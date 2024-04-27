package willburden.hale.standalone;

import willburden.hale.standalone.runtime.HaleType;
import willburden.hale.standalone.runtime.HaleValue;

public class WrongTypeException extends InterpreterException {

	private static final long serialVersionUID = -7133232309649018911L;
	
	public WrongTypeException() {
		super();
	}

	public WrongTypeException(Throwable cause) {
		super(cause);
	}
	
	public WrongTypeException(String message) {
		super(message);
	}
	
	public WrongTypeException(String message, Throwable cause) {
		super(message, cause);
	}

	public WrongTypeException(HaleValue value, HaleType type) {
		super(createMessage(value, type));
	}
	
	public WrongTypeException(HaleValue value, HaleType type, Throwable cause) {
		super(createMessage(value, type), cause);
	}
	
	private static String createMessage(HaleValue value, HaleType type) {
		return 
			"Expected value " + value.toString() + " to be of type '" + type.toString() +
			"', but it is actually of type '" + value.getType().toString() + "'";
	}
	
}
