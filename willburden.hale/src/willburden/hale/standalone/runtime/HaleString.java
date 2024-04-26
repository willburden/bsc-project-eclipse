package willburden.hale.standalone.runtime;

public record HaleString(String value) implements HaleValue {
	@Override
	public HaleType getType() {
		return HaleType.STRING;
	}
	
	@Override
	public String toString() {
		return value;
	}
}
