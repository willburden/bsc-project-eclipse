package willburden.hale.tests;

import com.google.inject.Inject;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.util.ParseHelper;
import org.eclipse.xtext.testing.validation.ValidationTestHelper;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.junit.jupiter.api.Assertions;
import willburden.hale.hale.Conversion;
import willburden.hale.hale.Expression;
import willburden.hale.hale.Hale;
import willburden.hale.hale.Statement;
import willburden.hale.hale.Type;
import willburden.hale.interpreter.CallFrame;
import willburden.hale.interpreter.CallStack;
import willburden.hale.interpreter.Interpreter;
import willburden.hale.interpreter.RuntimeBinding;
import willburden.hale.types.HaleType;
import willburden.hale.values.HaleValue;

@InjectWith(HaleInjectorProvider.class)
@SuppressWarnings("all")
public class TestHelper {
  public static class InterpretTestBuilder<R extends Object> {
    private Function<Interpreter, R> func;

    private List<List<Map<String, HaleValue>>> preparedStack;

    private String mockStdin;

    private InputStream sysIn;

    private PrintStream sysOut;

    private ByteArrayOutputStream baos;

    private Interpreter interpreter;

    public InterpretTestBuilder(final Function<Interpreter, R> func) {
      this.func = func;
      Map<String, HaleValue> _emptyMap = CollectionLiterals.<String, HaleValue>emptyMap();
      this.preparedStack = Collections.<List<Map<String, HaleValue>>>unmodifiableList(CollectionLiterals.<List<Map<String, HaleValue>>>newArrayList(Collections.<Map<String, HaleValue>>unmodifiableList(CollectionLiterals.<Map<String, HaleValue>>newArrayList(_emptyMap))));
    }

    public TestHelper.InterpretTestBuilder<R> withInput(final String input) {
      TestHelper.InterpretTestBuilder<R> _xblockexpression = null;
      {
        this.mockStdin = input;
        _xblockexpression = this;
      }
      return _xblockexpression;
    }

    public TestHelper.InterpretTestBuilder<R> withStack(final List<List<Map<String, HaleValue>>> frames) {
      TestHelper.InterpretTestBuilder<R> _xblockexpression = null;
      {
        this.preparedStack = frames;
        _xblockexpression = this;
      }
      return _xblockexpression;
    }

    public TestHelper.InterpretTestBuilder<R> withStack(final Map<String, HaleValue> bindings) {
      TestHelper.InterpretTestBuilder<R> _xblockexpression = null;
      {
        this.preparedStack = Collections.<List<Map<String, HaleValue>>>unmodifiableList(CollectionLiterals.<List<Map<String, HaleValue>>>newArrayList(Collections.<Map<String, HaleValue>>unmodifiableList(CollectionLiterals.<Map<String, HaleValue>>newArrayList(bindings))));
        _xblockexpression = this;
      }
      return _xblockexpression;
    }

    public TestHelper.InterpretTestBuilder<R> withEmptyStack() {
      TestHelper.InterpretTestBuilder<R> _xblockexpression = null;
      {
        this.preparedStack = Collections.<List<Map<String, HaleValue>>>unmodifiableList(CollectionLiterals.<List<Map<String, HaleValue>>>newArrayList());
        _xblockexpression = this;
      }
      return _xblockexpression;
    }

    public TestHelper.InterpretTestResults<R> inject() {
      this.setup();
      try {
        final R returned = this.func.apply(this.interpreter);
        String _string = this.baos.toString();
        CallStack _stack = this.interpreter.stack();
        return new TestHelper.InterpretTestResults<R>(returned, _string, _stack, this.preparedStack);
      } finally {
        this.cleanup();
      }
    }

    public <T extends Throwable> void injectCatching(final Class<T> throwableClass, final Consumer<T> catchFunc) {
      try {
        try {
          this.inject();
          String _elvis = null;
          String _canonicalName = throwableClass.getCanonicalName();
          if (_canonicalName != null) {
            _elvis = _canonicalName;
          } else {
            String _name = throwableClass.getName();
            _elvis = _name;
          }
          String _format = String.format(
            "expected %s to be thrown, but nothing was thrown", _elvis);
          throw new AssertionError(_format);
        } catch (final Throwable _t) {
          if (_t instanceof Throwable) {
            final Throwable t = (Throwable)_t;
            T castT = null;
            try {
              castT = throwableClass.cast(t);
            } catch (final Throwable _t_1) {
              if (_t_1 instanceof ClassCastException) {
                throw t;
              } else {
                throw Exceptions.sneakyThrow(_t_1);
              }
            }
            catchFunc.accept(castT);
          } else {
            throw Exceptions.sneakyThrow(_t);
          }
        }
      } catch (Throwable _e) {
        throw Exceptions.sneakyThrow(_e);
      }
    }

