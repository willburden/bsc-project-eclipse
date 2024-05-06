package willburden.hale.tests;

import com.google.inject.Inject;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.extensions.InjectionExtension;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Pair;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import willburden.hale.error.ErrorMessages;
import willburden.hale.error.InterpreterException;
import willburden.hale.hale.Addition;
import willburden.hale.hale.Application;
import willburden.hale.hale.Assignment;
import willburden.hale.hale.BindingReference;
import willburden.hale.hale.Block;
import willburden.hale.hale.BooleanLiteral;
import willburden.hale.hale.Concatenation;
import willburden.hale.hale.Conversion;
import willburden.hale.hale.Division;
import willburden.hale.hale.EitherType;
import willburden.hale.hale.Equality;
import willburden.hale.hale.Exponentiation;
import willburden.hale.hale.Expression;
import willburden.hale.hale.Function;
import willburden.hale.hale.FunctionType;
import willburden.hale.hale.GreaterThan;
import willburden.hale.hale.GreaterThanOrEqual;
import willburden.hale.hale.IfConditions;
import willburden.hale.hale.IfLet;
import willburden.hale.hale.Inequality;
import willburden.hale.hale.Input;
import willburden.hale.hale.LessThan;
import willburden.hale.hale.LessThanOrEqual;
import willburden.hale.hale.LetBinding;
import willburden.hale.hale.LogicalAnd;
import willburden.hale.hale.LogicalNot;
import willburden.hale.hale.LogicalOr;
import willburden.hale.hale.Multiplication;
import willburden.hale.hale.NumberLiteral;
import willburden.hale.hale.PrimitiveType;
import willburden.hale.hale.Print;
import willburden.hale.hale.Remainder;
import willburden.hale.hale.Statement;
import willburden.hale.hale.StringLiteral;
import willburden.hale.hale.Subtraction;
import willburden.hale.hale.Type;
import willburden.hale.hale.UnaryNegation;
import willburden.hale.hale.VoidLiteral;
import willburden.hale.hale.While;
import willburden.hale.interpreter.Interpreter;
import willburden.hale.types.HaleEitherType;
import willburden.hale.types.HaleFunctionType;
import willburden.hale.types.HalePrimitiveType;
import willburden.hale.types.HaleType;
import willburden.hale.values.HaleBoolean;
import willburden.hale.values.HaleEither;
import willburden.hale.values.HaleFunction;
import willburden.hale.values.HaleNumber;
import willburden.hale.values.HaleString;
import willburden.hale.values.HaleValue;
import willburden.hale.values.HaleVoid;

@ExtendWith(InjectionExtension.class)
@InjectWith(HaleInjectorProvider.class)
@SuppressWarnings("all")
public class HaleInterpreterTest {
  @Inject
  @Extension
  private TestHelper _testHelper;

  @Test
  public void execBlock() {
    final Consumer<Interpreter> _function = (Interpreter i) -> {
      try {
        Statement _parseStatement = this._testHelper.parseStatement("{ print 1; print 2; }");
        i.execBlock(((Block) _parseStatement));
      } catch (Throwable _e) {
        throw Exceptions.sneakyThrow(_e);
      }
    };
    TestHelper.InterpretTestResults<Void> _assertStackUnchanged = this._testHelper.inject(_function).assertStackUnchanged();
    String _lineSeparator = System.lineSeparator();
    String _plus = ("1" + _lineSeparator);
    String _plus_1 = (_plus + "2");
    String _lineSeparator_1 = System.lineSeparator();
    String _plus_2 = (_plus_1 + _lineSeparator_1);
    _assertStackUnchanged.assertStdoutEquals(_plus_2);
  }

  @Test
  public void execFunction() {
    Statement _parseStatement = this._testHelper.parseStatement("function xyz() {}");
    final Function function = ((Function) _parseStatement);
    final Consumer<Interpreter> _function = (Interpreter i) -> {
      i.execFunction(function);
    };
    HaleFunctionType _haleFunctionType = new HaleFunctionType(Collections.<HaleType>unmodifiableList(CollectionLiterals.<HaleType>newArrayList()), HalePrimitiveType.VOID);
    HaleFunction _haleFunction = new HaleFunction(_haleFunctionType, function);
    Pair<String, HaleFunction> _mappedTo = Pair.<String, HaleFunction>of("xyz", _haleFunction);
    this._testHelper.inject(_function).<HaleFunction>assertStackEquals(Collections.<String, HaleFunction>unmodifiableMap(CollectionLiterals.<String, HaleFunction>newHashMap(_mappedTo))).assertStdoutEmpty();
  }

  @Test
  public void execIfLet() {
    final Consumer<Interpreter> _function = (Interpreter i) -> {
      try {
        Statement _parseStatement = this._testHelper.parseStatement("\r\n\t\t\t\tif let num = \"1\" as Number { print num; }");
        i.execIfLet(
          ((IfLet) _parseStatement));
        Statement _parseStatement_1 = this._testHelper.parseStatement("\r\n\t\t\t\tif let num = \"abc\" as Number { print 2; }");
        i.execIfLet(
          ((IfLet) _parseStatement_1));
      } catch (Throwable _e) {
        throw Exceptions.sneakyThrow(_e);
      }
    };
    TestHelper.InterpretTestResults<Void> _assertStackUnchanged = this._testHelper.inject(_function).assertStackUnchanged();
    String _lineSeparator = System.lineSeparator();
    String _plus = ("1" + _lineSeparator);
    _assertStackUnchanged.assertStdoutEquals(_plus);
  }

  @Test
  public void execIfLetElse() {
    final Consumer<Interpreter> _function = (Interpreter i) -> {
      try {
        Statement _parseStatement = this._testHelper.parseStatement("\r\n\t\t\t\tif let num = \"1\" as Number { print num; }\r\n\t\t\t\telse { print 2; }");
        i.execIfLet(
          ((IfLet) _parseStatement));
        Statement _parseStatement_1 = this._testHelper.parseStatement("\r\n\t\t\t\tif let num = \"abc\" as Number { print 3; }\r\n\t\t\t\telse { print 4; }");
        i.execIfLet(
          ((IfLet) _parseStatement_1));
      } catch (Throwable _e) {
        throw Exceptions.sneakyThrow(_e);
      }
    };
    TestHelper.InterpretTestResults<Void> _assertStackUnchanged = this._testHelper.inject(_function).assertStackUnchanged();
    String _lineSeparator = System.lineSeparator();
    String _plus = ("1" + _lineSeparator);
    String _plus_1 = (_plus + "4");
    String _lineSeparator_1 = System.lineSeparator();
    String _plus_2 = (_plus_1 + _lineSeparator_1);
    _assertStackUnchanged.assertStdoutEquals(_plus_2);
  }

  @Test
  public void execIfLetElseLet() {
    final Consumer<Interpreter> _function = (Interpreter i) -> {
      try {
        Statement _parseStatement = this._testHelper.parseStatement("\r\n\t\t\t\tif let num = \"1\" as Number { print num; }\r\n\t\t\t\telse let err { print 2; }");
        i.execIfLet(
          ((IfLet) _parseStatement));
        Statement _parseStatement_1 = this._testHelper.parseStatement("\r\n\t\t\t\tif let num = \"abc\" as Number { print 3; }\r\n\t\t\t\telse let err { print err; }");
        i.execIfLet(
          ((IfLet) _parseStatement_1));
      } catch (Throwable _e) {
        throw Exceptions.sneakyThrow(_e);
      }
    };
    TestHelper.InterpretTestResults<Void> _assertStackUnchanged = this._testHelper.inject(_function).assertStackUnchanged();
    String _lineSeparator = System.lineSeparator();
    String _plus = ("1" + _lineSeparator);
    String _plus_1 = (_plus + "void");
    String _lineSeparator_1 = System.lineSeparator();
    String _plus_2 = (_plus_1 + _lineSeparator_1);
    _assertStackUnchanged.assertStdoutEquals(_plus_2);
  }

  @Test
  public void execIfConditions() {
    final Consumer<Interpreter> _function = (Interpreter i) -> {
      try {
        Statement _parseStatement = this._testHelper.parseStatement("if true { print \"a\"; }");
        i.execIfConditions(
          ((IfConditions) _parseStatement));
        Statement _parseStatement_1 = this._testHelper.parseStatement("if false { print \"b\"; }");
        i.execIfConditions(
          ((IfConditions) _parseStatement_1));
      } catch (Throwable _e) {
        throw Exceptions.sneakyThrow(_e);
      }
    };
    TestHelper.InterpretTestResults<Void> _assertStackUnchanged = this._testHelper.inject(_function).assertStackUnchanged();
    String _lineSeparator = System.lineSeparator();
    String _plus = ("a" + _lineSeparator);
    _assertStackUnchanged.assertStdoutEquals(_plus);
  }

