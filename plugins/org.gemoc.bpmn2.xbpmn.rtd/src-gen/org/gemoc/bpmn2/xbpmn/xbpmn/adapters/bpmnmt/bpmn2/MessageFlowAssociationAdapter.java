package org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.BPMNMTAdaptersFactory;
import org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.MessageFlowAssociation;

@SuppressWarnings("all")
public class MessageFlowAssociationAdapter extends EObjectAdapter<MessageFlowAssociation> implements org.obeonetwork.dsl.bpmn2.MessageFlowAssociation {
  private BPMNMTAdaptersFactory adaptersFactory;
  
  public MessageFlowAssociationAdapter() {
    super(org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.BPMNMTAdaptersFactory.getInstance());
    adaptersFactory = org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.BPMNMTAdaptersFactory.getInstance();
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
  public String getDescription() {
    return adaptee.getDescription();
  }
  
  @Override
  public void setDescription(final String o) {
    adaptee.setDescription(o);
  }
  
  private /* EList<org.obeonetwork.dsl.bpmn2.ExtensionDefinition> */Object extensionDefinitions_;
  
  @Override
  public /* EList<org.obeonetwork.dsl.bpmn2.ExtensionDefinition> */Object getExtensionDefinitions() {
    if (extensionDefinitions_ == null)
    	extensionDefinitions_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getExtensionDefinitions(), adaptersFactory, eResource);
    return extensionDefinitions_;
  }
  
  private /* EList<org.obeonetwork.dsl.bpmn2.ExtensionAttributeValue> */Object extensionValues_;
  
  @Override
  public /* EList<org.obeonetwork.dsl.bpmn2.ExtensionAttributeValue> */Object getExtensionValues() {
    if (extensionValues_ == null)
    	extensionValues_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getExtensionValues(), adaptersFactory, eResource);
    return extensionValues_;
  }
  
  private /* EList<org.obeonetwork.dsl.bpmn2.Documentation> */Object documentation_;
  
  @Override
  public /* EList<org.obeonetwork.dsl.bpmn2.Documentation> */Object getDocumentation() {
    if (documentation_ == null)
    	documentation_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getDocumentation(), adaptersFactory, eResource);
    return documentation_;
  }
  
  @Override
  public org.obeonetwork.dsl.bpmn2.MessageFlow getInnerMessageFlowRef() {
    return () adaptersFactory.createAdapter(adaptee.getInnerMessageFlowRef(), eResource);
  }
  
  @Override
  public void setInnerMessageFlowRef(final org.obeonetwork.dsl.bpmn2.MessageFlow o) {
    if (o != null)
    	adaptee.setInnerMessageFlowRef(((org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.MessageFlowAdapter) o).getAdaptee());
    else adaptee.setInnerMessageFlowRef(null);
  }
  
  @Override
  public org.obeonetwork.dsl.bpmn2.MessageFlow getOuterMessageFlowRef() {
    return () adaptersFactory.createAdapter(adaptee.getOuterMessageFlowRef(), eResource);
  }
  
  @Override
  public void setOuterMessageFlowRef(final org.obeonetwork.dsl.bpmn2.MessageFlow o) {
    if (o != null)
    	adaptee.setOuterMessageFlowRef(((org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.MessageFlowAdapter) o).getAdaptee());
    else adaptee.setOuterMessageFlowRef(null);
  }
  
  protected static final String ID_EDEFAULT = null;
  
  protected static final String DESCRIPTION_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return org.obeonetwork.dsl.bpmn2.Bpmn2Package.eINSTANCE.getMessageFlowAssociation();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.MESSAGE_FLOW_ASSOCIATION__ID:
    		return getId();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.MESSAGE_FLOW_ASSOCIATION__EXTENSION_DEFINITIONS:
    		return getExtensionDefinitions();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.MESSAGE_FLOW_ASSOCIATION__EXTENSION_VALUES:
    		return getExtensionValues();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.MESSAGE_FLOW_ASSOCIATION__DOCUMENTATION:
    		return getDocumentation();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.MESSAGE_FLOW_ASSOCIATION__DESCRIPTION:
    		return getDescription();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.MESSAGE_FLOW_ASSOCIATION__INNER_MESSAGE_FLOW_REF:
    		return getInnerMessageFlowRef();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.MESSAGE_FLOW_ASSOCIATION__OUTER_MESSAGE_FLOW_REF:
    		return getOuterMessageFlowRef();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.MESSAGE_FLOW_ASSOCIATION__ID:
    		return getId() != ID_EDEFAULT;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.MESSAGE_FLOW_ASSOCIATION__EXTENSION_DEFINITIONS:
    		return getExtensionDefinitions() != null && !getExtensionDefinitions().isEmpty();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.MESSAGE_FLOW_ASSOCIATION__EXTENSION_VALUES:
    		return getExtensionValues() != null && !getExtensionValues().isEmpty();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.MESSAGE_FLOW_ASSOCIATION__DOCUMENTATION:
    		return getDocumentation() != null && !getDocumentation().isEmpty();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.MESSAGE_FLOW_ASSOCIATION__DESCRIPTION:
    		return getDescription() != DESCRIPTION_EDEFAULT;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.MESSAGE_FLOW_ASSOCIATION__INNER_MESSAGE_FLOW_REF:
    		return getInnerMessageFlowRef() != null;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.MESSAGE_FLOW_ASSOCIATION__OUTER_MESSAGE_FLOW_REF:
    		return getOuterMessageFlowRef() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.MESSAGE_FLOW_ASSOCIATION__ID:
    		setId(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.MESSAGE_FLOW_ASSOCIATION__EXTENSION_DEFINITIONS:
    		getExtensionDefinitions().clear();
    		getExtensionDefinitions().addAll((Collection) newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.MESSAGE_FLOW_ASSOCIATION__EXTENSION_VALUES:
    		getExtensionValues().clear();
    		getExtensionValues().addAll((Collection) newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.MESSAGE_FLOW_ASSOCIATION__DOCUMENTATION:
    		getDocumentation().clear();
    		getDocumentation().addAll((Collection) newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.MESSAGE_FLOW_ASSOCIATION__DESCRIPTION:
    		setDescription(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.MESSAGE_FLOW_ASSOCIATION__INNER_MESSAGE_FLOW_REF:
    		setInnerMessageFlowRef(
    		(org.obeonetwork.dsl.bpmn2.MessageFlow)
    		 newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.MESSAGE_FLOW_ASSOCIATION__OUTER_MESSAGE_FLOW_REF:
    		setOuterMessageFlowRef(
    		(org.obeonetwork.dsl.bpmn2.MessageFlow)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
