package willburden.hale.tests

import com.google.inject.Inject
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.extensions.InjectionExtension
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.^extension.ExtendWith
import willburden.hale.hale.Addition
import willburden.hale.hale.Application
import willburden.hale.hale.Assignment
import willburden.hale.hale.BindingReference
import willburden.hale.hale.Block
import willburden.hale.hale.BooleanLiteral
import willburden.hale.hale.Break
import willburden.hale.hale.Concatenation
import willburden.hale.hale.Conversion
import willburden.hale.hale.Division
import willburden.hale.hale.EitherType
import willburden.hale.hale.Equality
import willburden.hale.hale.Exponentiation
import willburden.hale.hale.Function
import willburden.hale.hale.FunctionType
import willburden.hale.hale.GreaterThan
import willburden.hale.hale.GreaterThanOrEqual
import willburden.hale.hale.IfConditions
import willburden.hale.hale.IfLet
import willburden.hale.hale.Inequality
import willburden.hale.hale.Input
import willburden.hale.hale.LessThan
import willburden.hale.hale.LessThanOrEqual
import willburden.hale.hale.LetBinding
import willburden.hale.hale.LogicalAnd
import willburden.hale.hale.LogicalNot
import willburden.hale.hale.LogicalOr
import willburden.hale.hale.Multiplication
import willburden.hale.hale.NumberLiteral
import willburden.hale.hale.PrimitiveType
import willburden.hale.hale.Print
import willburden.hale.hale.Remainder
import willburden.hale.hale.Return
import willburden.hale.hale.StringLiteral
import willburden.hale.hale.Subtraction
import willburden.hale.hale.Throw
import willburden.hale.hale.UnaryNegation
import willburden.hale.hale.VoidLiteral
import willburden.hale.hale.While

import static org.junit.jupiter.api.Assertions.*

@ExtendWith(InjectionExtension)
@InjectWith(HaleInjectorProvider)
class HaleParsingTest {
	@Inject extension TestHelper
	
	// Top-level
	
	@Test
	def void hale() {
		"; false;; -3; void; ; ;".parseStatements(3)
	}
	
	@Test
	def void bracedBlock() {
		val block = "{ void; 5; true; }".parseStatement as Block
		assertEquals(3, block.statements.size)
	}
	
	// Literals

	@Test
	def void voidLiteral() {
		assertTrue("void".parseExpression instanceof VoidLiteral)
	}
	
	@Test
	def void booleanLiteral() {
		assertEquals(false, ("false".parseExpression as BooleanLiteral).value)
		assertEquals(true, ("true".parseExpression as BooleanLiteral).value)
	}
	
	@Test
	def void numberLiteral() {
		assertEquals(0, ("0".parseExpression as NumberLiteral).value)
		assertEquals(163, ("163".parseExpression as NumberLiteral).value)
		assertEquals(51.26, (parseExpression("51.26") as NumberLiteral).value)
	}
	
	@Test
	def void stringLiteral() {
		assertEquals("hello", ("\"hello\"".parseExpression as StringLiteral).value)
		assertEquals("", ("\"\"".parseExpression as StringLiteral).value)
	}
	
	// Types
	
	@Test
	def void FunctionType() {
		val type = "Function()".parseType as FunctionType
		assertEquals(0, type.paramTypes.size)
		assertNull(type.returnType)
	}
	
	@Test
	def void FunctionTypeWithParams() {
		val type = "Function(Number, String)".parseType as FunctionType
		assertEquals(2, type.paramTypes.size)
		assertEquals("Number", (type.paramTypes.get(0) as PrimitiveType).type)
		assertEquals("String", (type.paramTypes.get(1) as PrimitiveType).type)
		assertNull(type.returnType)
	}
	
	@Test
	def void FunctionTypeWithReturnType() {
		val type = "Function(): Boolean".parseType as FunctionType
		assertEquals(0, type.paramTypes.size)
		assertEquals("Boolean", (type.returnType as PrimitiveType).type)
	}
	
