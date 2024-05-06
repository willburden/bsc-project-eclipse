package willburden.hale.values;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

import willburden.hale.error.ErrorMessages;
import willburden.hale.error.TypeConversionException;
import willburden.hale.hale.Function;
import willburden.hale.types.HaleFunctionType;
import willburden.hale.types.HaleType;

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
		return "function " + value.getBinding().getName() + "(" +
				IntStream.range(0, value.getParameters().size())
					.mapToObj(i -> value.getParameters().get(i).getBinding().getName()
							+ ": "
							+ type.paramTypes().get(i).toString())
					.collect(Collectors.joining(", ")) +
				"): " + type.returnType().toString() + " {...}";
	}

}
