package willburden.hale.standalone.parser;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.validation.Issue;

public record ParserDiagnostic(String location, int line, int column, String message) {
	public ParserDiagnostic(Issue issue) {
		this(null, issue.getLineNumber(), issue.getColumn(), issue.getMessage());
	}
	
	public ParserDiagnostic(Resource.Diagnostic diag) {
		this(diag.getLocation(), diag.getLine(), diag.getColumn(), diag.getMessage());
	}
}
