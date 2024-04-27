package willburden.hale.standalone.interpreter;

import java.text.DecimalFormat;

public record HaleNumber(double value) implements HaleValue {
	private static DecimalFormat decimalFormat;
	
	static {
		decimalFormat = new DecimalFormat("#,###.#########");
	}
	
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
		return decimalFormat.format(value);
	}
}
