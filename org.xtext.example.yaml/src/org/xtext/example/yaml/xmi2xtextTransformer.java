package org.xtext.example.yaml;

import java.io.IOException;

//import mymodelingproject.MymodelingprojectPackage;
import namespace.NamespacePackage;
import _12._12Package;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import com.google.inject.Injector;

public class xmi2xtextTransformer {
public static void main(String[] args) throws IOException {
		
		runme();
	}
	
	public static void runme(){
		  // Register Epackage of modeling project otherwise, you will see: make sure that Epackage is registered
		 EPackage.Registry.INSTANCE.put("http://www.w3.org/XML/1998/namespace",NamespacePackage.eINSTANCE);
		 EPackage.Registry.INSTANCE.put("http://docs.oasis-open.org/tosca/ns/2011/12",_12Package.eINSTANCE);
		
		 
		 
		 
		 Injector injector = new MyDslStandaloneSetup().createInjectorAndDoEMFRegistration();
		// my dsl standalone is made by running Xtext artifact
		ResourceSet xmiResourceSet=injector.getInstance(ResourceSet.class);
		
		Resource xmi_resource=(Resource)xmiResourceSet.getResource(URI.createURI("oryxDDSM2TOSCA.xmi"),true);
		
	 
		// destination model that will be made by grammar
		ResourceSet xtext_resourceSet=injector.getInstance(ResourceSet.class);		 
		Resource textualModel_resource =(Resource)xtext_resourceSet.createResource(URI.createURI("OryxTOSCA2YAML.yaml"));
		// add the contents of the source model into destination model 
		textualModel_resource.getContents().add(xmi_resource.getContents().get(0));
		
		
		//save the destination file
		try {
				textualModel_resource.save(null);
		} catch (IOException e) {
			// TODO Auto-generated catch block			
			e.printStackTrace();
		}
				
			
				
	}

}
