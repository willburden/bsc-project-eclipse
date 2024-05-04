package willburden.hale.tests;

import com.google.inject.Inject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.extensions.InjectionExtension;
import org.eclipse.xtext.xbase.lib.Extension;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import willburden.hale.hale.Addition;
import willburden.hale.hale.Application;
import willburden.hale.hale.Assignment;
import willburden.hale.hale.Binding;
import willburden.hale.hale.BindingReference;
import willburden.hale.hale.Block;
import willburden.hale.hale.BooleanLiteral;
import willburden.hale.hale.Break;
import willburden.hale.hale.Concatenation;
import willburden.hale.hale.Conversion;
import willburden.hale.hale.Division;
import willburden.hale.hale.EitherType;
import willburden.hale.hale.ElseLet;
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
import willburden.hale.hale.Parameter;
import willburden.hale.hale.PrimitiveType;
import willburden.hale.hale.Print;
import willburden.hale.hale.Remainder;
import willburden.hale.hale.Return;
import willburden.hale.hale.Statement;
import willburden.hale.hale.StringLiteral;
import willburden.hale.hale.Subtraction;
import willburden.hale.hale.Throw;
import willburden.hale.hale.Type;
import willburden.hale.hale.UnaryNegation;
import willburden.hale.hale.VoidLiteral;
import willburden.hale.hale.While;

@ExtendWith(InjectionExtension.class)
@InjectWith(HaleInjectorProvider.class)
@SuppressWarnings("all")
public class HaleParsingTest {
  @Inject
  @Extension
  private TestHelper _testHelper;

  @Test
  public void hale() {
    this._testHelper.parseStatements("; false;; -3; void; ; ;", 3);
  }

  @Test
  public void bracedBlock() {
    Statement _parseStatement = this._testHelper.parseStatement("{ void; 5; true; }");
    final Block block = ((Block) _parseStatement);
    Assertions.assertEquals(3, block.getStatements().size());
  }

  @Test
  public void voidLiteral() {
    Expression _parseExpression = this._testHelper.parseExpression("void");
    Assertions.assertTrue((_parseExpression instanceof VoidLiteral));
  }

  @Test
  public void booleanLiteral() {
    Expression _parseExpression = this._testHelper.parseExpression("false");
    Assertions.assertEquals(Boolean.valueOf(false), Boolean.valueOf(((BooleanLiteral) _parseExpression).isValue()));
    Expression _parseExpression_1 = this._testHelper.parseExpression("true");
    Assertions.assertEquals(Boolean.valueOf(true), Boolean.valueOf(((BooleanLiteral) _parseExpression_1).isValue()));
  }

  @Test
  public void numberLiteral() {
    Expression _parseExpression = this._testHelper.parseExpression("0");
    Assertions.assertEquals(0, ((NumberLiteral) _parseExpression).getValue());
    Expression _parseExpression_1 = this._testHelper.parseExpression("163");
    Assertions.assertEquals(163, ((NumberLiteral) _parseExpression_1).getValue());
    Expression _parseExpression_2 = this._testHelper.parseExpression("51.26");
    Assertions.assertEquals(51.26, ((NumberLiteral) _parseExpression_2).getValue());
  }

  @Test
  public void stringLiteral() {
    Expression _parseExpression = this._testHelper.parseExpression("\"hello\"");
    Assertions.assertEquals("hello", ((StringLiteral) _parseExpression).getValue());
    Expression _parseExpression_1 = this._testHelper.parseExpression("\"\"");
    Assertions.assertEquals("", ((StringLiteral) _parseExpression_1).getValue());
  }

  @Test
  public void FunctionType() {
    Type _parseType = this._testHelper.parseType("Function()");
    final FunctionType type = ((FunctionType) _parseType);
    Assertions.assertEquals(0, type.getParamTypes().size());
    Assertions.assertNull(type.getReturnType());
  }

  @Test
  public void FunctionTypeWithParams() {
    Type _parseType = this._testHelper.parseType("Function(Number, String)");
    final FunctionType type = ((FunctionType) _parseType);
    Assertions.assertEquals(2, type.getParamTypes().size());
    Type _get = type.getParamTypes().get(0);
    Assertions.assertEquals("Number", ((PrimitiveType) _get).getType());
    Type _get_1 = type.getParamTypes().get(1);
    Assertions.assertEquals("String", ((PrimitiveType) _get_1).getType());
    Assertions.assertNull(type.getReturnType());
  }

