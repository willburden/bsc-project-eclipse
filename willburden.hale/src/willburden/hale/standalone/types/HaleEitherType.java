package willburden.hale.standalone.types;

public record HaleEitherType(HaleType left, HaleType right) implements HaleType {
	@Override
	public boolean typeEquals(HaleType other) {
		return other instanceof HaleEitherType eitherType &&
				left.typeEquals(eitherType.left()) &&
				right.typeEquals(eitherType.right());
	}
	
	@Override
	public final String toString() {
		return left.toString() + " ? " + (right instanceof HaleEitherType ?
				"(" + right.toString() + ")" :
				right.toString());
	}
}
