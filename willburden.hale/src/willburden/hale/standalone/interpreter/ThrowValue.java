package willburden.hale.standalone.interpreter;

import willburden.hale.standalone.values.HaleValue;
import willburden.hale.standalone.values.HaleVoid;

/**
 * Non-error throwable used to bubble up back to the calling context
 * when a return statement is reached. 
 */
public class ThrowValue extends ControlFlowThrowable {

	private static final long serialVersionUID = 1441419734374400097L;
	
	private HaleValue value;
	
	public ThrowValue() {
		this(new HaleVoid());
	}
	
	public ThrowValue(HaleValue value) {
		this.value = value;
	}
	
	public HaleValue value() {
		return value;
	}

}
