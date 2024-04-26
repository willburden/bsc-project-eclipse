package willburden.hale.standalone;

import org.eclipse.emf.ecore.resource.Resource.Diagnostic;

import willburden.hale.standalone.Parser.ParseResult;

public class Standalone {

	public static void main(String[] args) {
		if (args.length == 0) {
			System.err.println("Aborting: no path to program provided");
			return;	
		}

		Parser parser = new Parser();
		
		ParseResult result = parser.parseFile(args[0]);
		
		if (result.warnings().size() > 0) {
			System.err.printf("Encountered %d warning(s) while parsing%n%n", result.warnings().size());
			for (Diagnostic warning : result.warnings()) {
				printDiagnostic(warning);
			}
			
			System.err.println();
		}
		
		if (result.errors().size() > 0) {
			System.err.printf("Encountered %d error(s) while parsing%n%n", result.errors().size());
			for (Diagnostic error : result.errors()) {
				printDiagnostic(error);
			}
			
			System.err.printf("%nAborting due to errors%n");
			return;
		}
		
		Interpreter interpreter = new Interpreter();
		interpreter.execute(result.tree());
	}
	
	private static void printDiagnostic(Diagnostic diag) {
		if (diag.getLocation() != null) {
			System.err.printf("[%s:%s:%s] %s%n", diag.getLocation(), diag.getLine(), diag.getColumn(), diag.getMessage());
		} else {
			System.err.printf("[%s:%s] %s%n", diag.getLine(), diag.getColumn(), diag.getMessage());
		}
	}

}
