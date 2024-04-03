package willburden.hale.tests;

import com.google.inject.Inject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.extensions.InjectionExtension;
import org.eclipse.xtext.testing.util.ParseHelper;
import org.eclipse.xtext.testing.validation.ValidationTestHelper;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import willburden.hale.hale.Addition;
import willburden.hale.hale.Binding;
import willburden.hale.hale.BindingReference;
import willburden.hale.hale.Division;
import willburden.hale.hale.Expression;
import willburden.hale.hale.Hale;
import willburden.hale.hale.IntLiteral;
import willburden.hale.hale.Multiplication;
import willburden.hale.hale.Print;
import willburden.hale.hale.Statement;
import willburden.hale.hale.StringLiteral;
import willburden.hale.hale.Subtraction;

@ExtendWith(InjectionExtension.class)
@InjectWith(HaleInjectorProvider.class)
@SuppressWarnings("all")
public class HaleParsingTest {
  @Inject
  @Extension
  private ParseHelper<Hale> _parseHelper;

  @Inject
  @Extension
  private ValidationTestHelper _validationTestHelper;

  @Test
  public void testParsingIntLiteral() {
    try {
      final Hale model = this._parseHelper.parse("0;");
      this._validationTestHelper.assertNoIssues(model);
      Assertions.assertEquals(1, ((Object[])Conversions.unwrapArray(model.getStatements(), Object.class)).length);
      Statement _head = IterableExtensions.<Statement>head(model.getStatements());
      final IntLiteral literal = ((IntLiteral) _head);
      Assertions.assertEquals(0, literal.getValue());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }

  @Test
  public void testParsingStringLiteral() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("\"hello\";");
      _builder.newLine();
      _builder.append("\'goodbye\';");
      _builder.newLine();
      final Hale model = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoIssues(model);
      Assertions.assertEquals(2, ((Object[])Conversions.unwrapArray(model.getStatements(), Object.class)).length);
      Statement _get = model.getStatements().get(0);
      final StringLiteral literal0 = ((StringLiteral) _get);
      Assertions.assertEquals("hello", literal0.getValue());
      Statement _get_1 = model.getStatements().get(1);
      final StringLiteral literal1 = ((StringLiteral) _get_1);
      Assertions.assertEquals("goodbye", literal1.getValue());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }

