package willburden.hale.standalone.interpreter;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import willburden.hale.hale.Addition;
import willburden.hale.hale.Application;
import willburden.hale.hale.Assignment;
import willburden.hale.hale.Binding;
import willburden.hale.hale.BindingReference;
import willburden.hale.hale.Block;
import willburden.hale.hale.BooleanLiteral;
import willburden.hale.hale.Break;
import willburden.hale.hale.Concatenation;
import willburden.hale.hale.Conversion;
import willburden.hale.hale.Division;
import willburden.hale.hale.EitherType;
import willburden.hale.hale.ElseLet;
import willburden.hale.hale.Equality;
import willburden.hale.hale.Exponentiation;
import willburden.hale.hale.Expression;
import willburden.hale.hale.Function;
import willburden.hale.hale.FunctionType;
import willburden.hale.hale.GreaterThan;
import willburden.hale.hale.GreaterThanOrEqual;
import willburden.hale.hale.Hale;
import willburden.hale.hale.If;
import willburden.hale.hale.IfConditions;
import willburden.hale.hale.IfLet;
import willburden.hale.hale.Inequality;
import willburden.hale.hale.Input;
import willburden.hale.hale.LessThan;
import willburden.hale.hale.LessThanOrEqual;
import willburden.hale.hale.LetBinding;
import willburden.hale.hale.Literal;
import willburden.hale.hale.LogicalAnd;
import willburden.hale.hale.LogicalNot;
import willburden.hale.hale.LogicalOr;
import willburden.hale.hale.Multiplication;
import willburden.hale.hale.NumberLiteral;
import willburden.hale.hale.Parameter;
import willburden.hale.hale.PrimitiveType;
import willburden.hale.hale.Print;
import willburden.hale.hale.Remainder;
import willburden.hale.hale.Return;
import willburden.hale.hale.Statement;
import willburden.hale.hale.StringLiteral;
import willburden.hale.hale.Subtraction;
import willburden.hale.hale.Throw;
import willburden.hale.hale.Type;
import willburden.hale.hale.UnaryNegation;
import willburden.hale.hale.VoidLiteral;
import willburden.hale.hale.While;
import willburden.hale.standalone.error.BindingDoesntExistException;
import willburden.hale.standalone.error.EitherTypeMismatchException;
import willburden.hale.standalone.error.ErrorMessages;
import willburden.hale.standalone.error.InterpreterException;
import willburden.hale.standalone.error.TypeConversionException;
import willburden.hale.standalone.error.TypeMismatchException;
import willburden.hale.standalone.types.HaleEitherType;
import willburden.hale.standalone.types.HaleFunctionType;
import willburden.hale.standalone.types.HalePrimitiveType;
import willburden.hale.standalone.types.HaleType;
import willburden.hale.standalone.values.HaleBoolean;
import willburden.hale.standalone.values.HaleEither;
import willburden.hale.standalone.values.HaleFunction;
import willburden.hale.standalone.values.HaleNumber;
import willburden.hale.standalone.values.HaleString;
import willburden.hale.standalone.values.HaleValue;
import willburden.hale.standalone.values.HaleVoid;

/**
 * Interprets a Hale program.
 */
public class Interpreter {
	private CallStack stack;
	private Scanner scanner;

	public Interpreter() {
		stack = new CallStack();
		scanner = new Scanner(System.in);
	}

	public void execute(Hale program) {
		stack.pushFrame();

		try {
			execBlock(program.getMainBlock());
		} catch (ControlFlowThrowable e) {
			// All current subclasses are statically checked not to bubble up
			// to the main program body.
			throw new InterpreterException(
					ErrorMessages.unimplementedForSubclass(ControlFlowThrowable.class, e.getClass()));
		}

		stack.popFrame();
	}

	private void execBlock(Block block) throws ControlFlowThrowable {
		stack.pushScope();
		execBlockStatements(block);
		stack.popScope();
	}
	
	private void execBlockStatements(Block block) throws ControlFlowThrowable {
		// In some cases (function application, if let) we've already created the new scope
		// for the block, so this method is extracted to just run the statements using the current scope.
		for (Statement statement : block.getStatements()) {
			execStatement(statement);
		}
	}

