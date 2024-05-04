package willburden.hale.tests

import com.google.inject.Inject
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.extensions.InjectionExtension
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.^extension.ExtendWith
import willburden.hale.hale.Addition
import willburden.hale.hale.Application
import willburden.hale.hale.BindingReference
import willburden.hale.hale.Block
import willburden.hale.hale.BooleanLiteral
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
import willburden.hale.hale.LogicalAnd
import willburden.hale.hale.LogicalNot
import willburden.hale.hale.LogicalOr
import willburden.hale.hale.Multiplication
import willburden.hale.hale.NumberLiteral
import willburden.hale.hale.PrimitiveType
import willburden.hale.hale.Print
import willburden.hale.hale.Remainder
import willburden.hale.hale.StringLiteral
import willburden.hale.hale.Subtraction
import willburden.hale.hale.UnaryNegation
import willburden.hale.hale.VoidLiteral
import willburden.hale.standalone.error.ErrorMessages
import willburden.hale.standalone.error.InterpreterException
import willburden.hale.standalone.interpreter.Interpreter
import willburden.hale.standalone.types.HaleEitherType
import willburden.hale.standalone.types.HaleFunctionType
import willburden.hale.standalone.types.HalePrimitiveType
import willburden.hale.standalone.values.HaleBoolean
import willburden.hale.standalone.values.HaleEither
import willburden.hale.standalone.values.HaleFunction
import willburden.hale.standalone.values.HaleNumber
import willburden.hale.standalone.values.HaleString
import willburden.hale.standalone.values.HaleVoid

import static org.junit.jupiter.api.Assertions.*
import willburden.hale.hale.While
import willburden.hale.hale.LetBinding
import willburden.hale.hale.Assignment

@ExtendWith(InjectionExtension)
@InjectWith(HaleInjectorProvider)
class HaleInterpreterTest {
	@Inject extension TestHelper
	
	// Executing statements
	
	@Test
	def void execBlock() {
		inject [ Interpreter i | i
			.execBlock("{ print 1; print 2; }".parseStatement as Block)
		]
			.assertStackUnchanged
			.assertStdoutEquals("1" + System.lineSeparator + "2" + System.lineSeparator)
	}
	
