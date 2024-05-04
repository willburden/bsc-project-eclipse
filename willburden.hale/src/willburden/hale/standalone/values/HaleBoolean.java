package willburden.hale.standalone.values;

import willburden.hale.standalone.error.ErrorMessages;
import willburden.hale.standalone.error.TypeConversionException;
import willburden.hale.standalone.types.HalePrimitiveType;
import willburden.hale.standalone.types.HaleType;

public class HaleBoolean implements HaleValue {
	private boolean value;
	
	public HaleBoolean(boolean value) {
		this.value = value;
	}
	
	public boolean value() {
		return value;
	}
	
	@Override
	public HalePrimitiveType type() {
		return HalePrimitiveType.BOOLEAN;
	}

	@Override
	public boolean valueEquals(HaleValue other) {
		return other instanceof HaleBoolean bool && value == bool.value();
	}
	
	@Override
	public HaleValue convertTo(HaleType type) throws TypeConversionException {
		if (type instanceof HalePrimitiveType primitiveType) {
			if (primitiveType == HalePrimitiveType.BOOLEAN) {
				return this;
			} else if (primitiveType == HalePrimitiveType.STRING) {
				return new HaleString(toString());
			}
		}
		throw new TypeConversionException(ErrorMessages.cantConvert(this, type));
	}

	@Override
	public String toString() {
		if (value) {
			return "true";
		} else {
			return "false";
		}
	}
}
