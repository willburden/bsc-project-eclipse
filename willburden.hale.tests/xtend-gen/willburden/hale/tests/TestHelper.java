package willburden.hale.tests;

import com.google.inject.Inject;
import java.util.Map;
import java.util.Set;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.util.ParseHelper;
import org.eclipse.xtext.testing.validation.ValidationTestHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.junit.jupiter.api.Assertions;
import willburden.hale.hale.Conversion;
import willburden.hale.hale.Expression;
import willburden.hale.hale.Hale;
import willburden.hale.hale.Statement;
import willburden.hale.hale.Type;
import willburden.hale.standalone.interpreter.Interpreter;
import willburden.hale.standalone.values.HaleValue;

@InjectWith(HaleInjectorProvider.class)
@SuppressWarnings("all")
public class TestHelper {
  @Inject
  private ParseHelper<Hale> parseHelper;

  @Inject
  @Extension
  private ValidationTestHelper _validationTestHelper;

  public Hale parse(final String source) {
    try {
      final Hale model = this.parseHelper.parse(source);
      this._validationTestHelper.assertNoIssues(model);
      return model;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }

  public EList<Statement> parseStatements(final String source, final int numStatements) {
    final Hale model = this.parse(source);
    Assertions.assertEquals(numStatements, model.getMainBlock().getStatements().size());
    return model.getMainBlock().getStatements();
  }

  public Statement parseStatement(final String source) {
    return IterableExtensions.<Statement>head(this.parseStatements(source, 1));
  }

  public Expression parseExpression(final String source) {
    final Statement statement = this.parseStatement((source + ";"));
    return ((Expression) statement);
  }

  public Type parseType(final String source) {
    final Statement statement = this.parseStatement((("5 as " + source) + ";"));
    return ((Conversion) statement).getRight();
  }

  public Interpreter interpreter(final Map<String, HaleValue> bindings) {
    final Interpreter interpreter = new Interpreter();
    Set<String> _keySet = bindings.keySet();
    for (final String name : _keySet) {
      {
        final HaleValue value = bindings.get(name);
        interpreter.stack().put(name, value);
      }
    }
    return interpreter;
  }
}
