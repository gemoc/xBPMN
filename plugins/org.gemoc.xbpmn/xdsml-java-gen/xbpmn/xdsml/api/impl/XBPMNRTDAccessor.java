/* GENERATED FILE, do not modify manually                                                    *
 * If you need to modify it, copy it first */
package xbpmn.xdsml.api.impl;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.List;
import java.lang.reflect.Method;
import org.eclipse.gemoc.execution.concurrent.ccsljavaxdsml.utils.Copier;
import org.eclipse.gemoc.executionframework.engine.commons.K3DslHelper;


public class XBPMNRTDAccessor {
  public static java.lang.Boolean getisStarted(org.obeonetwork.dsl.bpmn2.Process eObject) {
     java.lang.Boolean theProperty = (java.lang.Boolean)getAspectProperty(eObject, "org.gemoc.xbpmn.XBPMN", "org.gemoc.xbpmn.k3dsa.bpmn2.aspects.ProcessAspect", "isStarted");
		return theProperty;
}
  public static java.lang.Boolean saveProperty_isStarted(org.obeonetwork.dsl.bpmn2.Process eObject) {
		java.lang.Boolean propertyValue = (java.lang.Boolean)getAspectProperty(eObject, "org.gemoc.xbpmn.XBPMN", "org.gemoc.xbpmn.k3dsa.bpmn2.aspects.ProcessAspect", "isStarted");
		propertyValue = propertyValue == null ? null : (java.lang.Boolean)Copier.clone(propertyValue);
		return propertyValue;
}
	public static boolean setisStarted(org.obeonetwork.dsl.bpmn2.Process eObject, java.lang.Boolean newValue) {
		return setAspectProperty(eObject, "org.gemoc.xbpmn.XBPMN", "org.gemoc.xbpmn.k3dsa.bpmn2.aspects.ProcessAspect", "isStarted", newValue);
	}
	public static boolean restoreProperty_isStarted(org.obeonetwork.dsl.bpmn2.Process eObject, java.lang.Boolean newValue) {
		java.lang.Boolean propertyValue = newValue;
		propertyValue = propertyValue == null ? null : (java.lang.Boolean)Copier.clone(propertyValue);
		return setAspectProperty(eObject, "org.gemoc.xbpmn.XBPMN", "org.gemoc.xbpmn.k3dsa.bpmn2.aspects.ProcessAspect", "isStarted", propertyValue);
	}
  public static java.lang.Integer getstartCounter(org.obeonetwork.dsl.bpmn2.Process eObject) {
     java.lang.Integer theProperty = (java.lang.Integer)getAspectProperty(eObject, "org.gemoc.xbpmn.XBPMN", "org.gemoc.xbpmn.k3dsa.bpmn2.aspects.ProcessAspect", "startCounter");
		return theProperty;
}
  public static java.lang.Integer saveProperty_startCounter(org.obeonetwork.dsl.bpmn2.Process eObject) {
		java.lang.Integer propertyValue = (java.lang.Integer)getAspectProperty(eObject, "org.gemoc.xbpmn.XBPMN", "org.gemoc.xbpmn.k3dsa.bpmn2.aspects.ProcessAspect", "startCounter");
		propertyValue = propertyValue == null ? null : (java.lang.Integer)Copier.clone(propertyValue);
		return propertyValue;
}
	public static boolean setstartCounter(org.obeonetwork.dsl.bpmn2.Process eObject, java.lang.Integer newValue) {
		return setAspectProperty(eObject, "org.gemoc.xbpmn.XBPMN", "org.gemoc.xbpmn.k3dsa.bpmn2.aspects.ProcessAspect", "startCounter", newValue);
	}
	public static boolean restoreProperty_startCounter(org.obeonetwork.dsl.bpmn2.Process eObject, java.lang.Integer newValue) {
		java.lang.Integer propertyValue = newValue;
		propertyValue = propertyValue == null ? null : (java.lang.Integer)Copier.clone(propertyValue);
		return setAspectProperty(eObject, "org.gemoc.xbpmn.XBPMN", "org.gemoc.xbpmn.k3dsa.bpmn2.aspects.ProcessAspect", "startCounter", propertyValue);
	}
  public static org.eclipse.emf.common.util.EList getownedTokens(org.obeonetwork.dsl.bpmn2.Process eObject) {
     org.eclipse.emf.common.util.EList theProperty = (org.eclipse.emf.common.util.EList)getAspectProperty(eObject, "org.gemoc.xbpmn.XBPMN", "org.gemoc.xbpmn.k3dsa.bpmn2.aspects.ProcessAspect", "ownedTokens");
		return theProperty;
}
  public static org.eclipse.emf.common.util.EList saveProperty_ownedTokens(org.obeonetwork.dsl.bpmn2.Process eObject) {
	    EList res = new BasicEList();
	    res.addAll(EcoreUtil.copyAll((org.eclipse.emf.common.util.EList)getAspectProperty(eObject, "org.gemoc.xbpmn.XBPMN", "org.gemoc.xbpmn.k3dsa.bpmn2.aspects.ProcessAspect", "ownedTokens")));
	    return res;
  }
	public static boolean restoreProperty_ownedTokens(org.obeonetwork.dsl.bpmn2.Process eObject, org.eclipse.emf.common.util.EList newValue) {
		getownedTokens(eObject).clear();
		Collection c = EcoreUtil.copyAll(newValue);
		getownedTokens(eObject).addAll(c);
		eObject.eResource().getContents().addAll(c);
		return true;
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
			return res;
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
		 Method m = getSetter(propertyName,newValue,aspect);
		 try {
			m.invoke(eObject, eObject, newValue);
			return true;
		} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			e.printStackTrace();
		}			
		return false;
}
	
	private static Method getSetter(String propertyName, Object value, Class<?> aspect) {
		Method setter = null;
		try {
			if(value != null) {
				setter = aspect.getMethod(propertyName, ((fr.inria.diverse.k3.al.annotationprocessor.Aspect)aspect.getAnnotations()[0]).className(), value.getClass());
			}else {
				for (Method m : aspect.getMethods()) {
					if (m.getName().compareTo(propertyName) ==0 && m.getParameterCount() == 2) {
						setter= m;
						return setter;
					}
				}
				throw new NoSuchMethodException();
			}
			return setter;
		} catch (NoSuchMethodException | SecurityException | IllegalArgumentException e) {
			
				for(Class<?> c : ((fr.inria.diverse.k3.al.annotationprocessor.Aspect)aspect.getAnnotations()[0]).getClass().getInterfaces()) {
					try {
						if(value != null) {
							setter = aspect.getMethod(propertyName, c, value.getClass());
							return setter;
						}
					} catch (NoSuchMethodException | SecurityException | IllegalArgumentException e1) {
					}
					for (Method m : aspect.getMethods()) {
						if (m.getName().compareTo(propertyName) ==0 && m.getParameterCount() == 2) {
							setter= m;
							return setter;
						}
					}
					
				}
				if (setter == null) {
					throw new RuntimeException("no method found for "+value.getClass().getName()+"::set"+propertyName);
				}
			}
		return setter;
	}};