    private void setup() {
      if ((this.mockStdin != null)) {
        this.sysIn = System.in;
        byte[] _bytes = this.mockStdin.getBytes();
        ByteArrayInputStream _byteArrayInputStream = new ByteArrayInputStream(_bytes);
        System.setIn(_byteArrayInputStream);
      }
      this.sysOut = System.out;
      ByteArrayOutputStream _byteArrayOutputStream = new ByteArrayOutputStream();
      this.baos = _byteArrayOutputStream;
      PrintStream _printStream = new PrintStream(this.baos);
      System.setOut(_printStream);
      Interpreter _interpreter = new Interpreter();
      this.interpreter = _interpreter;
      if ((this.preparedStack != null)) {
        this.setupStack();
      }
    }

    private void setupStack() {
      for (final List<Map<String, HaleValue>> frame : this.preparedStack) {
        {
          this.interpreter.stack().pushFrame();
          for (final Map<String, HaleValue> scope : frame) {
            {
              this.interpreter.stack().pushScope();
              Set<String> _keySet = scope.keySet();
              for (final String name : _keySet) {
                {
                  final HaleValue value = scope.get(name);
                  this.interpreter.stack().put(name, value);
                }
              }
            }
          }
        }
      }
    }

    private Interpreter cleanup() {
      Interpreter _xblockexpression = null;
      {
        if ((this.sysIn != null)) {
          System.setIn(this.sysIn);
        }
        System.setOut(this.sysOut);
        this.sysIn = null;
        this.sysOut = null;
        this.baos = null;
        _xblockexpression = this.interpreter = null;
      }
      return _xblockexpression;
    }
  }

  public static class InterpretTestResults<R extends Object> {
    private R returned;

    private String stdout;

    private CallStack stack;

    private List<List<Map<String, HaleValue>>> preparedStack;

    public InterpretTestResults(final R returned, final String stdout, final CallStack stack, final List<List<Map<String, HaleValue>>> preparedStack) {
      this.returned = returned;
      this.stdout = stdout;
      this.stack = stack;
      this.preparedStack = preparedStack;
    }

    public R returned() {
      return this.returned;
    }

    public String stdout() {
      return this.stdout;
    }

    public CallStack stack() {
      return this.stack;
    }

    public TestHelper.InterpretTestResults<R> withReturned(final Consumer<R> assertions) {
      TestHelper.InterpretTestResults<R> _xblockexpression = null;
      {
        assertions.accept(this.returned);
        _xblockexpression = this;
      }
      return _xblockexpression;
    }

    public TestHelper.InterpretTestResults<R> assertReturnedNull() {
      TestHelper.InterpretTestResults<R> _xblockexpression = null;
      {
        Assertions.assertNull(this.returned);
        _xblockexpression = this;
      }
      return _xblockexpression;
    }

    public TestHelper.InterpretTestResults<R> assertStdoutEquals(final String expected) {
      TestHelper.InterpretTestResults<R> _xblockexpression = null;
      {
        Assertions.assertEquals(expected, this.stdout);
        _xblockexpression = this;
      }
      return _xblockexpression;
    }

    public TestHelper.InterpretTestResults<R> assertStdoutEmpty() {
      return this.assertStdoutEquals("");
    }

    public <V extends HaleValue> TestHelper.InterpretTestResults<R> assertStackEquals(final List<List<Map<String, V>>> frames) {
      TestHelper.InterpretTestResults<R> _xblockexpression = null;
      {
        Assertions.assertEquals(frames.size(), this.stack.frames().size());
        for (int i = 0; (i < frames.size()); i++) {
          {
            final List<Map<String, V>> expFrame = frames.get(i);
            final CallFrame frame = ((CallFrame[])Conversions.unwrapArray(this.stack.frames(), CallFrame.class))[i];
            Assertions.assertEquals(expFrame.size(), frame.scopes().size());
            for (int j = 0; (j < expFrame.size()); j++) {
              {
                final Map<String, V> expScope = expFrame.get(j);
                final Map<String, RuntimeBinding> scope = ((Map<String, RuntimeBinding>[])Conversions.unwrapArray(frame.scopes(), Map.class))[j];
                Assertions.assertEquals(expScope.size(), scope.size());
                Set<String> _keySet = expScope.keySet();
                for (final String name : _keySet) {
                  {
                    final V expValue = expScope.get(name);
                    final HaleValue value = scope.get(name).getValue();
                    TestHelper.assertValueEqualsS(expValue, value);
                  }
                }
              }
            }
          }
        }
        _xblockexpression = this;
      }
      return _xblockexpression;
    }

    public <V extends HaleValue> TestHelper.InterpretTestResults<R> assertStackEquals(final Map<String, V> bindings) {
      return this.<V>assertStackEquals(Collections.<List<Map<String, V>>>unmodifiableList(CollectionLiterals.<List<Map<String, V>>>newArrayList(Collections.<Map<String, V>>unmodifiableList(CollectionLiterals.<Map<String, V>>newArrayList(bindings)))));
    }

    public TestHelper.InterpretTestResults<R> assertStackUnchanged() {
      TestHelper.InterpretTestResults<R> _xtrycatchfinallyexpression = null;
      try {
        _xtrycatchfinallyexpression = this.<HaleValue>assertStackEquals(this.preparedStack);
      } catch (final Throwable _t) {
        if (_t instanceof AssertionError) {
          final AssertionError e = (AssertionError)_t;
          throw new AssertionError("expected stack to be unchanged but it wasn\'t", e);
        } else {
          throw Exceptions.sneakyThrow(_t);
        }
      }
      return _xtrycatchfinallyexpression;
    }
  }

