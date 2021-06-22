package org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.BPMNMTAdaptersFactory;
import org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Escalation;

@SuppressWarnings("all")
public class EscalationAdapter extends EObjectAdapter<Escalation> implements org.obeonetwork.dsl.bpmn2.Escalation {
  private BPMNMTAdaptersFactory adaptersFactory;
  
  public EscalationAdapter() {
    super(org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.BPMNMTAdaptersFactory.getInstance());
    adaptersFactory = org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.BPMNMTAdaptersFactory.getInstance();
  }
  
  @Override
  public String getName() {
    return adaptee.getName();
  }
  
  @Override
  public void setName(final String o) {
    adaptee.setName(o);
  }
  
  @Override
  public String getEscalationCode() {
    return adaptee.getEscalationCode();
  }
  
  @Override
  public void setEscalationCode(final String o) {
    adaptee.setEscalationCode(o);
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
  public org.obeonetwork.dsl.bpmn2.ItemDefinition getStructureRef() {
    return () adaptersFactory.createAdapter(adaptee.getStructureRef(), eResource);
  }
  
  @Override
  public void setStructureRef(final org.obeonetwork.dsl.bpmn2.ItemDefinition o) {
    if (o != null)
    	adaptee.setStructureRef(((org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.ItemDefinitionAdapter) o).getAdaptee());
    else adaptee.setStructureRef(null);
  }
  
  protected static final String NAME_EDEFAULT = null;
  
  protected static final String ESCALATION_CODE_EDEFAULT = null;
  
  protected static final String ID_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return org.obeonetwork.dsl.bpmn2.Bpmn2Package.eINSTANCE.getEscalation();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.ESCALATION__STRUCTURE_REF:
    		return getStructureRef();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.ESCALATION__NAME:
    		return getName();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.ESCALATION__ESCALATION_CODE:
    		return getEscalationCode();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.ESCALATION__ID:
    		return getId();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.ESCALATION__STRUCTURE_REF:
    		return getStructureRef() != null;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.ESCALATION__NAME:
    		return getName() != NAME_EDEFAULT;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.ESCALATION__ESCALATION_CODE:
    		return getEscalationCode() != ESCALATION_CODE_EDEFAULT;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.ESCALATION__ID:
    		return getId() != ID_EDEFAULT;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.ESCALATION__STRUCTURE_REF:
    		setStructureRef(
    		(org.obeonetwork.dsl.bpmn2.ItemDefinition)
    		 newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.ESCALATION__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.ESCALATION__ESCALATION_CODE:
    		setEscalationCode(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.ESCALATION__ID:
    		setId(
    		(java.lang.String)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
