package willburden.hale.tests

import org.junit.jupiter.api.^extension.ExtendWith
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.extensions.InjectionExtension

import willburden.hale.standalone.interpreter.Interpreter
import com.google.inject.Inject
import org.junit.jupiter.api.Test

@ExtendWith(InjectionExtension)
@InjectWith(HaleInjectorProvider)
class HaleInterpreterTest {
	@Inject extension TestHelper
	
	@Test
	def void execPrint() {
		val model = "print \"Hello, world!\";".parse
		new Interpreter().execute(model)
	}
}