	private void execStatement(Statement statement) throws ControlFlowThrowable {
		if (statement instanceof Block block) {
			execBlock(block);
		} else if (statement instanceof Function function) {
			execFunction(function);
		} else if (statement instanceof If ifStmt) {
			execIf(ifStmt);
		} else if (statement instanceof While whileStmt) {
			execWhile(whileStmt);
		} else if (statement instanceof Print print) {
			execPrint(print);
		} else if (statement instanceof LetBinding letBinding) {
			execLetBinding(letBinding);
		} else if (statement instanceof Assignment assignment) {
			execAssignment(assignment);
		} else if (statement instanceof Break breakStmt) {
			execBreak(breakStmt);
		} else if (statement instanceof Return returnStmt) {
			execReturn(returnStmt);
		} else if (statement instanceof Throw throwStmt) {
			execThrow(throwStmt);
		} else if (statement instanceof Expression expression) {
			execExpression(expression);
		} else {
			throw new InterpreterException(
					ErrorMessages.unimplementedForSubclass(Statement.class, statement.getClass()));
		}
	}

	private void execFunction(Function function) {
		stack.put(function.getName(), new HaleFunction(buildFunctionType(function), function));
	}

	private HaleFunctionType buildFunctionType(Function function) {
		List<HaleType> paramTypes = new ArrayList<>();
		for (Binding param : function.getParameters()) {
			paramTypes.add(resolveType(((Parameter) param).getType()));
		}
		
		HaleType returnType = function.getReturnType() == null
				? HalePrimitiveType.VOID
				: resolveType(function.getReturnType());
		
		return new HaleFunctionType(paramTypes, returnType);
	}

	private void execIf(If ifStmt) throws ControlFlowThrowable {
		if (ifStmt instanceof IfLet ifLet) {
			execIfLet(ifLet);
		} else if (ifStmt instanceof IfConditions ifConditions) {
			execIfConditions(ifConditions);
		} else {
			throw new InterpreterException(ErrorMessages.unimplementedForSubclass(If.class, ifStmt.getClass()));
		}
	}
	
	private void execIfLet(IfLet ifLet) throws ControlFlowThrowable {
		HaleValue value = evalExpression(ifLet.getExpression());
		
		// Check the expression evaluates to an either value.
		HaleEither either;
		try {
			either = (HaleEither) value;
		} catch (ClassCastException e) {
			throw new InterpreterException(ErrorMessages.ifLetOnNonEitherValue(value));
		}
		
		// Check the type annotations.
		if (ifLet.getType() != null) {
			HaleType ifType = resolveType(ifLet.getType());
			if (!ifType.typeEquals(either.type().left())) {
				throw new InterpreterException(ErrorMessages.eitherValueOfWrongType(either, ifType, true));
			}
		}
		
		ElseLet elseLet = null; // Keep this to be used later if the else block needs to be run.
		if (ifLet.getElseLet() != null) {
			elseLet = (ElseLet) ifLet.getElseLet();
			if (elseLet.getType() != null) {
				HaleType elseType = resolveType(elseLet.getType());
				if (!elseType.typeEquals(either.type().right())) {
					throw new InterpreterException(ErrorMessages.eitherValueOfWrongType(either, elseType, false));
				}
			}
		}
		
		// Check if the if let passes, i.e. the value is of the left outcome.

		// Any new bindings should only last for this block's scope, so we create the scope
		// here in this method and then call execBlockStatements instead of execBlock.
		stack.pushScope();
		if (either.isLeft()) {
			stack.put(ifLet.getName(), either.value());
			
			execBlockStatements(ifLet.getIfBlock()); // Doesn't create a redundant new scope.
			
		} else if (elseLet != null) {
			if (elseLet.getName() != null) {
				// We need to create a binding for the right outcome value.
				stack.put(elseLet.getName(), either.value());
			}
			
			execBlockStatements(elseLet.getElseBlock());
		}
		stack.popScope();
	}
	
