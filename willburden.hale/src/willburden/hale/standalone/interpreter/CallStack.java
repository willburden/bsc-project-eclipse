package willburden.hale.standalone.interpreter;

import java.util.Deque;
import java.util.LinkedList;

import willburden.hale.standalone.error.BindingDoesntExistException;
import willburden.hale.standalone.values.HaleValue;

public class CallStack {
	private Deque<CallFrame> frames;
	
	public CallStack() {
		frames = new LinkedList<>();
	}
	
	public Deque<CallFrame> frames() {
		return frames;
	}
	
	public void pushFrame() {
		frames.push(new CallFrame());
	}
	
	public void popFrame() {
		frames.pop();
	}
	
	public void pushScope() {
		frames.getFirst().pushScope();
	}
	
	public void popScope() {
		frames.getFirst().popScope();
	}
	
	public void put(String name, HaleValue value) {
		frames.getFirst().put(name, value);
	}
	
	public RuntimeBinding get(String name) throws BindingDoesntExistException {
		// If the binding is not declared in this call frame, it is not
		// available to be referenced.
		
		return frames.getFirst().get(name);
	}
}
