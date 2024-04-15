package org.eclipse.xtext.example.arithmetics;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.example.arithmetics.arithmetics.Evaluation;
import org.eclipse.xtext.example.arithmetics.arithmetics.Statement;
import org.eclipse.xtext.example.arithmetics.interpreter.Calculator;
import org.eclipse.xtext.resource.XtextResourceSet;

import com.google.inject.Injector;

public class ArithmeticsStandalone {

	public static void main(String[] args) {
		Injector injector = new ArithmeticsStandaloneSetup().createInjectorAndDoEMFRegistration();

		XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);
		Resource resource = resourceSet.getResource(URI.createFileURI(args[0]), true);

		var module = (org.eclipse.xtext.example.arithmetics.arithmetics.Module) resource.getContents().get(0);
		
		Calculator calc = new Calculator();
		for (Statement statement : module.getStatements()) {
			if (statement instanceof Evaluation) {
				System.out.println("Result: " + calc.evaluate(((Evaluation) statement).getExpression()));
			}
		}
	}

}