	@Test
	def void EitherType() {
		val type = "String ? Void".parseType as EitherType
		assertEquals("String", (type.left as PrimitiveType).type)
		assertEquals("Void", (type.right as PrimitiveType).type)
	}
	
	@Test
	def void primitiveType() {
		assertEquals("Void", ("Void".parseType as PrimitiveType).type)
		assertEquals("Boolean", ("Boolean".parseType as PrimitiveType).type)
		assertEquals("Number", ("Number".parseType as PrimitiveType).type)
		assertEquals("String", ("String".parseType as PrimitiveType).type)
	}
	
	// Bindings
	
	@Test
	def void letBinding() {
		val stmt = "let xyz = void;".parseStatement as LetBinding
		assertFalse(stmt.mutable)
		assertEquals("xyz", stmt.binding.name)
		assertNull(stmt.type)
		assertTrue(stmt.expression instanceof VoidLiteral)
	}
	
	@Test
	def void letBindingWithMut() {
		val stmt = "let mut total = 0;".parseStatement as LetBinding
		assertTrue(stmt.mutable)
		assertEquals("total", stmt.binding.name)
		assertNull(stmt.type)
		assertEquals(0, (stmt.expression as NumberLiteral).value)
	}
	
	@Test
	def void letBindingWithTypeAnnotation() {
		val stmt = "let hello: String = \"Hello!\";".parseStatement as LetBinding
		assertFalse(stmt.mutable)
		assertEquals("hello", stmt.binding.name)
		assertEquals("String", (stmt.type as PrimitiveType).type)
		assertEquals("Hello!", (stmt.expression as StringLiteral).value)
	}
	
	@Test
	def void bindingReference() {
		val stmts = "let user = \"Alice\"; user;".parseStatements(2)
		val binding = (stmts.get(0) as LetBinding).binding
		val ref = stmts.get(1) as BindingReference
		assertEquals(binding, ref.binding)
	}
	
	@Test
	def void assignment() {
		val stmts = "let mut total = 3; total = 5;".parseStatements(2)
		val binding = (stmts.get(0) as LetBinding).binding
		val assignment = stmts.get(1) as Assignment
		assertEquals(binding, assignment.binding)
		assertEquals(5, (assignment.expression as NumberLiteral).value)
	}
	
	// Input/Output
	
	@Test
	def void input() {
		assertTrue("input".parseExpression instanceof Input)
	}
	
	@Test
	def void print() {
		val stmt = "print \"Hello, world!\";"
			.parseStatement as Print
		assertEquals("Hello, world!", (stmt.expression as StringLiteral).value)
	}
	
	// Control flow
	
	@Test
	def void ifLet() {
		val ifLet = "if let xyz = void { xyz; }"
			.parseStatement as IfLet
		assertFalse(ifLet.mutable)
		assertEquals("xyz", ifLet.binding.name)
		assertNull(ifLet.type)
		assertTrue(ifLet.expression instanceof VoidLiteral)
		assertNull(ifLet.elseLet)
		
		val stmts = ifLet.ifBlock.statements
		assertEquals(1, stmts.size)
		assertEquals(ifLet.binding, (stmts.get(0) as BindingReference).binding)
	}
	
	@Test
	def void ifLetMut() {
		val ifLet = "if let mut xyz = void {}"
			.parseStatement as IfLet
		assertTrue(ifLet.mutable)
		assertEquals("xyz", ifLet.binding.name)
		assertNull(ifLet.type)
		assertTrue(ifLet.expression instanceof VoidLiteral)
		assertNull(ifLet.elseLet)
		assertEquals(0, ifLet.ifBlock.statements.size)
	}
	
