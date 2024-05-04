package willburden.hale.tests

import com.google.inject.Inject
import java.io.ByteArrayInputStream
import java.io.ByteArrayOutputStream
import java.io.PrintStream
import java.util.List
import java.util.Map
import java.util.function.Consumer
import java.util.function.Function
import org.eclipse.emf.common.util.EList
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.util.ParseHelper
import org.eclipse.xtext.testing.validation.ValidationTestHelper
import willburden.hale.hale.Conversion
import willburden.hale.hale.Expression
import willburden.hale.hale.Hale
import willburden.hale.hale.Statement
import willburden.hale.hale.Type
import willburden.hale.standalone.interpreter.CallStack
import willburden.hale.standalone.interpreter.Interpreter
import willburden.hale.standalone.values.HaleValue

import static org.junit.jupiter.api.Assertions.*
import java.util.NoSuchElementException
import java.io.InputStream
import willburden.hale.standalone.types.HaleType

@InjectWith(HaleInjectorProvider)
class TestHelper {
	@Inject ParseHelper<Hale> parseHelper
	@Inject extension ValidationTestHelper
	
	// Utilities for parsing different language concepts
	
	def Hale parse(String source) {
		val model = parseHelper.parse(source)
		model.assertNoErrors()
		model
	}
	
	def EList<Statement> parseStatements(String source, int numStatements) {
		val model = parse(source)
		assertEquals(numStatements, model.mainBlock.statements.size)
		model.mainBlock.statements
	}
	
	def Statement parseStatement(String source) {
		parseStatements(source, 1).head
	}
	
	def Expression parseExpression(String source) {
		val statement = parseStatement(source + ";")
		
		statement as Expression
	}
	
	def Type parseType(String source) {
		val statement = parseStatement("5 as " + source + ";")
		
		(statement as Conversion).right
	}
	
	// Utilities for testing the interpreter. The tests can just provide a function
	// from an Interpreter to any type, and then can call the 'inject' or 'prepare' method.
	// This allows preparing the stack and stdin, captures anything written to stdout,
	// and provides chainable methods for making assertions about the resultant state.
	
	def<R> InterpretTestResults<R> inject(Function<Interpreter, R> func) {
		func.prepare.inject
	}
	
	def<R> InterpretTestBuilder<R> prepare(Function<Interpreter, R> func) {
		new InterpretTestBuilder(func)
	}
	
	// Convenience so functions that don't want to return anything don't have
	// to write 'null' at the end.
	def InterpretTestResults<Void> inject(Consumer<Interpreter> func) {
		func.prepare.inject
	}
	
	def InterpretTestBuilder<Void> prepare(Consumer<Interpreter> func) {
		prepare [ i |
			func.accept(i)
			null
		]
	}
	
	static class InterpretTestBuilder<R> {
		Function<Interpreter, R> func
		List<List<Map<String, HaleValue>>> preparedStack
		String mockStdin
		
		InputStream sysIn
		PrintStream sysOut
		ByteArrayOutputStream baos
		Interpreter interpreter
		
		new(Function<Interpreter, R> func) {
			this.func = func
			
			// By default, prepare the stack as though we have already
			// entered the main program scope. This can be undone with
			// 'withEmptyStack'.
			preparedStack = #[#[emptyMap()]]
		}
		
		def withInput(String input) {
			mockStdin = input
			
			this
		}
		
		def withStack(List<List<Map<String, HaleValue>>> frames) {
			preparedStack = frames
			
			this
		}
		
		// Convenience to prepare a stack with a single frame and scope.
		def withStack(Map<String, HaleValue> bindings) {
			preparedStack = #[#[bindings]]
			
			this
		}
		
		// Uninitialises the stack as though the interpreter hasn't yet started
		// running a program, e.g. for testing full programs.
		def withEmptyStack() {
			preparedStack = #[]
			
			this
		}
		
		def InterpretTestResults<R> inject() {
			setup()
			try {
				val returned = func.apply(interpreter)
				return new InterpretTestResults(
					returned, baos.toString, interpreter.stack, preparedStack
				)
			} finally {
				cleanup()
			}
		}
		
		def<T extends Throwable> void injectCatching(Class<T> throwableClass, Consumer<T> catchFunc) {
			try {
				inject
				throw new AssertionError(String.format(
					"expected %s to be thrown, but nothing was thrown",
					throwableClass.canonicalName ?: throwableClass.name
				))				
			} catch (Throwable t) {
				var T castT
				try {
					castT = throwableClass.cast(t)
				} catch (ClassCastException e) {
					throw t
				}
				catchFunc.accept(castT)
			}
		}
		