	private void execIfConditions(IfConditions ifConditions) throws ControlFlowThrowable {
		for (int i = 0; i < ifConditions.getIfBlocks().size(); i++) {
			boolean condition;
			try {
				condition = evalCondition(ifConditions.getConditions().get(i));
			} catch (TypeConversionException e) {
				throw new InterpreterException(ErrorMessages.ifFailed(), e);
			}
			
			if (condition) {
				execBlock(ifConditions.getIfBlocks().get(i));
				return;
			}
		}

		// If we reach this point, no 'if' or 'elseif' block was executed.

		if (ifConditions.getElseBlock() != null) {
			execBlock(ifConditions.getElseBlock());
		}
	}

	private void execWhile(While whileStmt) throws ControlFlowThrowable {
		// We use while (true) so we can wrap the condition evaluation in a try/catch.
		while (true) {
			boolean condition;
			try {
				condition = evalCondition(whileStmt.getCondition());
			} catch (TypeConversionException e) {
				throw new InterpreterException(ErrorMessages.whileFailed(), e);
			}

			if (!condition) {
				break;
			}

			try {
				execBlock(whileStmt.getBlock());
			} catch (LoopBreak loopBreak) {
				// Exit loop early when a break statement is encountered
				break;
			}
		}
	}

	private boolean evalCondition(Expression condition) throws TypeConversionException {
		HaleValue value = evalExpression(condition);

		// We allow implicit conversion to a boolean here, although that's pretty much
		// just theoretical
		// because no types other than HaleBoolean itself actually succeed at that
		// conversion.
		return ((HaleBoolean) value.convertTo(HalePrimitiveType.BOOLEAN)).value();
	}

	private void execPrint(Print print) {
		HaleValue value = evalExpression(print.getExpression());

		// Implicitly convert all types to String.
		try {
			System.out.println(((HaleString) value.convertTo(HalePrimitiveType.STRING)).value());
		} catch (TypeConversionException e) {
			throw new InterpreterException(ErrorMessages.printFailed(), e);
		}
	}

	private void execLetBinding(LetBinding letBinding) {
		HaleValue value = evalExpression(letBinding.getExpression());

		if (letBinding.getType() != null) {
			HaleType type = resolveType(letBinding.getType());
			if (type != value.type()) {
				throw new InterpreterException(ErrorMessages.wrongTypeInLetBinding(),
						new InterpreterException(ErrorMessages.valueOfWrongType(value, type)));
			}
		}

		stack.put(letBinding.getName(), value);
	}

	private void execAssignment(Assignment assignment) {
		String name = assignment.getBinding().getName();

		try {
			stack.get(name).setValue(evalExpression(assignment.getExpression()));
		} catch (BindingDoesntExistException | TypeMismatchException e) {
			throw new InterpreterException(ErrorMessages.assignmentFailed(name), e);
		}
	}

	private void execBreak(Break breakStmt) throws LoopBreak {
		throw new LoopBreak();
	}

	private void execReturn(Return returnStmt) throws ReturnValue {
		if (returnStmt.getExpression() != null) {
			throw new ReturnValue(evalExpression(returnStmt.getExpression()));
		} else {
			throw new ReturnValue();
		}
	}

	private void execThrow(Throw throwStmt) throws ThrowValue {
		if (throwStmt.getExpression() != null) {
			throw new ThrowValue(evalExpression(throwStmt.getExpression()));
		} else {
			throw new ThrowValue();
		}
	}

	private void execExpression(Expression expression) {
		evalExpression(expression);
	}

	private HaleValue evalExpression(Expression expression) {
		if (expression instanceof Concatenation concatenation) {
			return evalConcatenation(concatenation);
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
		} else if (expression instanceof Conversion conversion) {
			return evalConversion(conversion);
		} else if (expression instanceof UnaryNegation unaryNegation) {
			return evalUnaryNegation(unaryNegation);
		} else if (expression instanceof LogicalNot logicalNot) {
			return evalLogicalNot(logicalNot);
		} else if (expression instanceof Application application) {
			return evalApplication(application);
		} else if (expression instanceof Literal literal) {
			return evalLiteral(literal);
		} else if (expression instanceof BindingReference bindingReference) {
			return evalBindingReference(bindingReference);
		} else if (expression instanceof Input input) {
			return evalInput(input);
		} else {
			throw new InterpreterException(
					ErrorMessages.unimplementedForSubclass(Expression.class, expression.getClass()));
		}
	}