  @Test
  public void testParsingPrintStatement() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("print \"Hello world!\";");
      _builder.newLine();
      final Hale model = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoIssues(model);
      Assertions.assertEquals(1, ((Object[])Conversions.unwrapArray(model.getStatements(), Object.class)).length);
      Statement _head = IterableExtensions.<Statement>head(model.getStatements());
      final Print print = ((Print) _head);
      Expression _value = print.getValue();
      final StringLiteral stringLiteral = ((StringLiteral) _value);
      Assertions.assertEquals("Hello world!", stringLiteral.getValue());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }

  @Test
  public void testParsingExpressions() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("(0);");
      _builder.newLine();
      _builder.append("5 / 2;");
      _builder.newLine();
      _builder.append("\"hello \" + \'world\';");
      _builder.newLine();
      _builder.append("(1 - 2) * 3;");
      _builder.newLine();
      _builder.append("1 - (2 * 3);");
      _builder.newLine();
      final Hale model = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoIssues(model);
      Assertions.assertEquals(5, ((Object[])Conversions.unwrapArray(model.getStatements(), Object.class)).length);
      Statement _get = model.getStatements().get(0);
      final IntLiteral expr0 = ((IntLiteral) _get);
      Assertions.assertEquals(0, expr0.getValue());
      Statement _get_1 = model.getStatements().get(1);
      final Division expr1 = ((Division) _get_1);
      Expression _left = expr1.getLeft();
      Assertions.assertEquals(5, ((IntLiteral) _left).getValue());
      Expression _right = expr1.getRight();
      Assertions.assertEquals(2, ((IntLiteral) _right).getValue());
      Statement _get_2 = model.getStatements().get(2);
      final Addition expr2 = ((Addition) _get_2);
      Expression _left_1 = expr2.getLeft();
      Assertions.assertEquals("hello ", ((StringLiteral) _left_1).getValue());
      Expression _right_1 = expr2.getRight();
      Assertions.assertEquals("world", ((StringLiteral) _right_1).getValue());
      Statement _get_3 = model.getStatements().get(3);
      final Multiplication expr3 = ((Multiplication) _get_3);
      Expression _left_2 = expr3.getLeft();
      final Subtraction expr3Left = ((Subtraction) _left_2);
      Expression _left_3 = expr3Left.getLeft();
      Assertions.assertEquals(1, ((IntLiteral) _left_3).getValue());
      Expression _right_2 = expr3Left.getRight();
      Assertions.assertEquals(2, ((IntLiteral) _right_2).getValue());
      Expression _right_3 = expr3.getRight();
      Assertions.assertEquals(3, ((IntLiteral) _right_3).getValue());
      Statement _get_4 = model.getStatements().get(4);
      final Subtraction expr4 = ((Subtraction) _get_4);
      Expression _right_4 = expr4.getRight();
      final Multiplication expr4Right = ((Multiplication) _right_4);
      Expression _left_4 = expr4.getLeft();
      Assertions.assertEquals(1, ((IntLiteral) _left_4).getValue());
      Expression _left_5 = expr4Right.getLeft();
      Assertions.assertEquals(2, ((IntLiteral) _left_5).getValue());
      Expression _right_5 = expr4Right.getRight();
      Assertions.assertEquals(3, ((IntLiteral) _right_5).getValue());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }

  @Test
  public void testAdditionIsLeftAssociative() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("1 + 2 + 3 + 4;");
      _builder.newLine();
      final Hale model = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoIssues(model);
      Assertions.assertEquals(1, ((Object[])Conversions.unwrapArray(model.getStatements(), Object.class)).length);
      Statement _head = IterableExtensions.<Statement>head(model.getStatements());
      final Addition group0 = ((Addition) _head);
      Expression _left = group0.getLeft();
      final Addition group1 = ((Addition) _left);
      Expression _left_1 = group1.getLeft();
      final Addition group2 = ((Addition) _left_1);
      Expression _left_2 = group2.getLeft();
      Assertions.assertEquals(1, ((IntLiteral) _left_2).getValue());
      Expression _right = group2.getRight();
      Assertions.assertEquals(2, ((IntLiteral) _right).getValue());
      Expression _right_1 = group1.getRight();
      Assertions.assertEquals(3, ((IntLiteral) _right_1).getValue());
      Expression _right_2 = group0.getRight();
      Assertions.assertEquals(4, ((IntLiteral) _right_2).getValue());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }

  @Test
  public void testCannotMixOperators() {
  }

  @Test
  public void testParsingBinding() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("let xyz = \"abc123\";");
      _builder.newLine();
      _builder.append("xyz;");
      _builder.newLine();
      final Hale model = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoIssues(model);
      Assertions.assertEquals(2, ((Object[])Conversions.unwrapArray(model.getStatements(), Object.class)).length);
      Statement _get = model.getStatements().get(0);
      final Binding binding = ((Binding) _get);
      Assertions.assertEquals("xyz", binding.getName());
      Expression _value = binding.getValue();
      Assertions.assertEquals("abc123", ((StringLiteral) _value).getValue());
      Assertions.assertFalse(binding.isMutable());
      Statement _get_1 = model.getStatements().get(1);
      final BindingReference reference = ((BindingReference) _get_1);
      Assertions.assertSame(binding, reference.getBinding());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }

  @Test
  public void testParsingMutableBinding() {
  }

  @Test
  public void testParsingAssignment() {
  }

  @Test
  public void testCannotReferenceNonexistentBinding() {
  }

  @Test
  public void testCannotMutateImmutableBinding() {
  }

  @Test
  public void testBindingShadowing() {
  }
}
