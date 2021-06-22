package org.gemoc.bpmn2.xbpmn.xbpmn.adapters.xbpmnmt.bpmn2;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.bpmn2.xbpmn.xbpmn.adapters.xbpmnmt.XBPMNMTAdaptersFactory;
import org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.MultiInstanceLoopCharacteristics;

@SuppressWarnings("all")
public class MultiInstanceLoopCharacteristicsAdapter extends EObjectAdapter<MultiInstanceLoopCharacteristics> implements org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.MultiInstanceLoopCharacteristics {
  private XBPMNMTAdaptersFactory adaptersFactory;
  
  public MultiInstanceLoopCharacteristicsAdapter() {
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
  public boolean isIsSequential() {
    return adaptee.isIsSequential();
  }
  
  @Override
  public void setIsSequential(final boolean o) {
    adaptee.setIsSequential(o);
  }
  
  @Override
  public org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.MultiInstanceBehavior getBehavior() {
    return org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.MultiInstanceBehavior.get(adaptee.getBehavior().getValue());
  }
  
  @Override
  public void setBehavior(final org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.MultiInstanceBehavior o) {
    adaptee.setBehavior(org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.MultiInstanceBehavior.get(o.getValue()));
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
  public org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Expression getLoopCardinality() {
    return () adaptersFactory.createAdapter(adaptee.getLoopCardinality(), eResource);
  }
  
  @Override
  public void setLoopCardinality(final org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Expression o) {
    if (o != null)
    	adaptee.setLoopCardinality(((org.gemoc.bpmn2.xbpmn.xbpmn.adapters.xbpmnmt.bpmn2.ExpressionAdapter) o).getAdaptee());
    else adaptee.setLoopCardinality(null);
  }
  
  @Override
  public org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.ItemAwareElement getLoopDataInputRef() {
    return () adaptersFactory.createAdapter(adaptee.getLoopDataInputRef(), eResource);
  }
  
  @Override
  public void setLoopDataInputRef(final org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.ItemAwareElement o) {
    if (o != null)
    	adaptee.setLoopDataInputRef(((org.gemoc.bpmn2.xbpmn.xbpmn.adapters.xbpmnmt.bpmn2.ItemAwareElementAdapter) o).getAdaptee());
    else adaptee.setLoopDataInputRef(null);
  }
  
  @Override
  public org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.ItemAwareElement getLoopDataOutputRef() {
    return () adaptersFactory.createAdapter(adaptee.getLoopDataOutputRef(), eResource);
  }
  
  @Override
  public void setLoopDataOutputRef(final org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.ItemAwareElement o) {
    if (o != null)
    	adaptee.setLoopDataOutputRef(((org.gemoc.bpmn2.xbpmn.xbpmn.adapters.xbpmnmt.bpmn2.ItemAwareElementAdapter) o).getAdaptee());
    else adaptee.setLoopDataOutputRef(null);
  }
  
  @Override
  public org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.DataInput getInputDataItem() {
    return () adaptersFactory.createAdapter(adaptee.getInputDataItem(), eResource);
  }
  
  @Override
  public void setInputDataItem(final org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.DataInput o) {
    if (o != null)
    	adaptee.setInputDataItem(((org.gemoc.bpmn2.xbpmn.xbpmn.adapters.xbpmnmt.bpmn2.DataInputAdapter) o).getAdaptee());
    else adaptee.setInputDataItem(null);
  }
  
  @Override
  public org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.DataOutput getOutputDataItem() {
    return () adaptersFactory.createAdapter(adaptee.getOutputDataItem(), eResource);
  }
  
  @Override
  public void setOutputDataItem(final org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.DataOutput o) {
    if (o != null)
    	adaptee.setOutputDataItem(((org.gemoc.bpmn2.xbpmn.xbpmn.adapters.xbpmnmt.bpmn2.DataOutputAdapter) o).getAdaptee());
    else adaptee.setOutputDataItem(null);
  }
  
  @Override
  public org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Expression getCompletionCondition() {
    return () adaptersFactory.createAdapter(adaptee.getCompletionCondition(), eResource);
  }
  
  @Override
  public void setCompletionCondition(final org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Expression o) {
    if (o != null)
    	adaptee.setCompletionCondition(((org.gemoc.bpmn2.xbpmn.xbpmn.adapters.xbpmnmt.bpmn2.ExpressionAdapter) o).getAdaptee());
    else adaptee.setCompletionCondition(null);
  }
  
  private /* EList<org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.ComplexBehaviorDefinition> */Object complexBehaviorDefinition_;
  
  @Override
  public /* EList<org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.ComplexBehaviorDefinition> */Object getComplexBehaviorDefinition() {
    if (complexBehaviorDefinition_ == null)
    	complexBehaviorDefinition_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getComplexBehaviorDefinition(), adaptersFactory, eResource);
    return complexBehaviorDefinition_;
  }
  
  @Override
  public org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.EventDefinition getOneBehaviorEventRef() {
    return () adaptersFactory.createAdapter(adaptee.getOneBehaviorEventRef(), eResource);
  }
  
  @Override
  public void setOneBehaviorEventRef(final org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.EventDefinition o) {
    if (o != null)
    	adaptee.setOneBehaviorEventRef(((org.gemoc.bpmn2.xbpmn.xbpmn.adapters.xbpmnmt.bpmn2.EventDefinitionAdapter) o).getAdaptee());
    else adaptee.setOneBehaviorEventRef(null);
  }
  
  @Override
  public org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.EventDefinition getNoneBehaviorEventRef() {
    return () adaptersFactory.createAdapter(adaptee.getNoneBehaviorEventRef(), eResource);
  }
  
  @Override
  public void setNoneBehaviorEventRef(final org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.EventDefinition o) {
    if (o != null)
    	adaptee.setNoneBehaviorEventRef(((org.gemoc.bpmn2.xbpmn.xbpmn.adapters.xbpmnmt.bpmn2.EventDefinitionAdapter) o).getAdaptee());
    else adaptee.setNoneBehaviorEventRef(null);
  }
  
  protected static final String ID_EDEFAULT = null;
  
  protected static final String DESCRIPTION_EDEFAULT = null;
  
  protected static final boolean IS_SEQUENTIAL_EDEFAULT = false;
  
  protected static final org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.MultiInstanceBehavior BEHAVIOR_EDEFAULT = org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.MultiInstanceBehavior.ALL;
  
  @Override
  public EClass eClass() {
    return org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.eINSTANCE.getMultiInstanceLoopCharacteristics();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__ID:
    		return getId();
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__EXTENSION_DEFINITIONS:
    		return getExtensionDefinitions();
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__EXTENSION_VALUES:
    		return getExtensionValues();
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__DOCUMENTATION:
    		return getDocumentation();
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__DESCRIPTION:
    		return getDescription();
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__IS_SEQUENTIAL:
    		return isIsSequential() ? Boolean.TRUE : Boolean.FALSE;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__BEHAVIOR:
    		return getBehavior();
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__LOOP_CARDINALITY:
    		return getLoopCardinality();
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__LOOP_DATA_INPUT_REF:
    		return getLoopDataInputRef();
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__LOOP_DATA_OUTPUT_REF:
    		return getLoopDataOutputRef();
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__INPUT_DATA_ITEM:
    		return getInputDataItem();
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__OUTPUT_DATA_ITEM:
    		return getOutputDataItem();
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__COMPLETION_CONDITION:
    		return getCompletionCondition();
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__COMPLEX_BEHAVIOR_DEFINITION:
    		return getComplexBehaviorDefinition();
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__ONE_BEHAVIOR_EVENT_REF:
    		return getOneBehaviorEventRef();
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__NONE_BEHAVIOR_EVENT_REF:
    		return getNoneBehaviorEventRef();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__ID:
    		return getId() != ID_EDEFAULT;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__EXTENSION_DEFINITIONS:
    		return getExtensionDefinitions() != null && !getExtensionDefinitions().isEmpty();
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__EXTENSION_VALUES:
    		return getExtensionValues() != null && !getExtensionValues().isEmpty();
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__DOCUMENTATION:
    		return getDocumentation() != null && !getDocumentation().isEmpty();
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__DESCRIPTION:
    		return getDescription() != DESCRIPTION_EDEFAULT;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__IS_SEQUENTIAL:
    		return isIsSequential() != IS_SEQUENTIAL_EDEFAULT;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__BEHAVIOR:
    		return getBehavior() != BEHAVIOR_EDEFAULT;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__LOOP_CARDINALITY:
    		return getLoopCardinality() != null;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__LOOP_DATA_INPUT_REF:
    		return getLoopDataInputRef() != null;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__LOOP_DATA_OUTPUT_REF:
    		return getLoopDataOutputRef() != null;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__INPUT_DATA_ITEM:
    		return getInputDataItem() != null;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__OUTPUT_DATA_ITEM:
    		return getOutputDataItem() != null;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__COMPLETION_CONDITION:
    		return getCompletionCondition() != null;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__COMPLEX_BEHAVIOR_DEFINITION:
    		return getComplexBehaviorDefinition() != null && !getComplexBehaviorDefinition().isEmpty();
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__ONE_BEHAVIOR_EVENT_REF:
    		return getOneBehaviorEventRef() != null;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__NONE_BEHAVIOR_EVENT_REF:
    		return getNoneBehaviorEventRef() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__ID:
    		setId(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__EXTENSION_DEFINITIONS:
    		getExtensionDefinitions().clear();
    		getExtensionDefinitions().addAll((Collection) newValue);
    		return;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__EXTENSION_VALUES:
    		getExtensionValues().clear();
    		getExtensionValues().addAll((Collection) newValue);
    		return;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__DOCUMENTATION:
    		getDocumentation().clear();
    		getDocumentation().addAll((Collection) newValue);
    		return;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__DESCRIPTION:
    		setDescription(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__IS_SEQUENTIAL:
    		setIsSequential(((java.lang.Boolean) newValue).booleanValue());
    		return;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__BEHAVIOR:
    		setBehavior(
    		(org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.MultiInstanceBehavior)
    		 newValue);
    		return;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__LOOP_CARDINALITY:
    		setLoopCardinality(
    		(org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Expression)
    		 newValue);
    		return;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__LOOP_DATA_INPUT_REF:
    		setLoopDataInputRef(
    		(org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.ItemAwareElement)
    		 newValue);
    		return;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__LOOP_DATA_OUTPUT_REF:
    		setLoopDataOutputRef(
    		(org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.ItemAwareElement)
    		 newValue);
    		return;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__INPUT_DATA_ITEM:
    		setInputDataItem(
    		(org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.DataInput)
    		 newValue);
    		return;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__OUTPUT_DATA_ITEM:
    		setOutputDataItem(
    		(org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.DataOutput)
    		 newValue);
    		return;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__COMPLETION_CONDITION:
    		setCompletionCondition(
    		(org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Expression)
    		 newValue);
    		return;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__COMPLEX_BEHAVIOR_DEFINITION:
    		getComplexBehaviorDefinition().clear();
    		getComplexBehaviorDefinition().addAll((Collection) newValue);
    		return;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__ONE_BEHAVIOR_EVENT_REF:
    		setOneBehaviorEventRef(
    		(org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.EventDefinition)
    		 newValue);
    		return;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__NONE_BEHAVIOR_EVENT_REF:
    		setNoneBehaviorEventRef(
    		(org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.EventDefinition)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