  @Test
  public void execIfConditionsElse() {
    final Consumer<Interpreter> _function = (Interpreter i) -> {
      try {
        Statement _parseStatement = this._testHelper.parseStatement("if true { print \"a\"; } else { print \"b\"; }");
        i.execIfConditions(
          ((IfConditions) _parseStatement));
        Statement _parseStatement_1 = this._testHelper.parseStatement("if false { print \"c\"; } else { print \"d\"; }");
        i.execIfConditions(
          ((IfConditions) _parseStatement_1));
      } catch (Throwable _e) {
        throw Exceptions.sneakyThrow(_e);
      }
    };
    TestHelper.InterpretTestResults<Void> _assertStackUnchanged = this._testHelper.inject(_function).assertStackUnchanged();
    String _lineSeparator = System.lineSeparator();
    String _plus = ("a" + _lineSeparator);
    String _plus_1 = (_plus + "d");
    String _lineSeparator_1 = System.lineSeparator();
    String _plus_2 = (_plus_1 + _lineSeparator_1);
    _assertStackUnchanged.assertStdoutEquals(_plus_2);
  }

  @Test
  public void execIfConditionsElseif() {
    final Consumer<Interpreter> _function = (Interpreter i) -> {
      try {
        Statement _parseStatement = this._testHelper.parseStatement("\r\n\t\t\t\tif false { print \"a\"; }\r\n\t\t\t\telseif false { print \"b\"; }\r\n\t\t\t\telseif true { print \"c\"; }\r\n\t\t\t\telseif true { print \"d\"; }");
        i.execIfConditions(
          ((IfConditions) _parseStatement));
      } catch (Throwable _e) {
        throw Exceptions.sneakyThrow(_e);
      }
    };
    TestHelper.InterpretTestResults<Void> _assertStackUnchanged = this._testHelper.inject(_function).assertStackUnchanged();
    String _lineSeparator = System.lineSeparator();
    String _plus = ("c" + _lineSeparator);
    _assertStackUnchanged.assertStdoutEquals(_plus);
  }

  @Test
  public void execIfConditionsElseifElse() {
    final Consumer<Interpreter> _function = (Interpreter i) -> {
      try {
        Statement _parseStatement = this._testHelper.parseStatement("\r\n\t\t\t\tif false { print \"a\"; }\r\n\t\t\t\telseif false { print \"b\"; }\r\n\t\t\t\telse { print \"c\"; }");
        i.execIfConditions(
          ((IfConditions) _parseStatement));
        Statement _parseStatement_1 = this._testHelper.parseStatement("\r\n\t\t\t\tif false { print \"d\"; }\r\n\t\t\t\telseif true { print \"e\"; }\r\n\t\t\t\telse { print \"f\"; }");
        i.execIfConditions(
          ((IfConditions) _parseStatement_1));
      } catch (Throwable _e) {
        throw Exceptions.sneakyThrow(_e);
      }
    };
    TestHelper.InterpretTestResults<Void> _assertStackUnchanged = this._testHelper.inject(_function).assertStackUnchanged();
    String _lineSeparator = System.lineSeparator();
    String _plus = ("c" + _lineSeparator);
    String _plus_1 = (_plus + "e");
    String _lineSeparator_1 = System.lineSeparator();
    String _plus_2 = (_plus_1 + _lineSeparator_1);
    _assertStackUnchanged.assertStdoutEquals(_plus_2);
  }

  @Test
  public void execWhile() {
    final Consumer<Interpreter> _function = (Interpreter i) -> {
      try {
        Statement _get = this._testHelper.parseStatements("\r\n\t\t\t\tlet mut total = 1;\r\n\t\t\t\twhile total < 3 { print total; total = total + 1; }", 2).get(1);
        i.execWhile(
          ((While) _get));
      } catch (Throwable _e) {
        throw Exceptions.sneakyThrow(_e);
      }
    };
    HaleNumber _haleNumber = new HaleNumber(1);
    Pair<String, HaleNumber> _mappedTo = Pair.<String, HaleNumber>of("total", _haleNumber);
    HaleNumber _haleNumber_1 = new HaleNumber(3);
    Pair<String, HaleNumber> _mappedTo_1 = Pair.<String, HaleNumber>of("total", _haleNumber_1);
    TestHelper.InterpretTestResults<Void> _assertStackEquals = this._testHelper.prepare(_function).withStack(Collections.<String, HaleValue>unmodifiableMap(CollectionLiterals.<String, HaleValue>newHashMap(_mappedTo))).inject().<HaleNumber>assertStackEquals(Collections.<String, HaleNumber>unmodifiableMap(CollectionLiterals.<String, HaleNumber>newHashMap(_mappedTo_1)));
    String _lineSeparator = System.lineSeparator();
    String _plus = ("1" + _lineSeparator);
    String _plus_1 = (_plus + "2");
    String _lineSeparator_1 = System.lineSeparator();
    String _plus_2 = (_plus_1 + _lineSeparator_1);
    _assertStackEquals.assertStdoutEquals(_plus_2);
  }

  @Test
  public void execWhileWithBreak() {
    final Consumer<Interpreter> _function = (Interpreter i) -> {
      try {
        Statement _parseStatement = this._testHelper.parseStatement("\r\n\t\t\t\twhile true { print 1; break; print 2; }");
        i.execWhile(
          ((While) _parseStatement));
      } catch (Throwable _e) {
        throw Exceptions.sneakyThrow(_e);
      }
    };
    TestHelper.InterpretTestResults<Void> _assertStackUnchanged = this._testHelper.inject(_function).assertStackUnchanged();
    String _lineSeparator = System.lineSeparator();
    String _plus = ("1" + _lineSeparator);
    _assertStackUnchanged.assertStdoutEquals(_plus);
  }

  @Test
  public void execPrint() {
    final Consumer<Interpreter> _function = (Interpreter i) -> {
      Statement _parseStatement = this._testHelper.parseStatement("print \"Hello, world!\";");
      i.execPrint(((Print) _parseStatement));
      Statement _parseStatement_1 = this._testHelper.parseStatement("print void;");
      i.execPrint(((Print) _parseStatement_1));
    };
    TestHelper.InterpretTestResults<Void> _assertStackUnchanged = this._testHelper.inject(_function).assertStackUnchanged();
    String _lineSeparator = System.lineSeparator();
    String _plus = ("Hello, world!" + _lineSeparator);
    String _plus_1 = (_plus + 
      "void");
    String _lineSeparator_1 = System.lineSeparator();
    String _plus_2 = (_plus_1 + _lineSeparator_1);
    _assertStackUnchanged.assertStdoutEquals(_plus_2);
  }

  @Test
  public void execLetBinding() {
    final Consumer<Interpreter> _function = (Interpreter i) -> {
      Statement _parseStatement = this._testHelper.parseStatement("let xyz = 0;");
      i.execLetBinding(
        ((LetBinding) _parseStatement));
    };
    HaleNumber _haleNumber = new HaleNumber(0);
    Pair<String, HaleNumber> _mappedTo = Pair.<String, HaleNumber>of("xyz", _haleNumber);
    this._testHelper.inject(_function).<HaleNumber>assertStackEquals(Collections.<String, HaleNumber>unmodifiableMap(CollectionLiterals.<String, HaleNumber>newHashMap(_mappedTo))).assertStdoutEmpty();
  }

  @Test
  public void execLetBindingWithWrongType() {
    final Consumer<Interpreter> _function = (Interpreter i) -> {
      Statement _parseStatement = this._testHelper.parseStatement("let xyz: String = 0;");
      i.execLetBinding(
        ((LetBinding) _parseStatement));
    };
    final Consumer<InterpreterException> _function_1 = (InterpreterException e) -> {
      Assertions.assertEquals(ErrorMessages.wrongTypeInLetBinding(), e.getMessage());
    };
    this._testHelper.prepare(_function).<InterpreterException>injectCatching(InterpreterException.class, _function_1);
  }

  @Test
  public void execAssignment() {
    final Consumer<Interpreter> _function = (Interpreter i) -> {
      Statement _get = this._testHelper.parseStatements("let mut xyz = false; xyz = true;", 2).get(1);
      i.execAssignment(
        ((Assignment) _get));
    };
    HaleBoolean _haleBoolean = new HaleBoolean(false);
    Pair<String, HaleBoolean> _mappedTo = Pair.<String, HaleBoolean>of("xyz", _haleBoolean);
    HaleBoolean _haleBoolean_1 = new HaleBoolean(true);
    Pair<String, HaleBoolean> _mappedTo_1 = Pair.<String, HaleBoolean>of("xyz", _haleBoolean_1);
    this._testHelper.prepare(_function).withStack(Collections.<String, HaleValue>unmodifiableMap(CollectionLiterals.<String, HaleValue>newHashMap(_mappedTo))).inject().<HaleBoolean>assertStackEquals(Collections.<String, HaleBoolean>unmodifiableMap(CollectionLiterals.<String, HaleBoolean>newHashMap(_mappedTo_1))).assertStdoutEmpty();
  }

  @Test
  public void execAssignmentOfWrongType() {
    final Consumer<Interpreter> _function = (Interpreter i) -> {
      Statement _get = this._testHelper.parseStatements("let mut xyz = false; xyz = void;", 2).get(1);
      i.execAssignment(
        ((Assignment) _get));
    };
    HaleBoolean _haleBoolean = new HaleBoolean(false);
    Pair<String, HaleBoolean> _mappedTo = Pair.<String, HaleBoolean>of("xyz", _haleBoolean);
    final Consumer<InterpreterException> _function_1 = (InterpreterException e) -> {
      HaleVoid _haleVoid = new HaleVoid();
      Assertions.assertEquals(
        ErrorMessages.valueOfWrongType(_haleVoid, HalePrimitiveType.BOOLEAN), e.getMessage());
    };
    this._testHelper.prepare(_function).withStack(Collections.<String, HaleValue>unmodifiableMap(CollectionLiterals.<String, HaleValue>newHashMap(_mappedTo))).<InterpreterException>injectCatching(InterpreterException.class, _function_1);
  }