		private def setup() {
			// Redirect stdin to read from a buffer.
			if (mockStdin !== null) {
				sysIn = System.in
				System.setIn(new ByteArrayInputStream(mockStdin.getBytes))
			}

			// Redirect stdout to write to a buffer.
			sysOut = System.out
			baos = new ByteArrayOutputStream()
			System.setOut(new PrintStream(baos))			
			
			interpreter = new Interpreter()
			
			// Prepare the stack.
			if (preparedStack !== null) {
				setupStack()
			}
		}

		private def setupStack() {
			for (frame : preparedStack) {
				interpreter.stack.pushFrame()
				for (scope : frame) {
					interpreter.stack.pushScope()
					for (name : scope.keySet) {
						val value = scope.get(name)
						interpreter.stack.put(name, value)
					}
				}
			}
		}
		
		private def cleanup() {
			// Reset stdin and stdout.
			if (sysIn !== null) {
				System.setIn(sysIn)	
			}
			System.setOut(sysOut)
			
			// Unset members (in case consumer keeps a reference to the builder).
			sysIn = null
			sysOut = null
			baos = null
			interpreter = null
		}
	}
	
	static class InterpretTestResults<R> {
		R returned
		String stdout
		CallStack stack
		List<List<Map<String, HaleValue>>> preparedStack
		
		new(R returned, String stdout, CallStack stack,
			List<List<Map<String, HaleValue>>> preparedStack
		) {
			this.returned = returned
			this.stdout = stdout
			this.stack = stack
			this.preparedStack = preparedStack
		}
		
		def R returned() {
			returned
		}
		
		def String stdout() {
			stdout
		}
		
		def CallStack stack() {
			stack
		}
		
		def withReturned(Consumer<R> assertions) {
			assertions.accept(returned)
			this
		}
		
		def assertReturnedNull() {
			assertNull(returned)
			this
		}
		
		def assertStdoutEquals(String expected) {
			assertEquals(expected, stdout)
			this
		}
		
		def assertStdoutEmpty() {
			assertStdoutEquals("")
		}
		
		def<V extends HaleValue> assertStackEquals(List<List<Map<String, V>>> frames) {
			assertEquals(frames.size, stack.frames.size)
			for (var i = 0; i < frames.size; i++) {
				val expFrame = frames.get(i)
				val frame = stack.frames.get(i)
				
				assertEquals(expFrame.size, frame.scopes.size)
				for (var j = 0; j < expFrame.size; j++) {
					val expScope = expFrame.get(j)
					val scope = frame.scopes.get(j)
					
					assertEquals(expScope.size, scope.size)
					for (name : expScope.keySet) {
						val expValue = expScope.get(name)
						val value = scope.get(name).value
						
						assertValueEqualsS(expValue, value)
					}
				}
			}
			
			this
		}
		
		def<V extends HaleValue> assertStackEquals(Map<String, V> bindings) {
			assertStackEquals(#[#[bindings]])
		}
		
		// Assert that the stack hasn't changed from (or has but has changed back to)
		// its prepared state
		def assertStackUnchanged() {
			try {
				assertStackEquals(preparedStack)
			} catch (AssertionError e) {
				throw new AssertionError("expected stack to be unchanged but it wasn't", e)
			}
		}
		
	}

	def<V extends HaleValue> InterpretTestResults<V> assertReturnedValueEquals(InterpretTestResults<V> results, V expected) {
		assertValueEquals(expected, results.returned)
		results
	}
	
	def<U extends HaleValue, V extends HaleValue, I extends Iterable<U>, J extends Iterable<V>>
	InterpretTestResults<I> assertReturnedValuesEqual(InterpretTestResults<I> results, J expected) {
		val expIter = expected.iterator
		for (value : results.returned) {
			try {
				expIter.next.assertValueEquals(value)
			} catch (NoSuchElementException e) {
				throw new AssertionError("expected: no more values, but got: <" + value.toString + ">")
			}
		}
		try {
			val exp = expIter.next
			throw new AssertionError("expected: <" + exp.toString + "> but got: no more values")
		} catch (NoSuchElementException e) {}
		
		results
	}
	
	def void assertValueEquals(HaleValue expected, HaleValue actual) {
		assertValueEqualsS(expected, actual)
	}
	
	// Needed so we can use this functionality inside the static nested class too.
	static def void assertValueEqualsS(HaleValue expected, HaleValue actual) {
		if (!expected.valueEquals(actual)) {
			throw new AssertionError(
				String.format("expected: <%s> but was: <%s>",
					expected.toString,
					actual.toString
			))			
		}
	}
	
	def void assertTypeEquals(HaleType expected, HaleType actual) {
		if (!expected.typeEquals(actual)) {
			throw new AssertionError(
				String.format("expected: <%s> but was: <%s>",
					expected.toString,
					actual.toString
			))			
		}
	}
	
}
