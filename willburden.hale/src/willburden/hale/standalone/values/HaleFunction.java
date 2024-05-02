package willburden.hale.standalone.values;

import java.util.stream.Collectors;

import willburden.hale.hale.Function;
import willburden.hale.standalone.error.ErrorMessages;
import willburden.hale.standalone.error.TypeConversionException;
import willburden.hale.standalone.types.HaleFunctionType;
import willburden.hale.standalone.types.HaleType;

public class HaleFunction implements HaleValue {
	
	private Function value;
	private HaleFunctionType type;
	
	public HaleFunction(HaleFunctionType type, Function value) {
		this.value = value;
		this.type = type;
	}
	
	public Function value() {
		return value;
	}
	
	@Override
	public HaleFunctionType type() {
		return type;
	}

	@Override
	public boolean valueEquals(HaleValue other) {
		return other instanceof HaleFunction function && value == function.value();
	}

	@Override
	public HaleValue convertTo(HaleType otherType) throws TypeConversionException {
		if (type.typeEquals(otherType)) {
			return this;
		} else {
			throw new TypeConversionException(ErrorMessages.cantConvert(this, type));
		}
	}
	
	@Override
	public final String toString() {
		return "function " + value.getName() + "(" +
				value.getParameters().stream()
					.map(param -> param.getName())
					.collect(Collectors.joining(", ")) +
				") {...}";
	}

}
