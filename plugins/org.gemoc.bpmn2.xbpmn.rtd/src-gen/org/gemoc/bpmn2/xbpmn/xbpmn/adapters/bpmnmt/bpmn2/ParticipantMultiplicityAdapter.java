package org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.BPMNMTAdaptersFactory;
import org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.ParticipantMultiplicity;

@SuppressWarnings("all")
public class ParticipantMultiplicityAdapter extends EObjectAdapter<ParticipantMultiplicity> implements org.obeonetwork.dsl.bpmn2.ParticipantMultiplicity {
  private BPMNMTAdaptersFactory adaptersFactory;
  
  public ParticipantMultiplicityAdapter() {
    super(org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.BPMNMTAdaptersFactory.getInstance());
    adaptersFactory = org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.BPMNMTAdaptersFactory.getInstance();
  }
  
  @Override
  public int getMinimum() {
    return adaptee.getMinimum();
  }
  
  @Override
  public void setMinimum(final int o) {
    adaptee.setMinimum(o);
  }
  
  @Override
  public int getMaximum() {
    return adaptee.getMaximum();
  }
  
  @Override
  public void setMaximum(final int o) {
    adaptee.setMaximum(o);
  }
  
  @Override
  public String getId() {
    return adaptee.getId();
  }
  
  @Override
  public void setId(final String o) {
    adaptee.setId(o);
  }
  
  protected static final int MINIMUM_EDEFAULT = 0;
  
  protected static final int MAXIMUM_EDEFAULT = 1;
  
  protected static final String ID_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return org.obeonetwork.dsl.bpmn2.Bpmn2Package.eINSTANCE.getParticipantMultiplicity();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.PARTICIPANT_MULTIPLICITY__MINIMUM:
    		return new java.lang.Integer(getMinimum());
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.PARTICIPANT_MULTIPLICITY__MAXIMUM:
    		return new java.lang.Integer(getMaximum());
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.PARTICIPANT_MULTIPLICITY__ID:
    		return getId();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.PARTICIPANT_MULTIPLICITY__MINIMUM:
    		return getMinimum() != MINIMUM_EDEFAULT;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.PARTICIPANT_MULTIPLICITY__MAXIMUM:
    		return getMaximum() != MAXIMUM_EDEFAULT;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.PARTICIPANT_MULTIPLICITY__ID:
    		return getId() != ID_EDEFAULT;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.PARTICIPANT_MULTIPLICITY__MINIMUM:
    		setMinimum(((java.lang.Integer) newValue).intValue());
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.PARTICIPANT_MULTIPLICITY__MAXIMUM:
    		setMaximum(((java.lang.Integer) newValue).intValue());
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.PARTICIPANT_MULTIPLICITY__ID:
    		setId(
    		(java.lang.String)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
