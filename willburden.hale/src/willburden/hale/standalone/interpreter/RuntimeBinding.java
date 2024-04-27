package willburden.hale.standalone.interpreter;

import willburden.hale.standalone.error.TypeMismatchException;

/**
 * The runtime representation of a binding from a name to a HaleValue. This is
 * different from just storing a HaleValue, as it allows the value to be
 * replaced but only with values of the same HaleType.
 */
public class RuntimeBinding {
	private String name;
	private HaleValue value;

	public RuntimeBinding(String name, HaleValue value) {
		this.name = name;
		this.value = value;
	}

	public String getName() {
		return name;
	}

	public HaleType getType() {
		return value.getType();
	}

	public HaleValue getValue() {
		return value;
	}

	public void setValue(HaleValue value) throws TypeMismatchException {
		if (value.getType() != getType()) {
			throw new TypeMismatchException(value, getType());
		}
		
		this.value = value;
	}
}
