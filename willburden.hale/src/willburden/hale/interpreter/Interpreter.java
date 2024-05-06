package willburden.hale.interpreter;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import willburden.hale.error.BindingDoesntExistException;
import willburden.hale.error.EitherTypeMismatchException;
import willburden.hale.error.ErrorMessages;
import willburden.hale.error.InterpreterException;
import willburden.hale.error.TypeConversionException;
import willburden.hale.error.TypeMismatchException;
import willburden.hale.hale.Addition;
import willburden.hale.hale.Application;
import willburden.hale.hale.Assignment;
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
import willburden.hale.types.HaleEitherType;
import willburden.hale.types.HaleFunctionType;
import willburden.hale.types.HalePrimitiveType;
import willburden.hale.types.HaleType;
import willburden.hale.values.HaleBoolean;
import willburden.hale.values.HaleEither;
import willburden.hale.values.HaleFunction;
import willburden.hale.values.HaleNumber;
import willburden.hale.values.HaleString;
import willburden.hale.values.HaleValue;
import willburden.hale.values.HaleVoid;

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
	
	// Gives other components direct access to the stack, e.g. for testing.
	public CallStack stack() {
		return stack;
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
		} finally {
			stack.popFrame();
		}
	}

	public void execStatement(Statement statement) throws ControlFlowThrowable {
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

	public void execBlock(Block block) throws ControlFlowThrowable {
		stack.pushScope();
		try {
			execBlockStatements(block);
		} finally {
			stack.popScope();
		}
	}
	
	private void execBlockStatements(Block block) throws ControlFlowThrowable {
		// In some cases (function application, if let) we've already created the new scope
		// for the block, so this method is extracted to just run the statements using the current scope.
		for (Statement statement : block.getStatements()) {
			execStatement(statement);
		}
	}

	public void execFunction(Function function) {
		stack.put(function.getBinding().getName(), new HaleFunction(resolveFunctionSignature(function), function));
	}

	public void execIf(If ifStmt) throws ControlFlowThrowable {
		if (ifStmt instanceof IfLet ifLet) {
			execIfLet(ifLet);
		} else if (ifStmt instanceof IfConditions ifConditions) {
			execIfConditions(ifConditions);
		} else {
			throw new InterpreterException(ErrorMessages.unimplementedForSubclass(If.class, ifStmt.getClass()));
		}
	}
	
	public void execIfLet(IfLet ifLet) throws ControlFlowThrowable {
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
		try {
			if (either.isLeft()) {
				stack.put(ifLet.getBinding().getName(), either.value());
				
				execBlockStatements(ifLet.getIfBlock()); // Doesn't create a redundant new scope.
				
			} else if (elseLet != null) {
				if (elseLet.getBinding() != null) {
					// We need to create a binding for the right outcome value.
					stack.put(elseLet.getBinding().getName(), either.value());
				}
				
				execBlockStatements(elseLet.getElseBlock());
			}
		} finally {
			stack.popScope();
		}
	}
	
	public void execIfConditions(IfConditions ifConditions) throws ControlFlowThrowable {
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

	public void execWhile(While whileStmt) throws ControlFlowThrowable {
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

	public void execPrint(Print print) {
		HaleValue value = evalExpression(print.getExpression());

		// Implicitly convert all types to String.
		try {
			System.out.println(((HaleString) value.convertTo(HalePrimitiveType.STRING)).value());
		} catch (TypeConversionException e) {
			throw new InterpreterException(ErrorMessages.printFailed(), e);
		}
	}

	public void execLetBinding(LetBinding letBinding) {
		HaleValue value = evalExpression(letBinding.getExpression());

		if (letBinding.getType() != null) {
			HaleType type = resolveType(letBinding.getType());
			if (type != value.type()) {
				throw new InterpreterException(ErrorMessages.wrongTypeInLetBinding(),
						new InterpreterException(ErrorMessages.valueOfWrongType(value, type)));
			}
		}

		stack.put(letBinding.getBinding().getName(), value);
	}

	public void execAssignment(Assignment assignment) {
		String name = assignment.getBinding().getName();

		try {
			stack.get(name).setValue(evalExpression(assignment.getExpression()));
		} catch (BindingDoesntExistException | TypeMismatchException e) {
			throw new InterpreterException(e.getMessage(), e.getCause());
		}
	}

	public void execBreak(Break breakStmt) throws LoopBreak {
		throw new LoopBreak();
	}

	public void execReturn(Return returnStmt) throws ReturnValue {
		if (returnStmt.getExpression() != null) {
			throw new ReturnValue(evalExpression(returnStmt.getExpression()));
		} else {
			throw new ReturnValue();
		}
	}

	public void execThrow(Throw throwStmt) throws ThrowValue {
		if (throwStmt.getExpression() != null) {
			throw new ThrowValue(evalExpression(throwStmt.getExpression()));
		} else {
			throw new ThrowValue();
		}
	}

	public void execExpression(Expression expression) {
		evalExpression(expression);
	}

	public HaleValue evalExpression(Expression expression) {
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

	public HaleString evalConcatenation(Concatenation operator) {
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

	public HaleBoolean evalLogicalAnd(LogicalAnd operator) {
		HaleBoolean left = (HaleBoolean) evalToType(operator.getLeft(), HalePrimitiveType.BOOLEAN);
		HaleBoolean right = (HaleBoolean) evalToType(operator.getRight(), HalePrimitiveType.BOOLEAN);

		return new HaleBoolean(left.value() && right.value());
	}

	public HaleBoolean evalLogicalOr(LogicalOr operator) {
		HaleBoolean left = (HaleBoolean) evalToType(operator.getLeft(), HalePrimitiveType.BOOLEAN);
		HaleBoolean right = (HaleBoolean) evalToType(operator.getRight(), HalePrimitiveType.BOOLEAN);

		return new HaleBoolean(left.value() || right.value());
	}

	public HaleBoolean evalEquality(Equality operator) {
		HaleValue left = evalExpression(operator.getLeft());
		HaleValue right = evalExpression(operator.getRight());

		return new HaleBoolean(left.valueEquals(right));
	}

	public HaleBoolean evalInequality(Inequality operator) {
		HaleValue left = evalExpression(operator.getLeft());
		HaleValue right = evalExpression(operator.getRight());

		return new HaleBoolean(!left.valueEquals(right));
	}

	public HaleBoolean evalLessThanOrEqual(LessThanOrEqual operator) {
		HaleNumber left = (HaleNumber) evalToType(operator.getLeft(), HalePrimitiveType.NUMBER);
		HaleNumber right = (HaleNumber) evalToType(operator.getRight(), HalePrimitiveType.NUMBER);

		return new HaleBoolean(left.value() <= right.value());
	}

	public HaleBoolean evalLessThan(LessThan operator) {
		HaleNumber left = (HaleNumber) evalToType(operator.getLeft(), HalePrimitiveType.NUMBER);
		HaleNumber right = (HaleNumber) evalToType(operator.getRight(), HalePrimitiveType.NUMBER);

		return new HaleBoolean(left.value() < right.value());
	}

	public HaleBoolean evalGreaterThanOrEqual(GreaterThanOrEqual operator) {
		HaleNumber left = (HaleNumber) evalToType(operator.getLeft(), HalePrimitiveType.NUMBER);
		HaleNumber right = (HaleNumber) evalToType(operator.getRight(), HalePrimitiveType.NUMBER);

		return new HaleBoolean(left.value() >= right.value());
	}

	public HaleBoolean evalGreaterThan(GreaterThan operator) {
		HaleNumber left = (HaleNumber) evalToType(operator.getLeft(), HalePrimitiveType.NUMBER);
		HaleNumber right = (HaleNumber) evalToType(operator.getRight(), HalePrimitiveType.NUMBER);

		return new HaleBoolean(left.value() > right.value());
	}

	public HaleNumber evalAddition(Addition operator) {
		HaleNumber left = (HaleNumber) evalToType(operator.getLeft(), HalePrimitiveType.NUMBER);
		HaleNumber right = (HaleNumber) evalToType(operator.getRight(), HalePrimitiveType.NUMBER);

		return new HaleNumber(left.value() + right.value());
	}

	public HaleNumber evalSubtraction(Subtraction operator) {
		HaleNumber left = (HaleNumber) evalToType(operator.getLeft(), HalePrimitiveType.NUMBER);
		HaleNumber right = (HaleNumber) evalToType(operator.getRight(), HalePrimitiveType.NUMBER);

		return new HaleNumber(left.value() - right.value());
	}

	public HaleNumber evalMultiplication(Multiplication operator) {
		HaleNumber left = (HaleNumber) evalToType(operator.getLeft(), HalePrimitiveType.NUMBER);
		HaleNumber right = (HaleNumber) evalToType(operator.getRight(), HalePrimitiveType.NUMBER);

		return new HaleNumber(left.value() * right.value());
	}

	public HaleNumber evalDivision(Division operator) {
		HaleNumber left = (HaleNumber) evalToType(operator.getLeft(), HalePrimitiveType.NUMBER);
		HaleNumber right = (HaleNumber) evalToType(operator.getRight(), HalePrimitiveType.NUMBER);

		if (right.value() == 0) {
			throw new InterpreterException(ErrorMessages.divideByZero(left));
		}
		
		return new HaleNumber(left.value() / right.value());
	}

	public HaleNumber evalRemainder(Remainder operator) {
		HaleNumber left = (HaleNumber) evalToType(operator.getLeft(), HalePrimitiveType.NUMBER);
		HaleNumber right = (HaleNumber) evalToType(operator.getRight(), HalePrimitiveType.NUMBER);

		return new HaleNumber(left.value() % right.value());
	}

	public HaleNumber evalExponentiation(Exponentiation operator) {
		HaleNumber left = (HaleNumber) evalToType(operator.getLeft(), HalePrimitiveType.NUMBER);
		HaleNumber right = (HaleNumber) evalToType(operator.getRight(), HalePrimitiveType.NUMBER);

		return new HaleNumber(Math.pow(left.value(), right.value()));
	}

	public HaleValue evalConversion(Conversion operator) {
		HaleValue value = evalExpression(operator.getLeft());
		HaleType targetType = resolveType(operator.getRight());

		try {
			return value.convertTo(targetType);
		} catch (TypeConversionException e) {
			throw new InterpreterException(e.getMessage(), e.getCause());
		}
	}

	public HaleNumber evalUnaryNegation(UnaryNegation operator) {
		HaleNumber inner = (HaleNumber) evalToType(operator.getInner(), HalePrimitiveType.NUMBER);

		return new HaleNumber(-inner.value());
	}

	public HaleBoolean evalLogicalNot(LogicalNot operator) {
		HaleBoolean inner = (HaleBoolean) evalToType(operator.getInner(), HalePrimitiveType.BOOLEAN);

		return new HaleBoolean(!inner.value());
	}

	public HaleValue evalApplication(Application application) {
		// Evaluate the expression to get the function we are applying.
		HaleValue applValue = evalExpression(application.getExpression());
		HaleFunction function;
		try {
			function = (HaleFunction) applValue;
		} catch (ClassCastException e) {
			throw new InterpreterException(ErrorMessages.valueNotAFunction(applValue));
		}
		
		int numParams = function.type().paramTypes().size();
		int numArgs = application.getArguments().size();

		if (numParams != numArgs) {
			throw new InterpreterException(ErrorMessages.wrongNumberOfArguments(numParams, numArgs));
		}

		// It's important to evaluate all the arguments before creating the new stack
		// frame,
		// as they may contain references to bindings in the current stack frame.
		List<HaleValue> arguments = application.getArguments().stream().map(arg -> evalExpression(arg)).toList();

		// Create the new stack frame and add the arguments to it as bindings.
		stack.pushFrame();
		stack.pushScope();

		try {
			for (int i = 0; i < numParams; i++) {
				// Create a binding. We also check the type annotations match here.
				HaleType paramType = function.type().paramTypes().get(i);
				String paramName = function.value().getParameters().get(i).getBinding().getName();
				HaleValue argument = arguments.get(i);
		
				if (!paramType.typeEquals(argument.type())) {
					throw new InterpreterException(
							ErrorMessages.argumentOfWrongType(argument, paramName, paramType)
					);
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

			return returnValue;
		} finally {
			stack.popFrame();
		}
	}

	public HaleValue evalLiteral(Literal literal) {
		if (literal instanceof VoidLiteral voidLiteral) {
			return evalVoidLiteral(voidLiteral);
		} else if (literal instanceof BooleanLiteral booleanLiteral) {
			return evalBooleanLiteral(booleanLiteral);
		} else if (literal instanceof NumberLiteral numberLiteral) {
			return evalNumberLiteral(numberLiteral);
		} else if (literal instanceof StringLiteral stringLiteral) {
			return evalStringLiteral(stringLiteral);
		} else {
			throw new InterpreterException(ErrorMessages.unimplementedForSubclass(Literal.class, literal.getClass()));
		}
	}
	
	public HaleVoid evalVoidLiteral(VoidLiteral literal) {
		return new HaleVoid();
	}
	
	public HaleBoolean evalBooleanLiteral(BooleanLiteral literal) {
		return new HaleBoolean(literal.isValue());
	}
	
	public HaleNumber evalNumberLiteral(NumberLiteral literal) {
		return new HaleNumber(literal.getValue());
	}
	
	public HaleString evalStringLiteral(StringLiteral literal) {
		return new HaleString(literal.getValue());
	}

	public HaleValue evalBindingReference(BindingReference bindingReference) {
		String name = bindingReference.getBinding().getName();
		RuntimeBinding binding;

		try {
			binding = stack.get(name);
		} catch (BindingDoesntExistException e) {
			throw new InterpreterException(e);
		}

		return binding.getValue();
	}

	public HaleString evalInput(Input input) {
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

	// This method is static so it can be used by HaleValidator to produce better error messages
	// during static analysis. The introduction of user-defined types would mean this method
	// could no longer be static, so would require a more complex solution, i.e. a shared TypeChecker component.
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
	
	public static HaleFunctionType resolveFunctionType(FunctionType functionType) {
		List<HaleType> paramTypes = functionType.getParamTypes().stream()
				.map(paramType -> resolveType(paramType))
				.collect(Collectors.toList());
		
		HaleType returnType = resolveTypeOrVoid(functionType.getReturnType());
		
		return new HaleFunctionType(paramTypes, returnType);
	}
	
	public static HaleEitherType resolveEitherType(EitherType eitherType) {
		HaleType left = resolveType(eitherType.getLeft());
		HaleType right = resolveType(eitherType.getRight());
		return new HaleEitherType(left, right);
	}

	public static HalePrimitiveType resolvePrimitiveType(PrimitiveType primitiveType) {
		return switch (primitiveType.getType()) {
		case "Void" -> HalePrimitiveType.VOID;
		case "Boolean" -> HalePrimitiveType.BOOLEAN;
		case "Number" -> HalePrimitiveType.NUMBER;
		case "String" -> HalePrimitiveType.STRING;
		default -> throw new InterpreterException(ErrorMessages.cantResolveType(primitiveType.getType()));
		};
	}
	
	// Used to construct the type of a function from its definition statement
	public static HaleFunctionType resolveFunctionSignature(Function function) {
		List<HaleType> paramTypes = new ArrayList<>();
		for (Parameter param : function.getParameters()) {
			paramTypes.add(resolveType(param.getType()));
		}
		
		HaleType returnType = resolveTypeOrVoid(function.getReturnType());
		
		return new HaleFunctionType(paramTypes, returnType);
	}
	
	private static HaleType resolveTypeOrVoid(Type type) {
		return type != null
				? resolveType(type)
				: HalePrimitiveType.VOID;
	}
}
