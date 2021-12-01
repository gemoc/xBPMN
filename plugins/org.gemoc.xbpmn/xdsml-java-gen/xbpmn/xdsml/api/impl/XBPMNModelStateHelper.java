/* GENERATED FILE, do not modify manually                                                    *
 * If you need to modify it, copy it first */
package xbpmn.xdsml.api.impl;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature.Setting;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gemoc.execution.concurrent.ccsljavaengine.extensions.k3.rtd.modelstate.k3ModelState.ElementState;
import org.eclipse.gemoc.execution.concurrent.ccsljavaengine.extensions.k3.rtd.modelstate.k3ModelState.K3AttributeRTD;
import org.eclipse.gemoc.execution.concurrent.ccsljavaengine.extensions.k3.rtd.modelstate.k3ModelState.K3StringAttributeRTD;
import org.eclipse.gemoc.execution.concurrent.ccsljavaengine.extensions.k3.rtd.modelstate.k3ModelState.K3RawAttributeRTD;
import org.eclipse.gemoc.execution.concurrent.ccsljavaengine.extensions.k3.rtd.modelstate.k3ModelState.K3ManyEMFReferenceRTD;
import org.eclipse.gemoc.execution.concurrent.ccsljavaengine.extensions.k3.rtd.modelstate.k3ModelState.K3SingleEMFReferenceRTD;
import org.eclipse.gemoc.execution.concurrent.ccsljavaengine.extensions.k3.rtd.modelstate.k3ModelState.K3ModelState;
import org.eclipse.gemoc.execution.concurrent.ccsljavaengine.extensions.k3.rtd.modelstate.k3ModelState.K3ModelStateFactory;
import org.eclipse.gemoc.execution.concurrent.ccsljavaengine.extensions.k3.rtd.modelstate.utils.K3ModelStateHelper;
import org.eclipse.gemoc.execution.concurrent.ccsljavaengine.extensions.k3.dsa.helper.IK3ModelStateHelper;
import org.eclipse.gemoc.execution.concurrent.ccsljavaxdsml.utils.Copier;
import org.eclipse.gemoc.executionframework.engine.commons.K3DslHelper;
import java.util.ArrayList;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import java.util.Arrays;
import java.util.List;


public class XBPMNModelStateHelper implements IK3ModelStateHelper{
	K3ModelStateFactory theFactory = K3ModelStateFactory.eINSTANCE; 

	public K3ModelState getK3StateSpaceModelState(EObject model) {
		return getK3ModelState(model, false);
	}
	
	public K3ModelState getK3ModelState(EObject model) {
		return getK3ModelState(model, true);
	}
		
	public K3ModelState getK3ModelState(EObject model, boolean allRTDs) {
		K3ModelState res = theFactory.createK3ModelState();

		// consider indirectly referenced models (ugly and probably not efficient)
		ArrayList<EObject> allElements = new ArrayList<EObject>();
		model.eAllContents().forEachRemaining(x -> allElements.add(x));
		Map<EObject, Collection<Setting>> f = EcoreUtil.CrossReferencer.find(allElements);
		HashSet<Resource> consideredResources = new HashSet<Resource>();
		consideredResources.add(model.eResource());
		f.keySet().forEach(eo -> consideredResources.add(eo.eResource()));
		
		for(Resource resource : consideredResources) {
			TreeIterator<EObject> allContentIt = resource.getAllContents();
			while (allContentIt.hasNext()) {
				EObject elem = allContentIt.next();

				Class<?> clazz =null;
				clazz = K3DslHelper.getTarget(org.gemoc.xbpmn.k3dsa.bpmn2.aspects.ProcessAspect.class);
				if (clazz.isInstance(elem)) {
					ElementState elemState = theFactory.createElementState();
					elemState.setModelElement(elem);
					res.getOwnedElementstates().add(elemState);
					// Annotation CONTAINER
					java.lang.Boolean propertyValue0 = XBPMNRTDAccessor.saveProperty_isStarted((org.obeonetwork.dsl.bpmn2.Process)elem);
					K3RawAttributeRTD n2v0 = theFactory.createK3RawAttributeRTD();
					n2v0.setClassName("java.lang.Boolean");
					try {
						n2v0.setValue(K3ModelStateHelper.getSerializedString(propertyValue0));
					} catch (IOException e0) {
						org.eclipse.gemoc.executionframework.engine.Activator.getDefault().error(String.format(" Error while saving %s.%s := %s",
								elemState.getModelElement(), "isStarted", propertyValue0), e0);
					}
					n2v0.setAttributeName("isStarted");
					elemState.getSavedRTDs().add(n2v0);
					org.eclipse.gemoc.executionframework.engine.Activator.getDefault().debug(String.format("   saving %s.%s := %s",
						elemState.getModelElement(), "isStarted", propertyValue0));
					// Annotation CONTAINER
					java.lang.Integer propertyValue1 = XBPMNRTDAccessor.saveProperty_startCounter((org.obeonetwork.dsl.bpmn2.Process)elem);
					K3RawAttributeRTD n2v1 = theFactory.createK3RawAttributeRTD();
					n2v1.setClassName("java.lang.Integer");
					try {
						n2v1.setValue(K3ModelStateHelper.getSerializedString(propertyValue1));
					} catch (IOException e1) {
						org.eclipse.gemoc.executionframework.engine.Activator.getDefault().error(String.format(" Error while saving %s.%s := %s",
								elemState.getModelElement(), "startCounter", propertyValue1), e1);
					}
					n2v1.setAttributeName("startCounter");
					elemState.getSavedRTDs().add(n2v1);
					org.eclipse.gemoc.executionframework.engine.Activator.getDefault().debug(String.format("   saving %s.%s := %s",
						elemState.getModelElement(), "startCounter", propertyValue1));
					// Annotation CONTAINER
					org.eclipse.emf.common.util.EList propertyValue2 = XBPMNRTDAccessor.saveProperty_ownedTokens((org.obeonetwork.dsl.bpmn2.Process)elem);
					K3ManyEMFReferenceRTD n2v2 = theFactory.createK3ManyEMFReferenceRTD();
					n2v2.getReferenceValues().addAll(propertyValue2);
					n2v2.setAttributeName("ownedTokens");
					elemState.getSavedRTDs().add(n2v2);
					org.eclipse.gemoc.executionframework.engine.Activator.getDefault().debug(String.format("   saving %s.%s := %s",
						elemState.getModelElement(), "ownedTokens", propertyValue2));
				}
			}
		}
		return res;
	}