	@Test
	def void ifLetWithTypeAnnotation() {
		val ifLet = "if let xyz: Void = void {}"
			.parseStatement as IfLet
		assertFalse(ifLet.mutable)
		assertEquals("xyz", ifLet.binding.name)
		assertEquals("Void", (ifLet.type as PrimitiveType).type)
		assertTrue(ifLet.expression instanceof VoidLiteral)
		assertNull(ifLet.elseLet)
		assertEquals(0, ifLet.ifBlock.statements.size)
	}
	
	@Test
	def void ifLetElse() {
		val ifLet =  "if let xyz = void {} else {}"
			.parseStatement as IfLet
		val elseLet = ifLet.elseLet
		assertFalse(elseLet.mutable)
		assertNull(elseLet.binding)
		assertNull(elseLet.type)
		assertEquals(0, ifLet.ifBlock.statements.size)
	}
	
	@Test
	def void ifLetElseLet() {
		val ifLet = "if let xyz = void {} else let abc { abc; }"
			.parseStatement as IfLet
		val elseLet = ifLet.elseLet
		assertFalse(elseLet.mutable)
		assertEquals("abc", elseLet.binding.name)
		assertNull(elseLet.type)
		
		val stmts = elseLet.elseBlock.statements
		assertEquals(1, stmts.size)
		assertEquals(elseLet.binding, (stmts.get(0) as BindingReference).binding)
	}
	
	@Test
	def void ifLetElseLetMut() {
		val ifLet = "if let xyz = void {} else let mut abc {}"
			.parseStatement as IfLet
		val elseLet = ifLet.elseLet
		assertTrue(elseLet.mutable)
		assertEquals("abc", elseLet.binding.name)
		assertNull(elseLet.type)
		assertEquals(0, elseLet.elseBlock.statements.size)
	}
	
	@Test
	def void ifLetElseLetWithTypeAnnotation() {
		val ifLet = "if let xyz = void {} else let abc: String {}"
			.parseStatement as IfLet
		val elseLet = ifLet.elseLet
		assertFalse(elseLet.mutable)
		assertEquals("abc", elseLet.binding.name)
		assertEquals("String", (elseLet.type as PrimitiveType).type)
		assertEquals(0, elseLet.elseBlock.statements.size)
	}
	
	@Test
	def void ifConditions() {
		val ifCon = "if true {}"
			.parseStatement as IfConditions
		val cons = ifCon.conditions
		assertEquals(1, cons.size)
		assertEquals(true, (cons.get(0) as BooleanLiteral).value)
		val blocks = ifCon.ifBlocks
		assertEquals(1, blocks.size)
		assertEquals(0, blocks.get(0).statements.size)
		assertNull(ifCon.elseBlock)
	}
	
	@Test
	def void ifConditionsElse() {
		val ifCon = "if true {} else {}"
			.parseStatement as IfConditions
		assertEquals(0, ifCon.elseBlock.statements.size)
	}
	
	@Test
	def void ifConditionsElseif() {
		val ifCon = "if false {} elseif true {} elseif false {}"
			.parseStatement as IfConditions
		val cons = ifCon.conditions
		assertEquals(3, cons.size)
		assertEquals(false, (cons.get(0) as BooleanLiteral).value)
		assertEquals(true, (cons.get(1) as BooleanLiteral).value)
		assertEquals(false, (cons.get(2) as BooleanLiteral).value)
		val blocks = ifCon.ifBlocks
		assertEquals(3, blocks.size)
		assertEquals(0, blocks.get(0).statements.size)
		assertEquals(0, blocks.get(1).statements.size)
		assertEquals(0, blocks.get(2).statements.size)
		assertNull(ifCon.elseBlock)
	}
	
	@Test
	def void ifConditionsElseifElse() {
		val ifCon = "if false {} elseif true {} else {}"
			.parseStatement as IfConditions
		assertEquals(2, ifCon.conditions.size)
		assertEquals(2, ifCon.ifBlocks.size)
		assertEquals(0, ifCon.elseBlock.statements.size)
	}
	
