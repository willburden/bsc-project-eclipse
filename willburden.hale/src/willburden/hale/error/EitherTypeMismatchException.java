package willburden.hale.error;

public class EitherTypeMismatchException extends Exception {

	private static final long serialVersionUID = 7605052183323191321L;

	public EitherTypeMismatchException() {
		super();
	}

	public EitherTypeMismatchException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public EitherTypeMismatchException(String message, Throwable cause) {
		super(message, cause);
	}

	public EitherTypeMismatchException(String message) {
		super(message);
	}

	public EitherTypeMismatchException(Throwable cause) {
		super(cause);
	}

}
