package willburden.hale.standalone.interpreter;

public record HaleBoolean(boolean value) implements HaleValue {
	@Override
	public HaleType getType() {
		return HaleType.BOOLEAN;
	}

	@Override
	public boolean valueEquals(HaleValue other) {
		return other instanceof HaleBoolean bool && value == bool.value();
	}

	@Override
	public String toString() {
		return String.valueOf(value);
	}
}