	@Test
	def void whileStmt() {
		val stmt = "while true {}"
			.parseStatement as While
		assertEquals(true, (stmt.condition as BooleanLiteral).value)
		assertEquals(0, stmt.block.statements.size)
	}
	
	@Test
	def void breakStmt() {
		val whileStmt = "while true { break; }"
			.parseStatement as While
		assertEquals(1, whileStmt.block.statements.size)
		assertTrue(whileStmt.block.statements.get(0) instanceof Break)
	}
	
	// Functions
	
	@Test
	def void function() {
		val func = "function xyz() {}"
			.parseStatement as Function
		assertEquals("xyz", func.binding.name)
		assertEquals(0, func.parameters.size)
		assertNull(func.returnType)
		assertEquals(0, func.body.statements.size)
	}
	
	@Test
	def void functionWithParams() {
		val func = "function xyz(abc: Number, mut def: Boolean) { abc; def; }"
			.parseStatement as Function
		assertEquals("xyz", func.binding.name)
		assertNull(func.returnType)
		
		assertEquals(2, func.parameters.size)
		val param0 = func.parameters.get(0)
		val param1 = func.parameters.get(1)
		assertFalse(param0.mutable)
		assertEquals("abc", param0.binding.name)
		assertEquals("Number", (param0.type as PrimitiveType).type)
		assertTrue(param1.mutable)
		assertEquals("def", param1.binding.name)
		assertEquals("Boolean", (param1.type as PrimitiveType).type)
		
		val stmts = func.body.statements
		assertEquals(2, stmts.size)
		assertEquals(param0.binding, (stmts.get(0) as BindingReference).binding)
		assertEquals(param1.binding, (stmts.get(1) as BindingReference).binding)
	}
	
	@Test
	def void functionWithReturnType() {
		val func = "function xyz(): String {}"
			.parseStatement as Function
		assertEquals("xyz", func.binding.name)
		assertEquals("String", (func.returnType as PrimitiveType).type)
		assertEquals(0, func.body.statements.size)
	}
	
	@Test
	def void returnStmt() {
		val func = "function xyz() { return; }"
			.parseStatement as Function
		val returnStmt = func.body.statements.get(0) as Return
		assertNull(returnStmt.expression)
	}
	
	@Test
	def void returnStmtWithExpression() {
		val func = "function xyz() { return void; }"
			.parseStatement as Function
		val returnStmt = func.body.statements.get(0) as Return
		assertTrue(returnStmt.expression instanceof VoidLiteral)
	}
	
	@Test
	def void throwStmt() {
		val func = "function xyz(): String ? Void { throw; }"
			.parseStatement as Function
		val throwStmt = func.body.statements.get(0) as Throw
		assertNull(throwStmt.expression)
	}
	
	@Test
	def void throwStmtWithExpression() {
		val func = "function xyz(): String ? Void { throw void; }"
			.parseStatement as Function
		val throwStmt = func.body.statements.get(0) as Throw
		assertTrue(throwStmt.expression instanceof VoidLiteral)
	}
	
	// Expressions
	
	@Test
	def void concatenation() {
		val expr = "\"hello \" . \"world\"".parseExpression as Concatenation
		assertEquals("hello ", (expr.left as StringLiteral).value)
		assertEquals("world", (expr.right as StringLiteral).value)
	}

	@Test
	def void logicalAnd() {
		val expr = "true and false".parseExpression as LogicalAnd
		assertEquals(true, (expr.left as BooleanLiteral).value)
		assertEquals(false, (expr.right as BooleanLiteral).value)
	}
	
	@Test
	def void logicalOr() {
		val expr = "true or false".parseExpression as LogicalOr
		assertEquals(true, (expr.left as BooleanLiteral).value)
		assertEquals(false, (expr.right as BooleanLiteral).value)
	}
	
