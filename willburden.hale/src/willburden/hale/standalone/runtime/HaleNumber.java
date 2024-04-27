package willburden.hale.standalone.runtime;

public record HaleNumber(double value) implements HaleValue {
	@Override
	public HaleType getType() {
		return HaleType.NUMBER;
	}
	
	@Override
	public boolean valueEquals(HaleValue other) {
		double epsilon = 0.000001d;
		
		return other instanceof HaleNumber number && Math.abs(value - number.value()) < epsilon;
	}
	
	@Override
	public String toString() {
		return String.valueOf(value);
	}
}
