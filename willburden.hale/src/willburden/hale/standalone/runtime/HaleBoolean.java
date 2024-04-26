package willburden.hale.standalone.runtime;

public record HaleBoolean(boolean value) implements HaleValue {
	@Override
	public HaleType getType() {
		return HaleType.BOOLEAN;
	}
	
	@Override
	public String toString() {
		return String.valueOf(value);
	}
}
