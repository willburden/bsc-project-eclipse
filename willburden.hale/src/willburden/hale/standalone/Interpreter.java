package willburden.hale.standalone;

import java.util.HashMap;
import java.util.Map;

import willburden.hale.hale.Addition;
import willburden.hale.hale.Assignment;
import willburden.hale.hale.Binding;
import willburden.hale.hale.BindingReference;
import willburden.hale.hale.Division;
import willburden.hale.hale.Equality;
import willburden.hale.hale.Exponentiation;
import willburden.hale.hale.Expression;
import willburden.hale.hale.GreaterThan;
import willburden.hale.hale.GreaterThanOrEqual;
import willburden.hale.hale.Hale;
import willburden.hale.hale.Inequality;
import willburden.hale.hale.LessThan;
import willburden.hale.hale.LessThanOrEqual;
import willburden.hale.hale.Literal;
import willburden.hale.hale.LogicalAnd;
import willburden.hale.hale.LogicalNot;
import willburden.hale.hale.LogicalOr;
import willburden.hale.hale.Multiplication;
import willburden.hale.hale.NumberLiteral;
import willburden.hale.hale.Print;
import willburden.hale.hale.Remainder;
import willburden.hale.hale.Statement;
import willburden.hale.hale.StringLiteral;
import willburden.hale.hale.Subtraction;
import willburden.hale.hale.UnaryNegation;
import willburden.hale.standalone.runtime.HaleBoolean;
import willburden.hale.standalone.runtime.HaleNumber;
import willburden.hale.standalone.runtime.HaleString;
import willburden.hale.standalone.runtime.HaleType;
import willburden.hale.standalone.runtime.HaleValue;

/**
 * Interprets a Hale program.
 */
public class Interpreter {
	private Map<String, HaleValue> bindings;
	
	public Interpreter() {
		bindings = new HashMap<>();
	}
	
	public void execute(Hale tree) throws InterpreterException {
		for (Statement statement : tree.getStatements()) {
			execStatement(statement);
		}
	}
	
	private void execStatement(Statement statement) throws InterpreterException {
		if (statement instanceof Print print) {
			execPrintStatement(print);
		} else if (statement instanceof Binding binding) {
			execBindingStatement(binding);
		} else if (statement instanceof Expression expression) {
			execExpressionStatement(expression);
		} else if (statement instanceof Assignment assignment) {
			execAssignmentStatement(assignment);
		} else {
			throw new InterpreterException("Unsupported statement class: " + statement.getClass().toString());
		}
	}
	
	private void execPrintStatement(Print print) throws InterpreterException {
		System.out.println(evalExpression(print.getValue()).toString());
	}
	
	private void execBindingStatement(Binding binding) throws InterpreterException {
		if (bindings.containsKey(binding.getName())) {
			throw new InterpreterException("Binding '" + binding.getName() + "' already exists");
		}
		
		bindings.put(binding.getName(), evalExpression(binding.getValue()));
	}
	
	private void execAssignmentStatement(Assignment assignment) throws InterpreterException {
		String name = assignment.getBinding().getName();
		
		if (!bindings.containsKey(name)) {
			throw new InterpreterException("Cannot assign to binding '" + name + "' that doesn't exist");
		}
		
		// Don't need to check if the binding is mutable, since that is statically checked for by a
		// validation rule.
		
		HaleValue value = evalExpression(assignment.getValue());
		HaleType type = bindings.get(name).getType();
		
		if (value.getType() != type) {
			throw new InterpreterException(
				"Attempted to assign a value of the wrong type to binding '" + name + "'\n" +
				"\tBinding is of type '" + type.toString() + "'\n" +
				"\tAttempted to assign value '" + value.toString() + "' of type '" + value.getType().toString() + "'"
			);
		}
		
		bindings.put(name, value);
	}
	
	private void execExpressionStatement(Expression expression) throws InterpreterException {
		evalExpression(expression);
	}
	
