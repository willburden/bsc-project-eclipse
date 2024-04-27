package willburden.hale.standalone.interpreter;

import willburden.hale.standalone.error.ErrorMessages;
import willburden.hale.standalone.error.InterpreterException;

public class BindingDoesntExistException extends InterpreterException {
	
	public BindingDoesntExistException(String name) {
		this(name, null);
	}
	
	public BindingDoesntExistException(String name, Throwable cause) {
		super(ErrorMessages.bindingDoesntExist(name), cause);
	}
	
}
