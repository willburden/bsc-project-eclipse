package willburden.hale.error;

public class TypeMismatchException extends InterpreterException {

	private static final long serialVersionUID = -7133232309649018911L;

	public TypeMismatchException() {
		super();
	}

	public TypeMismatchException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public TypeMismatchException(String message, Throwable cause) {
		super(message, cause);
	}

	public TypeMismatchException(String message) {
		super(message);
	}

	public TypeMismatchException(Throwable cause) {
		super(cause);
	}
	
}
