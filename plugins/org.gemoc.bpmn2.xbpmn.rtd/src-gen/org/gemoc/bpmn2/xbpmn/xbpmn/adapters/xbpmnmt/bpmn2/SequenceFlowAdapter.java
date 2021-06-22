package org.gemoc.bpmn2.xbpmn.xbpmn.adapters.xbpmnmt.bpmn2;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.bpmn2.xbpmn.xbpmn.adapters.xbpmnmt.XBPMNMTAdaptersFactory;
import org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.SequenceFlow;

@SuppressWarnings("all")
public class SequenceFlowAdapter extends EObjectAdapter<SequenceFlow> implements org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.SequenceFlow {
  private XBPMNMTAdaptersFactory adaptersFactory;
  
  public SequenceFlowAdapter() {
    super(org.gemoc.bpmn2.xbpmn.xbpmn.adapters.xbpmnmt.XBPMNMTAdaptersFactory.getInstance());
    adaptersFactory = org.gemoc.bpmn2.xbpmn.xbpmn.adapters.xbpmnmt.XBPMNMTAdaptersFactory.getInstance();
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
  public boolean isIsImmediate() {
    return adaptee.isIsImmediate();
  }
  
  @Override
  public void setIsImmediate(final boolean o) {
    adaptee.setIsImmediate(o);
  }
  
  private /* EList<org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.ExtensionDefinition> */Object extensionDefinitions_;
  
  @Override
  public /* EList<org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.ExtensionDefinition> */Object getExtensionDefinitions() {
    if (extensionDefinitions_ == null)
    	extensionDefinitions_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getExtensionDefinitions(), adaptersFactory, eResource);
    return extensionDefinitions_;
  }
  
  private /* EList<org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.ExtensionAttributeValue> */Object extensionValues_;
  
