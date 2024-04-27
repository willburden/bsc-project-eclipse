package willburden.hale.tests

import com.google.inject.Inject
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.extensions.InjectionExtension
import org.eclipse.xtext.testing.util.ParseHelper
import org.eclipse.xtext.testing.validation.ValidationTestHelper
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.^extension.ExtendWith
import willburden.hale.hale.Addition
import willburden.hale.hale.Binding
import willburden.hale.hale.BindingReference
import willburden.hale.hale.Division
import willburden.hale.hale.Hale
import willburden.hale.hale.NumberLiteral
import willburden.hale.hale.Multiplication
import willburden.hale.hale.Print
import willburden.hale.hale.StringLiteral
import willburden.hale.hale.Subtraction

import static org.junit.jupiter.api.Assertions.*

@ExtendWith(InjectionExtension)
@InjectWith(HaleInjectorProvider)
class HaleParsingTest {
	@Inject extension ParseHelper<Hale>
	
	@Inject extension ValidationTestHelper
	
//	@Test
//	def void testParsingNumberLiteral() {
//		val model = "0;".parse
//		
//		model.assertNoIssues();
//		assertEquals(1, model.statements.length)
//
//		val literal = model.statements.head as NumberLiteral
//		assertEquals(0, literal.value)
//	}
//	
//	@Test
//	def void testParsingStringLiteral() {
//		val model = '''
//			"hello";
//			'goodbye';
//		'''.parse
//		
//		model.assertNoIssues();
//		assertEquals(2, model.statements.length)
//
//		val literal0 = model.statements.get(0) as StringLiteral
//		assertEquals("hello", literal0.value)
//		
//		val literal1 = model.statements.get(1) as StringLiteral
//		assertEquals("goodbye", literal1.value)
//	}
//	
//	@Test
//	def void testParsingPrintStatement() {
//		val model = '''
//			print "Hello world!";
//		'''.parse
//		
//		model.assertNoIssues();
//		assertEquals(1, model.statements.length)
//
//		val print = model.statements.head as Print
//		val stringLiteral = print.value as StringLiteral
//		
//		assertEquals("Hello world!", stringLiteral.value)
//	}
//	
//	@Test
//	def void testParsingExpressions() {
//		val model = '''
//			(0);
//			5 / 2;
//			"hello " + 'world';
//			(1 - 2) * 3;
//			1 - (2 * 3);
//		'''.parse
//		
//		model.assertNoIssues();
//		assertEquals(5, model.statements.length)
//		
//		val expr0 = model.statements.get(0) as NumberLiteral
//		assertEquals(0, expr0.value)
//		
//		val expr1 = model.statements.get(1) as Division
//		assertEquals(5, (expr1.left as NumberLiteral).value)
//		assertEquals(2, (expr1.right as NumberLiteral).value)
//		
//		val expr2 = model.statements.get(2) as Addition
//		assertEquals("hello ", (expr2.left as StringLiteral).value)
//		assertEquals("world", (expr2.right as StringLiteral).value)
//		
//		val expr3 = model.statements.get(3) as Multiplication
//		val expr3Left = expr3.left as Subtraction
//		assertEquals(1, (expr3Left.left as NumberLiteral).value)
//		assertEquals(2, (expr3Left.right as NumberLiteral).value)
//		assertEquals(3, (expr3.right as NumberLiteral).value)
//		
//		val expr4 = model.statements.get(4) as Subtraction
//		val expr4Right = expr4.right as Multiplication
//		assertEquals(1, (expr4.left as NumberLiteral).value)
//		assertEquals(2, (expr4Right.left as NumberLiteral).value)
//		assertEquals(3, (expr4Right.right as NumberLiteral).value)
//	}
//	
//	@Test
//	def void testAdditionIsLeftAssociative() {
//		val model = '''
//			1 + 2 + 3 + 4;
//		'''.parse
//		
//		model.assertNoIssues();
//		assertEquals(1, model.statements.length)
//		
//		val group0 = model.statements.head as Addition
//		val group1 = group0.left as Addition
//		val group2 = group1.left as Addition
//		
//		assertEquals(1, (group2.left as NumberLiteral).value)
//		assertEquals(2, (group2.right as NumberLiteral).value)
//		assertEquals(3, (group1.right as NumberLiteral).value)
//		assertEquals(4, (group0.right as NumberLiteral).value)
//	}
//	
//	@Test
//	def void testCannotMixOperators() {
//		
//	}
//	
//	@Test
//	def void testParsingBinding() {
//		val model = '''
//			let xyz = "abc123";
//			xyz;
//		'''.parse
//		
//		model.assertNoIssues();
//		assertEquals(2, model.statements.length)
//		
//		val binding = model.statements.get(0) as Binding
//		assertEquals("xyz", binding.name)
//		assertEquals("abc123", (binding.value as StringLiteral).value)
//		assertFalse(binding.mutable)
//		
//		val reference = model.statements.get(1) as BindingReference
//		assertSame(binding, reference.binding)
//	}
//	
//	@Test
//	def void testParsingMutableBinding() {
//		
//	}
//	
//	@Test
//	def void testParsingAssignment() {
//		
//	}
//	
//	@Test
//	def void testCannotReferenceNonexistentBinding() {
//		
//	}
//	
//	@Test
//	def void testCannotMutateImmutableBinding() {
//		
//	}
//	
//	@Test
//	def void testBindingShadowing() {
//		
//	}
}
