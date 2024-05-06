package willburden.hale.validation;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.validation.Check;

import willburden.hale.error.ErrorMessages;
import willburden.hale.hale.Assignment;
import willburden.hale.hale.Binding;
import willburden.hale.hale.BooleanLiteral;
import willburden.hale.hale.Break;
import willburden.hale.hale.EitherType;
import willburden.hale.hale.ElseLet;
import willburden.hale.hale.Function;
import willburden.hale.hale.HalePackage;
import willburden.hale.hale.IfLet;
import willburden.hale.hale.LetBinding;
import willburden.hale.hale.Parameter;
import willburden.hale.hale.Return;
import willburden.hale.hale.Throw;
import willburden.hale.hale.While;
import willburden.hale.interpreter.Interpreter;

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
public class HaleValidator extends AbstractHaleValidator {
	
	public static class IssueCodes {
		public static String ASSIGNMENT_TO_IMMUTABLE_BINDING = "00";
		public static String BREAK_OUTSIDE_LOOP = "01";
		public static String RETURN_OUTSIDE_FUNCTION = "02";
		public static String THROW_OUTSIDE_FUNCTION = "03";
		public static String THROW_IN_NON_EITHER_FUNCTION = "04";
		public static String WHILE_TRUE_WITHOUT_BREAK = "05";
	}

	@Check
	public void assignmentToImmutableBinding(Assignment assignment) {
		Binding binding = assignment.getBinding();
		if (binding.getName() != null && !(
				(binding.eContainer() instanceof LetBinding letBinding && letBinding.isMutable()) ||
				(binding.eContainer() instanceof Parameter parameter && parameter.isMutable()) ||
				(binding.eContainer() instanceof IfLet ifLet && ifLet.isMutable()) ||
				(binding.eContainer() instanceof ElseLet elseLet && elseLet.isMutable())
		)) {
			error(
					ErrorMessages.assignmentToImmutableBinding(),
					HalePackage.Literals.ASSIGNMENT__BINDING,
					IssueCodes.ASSIGNMENT_TO_IMMUTABLE_BINDING
			);
		}
	}
	
	@Check
	public void breakOutsideLoop(Break breakStmt) {
		if (EcoreUtil2.getContainerOfType(breakStmt, While.class) == null) {
			error(ErrorMessages.breakNotInLoop(), null, IssueCodes.BREAK_OUTSIDE_LOOP);
		}
	}
	
	@Check
	public void whileTrueWithoutBreak(While whileStmt) {
		if (whileStmt.getCondition() instanceof BooleanLiteral literal
				&& literal.isValue()
		) {
			TreeIterator<EObject> it = whileStmt.eAllContents();
			while (it.hasNext()) {
				EObject obj = it.next();
				if (obj instanceof Break) {
					return;
				}
				if (obj instanceof Function) {
					// Break statements inside functions don't help the issue.
					it.prune();
				}
			}
			warning(
					ErrorMessages.whileTrueWithoutBreak(),
					HalePackage.Literals.WHILE__CONDITION,
					IssueCodes.WHILE_TRUE_WITHOUT_BREAK
			);
		}
	}
	
	@Check
	public void returnOutsideFunction(Return returnStmt) {
		if (EcoreUtil2.getContainerOfType(returnStmt, Function.class) == null) {
			error(ErrorMessages.returnNotInFunction(), null, IssueCodes.RETURN_OUTSIDE_FUNCTION);
		}
	}
	
	@Check
	public void throwOutsideEitherFunction(Throw throwStmt) {
		Function function = EcoreUtil2.getContainerOfType(throwStmt, Function.class);
		if (function == null) {
			error(ErrorMessages.throwNotInFunction(), null, IssueCodes.THROW_OUTSIDE_FUNCTION);
		} else if (!(function.getReturnType() instanceof EitherType)) {
			error(
				ErrorMessages.throwInNonEitherFunction(Interpreter.resolveFunctionSignature(function).returnType()),
				null,
				IssueCodes.THROW_IN_NON_EITHER_FUNCTION
			);
		}
	}

}
