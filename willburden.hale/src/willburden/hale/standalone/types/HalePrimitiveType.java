package willburden.hale.standalone.types;

public enum HalePrimitiveType implements HaleType {
	VOID, BOOLEAN, NUMBER, STRING;

	@Override
	public String toString() {
		return switch (this) {
		case VOID -> "Void";
		case BOOLEAN -> "Boolean";
		case NUMBER -> "Number";
		case STRING -> "String";
		};
	}

	@Override
	public boolean typeEquals(HaleType other) {
		return this == other;
	}
}
