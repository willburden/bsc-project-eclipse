package willburden.hale.standalone.interpreter;

public enum HaleType {
	BOOLEAN,
	NUMBER,
	STRING,;

	@Override
	public String toString() {
		return switch (this) {
			case BOOLEAN -> "Boolean";
			case NUMBER -> "Number";
			case STRING -> "String";
		};
	}
}
