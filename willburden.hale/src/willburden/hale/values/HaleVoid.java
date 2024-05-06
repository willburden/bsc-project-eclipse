package willburden.hale.values;

import willburden.hale.error.ErrorMessages;
import willburden.hale.error.TypeConversionException;
import willburden.hale.types.HalePrimitiveType;
import willburden.hale.types.HaleType;

public class HaleVoid implements HaleValue {

	@Override
	public HalePrimitiveType type() {
		return HalePrimitiveType.VOID;
	}

	@Override
	public boolean valueEquals(HaleValue other) {
		return other instanceof HaleVoid;
	}

	@Override
	public HaleValue convertTo(HaleType type) throws TypeConversionException {
		if (type instanceof HalePrimitiveType primitiveType) {
			if (primitiveType == HalePrimitiveType.VOID) {
				return this;
			} else if (primitiveType == HalePrimitiveType.STRING) {
				return new HaleString(toString());
			}
		}
		throw new TypeConversionException(ErrorMessages.cantConvert(this, type));
	}
	
	@Override
	public String toString() {
		return "void";
	}
	
}
