package willburden.hale.standalone.values;

import willburden.hale.standalone.error.TypeConversionException;
import willburden.hale.standalone.types.HaleType;

public interface HaleValue {
	HaleType type();
	
	boolean valueEquals(HaleValue other);
	
	HaleValue convertTo(HaleType type) throws TypeConversionException;
}
