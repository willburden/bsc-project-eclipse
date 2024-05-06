package willburden.hale.error;

public class TypeConversionException extends Exception {

	private static final long serialVersionUID = 9092847856241006845L;

	public TypeConversionException() {
		super();
	}

	public TypeConversionException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public TypeConversionException(String message, Throwable cause) {
		super(message, cause);
	}

	public TypeConversionException(String message) {
		super(message);
	}

	public TypeConversionException(Throwable cause) {
		super(cause);
	}
	
}
