package willburden.hale.values;

import java.text.DecimalFormat;

import willburden.hale.error.ErrorMessages;
import willburden.hale.error.TypeConversionException;
import willburden.hale.types.HalePrimitiveType;
import willburden.hale.types.HaleType;

public class HaleNumber implements HaleValue {
	private static DecimalFormat decimalFormat;
	
	private double value;
	
	public HaleNumber(double value) {
		this.value = value;
	}
	
	public double value() {
		return value;
	}
	
	static {
		decimalFormat = new DecimalFormat("#,###.#########");
	}
	
	@Override
	public HalePrimitiveType type() {
		return HalePrimitiveType.NUMBER;
	}
	
	@Override
	public boolean valueEquals(HaleValue other) {
		double epsilon = 0.000001d;
		
		return other instanceof HaleNumber number && Math.abs(value - number.value()) < epsilon;
	}
	
	@Override
	public HaleValue convertTo(HaleType type) throws TypeConversionException {
		if (type instanceof HalePrimitiveType primitiveType) {
			if (primitiveType == HalePrimitiveType.NUMBER) {
				return this;
			} else if (primitiveType == HalePrimitiveType.STRING) {
				return new HaleString(toString());
			}
		}
		throw new TypeConversionException(ErrorMessages.cantConvert(this, type));
	}
	
	@Override
	public String toString() {
		return decimalFormat.format(value);
	}
}
