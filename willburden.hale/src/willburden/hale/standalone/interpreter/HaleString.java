package willburden.hale.standalone.interpreter;

import java.util.Objects;

public record HaleString(String value) implements HaleValue {
	@Override
	public HaleType getType() {
		return HaleType.STRING;
	}

	@Override
	public boolean valueEquals(HaleValue other) {
		return other instanceof HaleString string && Objects.equals(value, string.value());
	}
	
	@Override
	public String toString() {
		return value;
	}
}
