package willburden.hale.tests;

import com.google.inject.Inject;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.extensions.InjectionExtension;
import org.eclipse.xtext.testing.util.ParseHelper;
import org.eclipse.xtext.testing.validation.ValidationTestHelper;
import org.eclipse.xtext.xbase.lib.Extension;
import org.junit.jupiter.api.extension.ExtendWith;
import willburden.hale.hale.Hale;

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
}