  @Override
  public /* EList<org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.ExtensionAttributeValue> */Object getExtensionValues() {
    if (extensionValues_ == null)
    	extensionValues_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getExtensionValues(), adaptersFactory, eResource);
    return extensionValues_;
  }
  
  private /* EList<org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Documentation> */Object documentation_;
  
  @Override
  public /* EList<org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Documentation> */Object getDocumentation() {
    if (documentation_ == null)
    	documentation_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getDocumentation(), adaptersFactory, eResource);
    return documentation_;
  }
  
  @Override
  public org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Auditing getAuditing() {
    return () adaptersFactory.createAdapter(adaptee.getAuditing(), eResource);
  }
  
  @Override
  public void setAuditing(final org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Auditing o) {
    if (o != null)
    	adaptee.setAuditing(((org.gemoc.bpmn2.xbpmn.xbpmn.adapters.xbpmnmt.bpmn2.AuditingAdapter) o).getAdaptee());
    else adaptee.setAuditing(null);
  }
  
  @Override
  public org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Monitoring getMonitoring() {
    return () adaptersFactory.createAdapter(adaptee.getMonitoring(), eResource);
  }
  
  @Override
  public void setMonitoring(final org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Monitoring o) {
    if (o != null)
    	adaptee.setMonitoring(((org.gemoc.bpmn2.xbpmn.xbpmn.adapters.xbpmnmt.bpmn2.MonitoringAdapter) o).getAdaptee());
    else adaptee.setMonitoring(null);
  }
  
  private /* EList<org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.CategoryValue> */Object categoryValueRef_;
  
  @Override
  public /* EList<org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.CategoryValue> */Object getCategoryValueRef() {
    if (categoryValueRef_ == null)
    	categoryValueRef_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getCategoryValueRef(), adaptersFactory, eResource);
    return categoryValueRef_;
  }
  
  @Override
  public org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Expression getConditionExpression() {
    return () adaptersFactory.createAdapter(adaptee.getConditionExpression(), eResource);
  }
  
  @Override
  public void setConditionExpression(final org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Expression o) {
    if (o != null)
    	adaptee.setConditionExpression(((org.gemoc.bpmn2.xbpmn.xbpmn.adapters.xbpmnmt.bpmn2.ExpressionAdapter) o).getAdaptee());
    else adaptee.setConditionExpression(null);
  }
  
  @Override
  public org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.FlowNode getTargetRef() {
    return () adaptersFactory.createAdapter(adaptee.getTargetRef(), eResource);
  }
  
  @Override
  public void setTargetRef(final org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.FlowNode o) {
    if (o != null)
    	adaptee.setTargetRef(((org.gemoc.bpmn2.xbpmn.xbpmn.adapters.xbpmnmt.bpmn2.FlowNodeAdapter) o).getAdaptee());
    else adaptee.setTargetRef(null);
  }
  
  @Override
  public org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.FlowNode getSourceRef() {
    return () adaptersFactory.createAdapter(adaptee.getSourceRef(), eResource);
  }
  
  @Override
  public void setSourceRef(final org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.FlowNode o) {
    if (o != null)
    	adaptee.setSourceRef(((org.gemoc.bpmn2.xbpmn.xbpmn.adapters.xbpmnmt.bpmn2.FlowNodeAdapter) o).getAdaptee());
    else adaptee.setSourceRef(null);
  }
  
  protected static final String ID_EDEFAULT = null;
  
  protected static final String DESCRIPTION_EDEFAULT = null;
  
  protected static final String NAME_EDEFAULT = null;
  
  protected static final boolean IS_IMMEDIATE_EDEFAULT = false;
  
  @Override
  public EClass eClass() {
    return org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.eINSTANCE.getSequenceFlow();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.SEQUENCE_FLOW__ID:
    		return getId();
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.SEQUENCE_FLOW__EXTENSION_DEFINITIONS:
    		return getExtensionDefinitions();
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.SEQUENCE_FLOW__EXTENSION_VALUES:
    		return getExtensionValues();
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.SEQUENCE_FLOW__DOCUMENTATION:
    		return getDocumentation();
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.SEQUENCE_FLOW__DESCRIPTION:
    		return getDescription();
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.SEQUENCE_FLOW__NAME:
    		return getName();
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.SEQUENCE_FLOW__AUDITING:
    		return getAuditing();
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.SEQUENCE_FLOW__MONITORING:
    		return getMonitoring();
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.SEQUENCE_FLOW__CATEGORY_VALUE_REF:
    		return getCategoryValueRef();
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.SEQUENCE_FLOW__IS_IMMEDIATE:
    		return isIsImmediate() ? Boolean.TRUE : Boolean.FALSE;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.SEQUENCE_FLOW__CONDITION_EXPRESSION:
    		return getConditionExpression();
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.SEQUENCE_FLOW__TARGET_REF:
    		return getTargetRef();
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.SEQUENCE_FLOW__SOURCE_REF:
    		return getSourceRef();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.SEQUENCE_FLOW__ID:
    		return getId() != ID_EDEFAULT;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.SEQUENCE_FLOW__EXTENSION_DEFINITIONS:
    		return getExtensionDefinitions() != null && !getExtensionDefinitions().isEmpty();
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.SEQUENCE_FLOW__EXTENSION_VALUES:
    		return getExtensionValues() != null && !getExtensionValues().isEmpty();
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.SEQUENCE_FLOW__DOCUMENTATION:
    		return getDocumentation() != null && !getDocumentation().isEmpty();
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.SEQUENCE_FLOW__DESCRIPTION:
    		return getDescription() != DESCRIPTION_EDEFAULT;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.SEQUENCE_FLOW__NAME:
    		return getName() != NAME_EDEFAULT;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.SEQUENCE_FLOW__AUDITING:
    		return getAuditing() != null;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.SEQUENCE_FLOW__MONITORING:
    		return getMonitoring() != null;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.SEQUENCE_FLOW__CATEGORY_VALUE_REF:
    		return getCategoryValueRef() != null && !getCategoryValueRef().isEmpty();
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.SEQUENCE_FLOW__IS_IMMEDIATE:
    		return isIsImmediate() != IS_IMMEDIATE_EDEFAULT;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.SEQUENCE_FLOW__CONDITION_EXPRESSION:
    		return getConditionExpression() != null;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.SEQUENCE_FLOW__TARGET_REF:
    		return getTargetRef() != null;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.SEQUENCE_FLOW__SOURCE_REF:
    		return getSourceRef() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.SEQUENCE_FLOW__ID:
    		setId(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.SEQUENCE_FLOW__EXTENSION_DEFINITIONS:
    		getExtensionDefinitions().clear();
    		getExtensionDefinitions().addAll((Collection) newValue);
    		return;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.SEQUENCE_FLOW__EXTENSION_VALUES:
    		getExtensionValues().clear();
    		getExtensionValues().addAll((Collection) newValue);
    		return;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.SEQUENCE_FLOW__DOCUMENTATION:
    		getDocumentation().clear();
    		getDocumentation().addAll((Collection) newValue);
    		return;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.SEQUENCE_FLOW__DESCRIPTION:
    		setDescription(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.SEQUENCE_FLOW__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.SEQUENCE_FLOW__AUDITING:
    		setAuditing(
    		(org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Auditing)
    		 newValue);
    		return;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.SEQUENCE_FLOW__MONITORING:
    		setMonitoring(
    		(org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Monitoring)
    		 newValue);
    		return;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.SEQUENCE_FLOW__CATEGORY_VALUE_REF:
    		getCategoryValueRef().clear();
    		getCategoryValueRef().addAll((Collection) newValue);
    		return;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.SEQUENCE_FLOW__IS_IMMEDIATE:
    		setIsImmediate(((java.lang.Boolean) newValue).booleanValue());
    		return;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.SEQUENCE_FLOW__CONDITION_EXPRESSION:
    		setConditionExpression(
    		(org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Expression)
    		 newValue);
    		return;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.SEQUENCE_FLOW__TARGET_REF:
    		setTargetRef(
    		(org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.FlowNode)
    		 newValue);
    		return;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.SEQUENCE_FLOW__SOURCE_REF:
    		setSourceRef(
    		(org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.FlowNode)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
