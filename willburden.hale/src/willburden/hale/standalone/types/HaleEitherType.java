package willburden.hale.standalone.types;

public class HaleEitherType implements HaleType {
	private HaleType left;
	private HaleType right;
	
	public HaleEitherType(HaleType left, HaleType right) {
		this.left = left;
		this.right = right;
	}
	
	public HaleType left() {
		return left;
	}
	
	public HaleType right() {
		return right;
	}
	
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
