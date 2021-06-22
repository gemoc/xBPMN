package org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.BPMNMTAdaptersFactory;
import org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.EventBasedGateway;

@SuppressWarnings("all")
public class EventBasedGatewayAdapter extends EObjectAdapter<EventBasedGateway> implements org.obeonetwork.dsl.bpmn2.EventBasedGateway {
  private BPMNMTAdaptersFactory adaptersFactory;
  
  public EventBasedGatewayAdapter() {
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
  
  @Override
  public org.obeonetwork.dsl.bpmn2.GatewayDirection getGatewayDirection() {
    return org.obeonetwork.dsl.bpmn2.GatewayDirection.get(adaptee.getGatewayDirection().getValue());
  }
  
  @Override
  public void setGatewayDirection(final org.obeonetwork.dsl.bpmn2.GatewayDirection o) {
    adaptee.setGatewayDirection(org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.GatewayDirection.get(o.getValue()));
  }
  
  @Override
  public boolean isInstantiate() {
    return adaptee.isInstantiate();
  }
  
  @Override
  public void setInstantiate(final boolean o) {
    adaptee.setInstantiate(o);
  }
  
  @Override
  public org.obeonetwork.dsl.bpmn2.EventBasedGatewayType getEventGatewayType() {
    return org.obeonetwork.dsl.bpmn2.EventBasedGatewayType.get(adaptee.getEventGatewayType().getValue());
  }
  
  @Override
  public void setEventGatewayType(final org.obeonetwork.dsl.bpmn2.EventBasedGatewayType o) {
    adaptee.setEventGatewayType(org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.EventBasedGatewayType.get(o.getValue()));
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
  public org.obeonetwork.dsl.bpmn2.Auditing getAuditing() {
    return () adaptersFactory.createAdapter(adaptee.getAuditing(), eResource);
  }
  
  @Override
  public void setAuditing(final org.obeonetwork.dsl.bpmn2.Auditing o) {
    if (o != null)
    	adaptee.setAuditing(((org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.AuditingAdapter) o).getAdaptee());
    else adaptee.setAuditing(null);
  }
  
  @Override
  public org.obeonetwork.dsl.bpmn2.Monitoring getMonitoring() {
    return () adaptersFactory.createAdapter(adaptee.getMonitoring(), eResource);
  }
  
  @Override
  public void setMonitoring(final org.obeonetwork.dsl.bpmn2.Monitoring o) {
    if (o != null)
    	adaptee.setMonitoring(((org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.MonitoringAdapter) o).getAdaptee());
    else adaptee.setMonitoring(null);
  }
  
  private /* EList<org.obeonetwork.dsl.bpmn2.CategoryValue> */Object categoryValueRef_;
  
  @Override
  public /* EList<org.obeonetwork.dsl.bpmn2.CategoryValue> */Object getCategoryValueRef() {
    if (categoryValueRef_ == null)
    	categoryValueRef_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getCategoryValueRef(), adaptersFactory, eResource);
    return categoryValueRef_;
  }
  
  private /* EList<org.obeonetwork.dsl.bpmn2.SequenceFlow> */Object outgoing_;
  
  @Override
  public /* EList<org.obeonetwork.dsl.bpmn2.SequenceFlow> */Object getOutgoing() {
    if (outgoing_ == null)
    	outgoing_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOutgoing(), adaptersFactory, eResource);
    return outgoing_;
  }
  
  private /* EList<org.obeonetwork.dsl.bpmn2.SequenceFlow> */Object incoming_;
  
