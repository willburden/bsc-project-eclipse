package willburden.hale.standalone.interpreter;

import willburden.hale.hale.Addition;
import willburden.hale.hale.Assignment;
import willburden.hale.hale.Binding;
import willburden.hale.hale.BindingReference;
import willburden.hale.hale.Block;
import willburden.hale.hale.Division;
import willburden.hale.hale.Equality;
import willburden.hale.hale.Exponentiation;
import willburden.hale.hale.Expression;
import willburden.hale.hale.GreaterThan;
import willburden.hale.hale.GreaterThanOrEqual;
import willburden.hale.hale.Hale;
import willburden.hale.hale.If;
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
import willburden.hale.hale.While;
import willburden.hale.standalone.error.ErrorMessages;
import willburden.hale.standalone.error.InterpreterException;
import willburden.hale.standalone.error.TypeMismatchException;

/**
 * Interprets a Hale program.
 */
public class Interpreter {
	private CallStack stack;

	public Interpreter() {
		stack = new CallStack();
	}

	public void execute(Hale program) throws InterpreterException {
		stack.pushFrame();
		execBlock(program.getBlock());
		stack.popFrame();
	}

	private void execBlock(Block block) throws InterpreterException {
		stack.pushScope();
		for (Statement statement : block.getStatements()) {
			execStatement(statement);
		}
		stack.popScope();
	}

	private void execStatement(Statement statement) throws InterpreterException {
		if (statement instanceof Block block) {
			execBlock(block);
		} else if (statement instanceof If ifStmt) {
			execIf(ifStmt);
		} else if (statement instanceof While whileStmt) {
			execWhile(whileStmt);
		} else if (statement instanceof Print print) {
			execPrint(print);
		} else if (statement instanceof Binding binding) {
			execBinding(binding);
		} else if (statement instanceof Assignment assignment) {
			execAssignment(assignment);
		} else if (statement instanceof Expression expression) {
			execExpression(expression);
		} else {
			throw new InterpreterException(ErrorMessages.unimplementedForSubclass(Statement.class, statement.getClass()));
		}
	}

	private void execIf(If ifStmt) throws InterpreterException {
		for (int i = 0; i < ifStmt.getIfBlocks().size(); i++) {
			if (evalCondition(ifStmt.getConditions().get(i))) {
				execBlock(ifStmt.getIfBlocks().get(i));
				return;
			}
		}
		
		// If we reach this point, no 'if' or 'elseif' block was executed.
		
		if (ifStmt.getElseBlock() != null) {
			execBlock(ifStmt.getElseBlock());
		}
	}

	private void execWhile(While whileStmt) throws InterpreterException {
		while (evalCondition(whileStmt.getCondition())) {
			execBlock(whileStmt.getBlock());
		}
	}
	
	private boolean evalCondition(Expression expression) throws InterpreterException {
		HaleValue conditionValue = evalExpression(expression);

		HaleBoolean condition;
		try {
			condition = (HaleBoolean) checkType(conditionValue, HaleType.BOOLEAN);
		} catch (TypeMismatchException e) {
			throw new InterpreterException(ErrorMessages.conditionOfWrongType(), e);
		}
		
		return condition.value();
	}

	private void execPrint(Print print) throws InterpreterException {
		HaleValue value = evalExpression(print.getExpression());

		if (value instanceof HaleString string) {
			System.out.println(string.value());
		} else {
			System.out.println(value.toString());
		}
	}

	private void execBinding(Binding binding) throws InterpreterException {
		stack.put(binding.getName(), evalExpression(binding.getExpression()));
	}

	private void execAssignment(Assignment assignment) throws InterpreterException {
		String name = assignment.getBinding().getName();
		
		try {
			stack.get(name).setValue(evalExpression(assignment.getExpression()));	
		} catch (BindingDoesntExistException | TypeMismatchException e) {
			throw new InterpreterException(ErrorMessages.assignmentFailed(name), e);
		}
	}

	private void execExpression(Expression expression) throws InterpreterException {
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
			throw new InterpreterException(ErrorMessages.unimplementedForSubclass(Expression.class, expression.getClass()));
		}
	}

	private HaleValue evalLiteral(Literal literal) throws InterpreterException {
		if (literal instanceof NumberLiteral number) {
			return new HaleNumber(number.getValue());
		} else if (literal instanceof StringLiteral string) {
			return new HaleString(string.getValue());
		} else {
			throw new InterpreterException(ErrorMessages.unimplementedForSubclass(Literal.class, literal.getClass()));
		}
	}

	private HaleValue evalBindingReference(BindingReference bindingReference) throws InterpreterException {
		String name = bindingReference.getBinding().getName();
		RuntimeBinding binding = stack.get(name);
		
		if (binding == null) {
			throw new InterpreterException(ErrorMessages.bindingDoesntExist(name));
		}
		
		return binding.getValue();		
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

		return new HaleBoolean(left.valueEquals(right));
	}

	private HaleBoolean evalInequality(Inequality operator) throws InterpreterException {
		HaleValue left = evalExpression(operator.getLeft());
		HaleValue right = evalExpression(operator.getRight());

		return new HaleBoolean(!left.valueEquals(right));
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

		return checkType(value, type);
	}

	private HaleValue checkType(HaleValue value, HaleType type) throws TypeMismatchException {
		if (value.getType() != type) {
			throw new TypeMismatchException(value, type);
		}

		return value;
	}
}
