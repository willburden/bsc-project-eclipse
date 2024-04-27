package willburden.hale.standalone.error;

/**
 * Raised in situations that should be impossible according to the interpreters' logic:
 * i.e., when there is a bug in the interpreter code.
 */
public class InterpreterException extends Exception {
	private static final long serialVersionUID = -3651324676687865362L;
	
    public InterpreterException() {
        super();
    }

    public InterpreterException(String message) {
        super(message);
    }

    public InterpreterException(String message, Throwable cause) {
        super(message, cause);
    }

    public InterpreterException(Throwable cause) {
        super(cause);
    }
}