	private HaleString evalConcatenation(Concatenation operator) {
		// Because concatenation is a dedicated operator, we can implicitly convert
		// values of any type.
		HaleString left, right;
		try {
			left = (HaleString) evalExpression(operator.getLeft()).convertTo(HalePrimitiveType.STRING);
			right = (HaleString) evalExpression(operator.getRight()).convertTo(HalePrimitiveType.STRING);
		} catch (TypeConversionException e) {
			throw new InterpreterException(ErrorMessages.concatenationFailed(), e);
		}

		return new HaleString(left.value() + right.value());
	}

	private HaleBoolean evalLogicalAnd(LogicalAnd operator) {
		HaleBoolean left = (HaleBoolean) evalToType(operator.getLeft(), HalePrimitiveType.BOOLEAN);
		HaleBoolean right = (HaleBoolean) evalToType(operator.getRight(), HalePrimitiveType.BOOLEAN);

		return new HaleBoolean(left.value() && right.value());
	}

	private HaleBoolean evalLogicalOr(LogicalOr operator) {
		HaleBoolean left = (HaleBoolean) evalToType(operator.getLeft(), HalePrimitiveType.BOOLEAN);
		HaleBoolean right = (HaleBoolean) evalToType(operator.getRight(), HalePrimitiveType.BOOLEAN);

		return new HaleBoolean(left.value() || right.value());
	}

	private HaleBoolean evalEquality(Equality operator) {
		HaleValue left = evalExpression(operator.getLeft());
		HaleValue right = evalExpression(operator.getRight());

		return new HaleBoolean(left.valueEquals(right));
	}

	private HaleBoolean evalInequality(Inequality operator) {
		HaleValue left = evalExpression(operator.getLeft());
		HaleValue right = evalExpression(operator.getRight());

		return new HaleBoolean(!left.valueEquals(right));
	}

	private HaleBoolean evalLessThanOrEqual(LessThanOrEqual operator) {
		HaleNumber left = (HaleNumber) evalToType(operator.getLeft(), HalePrimitiveType.NUMBER);
		HaleNumber right = (HaleNumber) evalToType(operator.getRight(), HalePrimitiveType.NUMBER);

		return new HaleBoolean(left.value() <= right.value());
	}

	private HaleBoolean evalLessThan(LessThan operator) {
		HaleNumber left = (HaleNumber) evalToType(operator.getLeft(), HalePrimitiveType.NUMBER);
		HaleNumber right = (HaleNumber) evalToType(operator.getRight(), HalePrimitiveType.NUMBER);

		return new HaleBoolean(left.value() < right.value());
	}

	private HaleBoolean evalGreaterThanOrEqual(GreaterThanOrEqual operator) {
		HaleNumber left = (HaleNumber) evalToType(operator.getLeft(), HalePrimitiveType.NUMBER);
		HaleNumber right = (HaleNumber) evalToType(operator.getRight(), HalePrimitiveType.NUMBER);

		return new HaleBoolean(left.value() >= right.value());
	}

	private HaleBoolean evalGreaterThan(GreaterThan operator) {
		HaleNumber left = (HaleNumber) evalToType(operator.getLeft(), HalePrimitiveType.NUMBER);
		HaleNumber right = (HaleNumber) evalToType(operator.getRight(), HalePrimitiveType.NUMBER);

		return new HaleBoolean(left.value() > right.value());
	}

	private HaleNumber evalAddition(Addition operator) {
		HaleNumber left = (HaleNumber) evalToType(operator.getLeft(), HalePrimitiveType.NUMBER);
		HaleNumber right = (HaleNumber) evalToType(operator.getRight(), HalePrimitiveType.NUMBER);

		return new HaleNumber(left.value() + right.value());
	}

	private HaleNumber evalSubtraction(Subtraction operator) {
		HaleNumber left = (HaleNumber) evalToType(operator.getLeft(), HalePrimitiveType.NUMBER);
		HaleNumber right = (HaleNumber) evalToType(operator.getRight(), HalePrimitiveType.NUMBER);

		return new HaleNumber(left.value() - right.value());
	}

	private HaleNumber evalMultiplication(Multiplication operator) {
		HaleNumber left = (HaleNumber) evalToType(operator.getLeft(), HalePrimitiveType.NUMBER);
		HaleNumber right = (HaleNumber) evalToType(operator.getRight(), HalePrimitiveType.NUMBER);

		return new HaleNumber(left.value() * right.value());
	}

