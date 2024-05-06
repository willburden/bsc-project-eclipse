package willburden.hale.interpreter;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

import willburden.hale.error.BindingDoesntExistException;
import willburden.hale.error.ErrorMessages;
import willburden.hale.values.HaleValue;

public class CallFrame {
	private Deque<Map<String, RuntimeBinding>> scopes;
	
	public CallFrame() {
		scopes = new LinkedList<>();
	}
	
	public Deque<Map<String, RuntimeBinding>> scopes() {
		return scopes;
	}
	
	public void pushScope() {
		scopes.push(new HashMap<>());
	}
	
	public void popScope() {
		scopes.pop();
	}

	public void put(String name, HaleValue value) {
		// If there is another binding already declared, it is shadowed;
		// any subsequent references to this name will refer to this binding,
		// and the old RuntimeBinding is free to be garbage-collected.
		
		scopes.getFirst().put(name, new RuntimeBinding(name, value));
	}
	
	public RuntimeBinding get(String name) throws BindingDoesntExistException {
		// Find the innermost scope with a binding with the given name.
		
		for (var scope : scopes) {
			if (scope.containsKey(name)) {
				return scope.get(name);
			}
		}
		
		throw new BindingDoesntExistException(ErrorMessages.bindingDoesntExist(name));
	}
}