  @Inject
  private ParseHelper<Hale> parseHelper;

  @Inject
  @Extension
  private ValidationTestHelper _validationTestHelper;

  public Hale parse(final String source) {
    try {
      Hale _xblockexpression = null;
      {
        final Hale model = this.parseHelper.parse(source);
        this._validationTestHelper.assertNoErrors(model);
        _xblockexpression = model;
      }
      return _xblockexpression;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }

  public EList<Statement> parseStatements(final String source, final int numStatements) {
    EList<Statement> _xblockexpression = null;
    {
      final Hale model = this.parse(source);
      Assertions.assertEquals(numStatements, model.getMainBlock().getStatements().size());
      _xblockexpression = model.getMainBlock().getStatements();
    }
    return _xblockexpression;
  }

  public Statement parseStatement(final String source) {
    return IterableExtensions.<Statement>head(this.parseStatements(source, 1));
  }

  public Expression parseExpression(final String source) {
    Expression _xblockexpression = null;
    {
      final Statement statement = this.parseStatement((source + ";"));
      _xblockexpression = ((Expression) statement);
    }
    return _xblockexpression;
  }

  public Type parseType(final String source) {
    Type _xblockexpression = null;
    {
      final Statement statement = this.parseStatement((("5 as " + source) + ";"));
      _xblockexpression = ((Conversion) statement).getRight();
    }
    return _xblockexpression;
  }

  public <R extends Object> TestHelper.InterpretTestResults<R> inject(final Function<Interpreter, R> func) {
    return this.<R>prepare(func).inject();
  }

  public <R extends Object> TestHelper.InterpretTestBuilder<R> prepare(final Function<Interpreter, R> func) {
    return new TestHelper.InterpretTestBuilder<R>(func);
  }

  public TestHelper.InterpretTestResults<Void> inject(final Consumer<Interpreter> func) {
    return this.prepare(func).inject();
  }

  public TestHelper.InterpretTestBuilder<Void> prepare(final Consumer<Interpreter> func) {
    final Function<Interpreter, Void> _function = (Interpreter i) -> {
      Object _xblockexpression = null;
      {
        func.accept(i);
        _xblockexpression = null;
      }
      return ((Void)_xblockexpression);
    };
    return this.<Void>prepare(_function);
  }

  public <V extends HaleValue> TestHelper.InterpretTestResults<V> assertReturnedValueEquals(final TestHelper.InterpretTestResults<V> results, final V expected) {
    TestHelper.InterpretTestResults<V> _xblockexpression = null;
    {
      this.assertValueEquals(expected, results.returned);
      _xblockexpression = results;
    }
    return _xblockexpression;
  }

  public <U extends HaleValue, V extends HaleValue, I extends Iterable<U>, J extends Iterable<V>> TestHelper.InterpretTestResults<I> assertReturnedValuesEqual(final TestHelper.InterpretTestResults<I> results, final J expected) {
    TestHelper.InterpretTestResults<I> _xblockexpression = null;
    {
      final Iterator<V> expIter = expected.iterator();
      for (final U value : results.returned) {
        try {
          this.assertValueEquals(expIter.next(), value);
        } catch (final Throwable _t) {
          if (_t instanceof NoSuchElementException) {
            String _string = value.toString();
            String _plus = ("expected: no more values, but got: <" + _string);
            String _plus_1 = (_plus + ">");
            throw new AssertionError(_plus_1);
          } else {
            throw Exceptions.sneakyThrow(_t);
          }
        }
      }
      try {
        final V exp = expIter.next();
        String _string = exp.toString();
        String _plus = ("expected: <" + _string);
        String _plus_1 = (_plus + "> but got: no more values");
        throw new AssertionError(_plus_1);
      } catch (final Throwable _t) {
        if (_t instanceof NoSuchElementException) {
        } else {
          throw Exceptions.sneakyThrow(_t);
        }
      }
      _xblockexpression = results;
    }
    return _xblockexpression;
  }

  public void assertValueEquals(final HaleValue expected, final HaleValue actual) {
    TestHelper.assertValueEqualsS(expected, actual);
  }

  public static void assertValueEqualsS(final HaleValue expected, final HaleValue actual) {
    boolean _valueEquals = expected.valueEquals(actual);
    boolean _not = (!_valueEquals);
    if (_not) {
      String _format = String.format("expected: <%s> but was: <%s>", 
        expected.toString(), 
        actual.toString());
      throw new AssertionError(_format);
    }
  }

  public void assertTypeEquals(final HaleType expected, final HaleType actual) {
    boolean _typeEquals = expected.typeEquals(actual);
    boolean _not = (!_typeEquals);
    if (_not) {
      String _format = String.format("expected: <%s> but was: <%s>", 
        expected.toString(), 
        actual.toString());
      throw new AssertionError(_format);
    }
  }
}