  @Test
  public void FunctionTypeWithReturnType() {
    Type _parseType = this._testHelper.parseType("Function(): Boolean");
    final FunctionType type = ((FunctionType) _parseType);
    Assertions.assertEquals(0, type.getParamTypes().size());
    Type _returnType = type.getReturnType();
    Assertions.assertEquals("Boolean", ((PrimitiveType) _returnType).getType());
  }

  @Test
  public void EitherType() {
    Type _parseType = this._testHelper.parseType("String ? Void");
    final EitherType type = ((EitherType) _parseType);
    Type _left = type.getLeft();
    Assertions.assertEquals("String", ((PrimitiveType) _left).getType());
    Type _right = type.getRight();
    Assertions.assertEquals("Void", ((PrimitiveType) _right).getType());
  }

  @Test
  public void primitiveType() {
    Type _parseType = this._testHelper.parseType("Void");
    Assertions.assertEquals("Void", ((PrimitiveType) _parseType).getType());
    Type _parseType_1 = this._testHelper.parseType("Boolean");
    Assertions.assertEquals("Boolean", ((PrimitiveType) _parseType_1).getType());
    Type _parseType_2 = this._testHelper.parseType("Number");
    Assertions.assertEquals("Number", ((PrimitiveType) _parseType_2).getType());
    Type _parseType_3 = this._testHelper.parseType("String");
    Assertions.assertEquals("String", ((PrimitiveType) _parseType_3).getType());
  }

  @Test
  public void letBinding() {
    Statement _parseStatement = this._testHelper.parseStatement("let xyz = void;");
    final LetBinding stmt = ((LetBinding) _parseStatement);
    Assertions.assertFalse(stmt.isMutable());
    Assertions.assertEquals("xyz", stmt.getBinding().getName());
    Assertions.assertNull(stmt.getType());
    Expression _expression = stmt.getExpression();
    Assertions.assertTrue((_expression instanceof VoidLiteral));
  }

  @Test
  public void letBindingWithMut() {
    Statement _parseStatement = this._testHelper.parseStatement("let mut total = 0;");
    final LetBinding stmt = ((LetBinding) _parseStatement);
    Assertions.assertTrue(stmt.isMutable());
    Assertions.assertEquals("total", stmt.getBinding().getName());
    Assertions.assertNull(stmt.getType());
    Expression _expression = stmt.getExpression();
    Assertions.assertEquals(0, ((NumberLiteral) _expression).getValue());
  }

  @Test
  public void letBindingWithTypeAnnotation() {
    Statement _parseStatement = this._testHelper.parseStatement("let hello: String = \"Hello!\";");
    final LetBinding stmt = ((LetBinding) _parseStatement);
    Assertions.assertFalse(stmt.isMutable());
    Assertions.assertEquals("hello", stmt.getBinding().getName());
    Type _type = stmt.getType();
    Assertions.assertEquals("String", ((PrimitiveType) _type).getType());
    Expression _expression = stmt.getExpression();
    Assertions.assertEquals("Hello!", ((StringLiteral) _expression).getValue());
  }

  @Test
  public void bindingReference() {
    final EList<Statement> stmts = this._testHelper.parseStatements("let user = \"Alice\"; user;", 2);
    Statement _get = stmts.get(0);
    final Binding binding = ((LetBinding) _get).getBinding();
    Statement _get_1 = stmts.get(1);
    final BindingReference ref = ((BindingReference) _get_1);
    Assertions.assertEquals(binding, ref.getBinding());
  }

  @Test
  public void assignment() {
    final EList<Statement> stmts = this._testHelper.parseStatements("let mut total = 3; total = 5;", 2);
    Statement _get = stmts.get(0);
    final Binding binding = ((LetBinding) _get).getBinding();
    Statement _get_1 = stmts.get(1);
    final Assignment assignment = ((Assignment) _get_1);
    Assertions.assertEquals(binding, assignment.getBinding());
    Expression _expression = assignment.getExpression();
    Assertions.assertEquals(5, ((NumberLiteral) _expression).getValue());
  }

