/* GENERATED FILE, do not modify manually                                                    *
 * If you need to modify it, copy it first */
package xbpmn.xdsml.api.impl;
import org.eclipse.emf.ecore.EObject;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.lang.reflect.Method;
import org.eclipse.gemoc.executionframework.engine.commons.K3DslHelper;


public class XBPMNRTDAccessor {
	public static java.lang.Boolean getIsStarted(org.obeonetwork.dsl.bpmn2.Process eObject) {
		return (java.lang.Boolean)  getAspectProperty(eObject, "org.gemoc.xbpmn.XBPMN", "org.gemoc.xbpmn.k3dsa.bpmn2.aspects.ProcessAspect", "isStarted");
	}
	public static boolean setIsStarted(org.obeonetwork.dsl.bpmn2.Process eObject, java.lang.Boolean newValue) {
		return setAspectProperty(eObject, "org.gemoc.xbpmn.XBPMN", "org.gemoc.xbpmn.k3dsa.bpmn2.aspects.ProcessAspect", "isStarted", newValue);
	}
	public static java.lang.Integer getStartCounter(org.obeonetwork.dsl.bpmn2.Process eObject) {
		return (java.lang.Integer)  getAspectProperty(eObject, "org.gemoc.xbpmn.XBPMN", "org.gemoc.xbpmn.k3dsa.bpmn2.aspects.ProcessAspect", "startCounter");
	}
	public static boolean setStartCounter(org.obeonetwork.dsl.bpmn2.Process eObject, java.lang.Integer newValue) {
		return setAspectProperty(eObject, "org.gemoc.xbpmn.XBPMN", "org.gemoc.xbpmn.k3dsa.bpmn2.aspects.ProcessAspect", "startCounter", newValue);
	}
	public static java.util.List getOwnedTokens(org.obeonetwork.dsl.bpmn2.Process eObject) {
		return (java.util.List)  getAspectProperty(eObject, "org.gemoc.xbpmn.XBPMN", "org.gemoc.xbpmn.k3dsa.bpmn2.aspects.ProcessAspect", "ownedTokens");
	}
	public static boolean setOwnedTokens(org.obeonetwork.dsl.bpmn2.Process eObject, java.util.List newValue) {
		return setAspectProperty(eObject, "org.gemoc.xbpmn.XBPMN", "org.gemoc.xbpmn.k3dsa.bpmn2.aspects.ProcessAspect", "ownedTokens", newValue);
	}
	public static java.lang.Integer getStartCounter(org.obeonetwork.dsl.bpmn2.Gateway eObject) {
		return (java.lang.Integer)  getAspectProperty(eObject, "org.gemoc.xbpmn.XBPMN", "org.gemoc.xbpmn.k3dsa.bpmn2.aspects.GatewayAspect", "startCounter");
	}
	public static boolean setStartCounter(org.obeonetwork.dsl.bpmn2.Gateway eObject, java.lang.Integer newValue) {
		return setAspectProperty(eObject, "org.gemoc.xbpmn.XBPMN", "org.gemoc.xbpmn.k3dsa.bpmn2.aspects.GatewayAspect", "startCounter", newValue);
	}
	public static java.lang.Integer getStartCounter(org.obeonetwork.dsl.bpmn2.Task eObject) {
		return (java.lang.Integer)  getAspectProperty(eObject, "org.gemoc.xbpmn.XBPMN", "org.gemoc.xbpmn.k3dsa.bpmn2.aspects.TaskAspect", "startCounter");
	}
	public static boolean setStartCounter(org.obeonetwork.dsl.bpmn2.Task eObject, java.lang.Integer newValue) {
		return setAspectProperty(eObject, "org.gemoc.xbpmn.XBPMN", "org.gemoc.xbpmn.k3dsa.bpmn2.aspects.TaskAspect", "startCounter", newValue);
	}
	public static java.lang.Boolean getIsStarted(org.obeonetwork.dsl.bpmn2.Task eObject) {
		return (java.lang.Boolean)  getAspectProperty(eObject, "org.gemoc.xbpmn.XBPMN", "org.gemoc.xbpmn.k3dsa.bpmn2.aspects.TaskAspect", "isStarted");
	}
	public static boolean setIsStarted(org.obeonetwork.dsl.bpmn2.Task eObject, java.lang.Boolean newValue) {
		return setAspectProperty(eObject, "org.gemoc.xbpmn.XBPMN", "org.gemoc.xbpmn.k3dsa.bpmn2.aspects.TaskAspect", "isStarted", newValue);
	}
	public static java.lang.Boolean getIsStarted(org.obeonetwork.dsl.bpmn2.Lane eObject) {
		return (java.lang.Boolean)  getAspectProperty(eObject, "org.gemoc.xbpmn.XBPMN", "org.gemoc.xbpmn.k3dsa.bpmn2.aspects.LaneAspect", "isStarted");
	}
	public static boolean setIsStarted(org.obeonetwork.dsl.bpmn2.Lane eObject, java.lang.Boolean newValue) {
		return setAspectProperty(eObject, "org.gemoc.xbpmn.XBPMN", "org.gemoc.xbpmn.k3dsa.bpmn2.aspects.LaneAspect", "isStarted", newValue);
	}

	public static Object getAspectProperty(EObject eObject, String languageName, String aspectName, String propertyName) {
		List<Class<?>> aspects = K3DslHelper.getAspectsOn(languageName, eObject.getClass());
		Class<?> aspect = null;
		for (Class<?> a : aspects) {
			try {
				if (Class.forName(aspectName).isAssignableFrom(a)) {
					aspect = a;
				}
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		}
		if (aspect == null) {
			return null;
		}
		Object res = null;
		 try {
			res = aspect.getDeclaredMethod(propertyName, ((fr.inria.diverse.k3.al.annotationprocessor.Aspect)aspect.getAnnotations()[0]).className()).invoke(eObject, eObject);
			if (res != null) {
				return res;
			}else {
				return null;
			}
		} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException
					| NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
		}

		return null;
	}
	
	
	public static boolean setAspectProperty(EObject eObject, String languageName, String aspectName, String propertyName, Object newValue) {
		List<Class<?>> aspects = K3DslHelper.getAspectsOn(languageName, eObject.getClass());
		Class<?> aspect = null;
		for (Class<?> a : aspects) {
			try {
				if (Class.forName(aspectName).isAssignableFrom(a)) {
					aspect = a;
				}
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
				return false;
			}
		}
		if (aspect == null) {
			return false;
		}
		final Class<?> targetClass = ((fr.inria.diverse.k3.al.annotationprocessor.Aspect)aspect.getAnnotations()[0]).className();
			 try {
				 aspect.getMethod(propertyName, targetClass, newValue.getClass()).invoke(eObject, eObject, newValue);
				return true;
				} catch (NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
					Method m = null;
					for(Class<?> c : newValue.getClass().getInterfaces()) {
						
						try {
							aspect.getMethod(propertyName, targetClass, c).invoke(eObject, eObject, newValue);
							return true;
						} catch (NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e1) {
						}
						if (m == null) {
							throw new RuntimeException("not method found for "+((fr.inria.diverse.k3.al.annotationprocessor.Aspect)aspect.getAnnotations()[0]).className()+"::set"+propertyName);
						}
					}
				}
			return false;
	}
};