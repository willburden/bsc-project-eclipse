package willburden.hale.standalone;

import java.io.File;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.Resource.Diagnostic;
import org.eclipse.xtext.resource.XtextResourceSet;

import com.google.inject.Injector;

import willburden.hale.HaleStandaloneSetup;
import willburden.hale.hale.Hale;

public class Parser {
	
	private Injector injector;
	
	public Parser() {
		injector = new HaleStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
	
	public ParseResult parseFile(String path) {
		XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);
		
		URI programURI = URI.createFileURI(new File(path).getAbsolutePath());
		Resource resource = resourceSet.getResource(programURI, true);
		
		EList<Diagnostic> errors = resource.getErrors();
		EList<Diagnostic> warnings = resource.getWarnings();
		Hale tree = (Hale) resource.getContents().get(0);
		
		return new ParseResult(errors, warnings, tree);
	}

	public static record ParseResult (EList<Diagnostic> errors, EList<Diagnostic> warnings, Hale tree) {}
		
}
