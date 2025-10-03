package dsldesign.iupac.xtext.test;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.resource.XtextResourceSet;
import com.google.inject.Injector;
import dsldesign.iupac.xtext.mydsl.MyDslStandaloneSetupGenerated;
import dsldesign.IUPACpackage.IUPAC;
import dsldesign.IUPACpackage.Chain;
import dsldesign.IUPACpackage.IupacPackage;

public class IupacParser {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.err.println("Usage: IupacParser <file.iupac>");
            System.exit(1);
        }
        
        IupacPackage.eINSTANCE.eClass();
        
        Injector injector = new MyDslStandaloneSetupGenerated()
            .createInjectorAndDoEMFRegistration();
        XtextResourceSet rs = injector.getInstance(XtextResourceSet.class);
        
        Resource resource = rs.getResource(
            URI.createFileURI(args[0]), true);
        
        if (!resource.getErrors().isEmpty()) {
            System.err.println("Parse errors:");
            resource.getErrors().forEach(e -> 
                System.err.println("  " + e.getMessage()));
            System.exit(1);
        }
        
        if (!resource.getContents().isEmpty()) {
            Object rootObj = resource.getContents().get(0);
            
            if (rootObj instanceof IUPAC) {
                IUPAC model = (IUPAC) rootObj;
                System.out.println("Valid IUPAC file");
                System.out.println("Chains: " + model.getChain().size());
                
                for (Chain c : model.getChain()) {
                    System.out.println("  - " + c.getEncodedName());
                }
            }
        }
    }
}