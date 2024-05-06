package willburden.hale.standalone;

import willburden.hale.error.InterpreterException;
import willburden.hale.interpreter.Interpreter;
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
			System.err.println("Encountered error while interpreting program");
			
			if (e.getMessage() != null) {
				System.err.println("\n" + e.getMessage());
			}
			
			Throwable cause = e.getCause();
			while (cause != null) {
				if (cause.getMessage() != null) {
					System.err.println("\nCaused by:\n" + cause.getMessage());
				}
				
				cause = cause.getCause();
			}
			
			System.err.println("\nAborting due to error");
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
