package willburden.hale.values;

import willburden.hale.error.TypeConversionException;
import willburden.hale.types.HaleType;

public interface HaleValue {
	HaleType type();
	
	boolean valueEquals(HaleValue other);
	
	HaleValue convertTo(HaleType type) throws TypeConversionException;
}
