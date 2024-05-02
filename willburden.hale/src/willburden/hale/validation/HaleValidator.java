package willburden.hale.validation;

import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.validation.Check;

import willburden.hale.hale.Assignment;
import willburden.hale.hale.Binding;
import willburden.hale.hale.Break;
import willburden.hale.hale.EitherType;
import willburden.hale.hale.Function;
import willburden.hale.hale.HalePackage;
import willburden.hale.hale.LetBinding;
import willburden.hale.hale.Parameter;
import willburden.hale.hale.Return;
import willburden.hale.hale.Throw;
import willburden.hale.hale.While;
import willburden.hale.standalone.error.ErrorMessages;
import willburden.hale.standalone.interpreter.Interpreter;

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
public class HaleValidator extends AbstractHaleValidator {
	
	// TODO: Check type annotations against literals.

	@Check
	public void checkAssignmentRefersToMutableBinding(Assignment assignment) {
		Binding binding = assignment.getBinding();
		if (binding.getName() != null && !(
				(binding instanceof LetBinding letBinding && letBinding.isMutable()) ||
				(binding instanceof Parameter parameter && parameter.isMutable())
		)) {
			error(ErrorMessages.assignmentToImmutableBinding(), HalePackage.Literals.ASSIGNMENT__BINDING);
		}
	}
	
	@Check
	public void checkBreakInsideLoop(Break breakStmt) {
		if (EcoreUtil2.getContainerOfType(breakStmt, While.class) == null) {
			error(ErrorMessages.breakNotInLoop(), null);
		}
	}
	
	@Check
	public void checkReturnInsideFunction(Return returnStmt) {
		if (EcoreUtil2.getContainerOfType(returnStmt, Function.class) == null) {
			error(ErrorMessages.returnNotInFunction(), null);
		}
	}
	
	@Check
	public void checkThrowInsideFunctionReturningEither(Throw throwStmt) {
		Function function = EcoreUtil2.getContainerOfType(throwStmt, Function.class);
		if (function == null) {
			error(ErrorMessages.throwNotInFunction(), null);
		} else if (!(function.getReturnType() instanceof EitherType)) {
			error(ErrorMessages.throwInNonEitherFunction(Interpreter.resolveType(function.getReturnType())), null);
		}
	}

}