	private HaleNumber evalDivision(Division operator) {
		HaleNumber left = (HaleNumber) evalToType(operator.getLeft(), HalePrimitiveType.NUMBER);
		HaleNumber right = (HaleNumber) evalToType(operator.getRight(), HalePrimitiveType.NUMBER);

		if (right.value() == 0) {
			throw new InterpreterException(ErrorMessages.divideByZero(left));
		}
		
		return new HaleNumber(left.value() / right.value());
	}

	private HaleNumber evalRemainder(Remainder operator) {
		HaleNumber left = (HaleNumber) evalToType(operator.getLeft(), HalePrimitiveType.NUMBER);
		HaleNumber right = (HaleNumber) evalToType(operator.getRight(), HalePrimitiveType.NUMBER);

		return new HaleNumber(left.value() % right.value());
	}

	private HaleNumber evalExponentiation(Exponentiation operator) {
		HaleNumber left = (HaleNumber) evalToType(operator.getLeft(), HalePrimitiveType.NUMBER);
		HaleNumber right = (HaleNumber) evalToType(operator.getRight(), HalePrimitiveType.NUMBER);

		return new HaleNumber(Math.pow(left.value(), right.value()));
	}

	private HaleValue evalConversion(Conversion operator) {
		HaleValue value = evalExpression(operator.getLeft());
		HaleType targetType = resolveType(operator.getRight());

		try {
			return value.convertTo(targetType);
		} catch (TypeConversionException e) {
			throw new InterpreterException(e.getMessage(), e.getCause());
		}
	}

	private HaleNumber evalUnaryNegation(UnaryNegation operator) {
		HaleNumber inner = (HaleNumber) evalToType(operator.getInner(), HalePrimitiveType.NUMBER);

		return new HaleNumber(-inner.value());
	}

	private HaleBoolean evalLogicalNot(LogicalNot operator) {
		HaleBoolean inner = (HaleBoolean) evalToType(operator.getInner(), HalePrimitiveType.BOOLEAN);

		return new HaleBoolean(!inner.value());
	}

	private HaleValue evalApplication(Application application) {
		// Evaluate the expression to get the function we are applying.
		HaleValue applValue = evalExpression(application.getExpression());
		HaleFunction function;
		try {
			function = (HaleFunction) applValue;
		} catch (ClassCastException e) {
			throw new InterpreterException(ErrorMessages.functionApplicationFailed(),
					new InterpreterException(ErrorMessages.valueNotAFunction(applValue)));
		}
		
		int numParams = function.type().paramTypes().size();
		int numArgs = application.getArguments().size();

		if (numParams != numArgs) {
			throw new InterpreterException(ErrorMessages.functionApplicationFailed(),
					new InterpreterException(ErrorMessages.wrongNumberOfArguments(numParams, numArgs)));
		}

		// It's important to evaluate all the arguments before creating the new stack
		// frame,
		// as they may contain references to bindings in the current stack frame.
		List<HaleValue> arguments = application.getArguments().stream().map(arg -> evalExpression(arg)).toList();

		// Create the new stack frame and add the arguments to it as bindings.
		stack.pushFrame();
		stack.pushScope();

		for (int i = 0; i < numParams; i++) {
			// Create a binding. We also check the type annotations match here.
			HaleType paramType = function.type().paramTypes().get(i);
			String paramName = function.value().getParameters().get(i).getName();
			HaleValue argument = arguments.get(i);

			if (paramType != argument.type()) {
				throw new InterpreterException(ErrorMessages.functionApplicationFailed(), new InterpreterException(
						ErrorMessages.argumentOfWrongType(argument, paramName, paramType)));
			}

			stack.put(paramName, arguments.get(i));
		}

		// Execute the function body.
		HaleValue returnValue;
		boolean isThrowing = false;
		try {
			execBlockStatements(function.value().getBody());

			// If the end of the function is reached without a return statement, the
			// function returns Void.
			returnValue = new HaleVoid();
		} catch (ReturnValue r) {
			returnValue = r.value();
		} catch (ThrowValue t) {
			returnValue = t.value();
			isThrowing = true;
		} catch (LoopBreak l) {
			throw new InterpreterException(ErrorMessages.breakNotInLoop());
		} catch (ControlFlowThrowable t) {
			throw new InterpreterException(
					ErrorMessages.unimplementedForSubclass(ControlFlowThrowable.class, t.getClass()));
		}
		
		// Return/throw value is automatically converted to an either if necessary.
		if (function.type().returnType() instanceof HaleEitherType eitherType) {
			try {
				returnValue = new HaleEither(eitherType, returnValue, !isThrowing);
			} catch (EitherTypeMismatchException e) {
				HaleType expectedType = isThrowing ? eitherType.right() : eitherType.left();
				throw new InterpreterException(ErrorMessages.returnValueOfWrongType(returnValue, expectedType));
			}
		} else if (returnValue.type() != function.type().returnType()) {
			// Non-either return values must still be of the correct type.
			throw new InterpreterException(ErrorMessages.returnValueOfWrongType(returnValue, function.type().returnType()));
		}
		
		// Note that we don't need to check for throwing inside a non-either function, since that
		// is statically precluded.

		stack.popFrame();
		return returnValue;
	}

