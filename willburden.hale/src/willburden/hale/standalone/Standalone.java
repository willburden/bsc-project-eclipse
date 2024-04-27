package willburden.hale.standalone;

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
			for (ParserDiagnostic warning : result.warnings()) {
				printDiagnostic(warning);
			}
			
			System.err.println();
		}
		
		if (result.errors().size() > 0) {
			System.err.printf("Encountered %d error(s) while parsing%n%n", result.errors().size());
			for (ParserDiagnostic error : result.errors()) {
				printDiagnostic(error);
			}
			
			System.err.printf("%nAborting due to errors%n");
			return;
		}
		
		Interpreter interpreter = new Interpreter();
		try {
			interpreter.execute(result.tree());
		} catch (InterpreterException e) {
			System.err.printf("Encountered error while interpreting program%n%n");
			
			if (e.getMessage() != null) {
				System.err.println(e.getMessage());
			}
			
			Throwable cause = e.getCause();
			while (cause != null) {
				if (cause.getMessage() != null) {
					System.err.println("\nCaused by:");
					System.err.println(cause.getMessage());
				}
				
				cause = cause.getCause();
			}
			
			System.err.printf("%nAborting due to error%n");
			return;
		}
	}
	
	private static void printDiagnostic(ParserDiagnostic diag) {
		if (diag.location() != null) {
			System.err.printf("[%s:%s:%s] %s%n", diag.location(), diag.line(), diag.column(), diag.message());
		} else {
			System.err.printf("[%s:%s] %s%n", diag.line(), diag.column(), diag.message());
		}
	}

}
