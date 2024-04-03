package willburden.hale.generator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class HaleGenerator extends AbstractGenerator {
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<EObject> _contents = resource.getContents();
      for(final EObject object : _contents) {
        String _dump = HaleGenerator.dump(object, "    ");
        _builder.append(_dump);
        _builder.newLineIfNotEmpty();
      }
    }
    fsa.generateFile("program.hale.ast", _builder);
  }

  public static String dump(final EObject mod_, final String indent) {
    String _replaceFirst = mod_.toString().replaceFirst(".*[.]impl[.](.*)Impl[^(]*", "$1 ");
    String res = (indent + _replaceFirst);
    EList<EObject> _eCrossReferences = mod_.eCrossReferences();
    for (final EObject a : _eCrossReferences) {
      String _res = res;
      String _replaceFirst_1 = a.toString().replaceFirst(".*[.]impl[.](.*)Impl[^(]*", "$1 ");
      String _plus = (" ->" + _replaceFirst_1);
      res = (_res + _plus);
    }
    String _res_1 = res;
    res = (_res_1 + "\n");
    EList<EObject> _eContents = mod_.eContents();
    for (final EObject f : _eContents) {
      String _res_2 = res;
      String _dump = HaleGenerator.dump(f, (indent + "    "));
      res = (_res_2 + _dump);
    }
    return res;
  }
}
