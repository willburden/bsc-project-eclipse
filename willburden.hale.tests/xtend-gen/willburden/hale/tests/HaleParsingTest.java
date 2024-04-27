package willburden.hale.tests;

import com.google.inject.Inject;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.extensions.InjectionExtension;
import org.eclipse.xtext.testing.util.ParseHelper;
import org.eclipse.xtext.testing.validation.ValidationTestHelper;
import org.eclipse.xtext.xbase.lib.Extension;
import org.junit.jupiter.api.Test;
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

  @Test
  public void testParsingNumberLiteral() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field statements is undefined for the type Hale"
      + "\nThe method or field statements is undefined for the type Hale"
      + "\nlength cannot be resolved"
      + "\nhead cannot be resolved");
  }

  @Test
  public void testParsingStringLiteral() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field statements is undefined for the type Hale"
      + "\nThe method or field statements is undefined for the type Hale"
      + "\nThe method or field statements is undefined for the type Hale"
      + "\nlength cannot be resolved"
      + "\nget cannot be resolved"
      + "\nget cannot be resolved");
  }

  @Test
  public void testParsingPrintStatement() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field statements is undefined for the type Hale"
      + "\nThe method or field statements is undefined for the type Hale"
      + "\nlength cannot be resolved"
      + "\nhead cannot be resolved");
  }

  @Test
  public void testParsingExpressions() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field statements is undefined for the type Hale"
      + "\nThe method or field statements is undefined for the type Hale"
      + "\nThe method or field statements is undefined for the type Hale"
      + "\nThe method or field statements is undefined for the type Hale"
      + "\nThe method or field statements is undefined for the type Hale"
      + "\nThe method or field statements is undefined for the type Hale"
      + "\nlength cannot be resolved"
      + "\nget cannot be resolved"
      + "\nget cannot be resolved"
      + "\nget cannot be resolved"
      + "\nget cannot be resolved"
      + "\nget cannot be resolved");
  }

  @Test
  public void testAdditionIsLeftAssociative() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field statements is undefined for the type Hale"
      + "\nThe method or field statements is undefined for the type Hale"
      + "\nlength cannot be resolved"
      + "\nhead cannot be resolved");
  }

  @Test
  public void testCannotMixOperators() {
  }

  @Test
  public void testParsingBinding() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field statements is undefined for the type Hale"
      + "\nThe method or field statements is undefined for the type Hale"
      + "\nThe method or field statements is undefined for the type Hale"
      + "\nlength cannot be resolved"
      + "\nget cannot be resolved"
      + "\nget cannot be resolved");
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