	private HaleValue evalLiteral(Literal literal) {
		if (literal instanceof VoidLiteral) {
			return new HaleVoid();
		} else if (literal instanceof BooleanLiteral bool) {
			return new HaleBoolean(bool.isValue());
		} else if (literal instanceof NumberLiteral number) {
			return new HaleNumber(number.getValue());
		} else if (literal instanceof StringLiteral string) {
			return new HaleString(string.getValue());
		} else {
			throw new InterpreterException(ErrorMessages.unimplementedForSubclass(Literal.class, literal.getClass()));
		}
	}

	private HaleValue evalBindingReference(BindingReference bindingReference) {
		String name = bindingReference.getBinding().getName();
		RuntimeBinding binding;

		try {
			binding = stack.get(name);
		} catch (BindingDoesntExistException e) {
			throw new InterpreterException(e);
		}

		return binding.getValue();
	}

	private HaleString evalInput(Input input) {
		return new HaleString(scanner.nextLine());
	}

	private HaleValue evalToType(Expression expression, HalePrimitiveType type) {
		HaleValue value = evalExpression(expression);

		return checkType(value, type);
	}

	private HaleValue checkType(HaleValue value, HalePrimitiveType type) {
		if (value.type() != type) {
			throw new TypeMismatchException(ErrorMessages.valueOfWrongType(value, type));
		}

		return value;
	}

	// This method is public so it can be used by HaleValidator to produce better error messages
	// during static analysis. The introduction of user-defined types would mean this method
	// could no longer be static, so would require a more complex solution.
	public static HaleType resolveType(Type type) {
		if (type instanceof FunctionType functionType) {
			return resolveFunctionType(functionType);
		} else if (type instanceof EitherType eitherType) {
			return resolveEitherType(eitherType);
		} else if (type instanceof PrimitiveType primitiveType) {
			return resolvePrimitiveType(primitiveType);
		} else {
			throw new InterpreterException(ErrorMessages.unimplementedForSubclass(Type.class, type.getClass()));
		}
	}
	
	private static HaleFunctionType resolveFunctionType(FunctionType functionType) {
		HaleType returnType = resolveType(functionType.getReturnType());
		List<HaleType> paramTypes = functionType.getParamTypes().stream()
				.map(paramType -> resolveType(paramType))
				.collect(Collectors.toList());
		return new HaleFunctionType(paramTypes, returnType);
	}
	
	private static HaleEitherType resolveEitherType(EitherType eitherType) {
		HaleType left = resolveType(eitherType.getLeft());
		HaleType right = resolveType(eitherType.getRight());
		return new HaleEitherType(left, right);
	}

	private static HalePrimitiveType resolvePrimitiveType(PrimitiveType primitiveType) {
		return switch (primitiveType.getType()) {
		case "Void" -> HalePrimitiveType.VOID;
		case "Boolean" -> HalePrimitiveType.BOOLEAN;
		case "Number" -> HalePrimitiveType.NUMBER;
		case "String" -> HalePrimitiveType.STRING;
		default -> throw new InterpreterException(ErrorMessages.cantResolveType(primitiveType.getType()));
		};
	}
}
