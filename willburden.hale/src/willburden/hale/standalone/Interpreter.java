package willburden.hale.standalone;

import willburden.hale.hale.Hale;
import willburden.hale.hale.Statement;

/**
 * Interprets a Hale program.
 */
public class Interpreter {
	public void execute(Hale tree) {
		for (Statement statement : tree.getStatements()) {
			// Interpret the statement.
			
			System.out.println(statement.toString());
		}
	}
}