  @Test
  public void input() {
    Expression _parseExpression = this._testHelper.parseExpression("input");
    Assertions.assertTrue((_parseExpression instanceof Input));
  }

  @Test
  public void print() {
    Statement _parseStatement = this._testHelper.parseStatement("print \"Hello, world!\";");
    final Print stmt = ((Print) _parseStatement);
    Expression _expression = stmt.getExpression();
    Assertions.assertEquals("Hello, world!", ((StringLiteral) _expression).getValue());
  }

  @Test
  public void ifLet() {
    Statement _parseStatement = this._testHelper.parseStatement("if let xyz = void { xyz; }");
    final IfLet ifLet = ((IfLet) _parseStatement);
    Assertions.assertFalse(ifLet.isMutable());
    Assertions.assertEquals("xyz", ifLet.getBinding().getName());
    Assertions.assertNull(ifLet.getType());
    Expression _expression = ifLet.getExpression();
    Assertions.assertTrue((_expression instanceof VoidLiteral));
    Assertions.assertNull(ifLet.getElseLet());
    final EList<Statement> stmts = ifLet.getIfBlock().getStatements();
    Assertions.assertEquals(1, stmts.size());
    Statement _get = stmts.get(0);
    Assertions.assertEquals(ifLet.getBinding(), ((BindingReference) _get).getBinding());
  }

  @Test
  public void ifLetMut() {
    Statement _parseStatement = this._testHelper.parseStatement("if let mut xyz = void {}");
    final IfLet ifLet = ((IfLet) _parseStatement);
    Assertions.assertTrue(ifLet.isMutable());
    Assertions.assertEquals("xyz", ifLet.getBinding().getName());
    Assertions.assertNull(ifLet.getType());
    Expression _expression = ifLet.getExpression();
    Assertions.assertTrue((_expression instanceof VoidLiteral));
    Assertions.assertNull(ifLet.getElseLet());
    Assertions.assertEquals(0, ifLet.getIfBlock().getStatements().size());
  }

  @Test
  public void ifLetWithTypeAnnotation() {
    Statement _parseStatement = this._testHelper.parseStatement("if let xyz: Void = void {}");
    final IfLet ifLet = ((IfLet) _parseStatement);
    Assertions.assertFalse(ifLet.isMutable());
    Assertions.assertEquals("xyz", ifLet.getBinding().getName());
    Type _type = ifLet.getType();
    Assertions.assertEquals("Void", ((PrimitiveType) _type).getType());
    Expression _expression = ifLet.getExpression();
    Assertions.assertTrue((_expression instanceof VoidLiteral));
    Assertions.assertNull(ifLet.getElseLet());
    Assertions.assertEquals(0, ifLet.getIfBlock().getStatements().size());
  }

  @Test
  public void ifLetElse() {
    Statement _parseStatement = this._testHelper.parseStatement("if let xyz = void {} else {}");
    final IfLet ifLet = ((IfLet) _parseStatement);
    final ElseLet elseLet = ifLet.getElseLet();
    Assertions.assertFalse(elseLet.isMutable());
    Assertions.assertNull(elseLet.getBinding());
    Assertions.assertNull(elseLet.getType());
    Assertions.assertEquals(0, ifLet.getIfBlock().getStatements().size());
  }

  @Test
  public void ifLetElseLet() {
    Statement _parseStatement = this._testHelper.parseStatement("if let xyz = void {} else let abc { abc; }");
    final IfLet ifLet = ((IfLet) _parseStatement);
    final ElseLet elseLet = ifLet.getElseLet();
    Assertions.assertFalse(elseLet.isMutable());
    Assertions.assertEquals("abc", elseLet.getBinding().getName());
    Assertions.assertNull(elseLet.getType());
    final EList<Statement> stmts = elseLet.getElseBlock().getStatements();
    Assertions.assertEquals(1, stmts.size());
    Statement _get = stmts.get(0);
    Assertions.assertEquals(elseLet.getBinding(), ((BindingReference) _get).getBinding());
  }