	public void restoreModelState(K3ModelState state) {
		for(ElementState elemState : state.getOwnedElementstates()) {
			for(K3AttributeRTD o : elemState.getSavedRTDs()) {
				Object value = null;
				if(o instanceof K3RawAttributeRTD) {
					try {
						value = K3ModelStateHelper.getDeserializedObject(((K3RawAttributeRTD)o).getValue());
					} catch (ClassNotFoundException | IOException e) {
						e.printStackTrace();
					}				} else if(o instanceof K3StringAttributeRTD) { 
					value = ((K3StringAttributeRTD)o).getValue();
				}  else if(o instanceof K3ManyEMFReferenceRTD) { 
						value = ((K3ManyEMFReferenceRTD)o).getReferenceValues();
				} else if(o instanceof K3SingleEMFReferenceRTD) { 
					value = ((K3SingleEMFReferenceRTD)o).getReferenceValue();
				}
				org.eclipse.gemoc.executionframework.engine.Activator.getDefault().debug(String.format("	restoring %s.%s := %s",
						elemState.getModelElement(), o.getAttributeName(), value!=null ? value.toString(): "null"));
				Method setter = null;
				setter = getRestorePropertySetter(elemState.getModelElement().getClass(), o);
				try {
					setter.invoke(null, elemState.getModelElement(), value);
				} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
					e.printStackTrace();
				}
			}
		}
	}
	private Method getRestorePropertySetter(Class<?> targetClass, K3AttributeRTD n2v) {
		Method setter = null;
		Object deserializedValue = null;
		try {
			
			if(n2v instanceof K3RawAttributeRTD) {
				try {
					deserializedValue = K3ModelStateHelper.getDeserializedObject(((K3RawAttributeRTD)n2v).getValue());
				} catch (ClassNotFoundException | IOException e) {
					org.eclipse.gemoc.executionframework.engine.Activator.getDefault().error(String.format("	ERROR restoring property %s from serialized String %s",
							n2v.getAttributeName(), ((K3RawAttributeRTD)n2v).getValue()), e);
				}			} else if(n2v instanceof K3StringAttributeRTD) { 
				deserializedValue = ((K3StringAttributeRTD)n2v).getValue();
			}
			for(Method m2 : XBPMNRTDAccessor.class.getMethods()) {
				if(m2.getName().equals("restoreProperty_"+n2v.getAttributeName()) && m2.getParameterTypes().length == 2) {
					
					if(m2.getParameterTypes()[0].isAssignableFrom(targetClass) &&
							(deserializedValue == null || m2.getParameterTypes()[1].isAssignableFrom(deserializedValue.getClass()))	) {
						setter = m2;
						break;
					}
				}
			}
			if (setter == null) {
				throw new RuntimeException("no method found for restoreProperty_"+n2v.getAttributeName()+"("+targetClass+", "+deserializedValue.getClass().getName()+")");
			}
			return setter;
		} catch (SecurityException | IllegalArgumentException e) {
			throw new RuntimeException("no method found for set"+n2v.getAttributeName()+"("+targetClass+", "+deserializedValue.getClass().getName()+")", e);
		}
	}
	
};