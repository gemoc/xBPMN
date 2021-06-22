package org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.BPMNMTAdaptersFactory;
import org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.MessageFlow;

@SuppressWarnings("all")
public class MessageFlowAdapter extends EObjectAdapter<MessageFlow> implements org.obeonetwork.dsl.bpmn2.MessageFlow {
  private BPMNMTAdaptersFactory adaptersFactory;
  
  public MessageFlowAdapter() {
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
  
  @Override
  public String getName() {
    return adaptee.getName();
  }
  
  @Override
  public void setName(final String o) {
    adaptee.setName(o);
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
  public org.obeonetwork.dsl.bpmn2.InteractionNode getSourceRef() {
    return () adaptersFactory.createAdapter(adaptee.getSourceRef(), eResource);
  }
  
  @Override
  public void setSourceRef(final org.obeonetwork.dsl.bpmn2.InteractionNode o) {
    if (o != null)
    	adaptee.setSourceRef(((org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.InteractionNodeAdapter) o).getAdaptee());
    else adaptee.setSourceRef(null);
  }
  
  @Override
  public org.obeonetwork.dsl.bpmn2.InteractionNode getTargetRef() {
    return () adaptersFactory.createAdapter(adaptee.getTargetRef(), eResource);
  }
  
  @Override
  public void setTargetRef(final org.obeonetwork.dsl.bpmn2.InteractionNode o) {
    if (o != null)
    	adaptee.setTargetRef(((org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.InteractionNodeAdapter) o).getAdaptee());
    else adaptee.setTargetRef(null);
  }
  
  @Override
  public org.obeonetwork.dsl.bpmn2.Message getMessageRef() {
    return () adaptersFactory.createAdapter(adaptee.getMessageRef(), eResource);
  }
  
  @Override
  public void setMessageRef(final org.obeonetwork.dsl.bpmn2.Message o) {
    if (o != null)
    	adaptee.setMessageRef(((org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.MessageAdapter) o).getAdaptee());
    else adaptee.setMessageRef(null);
  }
  
  protected static final String ID_EDEFAULT = null;
  
  protected static final String DESCRIPTION_EDEFAULT = null;
  
  protected static final String NAME_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return org.obeonetwork.dsl.bpmn2.Bpmn2Package.eINSTANCE.getMessageFlow();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.MESSAGE_FLOW__ID:
    		return getId();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.MESSAGE_FLOW__EXTENSION_DEFINITIONS:
    		return getExtensionDefinitions();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.MESSAGE_FLOW__EXTENSION_VALUES:
    		return getExtensionValues();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.MESSAGE_FLOW__DOCUMENTATION:
    		return getDocumentation();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.MESSAGE_FLOW__DESCRIPTION:
    		return getDescription();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.MESSAGE_FLOW__NAME:
    		return getName();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.MESSAGE_FLOW__SOURCE_REF:
    		return getSourceRef();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.MESSAGE_FLOW__TARGET_REF:
    		return getTargetRef();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.MESSAGE_FLOW__MESSAGE_REF:
    		return getMessageRef();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.MESSAGE_FLOW__ID:
    		return getId() != ID_EDEFAULT;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.MESSAGE_FLOW__EXTENSION_DEFINITIONS:
    		return getExtensionDefinitions() != null && !getExtensionDefinitions().isEmpty();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.MESSAGE_FLOW__EXTENSION_VALUES:
    		return getExtensionValues() != null && !getExtensionValues().isEmpty();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.MESSAGE_FLOW__DOCUMENTATION:
    		return getDocumentation() != null && !getDocumentation().isEmpty();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.MESSAGE_FLOW__DESCRIPTION:
    		return getDescription() != DESCRIPTION_EDEFAULT;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.MESSAGE_FLOW__NAME:
    		return getName() != NAME_EDEFAULT;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.MESSAGE_FLOW__SOURCE_REF:
    		return getSourceRef() != null;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.MESSAGE_FLOW__TARGET_REF:
    		return getTargetRef() != null;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.MESSAGE_FLOW__MESSAGE_REF:
    		return getMessageRef() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.MESSAGE_FLOW__ID:
    		setId(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.MESSAGE_FLOW__EXTENSION_DEFINITIONS:
    		getExtensionDefinitions().clear();
    		getExtensionDefinitions().addAll((Collection) newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.MESSAGE_FLOW__EXTENSION_VALUES:
    		getExtensionValues().clear();
    		getExtensionValues().addAll((Collection) newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.MESSAGE_FLOW__DOCUMENTATION:
    		getDocumentation().clear();
    		getDocumentation().addAll((Collection) newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.MESSAGE_FLOW__DESCRIPTION:
    		setDescription(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.MESSAGE_FLOW__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.MESSAGE_FLOW__SOURCE_REF:
    		setSourceRef(
    		(org.obeonetwork.dsl.bpmn2.InteractionNode)
    		 newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.MESSAGE_FLOW__TARGET_REF:
    		setTargetRef(
    		(org.obeonetwork.dsl.bpmn2.InteractionNode)
    		 newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.MESSAGE_FLOW__MESSAGE_REF:
    		setMessageRef(
    		(org.obeonetwork.dsl.bpmn2.Message)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
