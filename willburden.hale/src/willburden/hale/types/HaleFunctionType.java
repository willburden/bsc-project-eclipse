package willburden.hale.types;

import java.util.List;
import java.util.stream.Collectors;

public class HaleFunctionType implements HaleType {
	private List<HaleType> paramTypes;
	private HaleType returnType;
	
	public HaleFunctionType(List<HaleType> paramTypes, HaleType returnType) {
		this.paramTypes = paramTypes;
		this.returnType = returnType;
	}
	
	public List<HaleType> paramTypes() {
		return paramTypes;
	}
	
	public HaleType returnType() {
		return returnType;
	}

	@Override
	public boolean typeEquals(HaleType other) {
		if (other instanceof HaleFunctionType functionType &&
				returnType.typeEquals(functionType.returnType()) &&
				paramTypes.size() == functionType.paramTypes().size()
		) {
			for (int i = 0; i < paramTypes.size(); i++) {
				if (!paramTypes.get(i).typeEquals(functionType.paramTypes().get(i))) {
					return false;
				}
			}
			
			return true;
		}
		return false;
	}
	
	@Override
	public String toString() {
		return "Function(" +
				paramTypes.stream()
					.map(type -> type.toString())
					.collect(Collectors.joining(", ")) +
				"): " + returnType.toString();
	}
}