  @Test
  public void ifLetElseLetMut() {
    Statement _parseStatement = this._testHelper.parseStatement("if let xyz = void {} else let mut abc {}");
    final IfLet ifLet = ((IfLet) _parseStatement);
    final ElseLet elseLet = ifLet.getElseLet();
    Assertions.assertTrue(elseLet.isMutable());
    Assertions.assertEquals("abc", elseLet.getBinding().getName());
    Assertions.assertNull(elseLet.getType());
    Assertions.assertEquals(0, elseLet.getElseBlock().getStatements().size());
  }

  @Test
  public void ifLetElseLetWithTypeAnnotation() {
    Statement _parseStatement = this._testHelper.parseStatement("if let xyz = void {} else let abc: String {}");
    final IfLet ifLet = ((IfLet) _parseStatement);
    final ElseLet elseLet = ifLet.getElseLet();
    Assertions.assertFalse(elseLet.isMutable());
    Assertions.assertEquals("abc", elseLet.getBinding().getName());
    Type _type = elseLet.getType();
    Assertions.assertEquals("String", ((PrimitiveType) _type).getType());
    Assertions.assertEquals(0, elseLet.getElseBlock().getStatements().size());
  }

  @Test
  public void ifConditions() {
    Statement _parseStatement = this._testHelper.parseStatement("if true {}");
    final IfConditions ifCon = ((IfConditions) _parseStatement);
    final EList<Expression> cons = ifCon.getConditions();
    Assertions.assertEquals(1, cons.size());
    Expression _get = cons.get(0);
    Assertions.assertEquals(Boolean.valueOf(true), Boolean.valueOf(((BooleanLiteral) _get).isValue()));
    final EList<Block> blocks = ifCon.getIfBlocks();
    Assertions.assertEquals(1, blocks.size());
    Assertions.assertEquals(0, blocks.get(0).getStatements().size());
    Assertions.assertNull(ifCon.getElseBlock());
  }

  @Test
  public void ifConditionsElse() {
    Statement _parseStatement = this._testHelper.parseStatement("if true {} else {}");
    final IfConditions ifCon = ((IfConditions) _parseStatement);
    Assertions.assertEquals(0, ifCon.getElseBlock().getStatements().size());
  }

  @Test
  public void ifConditionsElseif() {
    Statement _parseStatement = this._testHelper.parseStatement("if false {} elseif true {} elseif false {}");
    final IfConditions ifCon = ((IfConditions) _parseStatement);
    final EList<Expression> cons = ifCon.getConditions();
    Assertions.assertEquals(3, cons.size());
    Expression _get = cons.get(0);
    Assertions.assertEquals(Boolean.valueOf(false), Boolean.valueOf(((BooleanLiteral) _get).isValue()));
    Expression _get_1 = cons.get(1);
    Assertions.assertEquals(Boolean.valueOf(true), Boolean.valueOf(((BooleanLiteral) _get_1).isValue()));
    Expression _get_2 = cons.get(2);
    Assertions.assertEquals(Boolean.valueOf(false), Boolean.valueOf(((BooleanLiteral) _get_2).isValue()));
    final EList<Block> blocks = ifCon.getIfBlocks();
    Assertions.assertEquals(3, blocks.size());
    Assertions.assertEquals(0, blocks.get(0).getStatements().size());
    Assertions.assertEquals(0, blocks.get(1).getStatements().size());
    Assertions.assertEquals(0, blocks.get(2).getStatements().size());
    Assertions.assertNull(ifCon.getElseBlock());
  }

  @Test
  public void ifConditionsElseifElse() {
    Statement _parseStatement = this._testHelper.parseStatement("if false {} elseif true {} else {}");
    final IfConditions ifCon = ((IfConditions) _parseStatement);
    Assertions.assertEquals(2, ifCon.getConditions().size());
    Assertions.assertEquals(2, ifCon.getIfBlocks().size());
    Assertions.assertEquals(0, ifCon.getElseBlock().getStatements().size());
  }

  @Test
  public void whileStmt() {
    Statement _parseStatement = this._testHelper.parseStatement("while true {}");
    final While stmt = ((While) _parseStatement);
    Expression _condition = stmt.getCondition();
    Assertions.assertEquals(Boolean.valueOf(true), Boolean.valueOf(((BooleanLiteral) _condition).isValue()));
    Assertions.assertEquals(0, stmt.getBlock().getStatements().size());
  }

