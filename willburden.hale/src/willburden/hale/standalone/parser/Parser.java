package willburden.hale.standalone.parser;

import java.io.File;
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.Resource.Diagnostic;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.validation.CheckMode;
import org.eclipse.xtext.validation.IResourceValidator;
import org.eclipse.xtext.validation.Issue;

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
		IResourceValidator validator = injector.getInstance(IResourceValidator.class);
		
		URI programURI = URI.createFileURI(new File(path).getAbsolutePath());
		Resource resource = resourceSet.getResource(programURI, true);
		
		EList<Diagnostic> resourceErrors = resource.getErrors();
		EList<Diagnostic> resourceWarnings = resource.getWarnings();
		
		List<ParserDiagnostic> errors = resourceErrors.stream()
			.map(error -> new ParserDiagnostic(error))
			.collect(Collectors.toList());
		
		List<ParserDiagnostic> warnings = resourceWarnings.stream()
				.map(warning -> new ParserDiagnostic(warning))
				.collect(Collectors.toList());

		List<Issue> issues = validator.validate(resource, CheckMode.ALL, CancelIndicator.NullImpl);
		for (Issue issue : issues) {
			switch (issue.getSeverity()) {
				case ERROR:
					errors.add(new ParserDiagnostic(issue));
					break;
				case WARNING:
				default:
					warnings.add(new ParserDiagnostic(issue));
					break;
			}
		}
		
		Hale tree = (Hale) resource.getContents().get(0);
		
		return new ParseResult(errors, warnings, tree);
	}

	public static record ParseResult (List<ParserDiagnostic> errors, List<ParserDiagnostic> warnings, Hale tree) {}
		
}
