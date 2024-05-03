package willburden.hale.tests;

import com.google.inject.Inject;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.extensions.InjectionExtension;
import org.eclipse.xtext.testing.util.ParseHelper;
import org.eclipse.xtext.testing.validation.ValidationTestHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import willburden.hale.hale.Hale;
import willburden.hale.hale.HalePackage;
import willburden.hale.validation.HaleValidator;

@ExtendWith(InjectionExtension.class)
@InjectWith(HaleInjectorProvider.class)
@SuppressWarnings("all")
public class HaleValidationTest {
  @Inject
  @Extension
  private ParseHelper<Hale> _parseHelper;

  @Inject
  @Extension
  private ValidationTestHelper _validationTestHelper;

  @Test
  public void assignmentToImmutableBinding() {
    try {
      this._validationTestHelper.assertError(this._parseHelper.parse("let xyz = false; xyz = true;"), 
        HalePackage.Literals.ASSIGNMENT, 
        HaleValidator.IssueCodes.ASSIGNMENT_TO_IMMUTABLE_BINDING);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }

  @Test
  public void assignmentToMutableLetBinding() {
    try {
      this._validationTestHelper.assertNoIssues(this._parseHelper.parse("let mut xyz = false; xyz = true;"));
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }

  @Test
  public void assignmentToImmutableFunctionBinding() {
    try {
      this._validationTestHelper.assertError(this._parseHelper.parse("function xyz() { }; xyz = void;"), 
        HalePackage.Literals.ASSIGNMENT, 
        HaleValidator.IssueCodes.ASSIGNMENT_TO_IMMUTABLE_BINDING);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }

  @Test
  public void assignmentToImmutableParamBinding() {
    try {
      this._validationTestHelper.assertError(this._parseHelper.parse("function xyz(abc: Boolean) { abc = true; )"), 
        HalePackage.Literals.ASSIGNMENT, 
        HaleValidator.IssueCodes.ASSIGNMENT_TO_IMMUTABLE_BINDING);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }

  @Test
  public void assignmentToMutableParamBinding() {
    try {
      this._validationTestHelper.assertNoIssues(this._parseHelper.parse("function xyz(mut abc: Boolean) { abc = true; }"));
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }

  @Test
  public void assignmentToImmutableIfLetBinding() {
    try {
      this._validationTestHelper.assertError(this._parseHelper.parse("if let xyz = void { xyz = true; }"), 
        HalePackage.Literals.ASSIGNMENT, 
        HaleValidator.IssueCodes.ASSIGNMENT_TO_IMMUTABLE_BINDING);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }

  @Test
  public void assignmentToMutableIfLetBinding() {
    try {
      this._validationTestHelper.assertNoIssues(this._parseHelper.parse("if let mut xyz = void { xyz = true; }"));
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }

  @Test
  public void assignmentToImmutableElseLetBinding() {
    try {
      this._validationTestHelper.assertError(this._parseHelper.parse("if let xyz = void { } else let abc { abc = true; }"), 
        HalePackage.Literals.ASSIGNMENT, 
        HaleValidator.IssueCodes.ASSIGNMENT_TO_IMMUTABLE_BINDING);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }

  @Test
  public void assignmentToMutableElseLetBinding() {
    try {
      this._validationTestHelper.assertNoIssues(this._parseHelper.parse("if let xyz = void { } else let mut abc { abc = true; }"));
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }

  @Test
  public void breakOutsideLoop() {
    try {
      this._validationTestHelper.assertError(this._parseHelper.parse("break;"), 
        HalePackage.Literals.BREAK, 
        HaleValidator.IssueCodes.BREAK_OUTSIDE_LOOP);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }

  @Test
  public void breakInLoop() {
    try {
      this._validationTestHelper.assertNoIssues(this._parseHelper.parse("while true { break; }"));
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }

  @Test
  public void returnOutsideFunction() {
    try {
      this._validationTestHelper.assertError(this._parseHelper.parse("return;"), 
        HalePackage.Literals.RETURN, 
        HaleValidator.IssueCodes.RETURN_OUTSIDE_FUNCTION);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }

  @Test
  public void returnInFunction() {
    try {
      this._validationTestHelper.assertNoIssues(this._parseHelper.parse("function xyz() { return; }"));
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }

  @Test
  public void throwOutsideFunction() {
    try {
      this._validationTestHelper.assertError(this._parseHelper.parse("throw;"), 
        HalePackage.Literals.THROW, 
        HaleValidator.IssueCodes.THROW_OUTSIDE_FUNCTION);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }

  @Test
  public void throwInNonEitherFunction() {
    try {
      this._validationTestHelper.assertError(this._parseHelper.parse("function xyz() { throw; }"), 
        HalePackage.Literals.THROW, 
        HaleValidator.IssueCodes.THROW_IN_NON_EITHER_FUNCTION);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }

  @Test
  public void throwInEitherFunction() {
    try {
      this._validationTestHelper.assertNoIssues(this._parseHelper.parse("function xyz(): Number ? Void { throw; }"));
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