  @Test
  public void breakStmt() {
    Statement _parseStatement = this._testHelper.parseStatement("while true { break; }");
    final While whileStmt = ((While) _parseStatement);
    Assertions.assertEquals(1, whileStmt.getBlock().getStatements().size());
    Statement _get = whileStmt.getBlock().getStatements().get(0);
    Assertions.assertTrue((_get instanceof Break));
  }

  @Test
  public void function() {
    Statement _parseStatement = this._testHelper.parseStatement("function xyz() {}");
    final Function func = ((Function) _parseStatement);
    Assertions.assertEquals("xyz", func.getBinding().getName());
    Assertions.assertEquals(0, func.getParameters().size());
    Assertions.assertNull(func.getReturnType());
    Assertions.assertEquals(0, func.getBody().getStatements().size());
  }

  @Test
  public void functionWithParams() {
    Statement _parseStatement = this._testHelper.parseStatement("function xyz(abc: Number, mut def: Boolean) { abc; def; }");
    final Function func = ((Function) _parseStatement);
    Assertions.assertEquals("xyz", func.getBinding().getName());
    Assertions.assertNull(func.getReturnType());
    Assertions.assertEquals(2, func.getParameters().size());
    final Parameter param0 = func.getParameters().get(0);
    final Parameter param1 = func.getParameters().get(1);
    Assertions.assertFalse(param0.isMutable());
    Assertions.assertEquals("abc", param0.getBinding().getName());
    Type _type = param0.getType();
    Assertions.assertEquals("Number", ((PrimitiveType) _type).getType());
    Assertions.assertTrue(param1.isMutable());
    Assertions.assertEquals("def", param1.getBinding().getName());
    Type _type_1 = param1.getType();
    Assertions.assertEquals("Boolean", ((PrimitiveType) _type_1).getType());
    final EList<Statement> stmts = func.getBody().getStatements();
    Assertions.assertEquals(2, stmts.size());
    Statement _get = stmts.get(0);
    Assertions.assertEquals(param0.getBinding(), ((BindingReference) _get).getBinding());
    Statement _get_1 = stmts.get(1);
    Assertions.assertEquals(param1.getBinding(), ((BindingReference) _get_1).getBinding());
  }

  @Test
  public void functionWithReturnType() {
    Statement _parseStatement = this._testHelper.parseStatement("function xyz(): String {}");
    final Function func = ((Function) _parseStatement);
    Assertions.assertEquals("xyz", func.getBinding().getName());
    Type _returnType = func.getReturnType();
    Assertions.assertEquals("String", ((PrimitiveType) _returnType).getType());
    Assertions.assertEquals(0, func.getBody().getStatements().size());
  }

  @Test
  public void returnStmt() {
    Statement _parseStatement = this._testHelper.parseStatement("function xyz() { return; }");
    final Function func = ((Function) _parseStatement);
    Statement _get = func.getBody().getStatements().get(0);
    final Return returnStmt = ((Return) _get);
    Assertions.assertNull(returnStmt.getExpression());
  }

  @Test
  public void returnStmtWithExpression() {
    Statement _parseStatement = this._testHelper.parseStatement("function xyz() { return void; }");
    final Function func = ((Function) _parseStatement);
    Statement _get = func.getBody().getStatements().get(0);
    final Return returnStmt = ((Return) _get);
    Expression _expression = returnStmt.getExpression();
    Assertions.assertTrue((_expression instanceof VoidLiteral));
  }

  @Test
  public void throwStmt() {
    Statement _parseStatement = this._testHelper.parseStatement("function xyz(): String ? Void { throw; }");
    final Function func = ((Function) _parseStatement);
    Statement _get = func.getBody().getStatements().get(0);
    final Throw throwStmt = ((Throw) _get);
    Assertions.assertNull(throwStmt.getExpression());
  }

  @Test
  public void throwStmtWithExpression() {
    Statement _parseStatement = this._testHelper.parseStatement("function xyz(): String ? Void { throw void; }");
    final Function func = ((Function) _parseStatement);
    Statement _get = func.getBody().getStatements().get(0);
    final Throw throwStmt = ((Throw) _get);
    Expression _expression = throwStmt.getExpression();
    Assertions.assertTrue((_expression instanceof VoidLiteral));
  }

