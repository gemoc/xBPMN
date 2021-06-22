package org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.BPMNMTAdaptersFactory;
import org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.StandardLoopCharacteristics;

@SuppressWarnings("all")
public class StandardLoopCharacteristicsAdapter extends EObjectAdapter<StandardLoopCharacteristics> implements org.obeonetwork.dsl.bpmn2.StandardLoopCharacteristics {
  private BPMNMTAdaptersFactory adaptersFactory;
  
  public StandardLoopCharacteristicsAdapter() {
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
  public boolean isTestBefore() {
    return adaptee.isTestBefore();
  }
  
  @Override
  public void setTestBefore(final boolean o) {
    adaptee.setTestBefore(o);
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
  public org.obeonetwork.dsl.bpmn2.Expression getLoopCondition() {
    return () adaptersFactory.createAdapter(adaptee.getLoopCondition(), eResource);
  }
  
  @Override
  public void setLoopCondition(final org.obeonetwork.dsl.bpmn2.Expression o) {
    if (o != null)
    	adaptee.setLoopCondition(((org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.ExpressionAdapter) o).getAdaptee());
    else adaptee.setLoopCondition(null);
  }
  
  @Override
  public org.obeonetwork.dsl.bpmn2.Expression getLoopMaximum() {
    return () adaptersFactory.createAdapter(adaptee.getLoopMaximum(), eResource);
  }
  
  @Override
  public void setLoopMaximum(final org.obeonetwork.dsl.bpmn2.Expression o) {
    if (o != null)
    	adaptee.setLoopMaximum(((org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.ExpressionAdapter) o).getAdaptee());
    else adaptee.setLoopMaximum(null);
  }
  
  protected static final String ID_EDEFAULT = null;
  
  protected static final String DESCRIPTION_EDEFAULT = null;
  
  protected static final boolean TEST_BEFORE_EDEFAULT = false;
  
  @Override
  public EClass eClass() {
    return org.obeonetwork.dsl.bpmn2.Bpmn2Package.eINSTANCE.getStandardLoopCharacteristics();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.STANDARD_LOOP_CHARACTERISTICS__ID:
    		return getId();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.STANDARD_LOOP_CHARACTERISTICS__EXTENSION_DEFINITIONS:
    		return getExtensionDefinitions();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.STANDARD_LOOP_CHARACTERISTICS__EXTENSION_VALUES:
    		return getExtensionValues();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.STANDARD_LOOP_CHARACTERISTICS__DOCUMENTATION:
    		return getDocumentation();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.STANDARD_LOOP_CHARACTERISTICS__DESCRIPTION:
    		return getDescription();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.STANDARD_LOOP_CHARACTERISTICS__TEST_BEFORE:
    		return isTestBefore() ? Boolean.TRUE : Boolean.FALSE;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.STANDARD_LOOP_CHARACTERISTICS__LOOP_CONDITION:
    		return getLoopCondition();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.STANDARD_LOOP_CHARACTERISTICS__LOOP_MAXIMUM:
    		return getLoopMaximum();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.STANDARD_LOOP_CHARACTERISTICS__ID:
    		return getId() != ID_EDEFAULT;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.STANDARD_LOOP_CHARACTERISTICS__EXTENSION_DEFINITIONS:
    		return getExtensionDefinitions() != null && !getExtensionDefinitions().isEmpty();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.STANDARD_LOOP_CHARACTERISTICS__EXTENSION_VALUES:
    		return getExtensionValues() != null && !getExtensionValues().isEmpty();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.STANDARD_LOOP_CHARACTERISTICS__DOCUMENTATION:
    		return getDocumentation() != null && !getDocumentation().isEmpty();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.STANDARD_LOOP_CHARACTERISTICS__DESCRIPTION:
    		return getDescription() != DESCRIPTION_EDEFAULT;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.STANDARD_LOOP_CHARACTERISTICS__TEST_BEFORE:
    		return isTestBefore() != TEST_BEFORE_EDEFAULT;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.STANDARD_LOOP_CHARACTERISTICS__LOOP_CONDITION:
    		return getLoopCondition() != null;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.STANDARD_LOOP_CHARACTERISTICS__LOOP_MAXIMUM:
    		return getLoopMaximum() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.STANDARD_LOOP_CHARACTERISTICS__ID:
    		setId(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.STANDARD_LOOP_CHARACTERISTICS__EXTENSION_DEFINITIONS:
    		getExtensionDefinitions().clear();
    		getExtensionDefinitions().addAll((Collection) newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.STANDARD_LOOP_CHARACTERISTICS__EXTENSION_VALUES:
    		getExtensionValues().clear();
    		getExtensionValues().addAll((Collection) newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.STANDARD_LOOP_CHARACTERISTICS__DOCUMENTATION:
    		getDocumentation().clear();
    		getDocumentation().addAll((Collection) newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.STANDARD_LOOP_CHARACTERISTICS__DESCRIPTION:
    		setDescription(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.STANDARD_LOOP_CHARACTERISTICS__TEST_BEFORE:
    		setTestBefore(((java.lang.Boolean) newValue).booleanValue());
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.STANDARD_LOOP_CHARACTERISTICS__LOOP_CONDITION:
    		setLoopCondition(
    		(org.obeonetwork.dsl.bpmn2.Expression)
    		 newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.STANDARD_LOOP_CHARACTERISTICS__LOOP_MAXIMUM:
    		setLoopMaximum(
    		(org.obeonetwork.dsl.bpmn2.Expression)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
