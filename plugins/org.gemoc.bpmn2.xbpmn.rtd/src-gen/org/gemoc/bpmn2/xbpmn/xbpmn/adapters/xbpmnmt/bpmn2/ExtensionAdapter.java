package org.gemoc.bpmn2.xbpmn.xbpmn.adapters.xbpmnmt.bpmn2;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.bpmn2.xbpmn.xbpmn.adapters.xbpmnmt.XBPMNMTAdaptersFactory;
import org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Extension;

@SuppressWarnings("all")
public class ExtensionAdapter extends EObjectAdapter<Extension> implements org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Extension {
  private XBPMNMTAdaptersFactory adaptersFactory;
  
  public ExtensionAdapter() {
    super(org.gemoc.bpmn2.xbpmn.xbpmn.adapters.xbpmnmt.XBPMNMTAdaptersFactory.getInstance());
    adaptersFactory = org.gemoc.bpmn2.xbpmn.xbpmn.adapters.xbpmnmt.XBPMNMTAdaptersFactory.getInstance();
  }
  
  @Override
  public boolean isMustUnderstand() {
    return adaptee.isMustUnderstand();
  }
  
  @Override
  public void setMustUnderstand(final boolean o) {
    adaptee.setMustUnderstand(o);
  }
  
  @Override
  public String getId() {
    return adaptee.getId();
  }
  
  @Override
  public void setId(final String o) {
    adaptee.setId(o);
  }
  
  @Override
  public org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.ExtensionDefinition getDefinition() {
    return () adaptersFactory.createAdapter(adaptee.getDefinition(), eResource);
  }
  
  @Override
  public void setDefinition(final org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.ExtensionDefinition o) {
    if (o != null)
    	adaptee.setDefinition(((org.gemoc.bpmn2.xbpmn.xbpmn.adapters.xbpmnmt.bpmn2.ExtensionDefinitionAdapter) o).getAdaptee());
    else adaptee.setDefinition(null);
  }
  
  protected static final boolean MUST_UNDERSTAND_EDEFAULT = false;
  
  protected static final String ID_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.eINSTANCE.getExtension();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.EXTENSION__MUST_UNDERSTAND:
    		return isMustUnderstand() ? Boolean.TRUE : Boolean.FALSE;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.EXTENSION__DEFINITION:
    		return getDefinition();
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.EXTENSION__ID:
    		return getId();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.EXTENSION__MUST_UNDERSTAND:
    		return isMustUnderstand() != MUST_UNDERSTAND_EDEFAULT;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.EXTENSION__DEFINITION:
    		return getDefinition() != null;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.EXTENSION__ID:
    		return getId() != ID_EDEFAULT;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.EXTENSION__MUST_UNDERSTAND:
    		setMustUnderstand(((java.lang.Boolean) newValue).booleanValue());
    		return;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.EXTENSION__DEFINITION:
    		setDefinition(
    		(org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.ExtensionDefinition)
    		 newValue);
    		return;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.EXTENSION__ID:
    		setId(
    		(java.lang.String)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