  @Test
  public void concatenation() {
    Expression _parseExpression = this._testHelper.parseExpression("\"hello \" . \"world\"");
    final Concatenation expr = ((Concatenation) _parseExpression);
    Expression _left = expr.getLeft();
    Assertions.assertEquals("hello ", ((StringLiteral) _left).getValue());
    Expression _right = expr.getRight();
    Assertions.assertEquals("world", ((StringLiteral) _right).getValue());
  }

  @Test
  public void logicalAnd() {
    Expression _parseExpression = this._testHelper.parseExpression("true and false");
    final LogicalAnd expr = ((LogicalAnd) _parseExpression);
    Expression _left = expr.getLeft();
    Assertions.assertEquals(Boolean.valueOf(true), Boolean.valueOf(((BooleanLiteral) _left).isValue()));
    Expression _right = expr.getRight();
    Assertions.assertEquals(Boolean.valueOf(false), Boolean.valueOf(((BooleanLiteral) _right).isValue()));
  }

  @Test
  public void logicalOr() {
    Expression _parseExpression = this._testHelper.parseExpression("true or false");
    final LogicalOr expr = ((LogicalOr) _parseExpression);
    Expression _left = expr.getLeft();
    Assertions.assertEquals(Boolean.valueOf(true), Boolean.valueOf(((BooleanLiteral) _left).isValue()));
    Expression _right = expr.getRight();
    Assertions.assertEquals(Boolean.valueOf(false), Boolean.valueOf(((BooleanLiteral) _right).isValue()));
  }

  @Test
  public void equality() {
    Expression _parseExpression = this._testHelper.parseExpression("5 == 0");
    final Equality expr = ((Equality) _parseExpression);
    Expression _left = expr.getLeft();
    Assertions.assertEquals(5, ((NumberLiteral) _left).getValue());
    Expression _right = expr.getRight();
    Assertions.assertEquals(0, ((NumberLiteral) _right).getValue());
  }

  @Test
  public void inequality() {
    Expression _parseExpression = this._testHelper.parseExpression("5 != 0");
    final Inequality expr = ((Inequality) _parseExpression);
    Expression _left = expr.getLeft();
    Assertions.assertEquals(5, ((NumberLiteral) _left).getValue());
    Expression _right = expr.getRight();
    Assertions.assertEquals(0, ((NumberLiteral) _right).getValue());
  }

  @Test
  public void lessThanOrEqual() {
    Expression _parseExpression = this._testHelper.parseExpression("5 <= 0");
    final LessThanOrEqual expr = ((LessThanOrEqual) _parseExpression);
    Expression _left = expr.getLeft();
    Assertions.assertEquals(5, ((NumberLiteral) _left).getValue());
    Expression _right = expr.getRight();
    Assertions.assertEquals(0, ((NumberLiteral) _right).getValue());
  }

  @Test
  public void lessThan() {
    Expression _parseExpression = this._testHelper.parseExpression("5 < 0");
    final LessThan expr = ((LessThan) _parseExpression);
    Expression _left = expr.getLeft();
    Assertions.assertEquals(5, ((NumberLiteral) _left).getValue());
    Expression _right = expr.getRight();
    Assertions.assertEquals(0, ((NumberLiteral) _right).getValue());
  }

  @Test
  public void greaterThanOrEqual() {
    Expression _parseExpression = this._testHelper.parseExpression("5 >= 0");
    final GreaterThanOrEqual expr = ((GreaterThanOrEqual) _parseExpression);
    Expression _left = expr.getLeft();
    Assertions.assertEquals(5, ((NumberLiteral) _left).getValue());
    Expression _right = expr.getRight();
    Assertions.assertEquals(0, ((NumberLiteral) _right).getValue());
  }

  @Test
  public void greaterThan() {
    Expression _parseExpression = this._testHelper.parseExpression("5 > 0");
    final GreaterThan expr = ((GreaterThan) _parseExpression);
    Expression _left = expr.getLeft();
    Assertions.assertEquals(5, ((NumberLiteral) _left).getValue());
    Expression _right = expr.getRight();
    Assertions.assertEquals(0, ((NumberLiteral) _right).getValue());
  }

