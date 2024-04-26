package willburden.hale.standalone.runtime;

public record HaleNumber(double value) implements HaleValue {
	@Override
	public HaleType getType() {
		return HaleType.NUMBER;
	}
	
	@Override
	public String toString() {
		return String.valueOf(value);
	}
}
