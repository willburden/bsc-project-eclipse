package willburden.hale.validation;

import org.eclipse.xtext.validation.Check;

import willburden.hale.hale.Assignment;
import willburden.hale.hale.Binding;
import willburden.hale.hale.HalePackage;

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
public class HaleValidator extends AbstractHaleValidator {

	@Check
	public void checkAssignmentRefersToMutableBinding(Assignment assignment) {
		Binding binding = assignment.getBinding();
		if (!binding.isMutable()) {
			error("Cannot assign to immutable variable", HalePackage.Literals.ASSIGNMENT__BINDING);
		}
	}

}
