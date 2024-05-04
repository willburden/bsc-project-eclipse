package willburden.hale.tests

import com.google.inject.Inject
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.extensions.InjectionExtension
import org.eclipse.xtext.testing.util.ParseHelper
import org.eclipse.xtext.testing.validation.ValidationTestHelper
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.^extension.ExtendWith
import willburden.hale.hale.Hale
import willburden.hale.hale.HalePackage
import willburden.hale.validation.HaleValidator

@ExtendWith(InjectionExtension)
@InjectWith(HaleInjectorProvider)
class HaleValidationTest {
	@Inject extension ParseHelper<Hale>
	@Inject extension ValidationTestHelper
	
	// Tests for @Check assignmentToImmutableBinding
	
	@Test
	def assignmentToImmutableBinding() {
		"let xyz = false; xyz = true;".parse.assertError(
			HalePackage.Literals.ASSIGNMENT,
			HaleValidator.IssueCodes.ASSIGNMENT_TO_IMMUTABLE_BINDING
		)
	}
	
	@Test
	def assignmentToMutableLetBinding() {
		"let mut xyz = false; xyz = true;".parse.assertNoIssues()
	}
	
	@Test
	def assignmentToImmutableFunctionBinding() {
		"function xyz() { }; xyz = void;".parse.assertError(
			HalePackage.Literals.ASSIGNMENT,
			HaleValidator.IssueCodes.ASSIGNMENT_TO_IMMUTABLE_BINDING
		)
	}
	
	@Test
	def assignmentToImmutableParamBinding() {
		"function xyz(abc: Boolean) { abc = true; )".parse.assertError(
			HalePackage.Literals.ASSIGNMENT,
			HaleValidator.IssueCodes.ASSIGNMENT_TO_IMMUTABLE_BINDING
		)
	}
	
	@Test
	def assignmentToMutableParamBinding() {
		"function xyz(mut abc: Boolean) { abc = true; }".parse.assertNoIssues()
	}
	
	@Test
	def assignmentToImmutableIfLetBinding() {
		"if let xyz = void { xyz = true; }".parse.assertError(
			HalePackage.Literals.ASSIGNMENT,
			HaleValidator.IssueCodes.ASSIGNMENT_TO_IMMUTABLE_BINDING
		)
	}
	
	@Test
	def assignmentToMutableIfLetBinding() {
		"if let mut xyz = void { xyz = true; }".parse.assertNoIssues()
	}
	
	@Test
	def assignmentToImmutableElseLetBinding() {
		"if let xyz = void { } else let abc { abc = true; }".parse.assertError(
			HalePackage.Literals.ASSIGNMENT,
			HaleValidator.IssueCodes.ASSIGNMENT_TO_IMMUTABLE_BINDING
		)
	}
	
	@Test
	def assignmentToMutableElseLetBinding() {
		"if let xyz = void { } else let mut abc { abc = true; }".parse.assertNoIssues()
	}
	
	// Tests for @Check breakOutsideLoop
	
	@Test
	def breakOutsideLoop() {
		"break;".parse.assertError(
			HalePackage.Literals.BREAK,
			HaleValidator.IssueCodes.BREAK_OUTSIDE_LOOP
		)
	}
	
	@Test
	def breakInLoop() {
		"while true { break; }".parse.assertNoIssues()
	}
	
	// Tests for @Check whileTrueWithoutBreak
	
	@Test
	def whileTrueWithoutBreak() {
		"while true {}".parse.assertWarning(
			HalePackage.Literals.WHILE,
			HaleValidator.IssueCodes.WHILE_TRUE_WITHOUT_BREAK
		)
	}
	
	@Test
	def whileTrueWithBreakInFunction() {
		"while true { function xyz() { break; } }".parse.assertWarning(
			HalePackage.Literals.WHILE,
			HaleValidator.IssueCodes.WHILE_TRUE_WITHOUT_BREAK
		)
	}
	
	@Test
	def whileTrueWithBreak() {
		"while true { break; }".parse.assertNoIssues()
	}
	
	// Tests for @Check returnOutsideFunction
	
	@Test
	def returnOutsideFunction() {
		"return;".parse.assertError(
			HalePackage.Literals.RETURN,
			HaleValidator.IssueCodes.RETURN_OUTSIDE_FUNCTION
		)
	}
	
	@Test
	def returnInFunction() {
		"function xyz() { return; }".parse.assertNoIssues()
	}
	
	// Tests for @Check throwOutsideEitherFunction
	
	@Test
	def throwOutsideFunction() {
		"throw;".parse.assertError(
			HalePackage.Literals.THROW,
			HaleValidator.IssueCodes.THROW_OUTSIDE_FUNCTION
		)
	}
	
	@Test
	def throwInNonEitherFunction() {
		"function xyz() { throw; }".parse.assertError(
			HalePackage.Literals.THROW,
			HaleValidator.IssueCodes.THROW_IN_NON_EITHER_FUNCTION
		)
	}
	
	@Test
	def throwInEitherFunction() {
		"function xyz(): Number ? Void { throw; }".parse.assertNoIssues()
	}
}
