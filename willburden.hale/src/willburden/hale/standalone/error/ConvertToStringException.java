package willburden.hale.standalone.error;

public class ConvertToStringException extends InterpreterException {
	
	private static final long serialVersionUID = -8073492776157821585L;

	public ConvertToStringException() {
		super();
	}

	public ConvertToStringException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public ConvertToStringException(String message, Throwable cause) {
		super(message, cause);
	}

	public ConvertToStringException(String message) {
		super(message);
	}

	public ConvertToStringException(Throwable cause) {
		super(cause);
	}
	
}
