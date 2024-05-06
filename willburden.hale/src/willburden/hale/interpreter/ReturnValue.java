package willburden.hale.interpreter;

import willburden.hale.values.HaleValue;
import willburden.hale.values.HaleVoid;

/**
 * Non-error throwable used to bubble up back to the calling context
 * when a return statement is reached. 
 */
public class ReturnValue extends ControlFlowThrowable {

	private static final long serialVersionUID = 3607872388587703449L;
	
	private HaleValue value;
	
	public ReturnValue() {
		this(new HaleVoid());
	}
	
	public ReturnValue(HaleValue value) {
		this.value = value;
	}
	
	public HaleValue value() {
		return value;
	}

}
