package willburden.hale.standalone.error;

import willburden.hale.standalone.interpreter.HaleType;
import willburden.hale.standalone.interpreter.HaleValue;

public class TypeMismatchException extends InterpreterException {

	private static final long serialVersionUID = -7133232309649018911L;

	public TypeMismatchException(HaleValue value, HaleType type) {
		this(value, type, null);
	}
	
	public TypeMismatchException(HaleValue value, HaleType type, Throwable cause) {
		super(ErrorMessages.valueOfWrongType(value, type), cause);
	}
	
}