	private HaleValue evalExpression(Expression expression) throws InterpreterException {
		if (expression instanceof Literal literal) {
			return evalLiteral(literal);
		} else if (expression instanceof BindingReference bindingReference) {
			return evalBindingReference(bindingReference);
		} else if (expression instanceof LogicalAnd logicalAnd) {
			return evalLogicalAnd(logicalAnd);
		} else if (expression instanceof LogicalOr logicalOr) {
			return evalLogicalOr(logicalOr);
		} else if (expression instanceof Equality equality) {
			return evalEquality(equality);
		} else if (expression instanceof Inequality inequality) {
			return evalInequality(inequality);
		} else if (expression instanceof LessThanOrEqual lessThanOrEqual) {
			return evalLessThanOrEqual(lessThanOrEqual);
		} else if (expression instanceof LessThan lessThan) {
			return evalLessThan(lessThan);
		} else if (expression instanceof GreaterThanOrEqual greaterThanOrEqual) {
			return evalGreaterThanOrEqual(greaterThanOrEqual);
		} else if (expression instanceof GreaterThan greaterThan) {
			return evalGreaterThan(greaterThan);
		} else if (expression instanceof Addition addition) {
			return evalAddition(addition);
		} else if (expression instanceof Subtraction subtraction) {
			return evalSubtraction(subtraction);
		} else if (expression instanceof Multiplication multiplication) {
			return evalMultiplication(multiplication);
		} else if (expression instanceof Division division) {
			return evalDivision(division);
		} else if (expression instanceof Remainder remainder) {
			return evalRemainder(remainder);
		} else if (expression instanceof Exponentiation exponentiation) {
			return evalExponentiation(exponentiation);
		} else if (expression instanceof UnaryNegation unaryNegation) {
			return evalUnaryNegation(unaryNegation);
		} else if (expression instanceof LogicalNot logicalNot) {
			return evalLogicalNot(logicalNot);
		} else {
			throw new InterpreterException("Unsupported expression class: " + expression.getClass().toString());
		}
	}

	private HaleValue evalLiteral(Literal literal) throws InterpreterException {
		if (literal instanceof NumberLiteral number) {
			return new HaleNumber(number.getValue());
		} else if (literal instanceof StringLiteral string) {
			return new HaleString(string.getValue());
		} else {
			throw new InterpreterException("Unsupported literal class: " + literal.getClass().toString());
		}
	}
	
	private HaleValue evalBindingReference(BindingReference bindingReference) throws InterpreterException {
		String name = bindingReference.getBinding().getName();
		
		if (!bindings.containsKey(name)) {
			throw new InterpreterException("Binding '" + name + "' is used before it is declared");
		}
		
		return bindings.get(name);
	}

	private HaleBoolean evalLogicalAnd(LogicalAnd operator) throws InterpreterException {
		 HaleBoolean left = (HaleBoolean) evalExpressionToType(operator.getLeft(), HaleType.BOOLEAN);
		 HaleBoolean right = (HaleBoolean) evalExpressionToType(operator.getRight(), HaleType.BOOLEAN);
		
		return new HaleBoolean(left.value() && right.value());
	}
	
	private HaleBoolean evalLogicalOr(LogicalOr operator) throws InterpreterException {
		 HaleBoolean left = (HaleBoolean) evalExpressionToType(operator.getLeft(), HaleType.BOOLEAN);
		 HaleBoolean right = (HaleBoolean) evalExpressionToType(operator.getRight(), HaleType.BOOLEAN);
		
		return new HaleBoolean(left.value() || right.value());
	}
	
	private HaleBoolean evalEquality(Equality operator) throws InterpreterException {
		 HaleValue left = evalExpression(operator.getLeft());
		 HaleValue right = evalExpression(operator.getRight());
		
		return new HaleBoolean(left == right);
	}
	
	private HaleBoolean evalInequality(Inequality operator) throws InterpreterException {
		 HaleValue left = evalExpression(operator.getLeft());
		 HaleValue right = evalExpression(operator.getRight());
		
		return new HaleBoolean(left != right);
	}
	
	private HaleBoolean evalLessThanOrEqual(LessThanOrEqual operator) throws InterpreterException {
		 HaleNumber left = (HaleNumber) evalExpressionToType(operator.getLeft(), HaleType.NUMBER);
		 HaleNumber right = (HaleNumber) evalExpressionToType(operator.getRight(), HaleType.NUMBER);
		
		return new HaleBoolean(left.value() <= right.value());
	}
	
