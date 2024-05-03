package willburden.hale.tests;

import com.google.inject.Inject;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.extensions.InjectionExtension;
import org.eclipse.xtext.xbase.lib.Extension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import willburden.hale.hale.Hale;
import willburden.hale.standalone.interpreter.Interpreter;

@ExtendWith(InjectionExtension.class)
@InjectWith(HaleInjectorProvider.class)
@SuppressWarnings("all")
public class HaleInterpreterTest {
  @Inject
  @Extension
  private TestHelper _testHelper;

  @Test
  public void execPrint() {
    final Hale model = this._testHelper.parse("print \"Hello, world!\";");
    new Interpreter().execute(model);
  }
}
