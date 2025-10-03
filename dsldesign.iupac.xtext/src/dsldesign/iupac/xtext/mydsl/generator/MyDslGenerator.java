package dsldesign.iupac.xtext.mydsl.generator;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGenerator2;
import org.eclipse.xtext.generator.IGeneratorContext;

public class MyDslGenerator implements IGenerator2 {

    @Override
    public void beforeGenerate(Resource input, IFileSystemAccess2 fsa, IGeneratorContext context) {
        // no-op
    }

    @Override
    public void doGenerate(Resource input, IFileSystemAccess2 fsa, IGeneratorContext context) {
        // no-op
    }

    @Override
    public void afterGenerate(Resource input, IFileSystemAccess2 fsa, IGeneratorContext context) {
        // no-op
    }
}
