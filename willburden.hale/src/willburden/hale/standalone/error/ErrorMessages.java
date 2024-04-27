package willburden.hale.standalone.error;

import willburden.hale.standalone.interpreter.HaleType;
import willburden.hale.standalone.interpreter.HaleValue;

public class ErrorMessages {
	
	public static <C1, C2 extends C1> String unimplementedForSubclass(Class<C1> superclass, Class<C2> subclass) {
		return superclass.getSimpleName() + " subclass not yet implemented: " + subclass.getSimpleName();
	}
	
	public static String bindingDoesntExist(String name) {
		return "Reference to binding `" + name + "` before it is declared";
	}
	
	public static String assignmentFailed(String name) {
		return "Cannot assign to binding `" + name + "`";
	}

	public static String assignmentToImmutableBinding() {
		return "Cannot assign to immutable variable";
	}

	public static String conditionOfWrongType() {
		return "Attempted to use a value of the wrong type as a condition";
	}
	
	public static String valueOfWrongType(HaleValue value, HaleType type) {
		return 
			"Expected value `" + value.toString() + "` to be of type `" + type.toString() +
			"`, but it is actually of type `" + value.getType().toString() + "`";
	}

}