  @Override
  public /* EList<org.obeonetwork.dsl.bpmn2.SequenceFlow> */Object getIncoming() {
    if (incoming_ == null)
    	incoming_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getIncoming(), adaptersFactory, eResource);
    return incoming_;
  }
  
  private /* EList<org.obeonetwork.dsl.bpmn2.Lane> */Object lanes_;
  
  @Override
  public /* EList<org.obeonetwork.dsl.bpmn2.Lane> */Object getLanes() {
    if (lanes_ == null)
    	lanes_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getLanes(), adaptersFactory, eResource);
    return lanes_;
  }
  
  protected static final String ID_EDEFAULT = null;
  
  protected static final String DESCRIPTION_EDEFAULT = null;
  
  protected static final String NAME_EDEFAULT = null;
  
  protected static final org.obeonetwork.dsl.bpmn2.GatewayDirection GATEWAY_DIRECTION_EDEFAULT = org.obeonetwork.dsl.bpmn2.GatewayDirection.UNSPECIFIED;
  
  protected static final boolean INSTANTIATE_EDEFAULT = false;
  
  protected static final org.obeonetwork.dsl.bpmn2.EventBasedGatewayType EVENT_GATEWAY_TYPE_EDEFAULT = org.obeonetwork.dsl.bpmn2.EventBasedGatewayType.PARALLEL;
  
  @Override
  public EClass eClass() {
    return org.obeonetwork.dsl.bpmn2.Bpmn2Package.eINSTANCE.getEventBasedGateway();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.EVENT_BASED_GATEWAY__ID:
    		return getId();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.EVENT_BASED_GATEWAY__EXTENSION_DEFINITIONS:
    		return getExtensionDefinitions();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.EVENT_BASED_GATEWAY__EXTENSION_VALUES:
    		return getExtensionValues();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.EVENT_BASED_GATEWAY__DOCUMENTATION:
    		return getDocumentation();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.EVENT_BASED_GATEWAY__DESCRIPTION:
    		return getDescription();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.EVENT_BASED_GATEWAY__NAME:
    		return getName();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.EVENT_BASED_GATEWAY__AUDITING:
    		return getAuditing();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.EVENT_BASED_GATEWAY__MONITORING:
    		return getMonitoring();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.EVENT_BASED_GATEWAY__CATEGORY_VALUE_REF:
    		return getCategoryValueRef();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.EVENT_BASED_GATEWAY__OUTGOING:
    		return getOutgoing();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.EVENT_BASED_GATEWAY__INCOMING:
    		return getIncoming();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.EVENT_BASED_GATEWAY__LANES:
    		return getLanes();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.EVENT_BASED_GATEWAY__GATEWAY_DIRECTION:
    		return getGatewayDirection();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.EVENT_BASED_GATEWAY__INSTANTIATE:
    		return isInstantiate() ? Boolean.TRUE : Boolean.FALSE;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.EVENT_BASED_GATEWAY__EVENT_GATEWAY_TYPE:
    		return getEventGatewayType();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.EVENT_BASED_GATEWAY__ID:
    		return getId() != ID_EDEFAULT;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.EVENT_BASED_GATEWAY__EXTENSION_DEFINITIONS:
    		return getExtensionDefinitions() != null && !getExtensionDefinitions().isEmpty();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.EVENT_BASED_GATEWAY__EXTENSION_VALUES:
    		return getExtensionValues() != null && !getExtensionValues().isEmpty();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.EVENT_BASED_GATEWAY__DOCUMENTATION:
    		return getDocumentation() != null && !getDocumentation().isEmpty();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.EVENT_BASED_GATEWAY__DESCRIPTION:
    		return getDescription() != DESCRIPTION_EDEFAULT;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.EVENT_BASED_GATEWAY__NAME:
    		return getName() != NAME_EDEFAULT;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.EVENT_BASED_GATEWAY__AUDITING:
    		return getAuditing() != null;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.EVENT_BASED_GATEWAY__MONITORING:
    		return getMonitoring() != null;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.EVENT_BASED_GATEWAY__CATEGORY_VALUE_REF:
    		return getCategoryValueRef() != null && !getCategoryValueRef().isEmpty();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.EVENT_BASED_GATEWAY__OUTGOING:
    		return getOutgoing() != null && !getOutgoing().isEmpty();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.EVENT_BASED_GATEWAY__INCOMING:
    		return getIncoming() != null && !getIncoming().isEmpty();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.EVENT_BASED_GATEWAY__LANES:
    		return getLanes() != null && !getLanes().isEmpty();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.EVENT_BASED_GATEWAY__GATEWAY_DIRECTION:
    		return getGatewayDirection() != GATEWAY_DIRECTION_EDEFAULT;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.EVENT_BASED_GATEWAY__INSTANTIATE:
    		return isInstantiate() != INSTANTIATE_EDEFAULT;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.EVENT_BASED_GATEWAY__EVENT_GATEWAY_TYPE:
    		return getEventGatewayType() != EVENT_GATEWAY_TYPE_EDEFAULT;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.EVENT_BASED_GATEWAY__ID:
    		setId(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.EVENT_BASED_GATEWAY__EXTENSION_DEFINITIONS:
    		getExtensionDefinitions().clear();
    		getExtensionDefinitions().addAll((Collection) newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.EVENT_BASED_GATEWAY__EXTENSION_VALUES:
    		getExtensionValues().clear();
    		getExtensionValues().addAll((Collection) newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.EVENT_BASED_GATEWAY__DOCUMENTATION:
    		getDocumentation().clear();
    		getDocumentation().addAll((Collection) newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.EVENT_BASED_GATEWAY__DESCRIPTION:
    		setDescription(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.EVENT_BASED_GATEWAY__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.EVENT_BASED_GATEWAY__AUDITING:
    		setAuditing(
    		(org.obeonetwork.dsl.bpmn2.Auditing)
    		 newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.EVENT_BASED_GATEWAY__MONITORING:
    		setMonitoring(
    		(org.obeonetwork.dsl.bpmn2.Monitoring)
    		 newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.EVENT_BASED_GATEWAY__CATEGORY_VALUE_REF:
    		getCategoryValueRef().clear();
    		getCategoryValueRef().addAll((Collection) newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.EVENT_BASED_GATEWAY__OUTGOING:
    		getOutgoing().clear();
    		getOutgoing().addAll((Collection) newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.EVENT_BASED_GATEWAY__INCOMING:
    		getIncoming().clear();
    		getIncoming().addAll((Collection) newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.EVENT_BASED_GATEWAY__LANES:
    		getLanes().clear();
    		getLanes().addAll((Collection) newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.EVENT_BASED_GATEWAY__GATEWAY_DIRECTION:
    		setGatewayDirection(
    		(org.obeonetwork.dsl.bpmn2.GatewayDirection)
    		 newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.EVENT_BASED_GATEWAY__INSTANTIATE:
    		setInstantiate(((java.lang.Boolean) newValue).booleanValue());
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.EVENT_BASED_GATEWAY__EVENT_GATEWAY_TYPE:
    		setEventGatewayType(
    		(org.obeonetwork.dsl.bpmn2.EventBasedGatewayType)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
