package willburden.hale.standalone.values;

import java.util.Objects;

import willburden.hale.standalone.error.EitherTypeMismatchException;
import willburden.hale.standalone.error.ErrorMessages;
import willburden.hale.standalone.error.InterpreterException;
import willburden.hale.standalone.error.TypeConversionException;
import willburden.hale.standalone.types.HaleEitherType;
import willburden.hale.standalone.types.HalePrimitiveType;
import willburden.hale.standalone.types.HaleType;

public record HaleString(String value) implements HaleValue {
	@Override
	public HalePrimitiveType type() {
		return HalePrimitiveType.STRING;
	}

	@Override
	public boolean valueEquals(HaleValue other) {
		return other instanceof HaleString string && Objects.equals(value, string.value());
	}

	@Override
	public HaleValue convertTo(HaleType type) throws TypeConversionException {
		if (type instanceof HalePrimitiveType primitiveType) {
			if (primitiveType == HalePrimitiveType.STRING) {
				return this;
			} else if (primitiveType == HalePrimitiveType.NUMBER) {
				HaleEitherType eitherType = new HaleEitherType(HalePrimitiveType.NUMBER, HalePrimitiveType.VOID);
				try {
					try {
						return new HaleEither(
								eitherType, 
								new HaleNumber(Double.parseDouble(value)),
								true
						);
					} catch (NumberFormatException e) {
						return new HaleEither(
								eitherType,
								new HaleVoid(),
								false
						);
					}
				} catch (EitherTypeMismatchException e) {
					// Shouldn't happen since we know the types are correct.
					throw new InterpreterException(e);
				}
			}
		}

		throw new TypeConversionException(ErrorMessages.cantConvert(this, type));
	}
	
	@Override
	public String toString() {
		return "\"" + value + "\"";
	}
}
