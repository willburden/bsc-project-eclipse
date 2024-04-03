package willburden.hale.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.eclipse.emf.ecore.EObject

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class HaleGenerator extends AbstractGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		fsa.generateFile("program.hale.ast", '''
			«FOR object : resource.contents»
				«dump(object, "    ")»
			«ENDFOR»
		''');
	}
	
	// https://stackoverflow.com/questions/13701199/viewing-the-parse-tree-node-model-ast-in-xtext
	def static String dump(EObject mod_, String indent) {
	    var res = indent + mod_.toString.replaceFirst ('.*[.]impl[.](.*)Impl[^(]*', '$1 ')
	
	    for (a :mod_.eCrossReferences)
	        res += ' ->' + a.toString().replaceFirst ('.*[.]impl[.](.*)Impl[^(]*', '$1 ')
	    res += "\n"
	    for (f :mod_.eContents) {
	        res += f.dump (indent+"    ")
	    }
	    return res
	}

}
