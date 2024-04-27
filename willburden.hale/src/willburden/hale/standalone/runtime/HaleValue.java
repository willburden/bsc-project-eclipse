package willburden.hale.standalone.runtime;

public interface HaleValue {
	HaleType getType();
	
	boolean valueEquals(HaleValue other);
}