	private HaleBoolean evalLessThan(LessThan operator) throws InterpreterException {
		 HaleNumber left = (HaleNumber) evalExpressionToType(operator.getLeft(), HaleType.NUMBER);
		 HaleNumber right = (HaleNumber) evalExpressionToType(operator.getRight(), HaleType.NUMBER);
		
		return new HaleBoolean(left.value() < right.value());
	}
	
	private HaleBoolean evalGreaterThanOrEqual(GreaterThanOrEqual operator) throws InterpreterException {
		 HaleNumber left = (HaleNumber) evalExpressionToType(operator.getLeft(), HaleType.NUMBER);
		 HaleNumber right = (HaleNumber) evalExpressionToType(operator.getRight(), HaleType.NUMBER);
		
		return new HaleBoolean(left.value() >= right.value());
	}
	
	private HaleBoolean evalGreaterThan(GreaterThan operator) throws InterpreterException {
		 HaleNumber left = (HaleNumber) evalExpressionToType(operator.getLeft(), HaleType.NUMBER);
		 HaleNumber right = (HaleNumber) evalExpressionToType(operator.getRight(), HaleType.NUMBER);
		
		return new HaleBoolean(left.value() > right.value());
	}
	
	private HaleNumber evalAddition(Addition operator) throws InterpreterException {
		 HaleNumber left = (HaleNumber) evalExpressionToType(operator.getLeft(), HaleType.NUMBER);
		 HaleNumber right = (HaleNumber) evalExpressionToType(operator.getRight(), HaleType.NUMBER);
		
		return new HaleNumber(left.value() + right.value());
	}
	
	private HaleNumber evalSubtraction(Subtraction operator) throws InterpreterException {
		 HaleNumber left = (HaleNumber) evalExpressionToType(operator.getLeft(), HaleType.NUMBER);
		 HaleNumber right = (HaleNumber) evalExpressionToType(operator.getRight(), HaleType.NUMBER);
		
		return new HaleNumber(left.value() - right.value());
	}
	
	private HaleNumber evalMultiplication(Multiplication operator) throws InterpreterException {
		 HaleNumber left = (HaleNumber) evalExpressionToType(operator.getLeft(), HaleType.NUMBER);
		 HaleNumber right = (HaleNumber) evalExpressionToType(operator.getRight(), HaleType.NUMBER);
		
		return new HaleNumber(left.value() * right.value());
	}
	
	private HaleNumber evalDivision(Division operator) throws InterpreterException {
		 HaleNumber left = (HaleNumber) evalExpressionToType(operator.getLeft(), HaleType.NUMBER);
		 HaleNumber right = (HaleNumber) evalExpressionToType(operator.getRight(), HaleType.NUMBER);
		
		return new HaleNumber(left.value() / right.value());
	}
	
	private HaleNumber evalRemainder(Remainder operator) throws InterpreterException {
		 HaleNumber left = (HaleNumber) evalExpressionToType(operator.getLeft(), HaleType.NUMBER);
		 HaleNumber right = (HaleNumber) evalExpressionToType(operator.getRight(), HaleType.NUMBER);
		
		return new HaleNumber(left.value() % right.value());
	}
	
	private HaleNumber evalExponentiation(Exponentiation operator) throws InterpreterException {
		 HaleNumber left = (HaleNumber) evalExpressionToType(operator.getLeft(), HaleType.NUMBER);
		 HaleNumber right = (HaleNumber) evalExpressionToType(operator.getRight(), HaleType.NUMBER);
		
		return new HaleNumber(Math.pow(left.value(), right.value()));
	}
	
	private HaleNumber evalUnaryNegation(UnaryNegation operator) throws InterpreterException {
		 HaleNumber inner = (HaleNumber) evalExpressionToType(operator.getInner(), HaleType.NUMBER);
		
		return new HaleNumber(-inner.value());
	}
	
	private HaleBoolean evalLogicalNot(LogicalNot operator) throws InterpreterException {
		 HaleBoolean inner = (HaleBoolean) evalExpressionToType(operator.getInner(), HaleType.BOOLEAN);
		
		return new HaleBoolean(!inner.value());
	}
	
	private HaleValue evalExpressionToType(Expression expression, HaleType type) throws InterpreterException {
		HaleValue value = evalExpression(expression);
		
		if (value.getType() != type) {
			throw new InterpreterException("Type error: expected " + type.toString() + ", got " + value.getType().toString());
		}
		
		return value;
	}
}