  @Test
  public void evalConcatenation() {
    final java.util.function.Function<Interpreter, List<HaleString>> _function = (Interpreter i) -> {
      Expression _parseExpression = this._testHelper.parseExpression("\"hello \" . \"world\"");
      HaleString _evalConcatenation = i.evalConcatenation(((Concatenation) _parseExpression));
      Expression _parseExpression_1 = this._testHelper.parseExpression("5 . void");
      HaleString _evalConcatenation_1 = i.evalConcatenation(((Concatenation) _parseExpression_1));
      Expression _parseExpression_2 = this._testHelper.parseExpression("true . \"abc\"");
      HaleString _evalConcatenation_2 = i.evalConcatenation(((Concatenation) _parseExpression_2));
      Expression _parseExpression_3 = this._testHelper.parseExpression("\"xyz\" . -3 . void");
      HaleString _evalConcatenation_3 = i.evalConcatenation(((Concatenation) _parseExpression_3));
      return Collections.<HaleString>unmodifiableList(CollectionLiterals.<HaleString>newArrayList(_evalConcatenation, _evalConcatenation_1, _evalConcatenation_2, _evalConcatenation_3));
    };
    HaleString _haleString = new HaleString("hello world");
    HaleString _haleString_1 = new HaleString("5void");
    HaleString _haleString_2 = new HaleString("trueabc");
    HaleString _haleString_3 = new HaleString("xyz-3void");
    this._testHelper.<HaleString, HaleString, List<HaleString>, List<HaleString>>assertReturnedValuesEqual(this._testHelper.<List<HaleString>>inject(_function), 
      Collections.<HaleString>unmodifiableList(CollectionLiterals.<HaleString>newArrayList(_haleString, _haleString_1, _haleString_2, _haleString_3))).assertStackUnchanged().assertStdoutEmpty();
  }

  @Test
  public void evalLogicalAnd() {
    final java.util.function.Function<Interpreter, List<HaleBoolean>> _function = (Interpreter i) -> {
      Expression _parseExpression = this._testHelper.parseExpression("false and false");
      HaleBoolean _evalLogicalAnd = i.evalLogicalAnd(((LogicalAnd) _parseExpression));
      Expression _parseExpression_1 = this._testHelper.parseExpression("false and true");
      HaleBoolean _evalLogicalAnd_1 = i.evalLogicalAnd(((LogicalAnd) _parseExpression_1));
      Expression _parseExpression_2 = this._testHelper.parseExpression("true and false");
      HaleBoolean _evalLogicalAnd_2 = i.evalLogicalAnd(((LogicalAnd) _parseExpression_2));
      Expression _parseExpression_3 = this._testHelper.parseExpression("true and true");
      HaleBoolean _evalLogicalAnd_3 = i.evalLogicalAnd(((LogicalAnd) _parseExpression_3));
      return Collections.<HaleBoolean>unmodifiableList(CollectionLiterals.<HaleBoolean>newArrayList(_evalLogicalAnd, _evalLogicalAnd_1, _evalLogicalAnd_2, _evalLogicalAnd_3));
    };
    HaleBoolean _haleBoolean = new HaleBoolean(false);
    HaleBoolean _haleBoolean_1 = new HaleBoolean(false);
    HaleBoolean _haleBoolean_2 = new HaleBoolean(false);
    HaleBoolean _haleBoolean_3 = new HaleBoolean(true);
    this._testHelper.<HaleBoolean, HaleBoolean, List<HaleBoolean>, List<HaleBoolean>>assertReturnedValuesEqual(this._testHelper.<List<HaleBoolean>>inject(_function), 
      Collections.<HaleBoolean>unmodifiableList(CollectionLiterals.<HaleBoolean>newArrayList(_haleBoolean, _haleBoolean_1, _haleBoolean_2, _haleBoolean_3))).assertStackUnchanged().assertStdoutEmpty();
  }

  @Test
  public void evalLogicalOr() {
    final java.util.function.Function<Interpreter, List<HaleBoolean>> _function = (Interpreter i) -> {
      Expression _parseExpression = this._testHelper.parseExpression("false or false");
      HaleBoolean _evalLogicalOr = i.evalLogicalOr(((LogicalOr) _parseExpression));
      Expression _parseExpression_1 = this._testHelper.parseExpression("false or true");
      HaleBoolean _evalLogicalOr_1 = i.evalLogicalOr(((LogicalOr) _parseExpression_1));
      Expression _parseExpression_2 = this._testHelper.parseExpression("true or false");
      HaleBoolean _evalLogicalOr_2 = i.evalLogicalOr(((LogicalOr) _parseExpression_2));
      Expression _parseExpression_3 = this._testHelper.parseExpression("true or true");
      HaleBoolean _evalLogicalOr_3 = i.evalLogicalOr(((LogicalOr) _parseExpression_3));
      return Collections.<HaleBoolean>unmodifiableList(CollectionLiterals.<HaleBoolean>newArrayList(_evalLogicalOr, _evalLogicalOr_1, _evalLogicalOr_2, _evalLogicalOr_3));
    };
    HaleBoolean _haleBoolean = new HaleBoolean(false);
    HaleBoolean _haleBoolean_1 = new HaleBoolean(true);
    HaleBoolean _haleBoolean_2 = new HaleBoolean(true);
    HaleBoolean _haleBoolean_3 = new HaleBoolean(true);
    this._testHelper.<HaleBoolean, HaleBoolean, List<HaleBoolean>, List<HaleBoolean>>assertReturnedValuesEqual(this._testHelper.<List<HaleBoolean>>inject(_function), 
      Collections.<HaleBoolean>unmodifiableList(CollectionLiterals.<HaleBoolean>newArrayList(_haleBoolean, _haleBoolean_1, _haleBoolean_2, _haleBoolean_3))).assertStackUnchanged().assertStdoutEmpty();
  }

  @Test
  public void evalEquality() {
    final java.util.function.Function<Interpreter, List<HaleBoolean>> _function = (Interpreter i) -> {
      Expression _parseExpression = this._testHelper.parseExpression("void == void");
      HaleBoolean _evalEquality = i.evalEquality(((Equality) _parseExpression));
      Expression _parseExpression_1 = this._testHelper.parseExpression("true == true");
      HaleBoolean _evalEquality_1 = i.evalEquality(((Equality) _parseExpression_1));
      Expression _parseExpression_2 = this._testHelper.parseExpression("false == true");
      HaleBoolean _evalEquality_2 = i.evalEquality(((Equality) _parseExpression_2));
      Expression _parseExpression_3 = this._testHelper.parseExpression("3 == 3");
      HaleBoolean _evalEquality_3 = i.evalEquality(((Equality) _parseExpression_3));
      Expression _parseExpression_4 = this._testHelper.parseExpression("2.5 == 2.4999999999999");
      HaleBoolean _evalEquality_4 = i.evalEquality(((Equality) _parseExpression_4));
      Expression _parseExpression_5 = this._testHelper.parseExpression("2 == 3");
      HaleBoolean _evalEquality_5 = i.evalEquality(((Equality) _parseExpression_5));
      Expression _parseExpression_6 = this._testHelper.parseExpression("\"xyz\" == \"xyz\"");
      HaleBoolean _evalEquality_6 = i.evalEquality(((Equality) _parseExpression_6));
      Expression _parseExpression_7 = this._testHelper.parseExpression("\"xyz\" == \"abc\"");
      HaleBoolean _evalEquality_7 = i.evalEquality(((Equality) _parseExpression_7));
      Expression _parseExpression_8 = this._testHelper.parseExpression("\"xyz\" == 1");
      HaleBoolean _evalEquality_8 = i.evalEquality(((Equality) _parseExpression_8));
      return Collections.<HaleBoolean>unmodifiableList(CollectionLiterals.<HaleBoolean>newArrayList(_evalEquality, _evalEquality_1, _evalEquality_2, _evalEquality_3, _evalEquality_4, _evalEquality_5, _evalEquality_6, _evalEquality_7, _evalEquality_8));
    };
    HaleBoolean _haleBoolean = new HaleBoolean(true);
    HaleBoolean _haleBoolean_1 = new HaleBoolean(true);
    HaleBoolean _haleBoolean_2 = new HaleBoolean(false);
    HaleBoolean _haleBoolean_3 = new HaleBoolean(true);
    HaleBoolean _haleBoolean_4 = new HaleBoolean(true);
    HaleBoolean _haleBoolean_5 = new HaleBoolean(false);
    HaleBoolean _haleBoolean_6 = new HaleBoolean(true);
    HaleBoolean _haleBoolean_7 = new HaleBoolean(false);
    HaleBoolean _haleBoolean_8 = new HaleBoolean(false);
    this._testHelper.<HaleBoolean, HaleBoolean, List<HaleBoolean>, List<HaleBoolean>>assertReturnedValuesEqual(this._testHelper.<List<HaleBoolean>>inject(_function), 
      Collections.<HaleBoolean>unmodifiableList(CollectionLiterals.<HaleBoolean>newArrayList(_haleBoolean, _haleBoolean_1, _haleBoolean_2, _haleBoolean_3, _haleBoolean_4, _haleBoolean_5, _haleBoolean_6, _haleBoolean_7, _haleBoolean_8))).assertStackUnchanged().assertStdoutEmpty();
  }