  @Test
  public void addition() {
    Expression _parseExpression = this._testHelper.parseExpression("5 + 0");
    final Addition expr = ((Addition) _parseExpression);
    Expression _left = expr.getLeft();
    Assertions.assertEquals(5, ((NumberLiteral) _left).getValue());
    Expression _right = expr.getRight();
    Assertions.assertEquals(0, ((NumberLiteral) _right).getValue());
  }

  @Test
  public void subtraction() {
    Expression _parseExpression = this._testHelper.parseExpression("5 - 0");
    final Subtraction expr = ((Subtraction) _parseExpression);
    Expression _left = expr.getLeft();
    Assertions.assertEquals(5, ((NumberLiteral) _left).getValue());
    Expression _right = expr.getRight();
    Assertions.assertEquals(0, ((NumberLiteral) _right).getValue());
  }

  @Test
  public void multiplication() {
    Expression _parseExpression = this._testHelper.parseExpression("5 * 0");
    final Multiplication expr = ((Multiplication) _parseExpression);
    Expression _left = expr.getLeft();
    Assertions.assertEquals(5, ((NumberLiteral) _left).getValue());
    Expression _right = expr.getRight();
    Assertions.assertEquals(0, ((NumberLiteral) _right).getValue());
  }

  @Test
  public void division() {
    Expression _parseExpression = this._testHelper.parseExpression("5 / 2");
    final Division expr = ((Division) _parseExpression);
    Expression _left = expr.getLeft();
    Assertions.assertEquals(5, ((NumberLiteral) _left).getValue());
    Expression _right = expr.getRight();
    Assertions.assertEquals(2, ((NumberLiteral) _right).getValue());
  }

  @Test
  public void remainder() {
    Expression _parseExpression = this._testHelper.parseExpression("5 % 2");
    final Remainder expr = ((Remainder) _parseExpression);
    Expression _left = expr.getLeft();
    Assertions.assertEquals(5, ((NumberLiteral) _left).getValue());
    Expression _right = expr.getRight();
    Assertions.assertEquals(2, ((NumberLiteral) _right).getValue());
  }

  @Test
  public void exponentiation() {
    Expression _parseExpression = this._testHelper.parseExpression("5 ** 2");
    final Exponentiation expr = ((Exponentiation) _parseExpression);
    Expression _left = expr.getLeft();
    Assertions.assertEquals(5, ((NumberLiteral) _left).getValue());
    Expression _right = expr.getRight();
    Assertions.assertEquals(2, ((NumberLiteral) _right).getValue());
  }

  @Test
  public void conversion() {
    Expression _parseExpression = this._testHelper.parseExpression("5 as String");
    final Conversion expr = ((Conversion) _parseExpression);
    Expression _left = expr.getLeft();
    Assertions.assertEquals(5, ((NumberLiteral) _left).getValue());
    Type _right = expr.getRight();
    Assertions.assertEquals("String", ((PrimitiveType) _right).getType());
  }

  @Test
  public void unaryNegation() {
    Expression _parseExpression = this._testHelper.parseExpression("-5");
    final UnaryNegation expr = ((UnaryNegation) _parseExpression);
    Expression _inner = expr.getInner();
    Assertions.assertEquals(5, ((NumberLiteral) _inner).getValue());
  }

  @Test
  public void logicalNot() {
    Expression _parseExpression = this._testHelper.parseExpression("not false");
    final LogicalNot expr = ((LogicalNot) _parseExpression);
    Expression _inner = expr.getInner();
    Assertions.assertEquals(Boolean.valueOf(false), Boolean.valueOf(((BooleanLiteral) _inner).isValue()));
  }

  @Test
  public void application() {
    Expression _parseExpression = this._testHelper.parseExpression("void(5, 2)");
    final Application expr = ((Application) _parseExpression);
    Expression _expression = expr.getExpression();
    Assertions.assertTrue((_expression instanceof VoidLiteral));
    Assertions.assertEquals(2, expr.getArguments().size());
    Expression _get = expr.getArguments().get(0);
    Assertions.assertEquals(5, ((NumberLiteral) _get).getValue());
    Expression _get_1 = expr.getArguments().get(1);
    Assertions.assertEquals(2, ((NumberLiteral) _get_1).getValue());
  }
}
