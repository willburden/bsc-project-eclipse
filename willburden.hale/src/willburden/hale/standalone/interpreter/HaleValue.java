package willburden.hale.standalone.interpreter;

public interface HaleValue {
	HaleType getType();
	
	boolean valueEquals(HaleValue other);
}
