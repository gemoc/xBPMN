package org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.BPMNMTAdaptersFactory;
import org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Lane;

@SuppressWarnings("all")
public class LaneAdapter extends EObjectAdapter<Lane> implements org.obeonetwork.dsl.bpmn2.Lane {
  private BPMNMTAdaptersFactory adaptersFactory;
  
  public LaneAdapter() {
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
  public org.obeonetwork.dsl.bpmn2.LaneSet getChildLaneSet() {
    return () adaptersFactory.createAdapter(adaptee.getChildLaneSet(), eResource);
  }
  
  @Override
  public void setChildLaneSet(final org.obeonetwork.dsl.bpmn2.LaneSet o) {
    if (o != null)
    	adaptee.setChildLaneSet(((org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.LaneSetAdapter) o).getAdaptee());
    else adaptee.setChildLaneSet(null);
  }
  
  @Override
  public org.obeonetwork.dsl.bpmn2.BaseElement getPartitionElementRef() {
    return () adaptersFactory.createAdapter(adaptee.getPartitionElementRef(), eResource);
  }
  
  @Override
  public void setPartitionElementRef(final org.obeonetwork.dsl.bpmn2.BaseElement o) {
    if (o != null)
    	adaptee.setPartitionElementRef(((org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.BaseElementAdapter) o).getAdaptee());
    else adaptee.setPartitionElementRef(null);
  }
  
  private /* EList<org.obeonetwork.dsl.bpmn2.FlowNode> */Object flowNodeRefs_;
  
  @Override
  public /* EList<org.obeonetwork.dsl.bpmn2.FlowNode> */Object getFlowNodeRefs() {
    if (flowNodeRefs_ == null)
    	flowNodeRefs_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getFlowNodeRefs(), adaptersFactory, eResource);
    return flowNodeRefs_;
  }
  
  @Override
  public org.obeonetwork.dsl.bpmn2.BaseElement getPartitionElement() {
    return () adaptersFactory.createAdapter(adaptee.getPartitionElement(), eResource);
  }
  
  @Override
  public void setPartitionElement(final org.obeonetwork.dsl.bpmn2.BaseElement o) {
    if (o != null)
    	adaptee.setPartitionElement(((org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.BaseElementAdapter) o).getAdaptee());
    else adaptee.setPartitionElement(null);
  }
  
  protected static final String ID_EDEFAULT = null;
  
  protected static final String DESCRIPTION_EDEFAULT = null;
  
  protected static final String NAME_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return org.obeonetwork.dsl.bpmn2.Bpmn2Package.eINSTANCE.getLane();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.LANE__ID:
    		return getId();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.LANE__EXTENSION_DEFINITIONS:
    		return getExtensionDefinitions();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.LANE__EXTENSION_VALUES:
    		return getExtensionValues();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.LANE__DOCUMENTATION:
    		return getDocumentation();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.LANE__DESCRIPTION:
    		return getDescription();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.LANE__NAME:
    		return getName();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.LANE__CHILD_LANE_SET:
    		return getChildLaneSet();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.LANE__PARTITION_ELEMENT_REF:
    		return getPartitionElementRef();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.LANE__FLOW_NODE_REFS:
    		return getFlowNodeRefs();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.LANE__PARTITION_ELEMENT:
    		return getPartitionElement();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.LANE__ID:
    		return getId() != ID_EDEFAULT;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.LANE__EXTENSION_DEFINITIONS:
    		return getExtensionDefinitions() != null && !getExtensionDefinitions().isEmpty();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.LANE__EXTENSION_VALUES:
    		return getExtensionValues() != null && !getExtensionValues().isEmpty();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.LANE__DOCUMENTATION:
    		return getDocumentation() != null && !getDocumentation().isEmpty();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.LANE__DESCRIPTION:
    		return getDescription() != DESCRIPTION_EDEFAULT;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.LANE__NAME:
    		return getName() != NAME_EDEFAULT;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.LANE__CHILD_LANE_SET:
    		return getChildLaneSet() != null;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.LANE__PARTITION_ELEMENT_REF:
    		return getPartitionElementRef() != null;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.LANE__FLOW_NODE_REFS:
    		return getFlowNodeRefs() != null && !getFlowNodeRefs().isEmpty();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.LANE__PARTITION_ELEMENT:
    		return getPartitionElement() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.LANE__ID:
    		setId(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.LANE__EXTENSION_DEFINITIONS:
    		getExtensionDefinitions().clear();
    		getExtensionDefinitions().addAll((Collection) newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.LANE__EXTENSION_VALUES:
    		getExtensionValues().clear();
    		getExtensionValues().addAll((Collection) newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.LANE__DOCUMENTATION:
    		getDocumentation().clear();
    		getDocumentation().addAll((Collection) newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.LANE__DESCRIPTION:
    		setDescription(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.LANE__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.LANE__CHILD_LANE_SET:
    		setChildLaneSet(
    		(org.obeonetwork.dsl.bpmn2.LaneSet)
    		 newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.LANE__PARTITION_ELEMENT_REF:
    		setPartitionElementRef(
    		(org.obeonetwork.dsl.bpmn2.BaseElement)
    		 newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.LANE__FLOW_NODE_REFS:
    		getFlowNodeRefs().clear();
    		getFlowNodeRefs().addAll((Collection) newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.LANE__PARTITION_ELEMENT:
    		setPartitionElement(
    		(org.obeonetwork.dsl.bpmn2.BaseElement)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
