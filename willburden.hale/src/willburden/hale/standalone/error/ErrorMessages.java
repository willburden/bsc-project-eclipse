package willburden.hale.standalone.error;

import willburden.hale.standalone.types.HaleType;
import willburden.hale.standalone.values.HaleEither;
import willburden.hale.standalone.values.HaleNumber;
import willburden.hale.standalone.values.HaleString;
import willburden.hale.standalone.values.HaleValue;

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

	public static String functionApplicationFailed() {
		return "Cannot perform function application";
	}

	public static String wrongNumberOfArguments(int expected, int actual) {
		return "Expected " + expected + " arguments, but got " + actual;
	}

	public static String breakNotInLoop() {
		return "A break statement must be inside a while loop";
	}

	public static String returnNotInFunction() {
		return "A return statement must be inside a function body";
	}

	public static String throwNotInFunction() {
		return "A throw statement must be inside a function body";
	}

	public static String throwInNonEitherFunction(HaleType returnType) {
		return "A throw statement must be inside a function that returns an either type,"
				+ " but this function returns `" + returnType.toString() + "`";
	}

	public static String printFailed() {
		return "Cannot perform print statement";
	}

	public static String ifFailed() {
		return "Cannot evaluate condition of if statement";
	}

	public static String whileFailed() {
		return "Cannot evaluate condition of while statement";
	}

	public static String concatenationFailed() {
		return "Cannot perform string concatenation";
	}

	public static String valueOfWrongType(HaleValue value, HaleType type) {
		return "Expected value `" + value.toString() + "` to be of type `" + type.toString()
				+ "`, but it is actually of type `" + value.type().toString() + "`";
	}

	public static String argumentOfWrongType(HaleValue argument, String paramName, HaleType paramType) {
		return "Expected parameter `" + paramName + "` to have type `" + paramType.toString()
				+ "`, but the value passed in was `" + argument.toString() + "`, of type `" + argument.type().toString()
				+ "`";
	}

	public static String returnValueOfWrongType(HaleValue argument, HaleType type) {
		return "Expected returned value to have type `" + type.toString() + "`, but the value returned was `"
				+ argument.toString() + "`, of type `" + argument.type().toString() + "`";
	}

	public static String throwValueOfWrongType(HaleValue argument, HaleType type) {
		return "Expected thrown value to have type `" + type.toString() + "`, but the value thrown was `"
				+ argument.toString() + "`, of type `" + argument.type().toString() + "`";
	}

	public static String valueNotAFunction(HaleValue value) {
		return "Expected value `" + value.toString() + "` to be a function, but it is actually of type `"
				+ value.type().toString() + "`";
	}

	public static String wrongTypeInLetBinding() {
		return "Type annotation doesn't match initial value in let-binding";
	}

	public static String ifLetOnNonEitherValue(HaleValue value) {
		return "Expected expression of 'if let' to be an either value, but it is the value `" + value.toString()
				+ "`, of type `" + value.type().toString() + "`";
	}

	public static String eitherValueOfWrongType(HaleEither either, HaleType type, boolean isLeft) {
		return "Expected either value's " + (isLeft ? "left" : "right") + " type to be `" + type.toString()
				+ "`, but the value receieved was `" + either.toString() + "`, of type `" + either.type().toString()
				+ "`";
	}

	public static String cantResolveType(String typeName) {
		return "Couldn't resolve type `" + typeName + "`";
	}

	public static String cantConvert(HaleValue value, HaleType type) {
		return "Can't convert value `" + value.toString() + "` of type `" + value.type().toString() + "` to type `"
				+ type.toString() + "`";
	}

	public static String cantParse(HaleString value, HaleType type) {
		return "The string `" + value.toString() + "` cannot be parsed as type `" + type.toString() + "`";
	}

	public static String divideByZero(HaleNumber number) {
		return "Attempted to divide value `" + number.toString() + "` by zero";
	}

}