  @Test
  public void evalInequality() {
    final java.util.function.Function<Interpreter, List<HaleBoolean>> _function = (Interpreter i) -> {
      Expression _parseExpression = this._testHelper.parseExpression("void != void");
      HaleBoolean _evalInequality = i.evalInequality(((Inequality) _parseExpression));
      Expression _parseExpression_1 = this._testHelper.parseExpression("true != true");
      HaleBoolean _evalInequality_1 = i.evalInequality(((Inequality) _parseExpression_1));
      Expression _parseExpression_2 = this._testHelper.parseExpression("false != true");
      HaleBoolean _evalInequality_2 = i.evalInequality(((Inequality) _parseExpression_2));
      Expression _parseExpression_3 = this._testHelper.parseExpression("3 != 3");
      HaleBoolean _evalInequality_3 = i.evalInequality(((Inequality) _parseExpression_3));
      Expression _parseExpression_4 = this._testHelper.parseExpression("2.5 != 2.4999999999999");
      HaleBoolean _evalInequality_4 = i.evalInequality(((Inequality) _parseExpression_4));
      Expression _parseExpression_5 = this._testHelper.parseExpression("2 != 3");
      HaleBoolean _evalInequality_5 = i.evalInequality(((Inequality) _parseExpression_5));
      Expression _parseExpression_6 = this._testHelper.parseExpression("\"xyz\" != \"xyz\"");
      HaleBoolean _evalInequality_6 = i.evalInequality(((Inequality) _parseExpression_6));
      Expression _parseExpression_7 = this._testHelper.parseExpression("\"xyz\" != \"abc\"");
      HaleBoolean _evalInequality_7 = i.evalInequality(((Inequality) _parseExpression_7));
      Expression _parseExpression_8 = this._testHelper.parseExpression("\"xyz\" != 1");
      HaleBoolean _evalInequality_8 = i.evalInequality(((Inequality) _parseExpression_8));
      return Collections.<HaleBoolean>unmodifiableList(CollectionLiterals.<HaleBoolean>newArrayList(_evalInequality, _evalInequality_1, _evalInequality_2, _evalInequality_3, _evalInequality_4, _evalInequality_5, _evalInequality_6, _evalInequality_7, _evalInequality_8));
    };
    HaleBoolean _haleBoolean = new HaleBoolean(false);
    HaleBoolean _haleBoolean_1 = new HaleBoolean(false);
    HaleBoolean _haleBoolean_2 = new HaleBoolean(true);
    HaleBoolean _haleBoolean_3 = new HaleBoolean(false);
    HaleBoolean _haleBoolean_4 = new HaleBoolean(false);
    HaleBoolean _haleBoolean_5 = new HaleBoolean(true);
    HaleBoolean _haleBoolean_6 = new HaleBoolean(false);
    HaleBoolean _haleBoolean_7 = new HaleBoolean(true);
    HaleBoolean _haleBoolean_8 = new HaleBoolean(true);
    this._testHelper.<HaleBoolean, HaleBoolean, List<HaleBoolean>, List<HaleBoolean>>assertReturnedValuesEqual(this._testHelper.<List<HaleBoolean>>inject(_function), 
      Collections.<HaleBoolean>unmodifiableList(CollectionLiterals.<HaleBoolean>newArrayList(_haleBoolean, _haleBoolean_1, _haleBoolean_2, _haleBoolean_3, _haleBoolean_4, _haleBoolean_5, _haleBoolean_6, _haleBoolean_7, _haleBoolean_8))).assertStackUnchanged().assertStdoutEmpty();
  }

  @Test
  public void evalLessThanOrEqual() {
    final java.util.function.Function<Interpreter, List<HaleBoolean>> _function = (Interpreter i) -> {
      Expression _parseExpression = this._testHelper.parseExpression("1 <= 0");
      HaleBoolean _evalLessThanOrEqual = i.evalLessThanOrEqual(((LessThanOrEqual) _parseExpression));
      Expression _parseExpression_1 = this._testHelper.parseExpression("0 <= 0");
      HaleBoolean _evalLessThanOrEqual_1 = i.evalLessThanOrEqual(((LessThanOrEqual) _parseExpression_1));
      Expression _parseExpression_2 = this._testHelper.parseExpression("-1 <= 0");
      HaleBoolean _evalLessThanOrEqual_2 = i.evalLessThanOrEqual(((LessThanOrEqual) _parseExpression_2));
      return Collections.<HaleBoolean>unmodifiableList(CollectionLiterals.<HaleBoolean>newArrayList(_evalLessThanOrEqual, _evalLessThanOrEqual_1, _evalLessThanOrEqual_2));
    };
    HaleBoolean _haleBoolean = new HaleBoolean(false);
    HaleBoolean _haleBoolean_1 = new HaleBoolean(true);
    HaleBoolean _haleBoolean_2 = new HaleBoolean(true);
    this._testHelper.<HaleBoolean, HaleBoolean, List<HaleBoolean>, List<HaleBoolean>>assertReturnedValuesEqual(this._testHelper.<List<HaleBoolean>>inject(_function), 
      Collections.<HaleBoolean>unmodifiableList(CollectionLiterals.<HaleBoolean>newArrayList(_haleBoolean, _haleBoolean_1, _haleBoolean_2))).assertStackUnchanged().assertStdoutEmpty();
  }

  @Test
  public void evalLessThan() {
    final java.util.function.Function<Interpreter, List<HaleBoolean>> _function = (Interpreter i) -> {
      Expression _parseExpression = this._testHelper.parseExpression("1 < 0");
      HaleBoolean _evalLessThan = i.evalLessThan(((LessThan) _parseExpression));
      Expression _parseExpression_1 = this._testHelper.parseExpression("0 < 0");
      HaleBoolean _evalLessThan_1 = i.evalLessThan(((LessThan) _parseExpression_1));
      Expression _parseExpression_2 = this._testHelper.parseExpression("-1 < 0");
      HaleBoolean _evalLessThan_2 = i.evalLessThan(((LessThan) _parseExpression_2));
      return Collections.<HaleBoolean>unmodifiableList(CollectionLiterals.<HaleBoolean>newArrayList(_evalLessThan, _evalLessThan_1, _evalLessThan_2));
    };
    HaleBoolean _haleBoolean = new HaleBoolean(false);
    HaleBoolean _haleBoolean_1 = new HaleBoolean(false);
    HaleBoolean _haleBoolean_2 = new HaleBoolean(true);
    this._testHelper.<HaleBoolean, HaleBoolean, List<HaleBoolean>, List<HaleBoolean>>assertReturnedValuesEqual(this._testHelper.<List<HaleBoolean>>inject(_function), 
      Collections.<HaleBoolean>unmodifiableList(CollectionLiterals.<HaleBoolean>newArrayList(_haleBoolean, _haleBoolean_1, _haleBoolean_2))).assertStackUnchanged().assertStdoutEmpty();
  }

  @Test
  public void evalGreaterThanOrEqual() {
    final java.util.function.Function<Interpreter, List<HaleBoolean>> _function = (Interpreter i) -> {
      Expression _parseExpression = this._testHelper.parseExpression("1 >= 0");
      HaleBoolean _evalGreaterThanOrEqual = i.evalGreaterThanOrEqual(((GreaterThanOrEqual) _parseExpression));
      Expression _parseExpression_1 = this._testHelper.parseExpression("0 >= 0");
      HaleBoolean _evalGreaterThanOrEqual_1 = i.evalGreaterThanOrEqual(((GreaterThanOrEqual) _parseExpression_1));
      Expression _parseExpression_2 = this._testHelper.parseExpression("-1 >= 0");
      HaleBoolean _evalGreaterThanOrEqual_2 = i.evalGreaterThanOrEqual(((GreaterThanOrEqual) _parseExpression_2));
      return Collections.<HaleBoolean>unmodifiableList(CollectionLiterals.<HaleBoolean>newArrayList(_evalGreaterThanOrEqual, _evalGreaterThanOrEqual_1, _evalGreaterThanOrEqual_2));
    };
    HaleBoolean _haleBoolean = new HaleBoolean(true);
    HaleBoolean _haleBoolean_1 = new HaleBoolean(true);
    HaleBoolean _haleBoolean_2 = new HaleBoolean(false);
    this._testHelper.<HaleBoolean, HaleBoolean, List<HaleBoolean>, List<HaleBoolean>>assertReturnedValuesEqual(this._testHelper.<List<HaleBoolean>>inject(_function), 
      Collections.<HaleBoolean>unmodifiableList(CollectionLiterals.<HaleBoolean>newArrayList(_haleBoolean, _haleBoolean_1, _haleBoolean_2))).assertStackUnchanged().assertStdoutEmpty();
  }