	@Test
	def void execFunction() {
		val function = "function xyz() {}".parseStatement as Function
		inject [ Interpreter i | i
			.execFunction(function)
		]
			.assertStackEquals(#{ "xyz" -> new HaleFunction(
				new HaleFunctionType(#[], HalePrimitiveType.VOID),
				function
			)})
			.assertStdoutEmpty
	}
	
	@Test
	def void execIfLet() {
		inject [ Interpreter i |
			i.execIfLet("
				if let num = \"1\" as Number { print num; }"
				.parseStatement as IfLet
			)
			i.execIfLet("
				if let num = \"abc\" as Number { print 2; }"
				.parseStatement as IfLet
			)
		]
			.assertStackUnchanged
			.assertStdoutEquals("1" + System.lineSeparator)
	}
	
	@Test
	def void execIfLetElse() {
		inject [ Interpreter i |
			i.execIfLet("
				if let num = \"1\" as Number { print num; }
				else { print 2; }"
				.parseStatement as IfLet
			)
			i.execIfLet("
				if let num = \"abc\" as Number { print 3; }
				else { print 4; }"
				.parseStatement as IfLet
			)
		]
			.assertStackUnchanged
			.assertStdoutEquals(
				"1" + System.lineSeparator + "4" + System.lineSeparator
			)
	}
	
	@Test
	def void execIfLetElseLet() {
		inject [ Interpreter i |
			i.execIfLet("
				if let num = \"1\" as Number { print num; }
				else let err { print 2; }"
				.parseStatement as IfLet
			)
			i.execIfLet("
				if let num = \"abc\" as Number { print 3; }
				else let err { print err; }"
				.parseStatement as IfLet
			)
		]
			.assertStackUnchanged
			.assertStdoutEquals(
				"1" + System.lineSeparator + "void" + System.lineSeparator
			)
	}
	
	@Test
	def void execIfConditions() {
		inject [ Interpreter i |
			i.execIfConditions(
				"if true { print \"a\"; }"
				.parseStatement as IfConditions
			)
			i.execIfConditions(
				"if false { print \"b\"; }"
				.parseStatement as IfConditions
			)
		]
			.assertStackUnchanged
			.assertStdoutEquals("a" + System.lineSeparator)
	}
	
	@Test
	def void execIfConditionsElse() {
		inject [ Interpreter i |
			i.execIfConditions(
				"if true { print \"a\"; } else { print \"b\"; }"
				.parseStatement as IfConditions
			)
			i.execIfConditions(
				"if false { print \"c\"; } else { print \"d\"; }"
				.parseStatement as IfConditions
			)
		]
			.assertStackUnchanged
			.assertStdoutEquals(
				"a" + System.lineSeparator + "d" + System.lineSeparator
			)
	}
	
	@Test
	def void execIfConditionsElseif() {
		inject [ Interpreter i |
			i.execIfConditions("
				if false { print \"a\"; }
				elseif false { print \"b\"; }
				elseif true { print \"c\"; }
				elseif true { print \"d\"; }"
				.parseStatement as IfConditions
			)
		]
			.assertStackUnchanged
			.assertStdoutEquals("c" + System.lineSeparator)
	}
	
	@Test
	def void execIfConditionsElseifElse() {
		inject [ Interpreter i |
			i.execIfConditions("
				if false { print \"a\"; }
				elseif false { print \"b\"; }
				else { print \"c\"; }"
				.parseStatement as IfConditions
			)
			i.execIfConditions("
				if false { print \"d\"; }
				elseif true { print \"e\"; }
				else { print \"f\"; }"
				.parseStatement as IfConditions
			)
		]
			.assertStackUnchanged
			.assertStdoutEquals(
				"c" + System.lineSeparator + "e" + System.lineSeparator 
			)
	}
	
	@Test
	def void execWhile() {
		prepare [ Interpreter i | i
			// Parser needs to be able to resolve the binding reference.
			.execWhile("
				let mut total = 1;
				while total < 3 { print total; total = total + 1; }"
				.parseStatements(2).get(1) as While
			)
		]
			.withStack(#{ "total" -> new HaleNumber(1) })
			.inject
			.assertStackEquals(#{ "total" -> new HaleNumber(3) })
			.assertStdoutEquals(
				"1" + System.lineSeparator + "2" + System.lineSeparator
			)
	}
	
	@Test
	def void execWhileWithBreak() {
		inject [ Interpreter i | i
			.execWhile("
				while true { print 1; break; print 2; }"
				.parseStatement as While
			)
		]
			.assertStackUnchanged
			.assertStdoutEquals(
				"1" + System.lineSeparator
			)
	}
	
	@Test
	def void execPrint() {
		inject [ Interpreter i |
			i.execPrint("print \"Hello, world!\";".parseStatement as Print)
			i.execPrint("print void;".parseStatement as Print)
		]
			.assertStackUnchanged
			.assertStdoutEquals(
				"Hello, world!" + System.lineSeparator +
				"void" + System.lineSeparator
			)
	}
	
	@Test
	def void execLetBinding() {
		inject [ Interpreter i | i
			.execLetBinding("let xyz = 0;"
				.parseStatement as LetBinding
			)
		]
			.assertStackEquals(#{ "xyz" -> new HaleNumber(0) })
			.assertStdoutEmpty
	}
	
	@Test
	def void execLetBindingWithWrongType() {
		prepare [ Interpreter i | i
			.execLetBinding("let xyz: String = 0;"
				.parseStatement as LetBinding
			)
		]
			.injectCatching(InterpreterException, [ e |
				assertEquals(ErrorMessages.wrongTypeInLetBinding, e.message)
			])
	}
	
	@Test
	def void execAssignment() {
		prepare [ Interpreter i | i
			// Parser needs to be able to resolve the binding reference.
			.execAssignment("let mut xyz = false; xyz = true;"
				.parseStatements(2).get(1) as Assignment
			)
		]
			.withStack(#{ "xyz" -> new HaleBoolean(false) })
			.inject
			.assertStackEquals(#{ "xyz" -> new HaleBoolean(true) })
			.assertStdoutEmpty
	}
	
	@Test
	def void execAssignmentOfWrongType() {
		prepare [ Interpreter i | i
			// Parser needs to be able to resolve the binding reference.
			.execAssignment("let mut xyz = false; xyz = void;"
				.parseStatements(2).get(1) as Assignment
			)
		]
			.withStack(#{ "xyz" -> new HaleBoolean(false) })
			.injectCatching(InterpreterException, [ e |
				assertEquals(ErrorMessages.valueOfWrongType(
					new HaleVoid(), HalePrimitiveType.BOOLEAN
				), e.message)
			])
	}
	
	// Evaluating expressions
	
	@Test
	def void evalConcatenation() {
		inject [ Interpreter i | #[
			i.evalConcatenation("\"hello \" . \"world\"".parseExpression as Concatenation),
			i.evalConcatenation("5 . void".parseExpression as Concatenation),
			i.evalConcatenation("true . \"abc\"".parseExpression as Concatenation),
			i.evalConcatenation("\"xyz\" . -3 . void".parseExpression as Concatenation)
		]]
			.assertReturnedValuesEqual(#[
				new HaleString("hello world"),
				new HaleString("5void"),
				new HaleString("trueabc"),
				new HaleString("xyz-3void")
			])
			.assertStackUnchanged
			.assertStdoutEmpty
	}
	
	@Test
	def void evalLogicalAnd() {
		inject [ Interpreter i | #[
			i.evalLogicalAnd("false and false".parseExpression as LogicalAnd),
			i.evalLogicalAnd("false and true".parseExpression as LogicalAnd),
			i.evalLogicalAnd("true and false".parseExpression as LogicalAnd),
			i.evalLogicalAnd("true and true".parseExpression as LogicalAnd)
		]]
			.assertReturnedValuesEqual(#[
				new HaleBoolean(false),
				new HaleBoolean(false),
				new HaleBoolean(false),
				new HaleBoolean(true)
			])
			.assertStackUnchanged
			.assertStdoutEmpty
	}
	
	@Test
	def void evalLogicalOr() {
		inject [ Interpreter i | #[
			i.evalLogicalOr("false or false".parseExpression as LogicalOr),
			i.evalLogicalOr("false or true".parseExpression as LogicalOr),
			i.evalLogicalOr("true or false".parseExpression as LogicalOr),
			i.evalLogicalOr("true or true".parseExpression as LogicalOr)
		]]
			.assertReturnedValuesEqual(#[
				new HaleBoolean(false),
				new HaleBoolean(true),
				new HaleBoolean(true),
				new HaleBoolean(true)
			])
			.assertStackUnchanged
			.assertStdoutEmpty
	}
	
	@Test
	def void evalEquality() {
		inject [ Interpreter i | #[
			i.evalEquality("void == void".parseExpression as Equality),
			i.evalEquality("true == true".parseExpression as Equality),
			i.evalEquality("false == true".parseExpression as Equality),
			i.evalEquality("3 == 3".parseExpression as Equality),
			i.evalEquality("2.5 == 2.4999999999999".parseExpression as Equality),
			i.evalEquality("2 == 3".parseExpression as Equality),
			i.evalEquality("\"xyz\" == \"xyz\"".parseExpression as Equality),
			i.evalEquality("\"xyz\" == \"abc\"".parseExpression as Equality),
			i.evalEquality("\"xyz\" == 1".parseExpression as Equality)
		]]
			.assertReturnedValuesEqual(#[
				new HaleBoolean(true),
				new HaleBoolean(true),
				new HaleBoolean(false),
				new HaleBoolean(true),
				new HaleBoolean(true),
				new HaleBoolean(false),
				new HaleBoolean(true),
				new HaleBoolean(false),
				new HaleBoolean(false)
			])
			.assertStackUnchanged
			.assertStdoutEmpty
	}
	
	@Test
	def void evalInequality() {
		inject [ Interpreter i | #[
		i.evalInequality("void != void".parseExpression as Inequality),
		i.evalInequality("true != true".parseExpression as Inequality),
		i.evalInequality("false != true".parseExpression as Inequality),
		i.evalInequality("3 != 3".parseExpression as Inequality),
		i.evalInequality("2.5 != 2.4999999999999".parseExpression as Inequality),
		i.evalInequality("2 != 3".parseExpression as Inequality),
		i.evalInequality("\"xyz\" != \"xyz\"".parseExpression as Inequality),
		i.evalInequality("\"xyz\" != \"abc\"".parseExpression as Inequality),
		i.evalInequality("\"xyz\" != 1".parseExpression as Inequality)
		]]
			.assertReturnedValuesEqual(#[
				new HaleBoolean(false),
				new HaleBoolean(false),
				new HaleBoolean(true),
				new HaleBoolean(false),
				new HaleBoolean(false),
				new HaleBoolean(true),
				new HaleBoolean(false),
				new HaleBoolean(true),
				new HaleBoolean(true)
			])
			.assertStackUnchanged
			.assertStdoutEmpty
	}
	
	@Test
	def void evalLessThanOrEqual() {
		inject [ Interpreter i | #[
			i.evalLessThanOrEqual("1 <= 0".parseExpression as LessThanOrEqual),
			i.evalLessThanOrEqual("0 <= 0".parseExpression as LessThanOrEqual),
			i.evalLessThanOrEqual("-1 <= 0".parseExpression as LessThanOrEqual)
		]]
			.assertReturnedValuesEqual(#[
				new HaleBoolean(false),
				new HaleBoolean(true),
				new HaleBoolean(true)
			])
			.assertStackUnchanged
			.assertStdoutEmpty
	}
	
	@Test
	def void evalLessThan() {
		inject [ Interpreter i | #[
			i.evalLessThan("1 < 0".parseExpression as LessThan),
			i.evalLessThan("0 < 0".parseExpression as LessThan),
			i.evalLessThan("-1 < 0".parseExpression as LessThan)
		]]
			.assertReturnedValuesEqual(#[
				new HaleBoolean(false),
				new HaleBoolean(false),
				new HaleBoolean(true)
			])
			.assertStackUnchanged
			.assertStdoutEmpty
	}
	
	@Test
	def void evalGreaterThanOrEqual() {
		inject [ Interpreter i | #[
			i.evalGreaterThanOrEqual("1 >= 0".parseExpression as GreaterThanOrEqual),
			i.evalGreaterThanOrEqual("0 >= 0".parseExpression as GreaterThanOrEqual),
			i.evalGreaterThanOrEqual("-1 >= 0".parseExpression as GreaterThanOrEqual)
		]]
			.assertReturnedValuesEqual(#[
				new HaleBoolean(true),
				new HaleBoolean(true),
				new HaleBoolean(false)
			])
			.assertStackUnchanged
			.assertStdoutEmpty
	}
	
	@Test
	def void evalGreaterThan() {
		inject [ Interpreter i | #[
			i.evalGreaterThan("1 > 0".parseExpression as GreaterThan),
			i.evalGreaterThan("0 > 0".parseExpression as GreaterThan),
			i.evalGreaterThan("-1 > 0".parseExpression as GreaterThan)
		]]
			.assertReturnedValuesEqual(#[
				new HaleBoolean(true),
				new HaleBoolean(false),
				new HaleBoolean(false)
			])
			.assertStackUnchanged
			.assertStdoutEmpty
	}
	
	@Test
	def void evalAddition() {
		inject [ Interpreter i | i
			.evalAddition("37 + 7".parseExpression as Addition)
		]
			.assertReturnedValueEquals(new HaleNumber(44))
			.assertStackUnchanged
			.assertStdoutEmpty
	}
	
	@Test
	def void evalSubtraction() {
		inject [ Interpreter i | i
			.evalSubtraction("32 - 238".parseExpression as Subtraction)
		]
			.assertReturnedValueEquals(new HaleNumber(-206))
			.assertStackUnchanged
			.assertStdoutEmpty
	}
	
	@Test
	def void evalMultiplication() {
		inject [ Interpreter i | i
			.evalMultiplication("3 * 12".parseExpression as Multiplication)
		]
			.assertReturnedValueEquals(new HaleNumber(36))
			.assertStackUnchanged
			.assertStdoutEmpty
	}
	
	@Test
	def void evalDivisionByZero() {
		prepare [ Interpreter i | i
			.evalDivision("1 / 0".parseExpression as Division)
		]
			.injectCatching(InterpreterException, [ e |
				assertEquals(
					ErrorMessages.divideByZero(new HaleNumber(1)),
					e.message
				)
			])
	}
	
	@Test
	def void evalDivision() {
		inject [ Interpreter i | #[
			i.evalDivision("6 / 3".parseExpression as Division),
			i.evalDivision("10 / 3".parseExpression as Division)
		]]
			.assertReturnedValuesEqual(#[
				new HaleNumber(2),
				new HaleNumber(10.0 / 3)
			])
			.assertStackUnchanged
			.assertStdoutEmpty
	}
	
	@Test
	def void evalRemainder() {
		inject [ Interpreter i | #[
			i.evalRemainder("10 % 3".parseExpression as Remainder),
			i.evalRemainder("5.4 % 2".parseExpression as Remainder),
			i.evalRemainder("-8 % 3".parseExpression as Remainder)
		]]
			.assertReturnedValuesEqual(#[
				new HaleNumber(1),
				new HaleNumber(1.4),
				new HaleNumber(-2)
			])
			.assertStackUnchanged
			.assertStdoutEmpty
	}
	
	@Test
	def void evalExponentiation() {
		inject [ Interpreter i | #[
			i.evalExponentiation("5 ** 3".parseExpression as Exponentiation),
			i.evalExponentiation("7 ** 0".parseExpression as Exponentiation),
			i.evalExponentiation("2 ** -2".parseExpression as Exponentiation),
			i.evalExponentiation("4 ** 0.5".parseExpression as Exponentiation)
		]]
			.assertReturnedValuesEqual(#[
				new HaleNumber(125),
				new HaleNumber(1),
				new HaleNumber(0.25),
				new HaleNumber(2)
			])
			.assertStackUnchanged
			.assertStdoutEmpty
	}
	
	@Test
	def void evalConversion() {
		val eitherType = new HaleEitherType(HalePrimitiveType.NUMBER, HalePrimitiveType.VOID)
		inject [ Interpreter i | #[
			i.evalConversion("5 as String".parseExpression as Conversion),
			i.evalConversion("-1.8 as String".parseExpression as Conversion),
			i.evalConversion("true as String".parseExpression as Conversion),
			i.evalConversion("void as String".parseExpression as Conversion),
			i.evalConversion("\"3.2\" as Number".parseExpression as Conversion),
			i.evalConversion("\"-2.5\" as Number".parseExpression as Conversion),
			i.evalConversion("\"abc\" as Number".parseExpression as Conversion)
		]]
			.assertReturnedValuesEqual(#[
				new HaleString("5"),
				new HaleString("-1.8"),
				new HaleString("true"),
				new HaleString("void"),
				new HaleEither(eitherType, new HaleNumber(3.2), true),
				new HaleEither(eitherType, new HaleNumber(-2.5), true),
				new HaleEither(eitherType, new HaleVoid(), false)
			])
			.assertStackUnchanged
			.assertStdoutEmpty
	}
	
	@Test
	def void evalUnaryNegation() {
		inject [ Interpreter i | i
			.evalUnaryNegation("-5".parseExpression as UnaryNegation)
		]
			.assertReturnedValueEquals(new HaleNumber(-5))
			.assertStackUnchanged
			.assertStdoutEmpty
	}
	
	@Test
	def void evalLogicalNot() {
		inject [ Interpreter i | #[ 
			i.evalLogicalNot("not true".parseExpression as LogicalNot),
			i.evalLogicalNot("not false".parseExpression as LogicalNot)
		]]
			.assertReturnedValuesEqual(#[
				new HaleBoolean(false),
				new HaleBoolean(true)
			])
			.assertStackUnchanged
			.assertStdoutEmpty
	}
	
	@Test
	def void evalApplication() {
		val functionStmt = "function xyz() { print \"called function\"; }"
		val function = functionStmt.parseStatement as Function
		prepare [ Interpreter i | i
			// Parser needs to be able to resolve the binding
			.evalApplication((functionStmt + "; xyz();")
				.parseStatements(2).get(1) as Application
			)
		]
			.withStack(#{ "xyz" -> new HaleFunction(
				Interpreter.resolveFunctionSignature(function),
				function
			)})
			.inject
			.assertReturnedValueEquals(new HaleVoid())
			.assertStackUnchanged
			.assertStdoutEquals("called function" + System.lineSeparator)
	}
	
	@Test
	def void evalApplicationWithParam() {
		val functionStmt = "function xyz(num: Number) { print num; }"
		val function = functionStmt.parseStatement as Function
		prepare [ Interpreter i | i
			// Parser needs to be able to resolve the binding
			.evalApplication((functionStmt + "; xyz(5);")
				.parseStatements(2).get(1) as Application
			)
		]
			.withStack(#{ "xyz" -> new HaleFunction(
				Interpreter.resolveFunctionSignature(function),
				function
			)})
			.inject
			.assertReturnedValueEquals(new HaleVoid())
			.assertStackUnchanged
			.assertStdoutEquals("5" + System.lineSeparator)
	}
	
	@Test
	def void evalApplicationWithReturn() {
		val functionStmt = "function xyz(): Boolean { return true; }"
		val function = functionStmt.parseStatement as Function
		prepare [ Interpreter i | i
			// Parser needs to be able to resolve the binding
			.evalApplication((functionStmt + "; xyz();")
				.parseStatements(2).get(1) as Application
			)
		]
			.withStack(#{ "xyz" -> new HaleFunction(
				Interpreter.resolveFunctionSignature(function),
				function
			)})
			.inject
			.assertReturnedValueEquals(new HaleBoolean(true))
			.assertStackUnchanged
			.assertStdoutEmpty
	}
	
	@Test
	def void evalApplicationWithReturnEither() {
		val functionStmt = "function xyz(): Boolean ? Boolean { return true; }"
		val function = functionStmt.parseStatement as Function
		prepare [ Interpreter i | i
			// Parser needs to be able to resolve the binding
			.evalApplication((functionStmt + "; xyz();")
				.parseStatements(2).get(1) as Application
			)
		]
			.withStack(#{ "xyz" -> new HaleFunction(
				Interpreter.resolveFunctionSignature(function),
				function
			)})
			.inject
			.assertReturnedValueEquals(new HaleEither(
				new HaleEitherType(HalePrimitiveType.BOOLEAN, HalePrimitiveType.BOOLEAN),
				new HaleBoolean(true),
				true
			))
			.assertStackUnchanged
			.assertStdoutEmpty
	}
	
	@Test
	def void evalApplicationWithThrowEither() {
		val functionStmt = "function xyz(): Boolean ? Boolean { throw true; }"
		val function = functionStmt.parseStatement as Function
		prepare [ Interpreter i | i
			// Parser needs to be able to resolve the binding
			.evalApplication((functionStmt + "; xyz();")
				.parseStatements(2).get(1) as Application
			)
		]
			.withStack(#{ "xyz" -> new HaleFunction(
				Interpreter.resolveFunctionSignature(function),
				function
			)})
			.inject
			.assertReturnedValueEquals(new HaleEither(
				new HaleEitherType(HalePrimitiveType.BOOLEAN, HalePrimitiveType.BOOLEAN),
				new HaleBoolean(true),
				false
			))
			.assertStackUnchanged
			.assertStdoutEmpty
	}
	
	@Test
	def void evalApplicationWithNonFunctionExpr() {
		prepare [ Interpreter i | i
			.evalApplication("void();"
				.parseStatement as Application
			)
		]
			.injectCatching(InterpreterException, [ e |
				assertEquals(ErrorMessages.valueNotAFunction(
					new HaleVoid()
				), e.message)
			])
	}
	
	@Test
	def void evalApplicationWithWrongNumArgs() {
		val functionStmt = "function xyz(num: Number) {}"
		val function = functionStmt.parseStatement as Function
		prepare [ Interpreter i | i
			// Parser needs to be able to resolve the binding
			.evalApplication((functionStmt + "; xyz();")
				.parseStatements(2).get(1) as Application
			)
		]
			.withStack(#{ "xyz" -> new HaleFunction(
				Interpreter.resolveFunctionSignature(function),
				function
			)})
			.injectCatching(InterpreterException, [ e |
				assertEquals(ErrorMessages.wrongNumberOfArguments(
					1, 0
				), e.message)
			])
	}
	
	@Test
	def void evalApplicationWithWrongArgType() {
		val functionStmt = "function xyz(num: Number) {}"
		val function = functionStmt.parseStatement as Function
		prepare [ Interpreter i | i
			// Parser needs to be able to resolve the binding
			.evalApplication((functionStmt + "; xyz(void);")
				.parseStatements(2).get(1) as Application
			)
		]
			.withStack(#{ "xyz" -> new HaleFunction(
				Interpreter.resolveFunctionSignature(function),
				function
			)})
			.injectCatching(InterpreterException, [ e |
				assertEquals(ErrorMessages.argumentOfWrongType(
					new HaleVoid(), "num", HalePrimitiveType.NUMBER
				), e.message)
			])
	}
	
	@Test
	def void evalApplicationWithWrongReturnType() {
		val functionStmt = "function xyz(): Number {}"
		val function = functionStmt.parseStatement as Function
		prepare [ Interpreter i | i
			// Parser needs to be able to resolve the binding
			.evalApplication((functionStmt + "; xyz();")
				.parseStatements(2).get(1) as Application
			)
		]
			.withStack(#{ "xyz" -> new HaleFunction(
				Interpreter.resolveFunctionSignature(function),
				function
			)})
			.injectCatching(InterpreterException, [ e |
				assertEquals(ErrorMessages.returnValueOfWrongType(
					new HaleVoid(), HalePrimitiveType.NUMBER
				), e.message)
			])
	}
	
	@Test
	def void evalVoidLiteral() {
		inject [ Interpreter i | i
			.evalVoidLiteral("void".parseExpression as VoidLiteral)
		]
			.assertReturnedValueEquals(new HaleVoid())
			.assertStackUnchanged
			.assertStdoutEmpty
	}
	
	@Test
	def void evalBooleanLiteral() {
		inject [ Interpreter i | #[
			i.evalBooleanLiteral("false".parseExpression as BooleanLiteral),
			i.evalBooleanLiteral("true".parseExpression as BooleanLiteral)
		]]
			.assertReturnedValuesEqual(#[
				new HaleBoolean(false),
				new HaleBoolean(true)
			])
			.assertStackUnchanged
			.assertStdoutEmpty
	}
	
	@Test
	def void evalNumberLiteral() {
		inject [ Interpreter i | #[
			i.evalNumberLiteral("162".parseExpression as NumberLiteral),
			i.evalNumberLiteral("19.235".parseExpression as NumberLiteral)
		]]
			.assertReturnedValuesEqual(#[
				new HaleNumber(162),
				new HaleNumber(19.235)
			])
			.assertStackUnchanged
			.assertStdoutEmpty
	}
	
	@Test
	def void evalStringLiteral() {
		inject [ Interpreter i |
			i.evalStringLiteral("\"Hello\"".parseExpression as StringLiteral)
		]
			.assertReturnedValueEquals(new HaleString("Hello"))
			.assertStackUnchanged
			.assertStdoutEmpty
	}
	
	@Test
	def void evalBindingReference() {
		prepare [ Interpreter i | i
			// Need the parser to be able to resolve the binding
			.evalBindingReference("let xyz = void; xyz;"
				.parseStatements(2).get(1) as BindingReference
			)
		]
			.withStack(#{ "xyz" -> new HaleVoid() })
			.inject
			.assertReturnedValueEquals(new HaleVoid())
			.assertStackUnchanged
			.assertStdoutEmpty
	}
	
	@Test
	def void evalInput() {
		prepare [ Interpreter i | i 
			.evalInput("input".parseExpression as Input)
		]
			.withInput("hello" + System.lineSeparator)
			.inject
			.assertReturnedValueEquals(new HaleString("hello"))
			.assertStackUnchanged
			.assertStdoutEmpty
	}
	
	// Resolving types
	
	@Test
	def void resolveFunctionType() {
		val expected = new HaleFunctionType(
			#[],
			HalePrimitiveType.VOID
		)
		val actual = Interpreter.resolveFunctionType(
			"Function()".parseType as FunctionType
		)
		expected.assertTypeEquals(actual)
	}
	
	@Test
	def void resolveFunctionTypeWithParams() {
		val expected = new HaleFunctionType(
			#[HalePrimitiveType.STRING, HalePrimitiveType.BOOLEAN],
			HalePrimitiveType.VOID
		)
		val actual = Interpreter.resolveFunctionType(
			"Function(String, Boolean)".parseType as FunctionType
		)
		expected.assertTypeEquals(actual)
	}
	
	@Test
	def void resolveFunctionTypeWithReturnType() {
		val expected = new HaleFunctionType(
			#[],
			HalePrimitiveType.NUMBER
		)
		val actual = Interpreter.resolveFunctionType(
			"Function(): Number".parseType as FunctionType
		)
		expected.assertTypeEquals(actual)
	}
	
	@Test
	def void resolveEitherType() {
		val expected = new HaleEitherType(
			HalePrimitiveType.NUMBER,
			HalePrimitiveType.VOID
		)
		val actual = Interpreter.resolveEitherType(
			"Number ? Void".parseType as EitherType
		)
		expected.assertTypeEquals(actual)
	}
	
	@Test
	def void resolvePrimitiveType() {
		val pairs = #[
			"Void" -> HalePrimitiveType.VOID,
			"Boolean" -> HalePrimitiveType.BOOLEAN,
			"Number" -> HalePrimitiveType.NUMBER,
			"String" -> HalePrimitiveType.STRING
		]
		for (pair : pairs) {
			pair.value.typeEquals(Interpreter.resolvePrimitiveType(
				pair.key.parseType as PrimitiveType
			))
		}
	}
	
	@Test
	def void resolveFunctionSignature() {
		val expected = new HaleFunctionType(
			#[],
			HalePrimitiveType.VOID
		)
		val actual = Interpreter.resolveFunctionSignature(
			"function xyz() {}".parseStatement as Function
		)
		expected.assertTypeEquals(actual)
	}
	
	@Test
	def void resolveFunctionSignatureWithParams() {
		val expected = new HaleFunctionType(
			#[HalePrimitiveType.NUMBER, HalePrimitiveType.VOID],
			HalePrimitiveType.VOID
		)
		val actual = Interpreter.resolveFunctionSignature(
			"function xyz(abc: Number, def: Void) {}".parseStatement as Function
		)
		expected.assertTypeEquals(actual)
	}
	
	@Test
	def void resolveFunctionSignatureWithReturnType() {
		val expected = new HaleFunctionType(
			#[],
			HalePrimitiveType.BOOLEAN
		)
		val actual = Interpreter.resolveFunctionSignature(
			"function xyz(): Boolean {}".parseStatement as Function
		)
		expected.assertTypeEquals(actual)
	}
}