	@Test
	def void equality() {
		val expr = "5 == 0".parseExpression as Equality
		assertEquals(5, (expr.left as NumberLiteral).value)
		assertEquals(0, (expr.right as NumberLiteral).value)
	}
	
	@Test
	def void inequality() {
		val expr = "5 != 0".parseExpression as Inequality
		assertEquals(5, (expr.left as NumberLiteral).value)
		assertEquals(0, (expr.right as NumberLiteral).value)
	}
	
	@Test
	def void lessThanOrEqual() {
		val expr = "5 <= 0".parseExpression as LessThanOrEqual
		assertEquals(5, (expr.left as NumberLiteral).value)
		assertEquals(0, (expr.right as NumberLiteral).value)
	}
	
	@Test
	def void lessThan() {
		val expr = "5 < 0".parseExpression as LessThan
		assertEquals(5, (expr.left as NumberLiteral).value)
		assertEquals(0, (expr.right as NumberLiteral).value)
	}
	
	@Test
	def void greaterThanOrEqual() {
		val expr = "5 >= 0".parseExpression as GreaterThanOrEqual
		assertEquals(5, (expr.left as NumberLiteral).value)
		assertEquals(0, (expr.right as NumberLiteral).value)
	}
	
	@Test
	def void greaterThan() {
		val expr = "5 > 0".parseExpression as GreaterThan
		assertEquals(5, (expr.left as NumberLiteral).value)
		assertEquals(0, (expr.right as NumberLiteral).value)
	}
	
	@Test
	def void addition() {
		val expr = "5 + 0".parseExpression as Addition
		assertEquals(5, (expr.left as NumberLiteral).value)
		assertEquals(0, (expr.right as NumberLiteral).value)
	}
	
	@Test
	def void subtraction() {
		val expr = "5 - 0".parseExpression as Subtraction
		assertEquals(5, (expr.left as NumberLiteral).value)
		assertEquals(0, (expr.right as NumberLiteral).value)
	}
	
	@Test
	def void multiplication() {
		val expr = "5 * 0".parseExpression as Multiplication
		assertEquals(5, (expr.left as NumberLiteral).value)
		assertEquals(0, (expr.right as NumberLiteral).value)
	}
	
	@Test
	def void division() {
		val expr = "5 / 2".parseExpression as Division
		assertEquals(5, (expr.left as NumberLiteral).value)
		assertEquals(2, (expr.right as NumberLiteral).value)
	}
	
	@Test
	def void remainder() {
		val expr = "5 % 2".parseExpression as Remainder
		assertEquals(5, (expr.left as NumberLiteral).value)
		assertEquals(2, (expr.right as NumberLiteral).value)
	}
	
	@Test
	def void exponentiation() {
		val expr = "5 ** 2".parseExpression as Exponentiation
		assertEquals(5, (expr.left as NumberLiteral).value)
		assertEquals(2, (expr.right as NumberLiteral).value)
	}
	
	@Test
	def void conversion() {
		val expr = "5 as String".parseExpression as Conversion
		assertEquals(5, (expr.left as NumberLiteral).value)
		assertEquals("String", (expr.right as PrimitiveType).type)
	}
	
	@Test
	def void unaryNegation() {
		val expr = "-5".parseExpression as UnaryNegation
		assertEquals(5, (expr.inner as NumberLiteral).value)
	}
	
	@Test
	def void logicalNot() {
		val expr = "not false".parseExpression as LogicalNot
		assertEquals(false, (expr.inner as BooleanLiteral).value)
	}
	
	@Test
	def void application() {
		val expr = "void(5, 2)".parseExpression as Application
		assertTrue(expr.expression instanceof VoidLiteral)
		assertEquals(2, expr.arguments.size)
		assertEquals(5, (expr.arguments.get(0) as NumberLiteral).value)
		assertEquals(2, (expr.arguments.get(1) as NumberLiteral).value)
	}
	
}
