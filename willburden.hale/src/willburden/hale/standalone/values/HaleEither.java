package willburden.hale.standalone.values;

import willburden.hale.standalone.error.EitherTypeMismatchException;
import willburden.hale.standalone.error.ErrorMessages;
import willburden.hale.standalone.error.TypeConversionException;
import willburden.hale.standalone.types.HaleEitherType;
import willburden.hale.standalone.types.HaleType;

public class HaleEither implements HaleValue {
	private HaleEitherType type;
	private HaleValue value;
	private boolean isLeft;
	
	public HaleEither(HaleEitherType type, HaleValue value, boolean isLeft) throws EitherTypeMismatchException {
		// Check the types match
		HaleType expectedType = isLeft ? type.left() : type.right();
		if (value.type() != expectedType) {
			throw new EitherTypeMismatchException(ErrorMessages.valueOfWrongType(value, expectedType));
		}
		
		this.type = type;
		this.value = value;
		this.isLeft = isLeft;
	}
	
	public HaleValue value() {
		return value;
	}
	
	public boolean isLeft() {
		return isLeft;
	}

	@Override
	public HaleEitherType type() {
		return type;
	}

	@Override
	public boolean valueEquals(HaleValue other) {
		return other instanceof HaleEither either &&
				type == either.type() &&
				isLeft == either.isLeft() &&
				value.valueEquals(either.value());
	}

	@Override
	public HaleValue convertTo(HaleType otherType) throws TypeConversionException {
		if (type.typeEquals(otherType)) {
			return this;
		} else {
			throw new TypeConversionException(ErrorMessages.cantConvert(this, otherType));
		}
	}
	
	@Override
	public String toString() {
		if (isLeft) {
			return value.toString() + "?";
		} else {
			return "?" + value.toString();
		}
	}
		
}
