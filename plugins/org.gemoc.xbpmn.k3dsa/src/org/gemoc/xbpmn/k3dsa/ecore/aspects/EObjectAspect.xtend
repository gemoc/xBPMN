package org.gemoc.xbpmn.k3dsa.ecore.aspects

import org.eclipse.emf.ecore.EObject
//import org.eclipse.gemoc.commons.eclipse.messagingsystem.api.MessagingSystem
//import fr.inria.glose.fcl.k3fcl.k3dsa.Activator
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.emf.ecore.EAttribute

class EObjectAspect {
	
	public static final String MESSAGE_GROUP = "BPMN_XDSML";
	
//	def static void devDebug(EObject _self, String message) {
//		Activator.getDefault().getMessaggingSystem().log(MessagingSystem.Kind.DevDEBUG, message, MESSAGE_GROUP);
//	}
//	
//	def static void devDebug(EObject _self) {
//		Activator.getDefault().getMessaggingSystem().log(MessagingSystem.Kind.DevDEBUG, _self.toString(), MESSAGE_GROUP);
//	}
//	def static void devInfo(EObject _self, String message) {
//		Activator.getDefault().getMessaggingSystem().devInfo(message, MESSAGE_GROUP);
//	}
//	def static void devInfo(EObject _self) {
//		Activator.getDefault().getMessaggingSystem().devInfo(_self.toString(), MESSAGE_GROUP);
//	}
//	def static void devWarn(EObject _self, String message) {
//		Activator.getDefault().getMessaggingSystem().log(MessagingSystem.Kind.DevWARNING, message, MESSAGE_GROUP);
//	}
//	def static void devError(EObject _self, String message) {
//		Activator.getDefault().getMessaggingSystem().log(MessagingSystem.Kind.DevERROR, message, MESSAGE_GROUP);
//	}
//	def static void info(EObject _self, String message) {
//		Activator.getDefault().getMessaggingSystem().info(message, MESSAGE_GROUP);
//	}
//	def static void important(EObject _self, String message) {
//		Activator.getDefault().getMessaggingSystem().important(message, MESSAGE_GROUP);
//	}
//
//	def static void warn(EObject _self, String message) {
//		Activator.getDefault().getMessaggingSystem().warn(message, MESSAGE_GROUP);
//	}
//	def static void error(EObject _self, String message) {
//		Activator.getDefault().getMessaggingSystem().error(message, MESSAGE_GROUP);
//	}
	
	def static String getQualifiedName(EObject eObject) {
		val StringBuilder sb = new StringBuilder();

		if(eObject.eContainer() !== null){
			sb.append(getQualifiedName(eObject.eContainer()));
			sb.append("/");
		}
		val EAttribute feat = eObject.eClass().getEAllAttributes().findFirst[att | att.getName().equals("name")];
		if(feat !== null) {
			sb.append(eObject.eGet(feat));
		} else {
			val String lastFragmentPart = EcoreUtil.getURI(eObject).fragment()
					.substring(EcoreUtil.getURI(eObject).fragment().lastIndexOf("/")+1);
			sb.append(lastFragmentPart);
		}
		return sb.toString();
		
	}
	
}
