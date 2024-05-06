package willburden.hale.error;

public class BindingDoesntExistException extends Exception {

	private static final long serialVersionUID = 3227705457340506202L;

	public BindingDoesntExistException() {
		super();
	}

	public BindingDoesntExistException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public BindingDoesntExistException(String message, Throwable cause) {
		super(message, cause);
	}

	public BindingDoesntExistException(String message) {
		super(message);
	}

	public BindingDoesntExistException(Throwable cause) {
		super(cause);
	}
	
}