  @Test
  public void evalGreaterThan() {
    final java.util.function.Function<Interpreter, List<HaleBoolean>> _function = (Interpreter i) -> {
      Expression _parseExpression = this._testHelper.parseExpression("1 > 0");
      HaleBoolean _evalGreaterThan = i.evalGreaterThan(((GreaterThan) _parseExpression));
      Expression _parseExpression_1 = this._testHelper.parseExpression("0 > 0");
      HaleBoolean _evalGreaterThan_1 = i.evalGreaterThan(((GreaterThan) _parseExpression_1));
      Expression _parseExpression_2 = this._testHelper.parseExpression("-1 > 0");
      HaleBoolean _evalGreaterThan_2 = i.evalGreaterThan(((GreaterThan) _parseExpression_2));
      return Collections.<HaleBoolean>unmodifiableList(CollectionLiterals.<HaleBoolean>newArrayList(_evalGreaterThan, _evalGreaterThan_1, _evalGreaterThan_2));
    };
    HaleBoolean _haleBoolean = new HaleBoolean(true);
    HaleBoolean _haleBoolean_1 = new HaleBoolean(false);
    HaleBoolean _haleBoolean_2 = new HaleBoolean(false);
    this._testHelper.<HaleBoolean, HaleBoolean, List<HaleBoolean>, List<HaleBoolean>>assertReturnedValuesEqual(this._testHelper.<List<HaleBoolean>>inject(_function), 
      Collections.<HaleBoolean>unmodifiableList(CollectionLiterals.<HaleBoolean>newArrayList(_haleBoolean, _haleBoolean_1, _haleBoolean_2))).assertStackUnchanged().assertStdoutEmpty();
  }

  @Test
  public void evalAddition() {
    final java.util.function.Function<Interpreter, HaleNumber> _function = (Interpreter i) -> {
      Expression _parseExpression = this._testHelper.parseExpression("37 + 7");
      return i.evalAddition(((Addition) _parseExpression));
    };
    TestHelper.InterpretTestResults<HaleNumber> _inject = this._testHelper.<HaleNumber>inject(_function);
    HaleNumber _haleNumber = new HaleNumber(44);
    this._testHelper.<HaleNumber>assertReturnedValueEquals(_inject, _haleNumber).assertStackUnchanged().assertStdoutEmpty();
  }

  @Test
  public void evalSubtraction() {
    final java.util.function.Function<Interpreter, HaleNumber> _function = (Interpreter i) -> {
      Expression _parseExpression = this._testHelper.parseExpression("32 - 238");
      return i.evalSubtraction(((Subtraction) _parseExpression));
    };
    TestHelper.InterpretTestResults<HaleNumber> _inject = this._testHelper.<HaleNumber>inject(_function);
    HaleNumber _haleNumber = new HaleNumber((-206));
    this._testHelper.<HaleNumber>assertReturnedValueEquals(_inject, _haleNumber).assertStackUnchanged().assertStdoutEmpty();
  }

  @Test
  public void evalMultiplication() {
    final java.util.function.Function<Interpreter, HaleNumber> _function = (Interpreter i) -> {
      Expression _parseExpression = this._testHelper.parseExpression("3 * 12");
      return i.evalMultiplication(((Multiplication) _parseExpression));
    };
    TestHelper.InterpretTestResults<HaleNumber> _inject = this._testHelper.<HaleNumber>inject(_function);
    HaleNumber _haleNumber = new HaleNumber(36);
    this._testHelper.<HaleNumber>assertReturnedValueEquals(_inject, _haleNumber).assertStackUnchanged().assertStdoutEmpty();
  }

  @Test
  public void evalDivisionByZero() {
    final java.util.function.Function<Interpreter, HaleNumber> _function = (Interpreter i) -> {
      Expression _parseExpression = this._testHelper.parseExpression("1 / 0");
      return i.evalDivision(((Division) _parseExpression));
    };
    final Consumer<InterpreterException> _function_1 = (InterpreterException e) -> {
      HaleNumber _haleNumber = new HaleNumber(1);
      Assertions.assertEquals(
        ErrorMessages.divideByZero(_haleNumber), 
        e.getMessage());
    };
    this._testHelper.<HaleNumber>prepare(_function).<InterpreterException>injectCatching(InterpreterException.class, _function_1);
  }

  @Test
  public void evalDivision() {
    final java.util.function.Function<Interpreter, List<HaleNumber>> _function = (Interpreter i) -> {
      Expression _parseExpression = this._testHelper.parseExpression("6 / 3");
      HaleNumber _evalDivision = i.evalDivision(((Division) _parseExpression));
      Expression _parseExpression_1 = this._testHelper.parseExpression("10 / 3");
      HaleNumber _evalDivision_1 = i.evalDivision(((Division) _parseExpression_1));
      return Collections.<HaleNumber>unmodifiableList(CollectionLiterals.<HaleNumber>newArrayList(_evalDivision, _evalDivision_1));
    };
    HaleNumber _haleNumber = new HaleNumber(2);
    HaleNumber _haleNumber_1 = new HaleNumber((10.0 / 3));
    this._testHelper.<HaleNumber, HaleNumber, List<HaleNumber>, List<HaleNumber>>assertReturnedValuesEqual(this._testHelper.<List<HaleNumber>>inject(_function), 
      Collections.<HaleNumber>unmodifiableList(CollectionLiterals.<HaleNumber>newArrayList(_haleNumber, _haleNumber_1))).assertStackUnchanged().assertStdoutEmpty();
  }

  @Test
  public void evalRemainder() {
    final java.util.function.Function<Interpreter, List<HaleNumber>> _function = (Interpreter i) -> {
      Expression _parseExpression = this._testHelper.parseExpression("10 % 3");
      HaleNumber _evalRemainder = i.evalRemainder(((Remainder) _parseExpression));
      Expression _parseExpression_1 = this._testHelper.parseExpression("5.4 % 2");
      HaleNumber _evalRemainder_1 = i.evalRemainder(((Remainder) _parseExpression_1));
      Expression _parseExpression_2 = this._testHelper.parseExpression("-8 % 3");
      HaleNumber _evalRemainder_2 = i.evalRemainder(((Remainder) _parseExpression_2));
      return Collections.<HaleNumber>unmodifiableList(CollectionLiterals.<HaleNumber>newArrayList(_evalRemainder, _evalRemainder_1, _evalRemainder_2));
    };
    HaleNumber _haleNumber = new HaleNumber(1);
    HaleNumber _haleNumber_1 = new HaleNumber(1.4);
    HaleNumber _haleNumber_2 = new HaleNumber((-2));
    this._testHelper.<HaleNumber, HaleNumber, List<HaleNumber>, List<HaleNumber>>assertReturnedValuesEqual(this._testHelper.<List<HaleNumber>>inject(_function), 
      Collections.<HaleNumber>unmodifiableList(CollectionLiterals.<HaleNumber>newArrayList(_haleNumber, _haleNumber_1, _haleNumber_2))).assertStackUnchanged().assertStdoutEmpty();
  }

  @Test
  public void evalExponentiation() {
    final java.util.function.Function<Interpreter, List<HaleNumber>> _function = (Interpreter i) -> {
      Expression _parseExpression = this._testHelper.parseExpression("5 ** 3");
      HaleNumber _evalExponentiation = i.evalExponentiation(((Exponentiation) _parseExpression));
      Expression _parseExpression_1 = this._testHelper.parseExpression("7 ** 0");
      HaleNumber _evalExponentiation_1 = i.evalExponentiation(((Exponentiation) _parseExpression_1));
      Expression _parseExpression_2 = this._testHelper.parseExpression("2 ** -2");
      HaleNumber _evalExponentiation_2 = i.evalExponentiation(((Exponentiation) _parseExpression_2));
      Expression _parseExpression_3 = this._testHelper.parseExpression("4 ** 0.5");
      HaleNumber _evalExponentiation_3 = i.evalExponentiation(((Exponentiation) _parseExpression_3));
      return Collections.<HaleNumber>unmodifiableList(CollectionLiterals.<HaleNumber>newArrayList(_evalExponentiation, _evalExponentiation_1, _evalExponentiation_2, _evalExponentiation_3));
    };
    HaleNumber _haleNumber = new HaleNumber(125);
    HaleNumber _haleNumber_1 = new HaleNumber(1);
    HaleNumber _haleNumber_2 = new HaleNumber(0.25);
    HaleNumber _haleNumber_3 = new HaleNumber(2);
    this._testHelper.<HaleNumber, HaleNumber, List<HaleNumber>, List<HaleNumber>>assertReturnedValuesEqual(this._testHelper.<List<HaleNumber>>inject(_function), 
      Collections.<HaleNumber>unmodifiableList(CollectionLiterals.<HaleNumber>newArrayList(_haleNumber, _haleNumber_1, _haleNumber_2, _haleNumber_3))).assertStackUnchanged().assertStdoutEmpty();
  }

