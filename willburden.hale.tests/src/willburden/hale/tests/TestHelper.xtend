package willburden.hale.tests

import com.google.inject.Inject
import java.util.Map
import org.eclipse.emf.common.util.EList
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.util.ParseHelper
import org.eclipse.xtext.testing.validation.ValidationTestHelper
import willburden.hale.hale.Conversion
import willburden.hale.hale.Expression
import willburden.hale.hale.Hale
import willburden.hale.hale.Statement
import willburden.hale.hale.Type
import willburden.hale.standalone.interpreter.Interpreter
import willburden.hale.standalone.values.HaleValue

import static org.junit.jupiter.api.Assertions.*

@InjectWith(HaleInjectorProvider)
class TestHelper {
	@Inject ParseHelper<Hale> parseHelper
	@Inject extension ValidationTestHelper
	
	// Utilities for parsing different language concepts
	
	def Hale parse(String source) {
		val model = parseHelper.parse(source)
		model.assertNoIssues()
		return model
	}
	
	def EList<Statement> parseStatements(String source, int numStatements) {
		val model = parse(source)
		assertEquals(numStatements, model.mainBlock.statements.size)
		return model.mainBlock.statements
	}
	
	def Statement parseStatement(String source) {
		return parseStatements(source, 1).head
	}
	
	def Expression parseExpression(String source) {
		val statement = parseStatement(source + ";")
		
		return statement as Expression
	}
	
	def Type parseType(String source) {
		val statement = parseStatement("5 as " + source + ";")
		
		return (statement as Conversion).right
	}
	
	// Utilities for testing the interpreter
	
	// Create a new interpreter with a prepared stack
	def Interpreter interpreter(Map<String, HaleValue> bindings) {
		val interpreter = new Interpreter()
		for (name : bindings.keySet) {
			val value = bindings.get(name)
			interpreter.stack.put(name, value)
		}
		return interpreter
	}
	
}
