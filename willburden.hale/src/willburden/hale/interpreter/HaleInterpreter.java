package willburden.hale.interpreter;

import java.io.File;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.resource.XtextResourceSet;

import com.google.inject.Injector;

import willburden.hale.HaleStandaloneSetup;
import willburden.hale.hale.Hale;
import willburden.hale.hale.Statement;

/**
 * Interprets a Hale program.
 */
public class HaleInterpreter {
	public static void main(String[] args) {
		if (args.length == 0) {
			System.err.println("Aborting: no path to program provided");
			return;	
		}
		
		Injector injector = new HaleStandaloneSetup().createInjectorAndDoEMFRegistration();
		
		XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class); 
		
		URI programURI = URI.createFileURI(new File(args[0]).getAbsolutePath());
		Resource resource = resourceSet.getResource(programURI, true);
		
		Hale root = (Hale) resource.getContents().get(0);
		
		for (Statement statement : root.getStatements()) {
			// Interpret the statement.
			
			System.out.println(statement.toString());
		}
	}
}