  @Test
  public void evalConversion() {
    try {
      final HaleEitherType eitherType = new HaleEitherType(HalePrimitiveType.NUMBER, HalePrimitiveType.VOID);
      final java.util.function.Function<Interpreter, List<HaleValue>> _function = (Interpreter i) -> {
        Expression _parseExpression = this._testHelper.parseExpression("5 as String");
        HaleValue _evalConversion = i.evalConversion(((Conversion) _parseExpression));
        Expression _parseExpression_1 = this._testHelper.parseExpression("-1.8 as String");
        HaleValue _evalConversion_1 = i.evalConversion(((Conversion) _parseExpression_1));
        Expression _parseExpression_2 = this._testHelper.parseExpression("true as String");
        HaleValue _evalConversion_2 = i.evalConversion(((Conversion) _parseExpression_2));
        Expression _parseExpression_3 = this._testHelper.parseExpression("void as String");
        HaleValue _evalConversion_3 = i.evalConversion(((Conversion) _parseExpression_3));
        Expression _parseExpression_4 = this._testHelper.parseExpression("\"3.2\" as Number");
        HaleValue _evalConversion_4 = i.evalConversion(((Conversion) _parseExpression_4));
        Expression _parseExpression_5 = this._testHelper.parseExpression("\"-2.5\" as Number");
        HaleValue _evalConversion_5 = i.evalConversion(((Conversion) _parseExpression_5));
        Expression _parseExpression_6 = this._testHelper.parseExpression("\"abc\" as Number");
        HaleValue _evalConversion_6 = i.evalConversion(((Conversion) _parseExpression_6));
        return Collections.<HaleValue>unmodifiableList(CollectionLiterals.<HaleValue>newArrayList(_evalConversion, _evalConversion_1, _evalConversion_2, _evalConversion_3, _evalConversion_4, _evalConversion_5, _evalConversion_6));
      };
      HaleString _haleString = new HaleString("5");
      HaleString _haleString_1 = new HaleString("-1.8");
      HaleString _haleString_2 = new HaleString("true");
      HaleString _haleString_3 = new HaleString("void");
      HaleNumber _haleNumber = new HaleNumber(3.2);
      HaleEither _haleEither = new HaleEither(eitherType, _haleNumber, true);
      HaleNumber _haleNumber_1 = new HaleNumber((-2.5));
      HaleEither _haleEither_1 = new HaleEither(eitherType, _haleNumber_1, true);
      HaleVoid _haleVoid = new HaleVoid();
      HaleEither _haleEither_2 = new HaleEither(eitherType, _haleVoid, false);
      this._testHelper.<HaleValue, HaleValue, List<HaleValue>, List<HaleValue>>assertReturnedValuesEqual(this._testHelper.<List<HaleValue>>inject(_function), 
        Collections.<HaleValue>unmodifiableList(CollectionLiterals.<HaleValue>newArrayList(_haleString, _haleString_1, _haleString_2, _haleString_3, _haleEither, _haleEither_1, _haleEither_2))).assertStackUnchanged().assertStdoutEmpty();
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }

  @Test
  public void evalUnaryNegation() {
    final java.util.function.Function<Interpreter, HaleNumber> _function = (Interpreter i) -> {
      Expression _parseExpression = this._testHelper.parseExpression("-5");
      return i.evalUnaryNegation(((UnaryNegation) _parseExpression));
    };
    TestHelper.InterpretTestResults<HaleNumber> _inject = this._testHelper.<HaleNumber>inject(_function);
    HaleNumber _haleNumber = new HaleNumber((-5));
    this._testHelper.<HaleNumber>assertReturnedValueEquals(_inject, _haleNumber).assertStackUnchanged().assertStdoutEmpty();
  }

  @Test
  public void evalLogicalNot() {
    final java.util.function.Function<Interpreter, List<HaleBoolean>> _function = (Interpreter i) -> {
      Expression _parseExpression = this._testHelper.parseExpression("not true");
      HaleBoolean _evalLogicalNot = i.evalLogicalNot(((LogicalNot) _parseExpression));
      Expression _parseExpression_1 = this._testHelper.parseExpression("not false");
      HaleBoolean _evalLogicalNot_1 = i.evalLogicalNot(((LogicalNot) _parseExpression_1));
      return Collections.<HaleBoolean>unmodifiableList(CollectionLiterals.<HaleBoolean>newArrayList(_evalLogicalNot, _evalLogicalNot_1));
    };
    HaleBoolean _haleBoolean = new HaleBoolean(false);
    HaleBoolean _haleBoolean_1 = new HaleBoolean(true);
    this._testHelper.<HaleBoolean, HaleBoolean, List<HaleBoolean>, List<HaleBoolean>>assertReturnedValuesEqual(this._testHelper.<List<HaleBoolean>>inject(_function), 
      Collections.<HaleBoolean>unmodifiableList(CollectionLiterals.<HaleBoolean>newArrayList(_haleBoolean, _haleBoolean_1))).assertStackUnchanged().assertStdoutEmpty();
  }

  @Test
  public void evalApplication() {
    final String functionStmt = "function xyz() { print \"called function\"; }";
    Statement _parseStatement = this._testHelper.parseStatement(functionStmt);
    final Function function = ((Function) _parseStatement);
    final java.util.function.Function<Interpreter, HaleValue> _function = (Interpreter i) -> {
      Statement _get = this._testHelper.parseStatements((functionStmt + "; xyz();"), 2).get(1);
      return i.evalApplication(((Application) _get));
    };
    HaleFunctionType _resolveFunctionSignature = Interpreter.resolveFunctionSignature(function);
    HaleFunction _haleFunction = new HaleFunction(_resolveFunctionSignature, function);
    Pair<String, HaleFunction> _mappedTo = Pair.<String, HaleFunction>of("xyz", _haleFunction);
    TestHelper.InterpretTestResults<HaleValue> _inject = this._testHelper.<HaleValue>prepare(_function).withStack(Collections.<String, HaleValue>unmodifiableMap(CollectionLiterals.<String, HaleValue>newHashMap(_mappedTo))).inject();
    HaleVoid _haleVoid = new HaleVoid();
    TestHelper.InterpretTestResults<HaleValue> _assertStackUnchanged = this._testHelper.<HaleValue>assertReturnedValueEquals(_inject, _haleVoid).assertStackUnchanged();
    String _lineSeparator = System.lineSeparator();
    String _plus = ("called function" + _lineSeparator);
    _assertStackUnchanged.assertStdoutEquals(_plus);
  }

  @Test
  public void evalApplicationWithParam() {
    final String functionStmt = "function xyz(num: Number) { print num; }";
    Statement _parseStatement = this._testHelper.parseStatement(functionStmt);
    final Function function = ((Function) _parseStatement);
    final java.util.function.Function<Interpreter, HaleValue> _function = (Interpreter i) -> {
      Statement _get = this._testHelper.parseStatements((functionStmt + "; xyz(5);"), 2).get(1);
      return i.evalApplication(((Application) _get));
    };
    HaleFunctionType _resolveFunctionSignature = Interpreter.resolveFunctionSignature(function);
    HaleFunction _haleFunction = new HaleFunction(_resolveFunctionSignature, function);
    Pair<String, HaleFunction> _mappedTo = Pair.<String, HaleFunction>of("xyz", _haleFunction);
    TestHelper.InterpretTestResults<HaleValue> _inject = this._testHelper.<HaleValue>prepare(_function).withStack(Collections.<String, HaleValue>unmodifiableMap(CollectionLiterals.<String, HaleValue>newHashMap(_mappedTo))).inject();
    HaleVoid _haleVoid = new HaleVoid();
    TestHelper.InterpretTestResults<HaleValue> _assertStackUnchanged = this._testHelper.<HaleValue>assertReturnedValueEquals(_inject, _haleVoid).assertStackUnchanged();
    String _lineSeparator = System.lineSeparator();
    String _plus = ("5" + _lineSeparator);
    _assertStackUnchanged.assertStdoutEquals(_plus);
  }

  @Test
  public void evalApplicationWithReturn() {
    final String functionStmt = "function xyz(): Boolean { return true; }";
    Statement _parseStatement = this._testHelper.parseStatement(functionStmt);
    final Function function = ((Function) _parseStatement);
    final java.util.function.Function<Interpreter, HaleValue> _function = (Interpreter i) -> {
      Statement _get = this._testHelper.parseStatements((functionStmt + "; xyz();"), 2).get(1);
      return i.evalApplication(((Application) _get));
    };
    HaleFunctionType _resolveFunctionSignature = Interpreter.resolveFunctionSignature(function);
    HaleFunction _haleFunction = new HaleFunction(_resolveFunctionSignature, function);
    Pair<String, HaleFunction> _mappedTo = Pair.<String, HaleFunction>of("xyz", _haleFunction);
    TestHelper.InterpretTestResults<HaleValue> _inject = this._testHelper.<HaleValue>prepare(_function).withStack(Collections.<String, HaleValue>unmodifiableMap(CollectionLiterals.<String, HaleValue>newHashMap(_mappedTo))).inject();
    HaleBoolean _haleBoolean = new HaleBoolean(true);
    this._testHelper.<HaleValue>assertReturnedValueEquals(_inject, _haleBoolean).assertStackUnchanged().assertStdoutEmpty();
  }

  @Test
  public void evalApplicationWithReturnEither() {
    try {
      final String functionStmt = "function xyz(): Boolean ? Boolean { return true; }";
      Statement _parseStatement = this._testHelper.parseStatement(functionStmt);
      final Function function = ((Function) _parseStatement);
      final java.util.function.Function<Interpreter, HaleValue> _function = (Interpreter i) -> {
        Statement _get = this._testHelper.parseStatements((functionStmt + "; xyz();"), 2).get(1);
        return i.evalApplication(((Application) _get));
      };
      HaleFunctionType _resolveFunctionSignature = Interpreter.resolveFunctionSignature(function);
      HaleFunction _haleFunction = new HaleFunction(_resolveFunctionSignature, function);
      Pair<String, HaleFunction> _mappedTo = Pair.<String, HaleFunction>of("xyz", _haleFunction);
      TestHelper.InterpretTestResults<HaleValue> _inject = this._testHelper.<HaleValue>prepare(_function).withStack(Collections.<String, HaleValue>unmodifiableMap(CollectionLiterals.<String, HaleValue>newHashMap(_mappedTo))).inject();
      HaleEitherType _haleEitherType = new HaleEitherType(HalePrimitiveType.BOOLEAN, HalePrimitiveType.BOOLEAN);
      HaleBoolean _haleBoolean = new HaleBoolean(true);
      HaleEither _haleEither = new HaleEither(_haleEitherType, _haleBoolean, 
        true);
      this._testHelper.<HaleValue>assertReturnedValueEquals(_inject, _haleEither).assertStackUnchanged().assertStdoutEmpty();
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }

  @Test
  public void evalApplicationWithThrowEither() {
    try {
      final String functionStmt = "function xyz(): Boolean ? Boolean { throw true; }";
      Statement _parseStatement = this._testHelper.parseStatement(functionStmt);
      final Function function = ((Function) _parseStatement);
      final java.util.function.Function<Interpreter, HaleValue> _function = (Interpreter i) -> {
        Statement _get = this._testHelper.parseStatements((functionStmt + "; xyz();"), 2).get(1);
        return i.evalApplication(((Application) _get));
      };
      HaleFunctionType _resolveFunctionSignature = Interpreter.resolveFunctionSignature(function);
      HaleFunction _haleFunction = new HaleFunction(_resolveFunctionSignature, function);
      Pair<String, HaleFunction> _mappedTo = Pair.<String, HaleFunction>of("xyz", _haleFunction);
      TestHelper.InterpretTestResults<HaleValue> _inject = this._testHelper.<HaleValue>prepare(_function).withStack(Collections.<String, HaleValue>unmodifiableMap(CollectionLiterals.<String, HaleValue>newHashMap(_mappedTo))).inject();
      HaleEitherType _haleEitherType = new HaleEitherType(HalePrimitiveType.BOOLEAN, HalePrimitiveType.BOOLEAN);
      HaleBoolean _haleBoolean = new HaleBoolean(true);
      HaleEither _haleEither = new HaleEither(_haleEitherType, _haleBoolean, 
        false);
      this._testHelper.<HaleValue>assertReturnedValueEquals(_inject, _haleEither).assertStackUnchanged().assertStdoutEmpty();
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }

  @Test
  public void evalApplicationWithNonFunctionExpr() {
    final java.util.function.Function<Interpreter, HaleValue> _function = (Interpreter i) -> {
      Statement _parseStatement = this._testHelper.parseStatement("void();");
      return i.evalApplication(
        ((Application) _parseStatement));
    };
    final Consumer<InterpreterException> _function_1 = (InterpreterException e) -> {
      HaleVoid _haleVoid = new HaleVoid();
      Assertions.assertEquals(
        ErrorMessages.valueNotAFunction(_haleVoid), e.getMessage());
    };
    this._testHelper.<HaleValue>prepare(_function).<InterpreterException>injectCatching(InterpreterException.class, _function_1);
  }

  @Test
  public void evalApplicationWithWrongNumArgs() {
    final String functionStmt = "function xyz(num: Number) {}";
    Statement _parseStatement = this._testHelper.parseStatement(functionStmt);
    final Function function = ((Function) _parseStatement);
    final java.util.function.Function<Interpreter, HaleValue> _function = (Interpreter i) -> {
      Statement _get = this._testHelper.parseStatements((functionStmt + "; xyz();"), 2).get(1);
      return i.evalApplication(((Application) _get));
    };
    HaleFunctionType _resolveFunctionSignature = Interpreter.resolveFunctionSignature(function);
    HaleFunction _haleFunction = new HaleFunction(_resolveFunctionSignature, function);
    Pair<String, HaleFunction> _mappedTo = Pair.<String, HaleFunction>of("xyz", _haleFunction);
    final Consumer<InterpreterException> _function_1 = (InterpreterException e) -> {
      Assertions.assertEquals(
        ErrorMessages.wrongNumberOfArguments(
          1, 0), e.getMessage());
    };
    this._testHelper.<HaleValue>prepare(_function).withStack(Collections.<String, HaleValue>unmodifiableMap(CollectionLiterals.<String, HaleValue>newHashMap(_mappedTo))).<InterpreterException>injectCatching(InterpreterException.class, _function_1);
  }

  @Test
  public void evalApplicationWithWrongArgType() {
    final String functionStmt = "function xyz(num: Number) {}";
    Statement _parseStatement = this._testHelper.parseStatement(functionStmt);
    final Function function = ((Function) _parseStatement);
    final java.util.function.Function<Interpreter, HaleValue> _function = (Interpreter i) -> {
      Statement _get = this._testHelper.parseStatements((functionStmt + "; xyz(void);"), 2).get(1);
      return i.evalApplication(((Application) _get));
    };
    HaleFunctionType _resolveFunctionSignature = Interpreter.resolveFunctionSignature(function);
    HaleFunction _haleFunction = new HaleFunction(_resolveFunctionSignature, function);
    Pair<String, HaleFunction> _mappedTo = Pair.<String, HaleFunction>of("xyz", _haleFunction);
    final Consumer<InterpreterException> _function_1 = (InterpreterException e) -> {
      HaleVoid _haleVoid = new HaleVoid();
      Assertions.assertEquals(
        ErrorMessages.argumentOfWrongType(_haleVoid, "num", HalePrimitiveType.NUMBER), e.getMessage());
    };
    this._testHelper.<HaleValue>prepare(_function).withStack(Collections.<String, HaleValue>unmodifiableMap(CollectionLiterals.<String, HaleValue>newHashMap(_mappedTo))).<InterpreterException>injectCatching(InterpreterException.class, _function_1);
  }

  @Test
  public void evalApplicationWithWrongReturnType() {
    final String functionStmt = "function xyz(): Number {}";
    Statement _parseStatement = this._testHelper.parseStatement(functionStmt);
    final Function function = ((Function) _parseStatement);
    final java.util.function.Function<Interpreter, HaleValue> _function = (Interpreter i) -> {
      Statement _get = this._testHelper.parseStatements((functionStmt + "; xyz();"), 2).get(1);
      return i.evalApplication(((Application) _get));
    };
    HaleFunctionType _resolveFunctionSignature = Interpreter.resolveFunctionSignature(function);
    HaleFunction _haleFunction = new HaleFunction(_resolveFunctionSignature, function);
    Pair<String, HaleFunction> _mappedTo = Pair.<String, HaleFunction>of("xyz", _haleFunction);
    final Consumer<InterpreterException> _function_1 = (InterpreterException e) -> {
      HaleVoid _haleVoid = new HaleVoid();
      Assertions.assertEquals(
        ErrorMessages.returnValueOfWrongType(_haleVoid, HalePrimitiveType.NUMBER), e.getMessage());
    };
    this._testHelper.<HaleValue>prepare(_function).withStack(Collections.<String, HaleValue>unmodifiableMap(CollectionLiterals.<String, HaleValue>newHashMap(_mappedTo))).<InterpreterException>injectCatching(InterpreterException.class, _function_1);
  }

  @Test
  public void evalVoidLiteral() {
    final java.util.function.Function<Interpreter, HaleVoid> _function = (Interpreter i) -> {
      Expression _parseExpression = this._testHelper.parseExpression("void");
      return i.evalVoidLiteral(((VoidLiteral) _parseExpression));
    };
    TestHelper.InterpretTestResults<HaleVoid> _inject = this._testHelper.<HaleVoid>inject(_function);
    HaleVoid _haleVoid = new HaleVoid();
    this._testHelper.<HaleVoid>assertReturnedValueEquals(_inject, _haleVoid).assertStackUnchanged().assertStdoutEmpty();
  }

  @Test
  public void evalBooleanLiteral() {
    final java.util.function.Function<Interpreter, List<HaleBoolean>> _function = (Interpreter i) -> {
      Expression _parseExpression = this._testHelper.parseExpression("false");
      HaleBoolean _evalBooleanLiteral = i.evalBooleanLiteral(((BooleanLiteral) _parseExpression));
      Expression _parseExpression_1 = this._testHelper.parseExpression("true");
      HaleBoolean _evalBooleanLiteral_1 = i.evalBooleanLiteral(((BooleanLiteral) _parseExpression_1));
      return Collections.<HaleBoolean>unmodifiableList(CollectionLiterals.<HaleBoolean>newArrayList(_evalBooleanLiteral, _evalBooleanLiteral_1));
    };
    HaleBoolean _haleBoolean = new HaleBoolean(false);
    HaleBoolean _haleBoolean_1 = new HaleBoolean(true);
    this._testHelper.<HaleBoolean, HaleBoolean, List<HaleBoolean>, List<HaleBoolean>>assertReturnedValuesEqual(this._testHelper.<List<HaleBoolean>>inject(_function), 
      Collections.<HaleBoolean>unmodifiableList(CollectionLiterals.<HaleBoolean>newArrayList(_haleBoolean, _haleBoolean_1))).assertStackUnchanged().assertStdoutEmpty();
  }

  @Test
  public void evalNumberLiteral() {
    final java.util.function.Function<Interpreter, List<HaleNumber>> _function = (Interpreter i) -> {
      Expression _parseExpression = this._testHelper.parseExpression("162");
      HaleNumber _evalNumberLiteral = i.evalNumberLiteral(((NumberLiteral) _parseExpression));
      Expression _parseExpression_1 = this._testHelper.parseExpression("19.235");
      HaleNumber _evalNumberLiteral_1 = i.evalNumberLiteral(((NumberLiteral) _parseExpression_1));
      return Collections.<HaleNumber>unmodifiableList(CollectionLiterals.<HaleNumber>newArrayList(_evalNumberLiteral, _evalNumberLiteral_1));
    };
    HaleNumber _haleNumber = new HaleNumber(162);
    HaleNumber _haleNumber_1 = new HaleNumber(19.235);
    this._testHelper.<HaleNumber, HaleNumber, List<HaleNumber>, List<HaleNumber>>assertReturnedValuesEqual(this._testHelper.<List<HaleNumber>>inject(_function), 
      Collections.<HaleNumber>unmodifiableList(CollectionLiterals.<HaleNumber>newArrayList(_haleNumber, _haleNumber_1))).assertStackUnchanged().assertStdoutEmpty();
  }

  @Test
  public void evalStringLiteral() {
    final java.util.function.Function<Interpreter, HaleString> _function = (Interpreter i) -> {
      Expression _parseExpression = this._testHelper.parseExpression("\"Hello\"");
      return i.evalStringLiteral(((StringLiteral) _parseExpression));
    };
    TestHelper.InterpretTestResults<HaleString> _inject = this._testHelper.<HaleString>inject(_function);
    HaleString _haleString = new HaleString("Hello");
    this._testHelper.<HaleString>assertReturnedValueEquals(_inject, _haleString).assertStackUnchanged().assertStdoutEmpty();
  }

  @Test
  public void evalBindingReference() {
    final java.util.function.Function<Interpreter, HaleValue> _function = (Interpreter i) -> {
      Statement _get = this._testHelper.parseStatements("let xyz = void; xyz;", 2).get(1);
      return i.evalBindingReference(
        ((BindingReference) _get));
    };
    HaleVoid _haleVoid = new HaleVoid();
    Pair<String, HaleVoid> _mappedTo = Pair.<String, HaleVoid>of("xyz", _haleVoid);
    TestHelper.InterpretTestResults<HaleValue> _inject = this._testHelper.<HaleValue>prepare(_function).withStack(Collections.<String, HaleValue>unmodifiableMap(CollectionLiterals.<String, HaleValue>newHashMap(_mappedTo))).inject();
    HaleVoid _haleVoid_1 = new HaleVoid();
    this._testHelper.<HaleValue>assertReturnedValueEquals(_inject, _haleVoid_1).assertStackUnchanged().assertStdoutEmpty();
  }

  @Test
  public void evalInput() {
    final java.util.function.Function<Interpreter, HaleString> _function = (Interpreter i) -> {
      Expression _parseExpression = this._testHelper.parseExpression("input");
      return i.evalInput(((Input) _parseExpression));
    };
    TestHelper.InterpretTestBuilder<HaleString> _prepare = this._testHelper.<HaleString>prepare(_function);
    String _lineSeparator = System.lineSeparator();
    String _plus = ("hello" + _lineSeparator);
    TestHelper.InterpretTestResults<HaleString> _inject = _prepare.withInput(_plus).inject();
    HaleString _haleString = new HaleString("hello");
    this._testHelper.<HaleString>assertReturnedValueEquals(_inject, _haleString).assertStackUnchanged().assertStdoutEmpty();
  }

  @Test
  public void resolveFunctionType() {
    final HaleFunctionType expected = new HaleFunctionType(
      Collections.<HaleType>unmodifiableList(CollectionLiterals.<HaleType>newArrayList()), 
      HalePrimitiveType.VOID);
    Type _parseType = this._testHelper.parseType("Function()");
    final HaleFunctionType actual = Interpreter.resolveFunctionType(
      ((FunctionType) _parseType));
    this._testHelper.assertTypeEquals(expected, actual);
  }

  @Test
  public void resolveFunctionTypeWithParams() {
    final HaleFunctionType expected = new HaleFunctionType(
      Collections.<HaleType>unmodifiableList(CollectionLiterals.<HaleType>newArrayList(HalePrimitiveType.STRING, HalePrimitiveType.BOOLEAN)), 
      HalePrimitiveType.VOID);
    Type _parseType = this._testHelper.parseType("Function(String, Boolean)");
    final HaleFunctionType actual = Interpreter.resolveFunctionType(
      ((FunctionType) _parseType));
    this._testHelper.assertTypeEquals(expected, actual);
  }

  @Test
  public void resolveFunctionTypeWithReturnType() {
    final HaleFunctionType expected = new HaleFunctionType(
      Collections.<HaleType>unmodifiableList(CollectionLiterals.<HaleType>newArrayList()), 
      HalePrimitiveType.NUMBER);
    Type _parseType = this._testHelper.parseType("Function(): Number");
    final HaleFunctionType actual = Interpreter.resolveFunctionType(
      ((FunctionType) _parseType));
    this._testHelper.assertTypeEquals(expected, actual);
  }

  @Test
  public void resolveEitherType() {
    final HaleEitherType expected = new HaleEitherType(
      HalePrimitiveType.NUMBER, 
      HalePrimitiveType.VOID);
    Type _parseType = this._testHelper.parseType("Number ? Void");
    final HaleEitherType actual = Interpreter.resolveEitherType(
      ((EitherType) _parseType));
    this._testHelper.assertTypeEquals(expected, actual);
  }

  @Test
  public void resolvePrimitiveType() {
    Pair<String, HalePrimitiveType> _mappedTo = Pair.<String, HalePrimitiveType>of("Void", HalePrimitiveType.VOID);
    Pair<String, HalePrimitiveType> _mappedTo_1 = Pair.<String, HalePrimitiveType>of("Boolean", HalePrimitiveType.BOOLEAN);
    Pair<String, HalePrimitiveType> _mappedTo_2 = Pair.<String, HalePrimitiveType>of("Number", HalePrimitiveType.NUMBER);
    Pair<String, HalePrimitiveType> _mappedTo_3 = Pair.<String, HalePrimitiveType>of("String", HalePrimitiveType.STRING);
    final List<Pair<String, HalePrimitiveType>> pairs = Collections.<Pair<String, HalePrimitiveType>>unmodifiableList(CollectionLiterals.<Pair<String, HalePrimitiveType>>newArrayList(_mappedTo, _mappedTo_1, _mappedTo_2, _mappedTo_3));
    for (final Pair<String, HalePrimitiveType> pair : pairs) {
      Type _parseType = this._testHelper.parseType(pair.getKey());
      pair.getValue().typeEquals(
        Interpreter.resolvePrimitiveType(
          ((PrimitiveType) _parseType)));
    }
  }

  @Test
  public void resolveFunctionSignature() {
    final HaleFunctionType expected = new HaleFunctionType(
      Collections.<HaleType>unmodifiableList(CollectionLiterals.<HaleType>newArrayList()), 
      HalePrimitiveType.VOID);
    Statement _parseStatement = this._testHelper.parseStatement("function xyz() {}");
    final HaleFunctionType actual = Interpreter.resolveFunctionSignature(
      ((Function) _parseStatement));
    this._testHelper.assertTypeEquals(expected, actual);
  }

  @Test
  public void resolveFunctionSignatureWithParams() {
    final HaleFunctionType expected = new HaleFunctionType(
      Collections.<HaleType>unmodifiableList(CollectionLiterals.<HaleType>newArrayList(HalePrimitiveType.NUMBER, HalePrimitiveType.VOID)), 
      HalePrimitiveType.VOID);
    Statement _parseStatement = this._testHelper.parseStatement("function xyz(abc: Number, def: Void) {}");
    final HaleFunctionType actual = Interpreter.resolveFunctionSignature(
      ((Function) _parseStatement));
    this._testHelper.assertTypeEquals(expected, actual);
  }

  @Test
  public void resolveFunctionSignatureWithReturnType() {
    final HaleFunctionType expected = new HaleFunctionType(
      Collections.<HaleType>unmodifiableList(CollectionLiterals.<HaleType>newArrayList()), 
      HalePrimitiveType.BOOLEAN);
    Statement _parseStatement = this._testHelper.parseStatement("function xyz(): Boolean {}");
    final HaleFunctionType actual = Interpreter.resolveFunctionSignature(
      ((Function) _parseStatement));
    this._testHelper.assertTypeEquals(expected, actual);
  }
}
