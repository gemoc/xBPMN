package org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.BPMNMTAdaptersFactory;
import org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.InputSet;

@SuppressWarnings("all")
public class InputSetAdapter extends EObjectAdapter<InputSet> implements org.obeonetwork.dsl.bpmn2.InputSet {
  private BPMNMTAdaptersFactory adaptersFactory;
  
  public InputSetAdapter() {
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
  
  private /* EList<org.obeonetwork.dsl.bpmn2.DataInput> */Object dataInputRefs_;
  
  @Override
  public /* EList<org.obeonetwork.dsl.bpmn2.DataInput> */Object getDataInputRefs() {
    if (dataInputRefs_ == null)
    	dataInputRefs_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getDataInputRefs(), adaptersFactory, eResource);
    return dataInputRefs_;
  }
  
  private /* EList<org.obeonetwork.dsl.bpmn2.DataInput> */Object optionalInputRefs_;
  
  @Override
  public /* EList<org.obeonetwork.dsl.bpmn2.DataInput> */Object getOptionalInputRefs() {
    if (optionalInputRefs_ == null)
    	optionalInputRefs_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOptionalInputRefs(), adaptersFactory, eResource);
    return optionalInputRefs_;
  }
  
  private /* EList<org.obeonetwork.dsl.bpmn2.DataInput> */Object whileExecutingInputRefs_;
  
  @Override
  public /* EList<org.obeonetwork.dsl.bpmn2.DataInput> */Object getWhileExecutingInputRefs() {
    if (whileExecutingInputRefs_ == null)
    	whileExecutingInputRefs_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getWhileExecutingInputRefs(), adaptersFactory, eResource);
    return whileExecutingInputRefs_;
  }
  
  private /* EList<org.obeonetwork.dsl.bpmn2.OutputSet> */Object outputSetRefs_;
  
  @Override
  public /* EList<org.obeonetwork.dsl.bpmn2.OutputSet> */Object getOutputSetRefs() {
    if (outputSetRefs_ == null)
    	outputSetRefs_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOutputSetRefs(), adaptersFactory, eResource);
    return outputSetRefs_;
  }
  
  protected static final String ID_EDEFAULT = null;
  
  protected static final String DESCRIPTION_EDEFAULT = null;
  
  protected static final String NAME_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return org.obeonetwork.dsl.bpmn2.Bpmn2Package.eINSTANCE.getInputSet();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.INPUT_SET__ID:
    		return getId();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.INPUT_SET__EXTENSION_DEFINITIONS:
    		return getExtensionDefinitions();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.INPUT_SET__EXTENSION_VALUES:
    		return getExtensionValues();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.INPUT_SET__DOCUMENTATION:
    		return getDocumentation();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.INPUT_SET__DESCRIPTION:
    		return getDescription();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.INPUT_SET__NAME:
    		return getName();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.INPUT_SET__DATA_INPUT_REFS:
    		return getDataInputRefs();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.INPUT_SET__OPTIONAL_INPUT_REFS:
    		return getOptionalInputRefs();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.INPUT_SET__WHILE_EXECUTING_INPUT_REFS:
    		return getWhileExecutingInputRefs();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.INPUT_SET__OUTPUT_SET_REFS:
    		return getOutputSetRefs();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.INPUT_SET__ID:
    		return getId() != ID_EDEFAULT;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.INPUT_SET__EXTENSION_DEFINITIONS:
    		return getExtensionDefinitions() != null && !getExtensionDefinitions().isEmpty();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.INPUT_SET__EXTENSION_VALUES:
    		return getExtensionValues() != null && !getExtensionValues().isEmpty();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.INPUT_SET__DOCUMENTATION:
    		return getDocumentation() != null && !getDocumentation().isEmpty();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.INPUT_SET__DESCRIPTION:
    		return getDescription() != DESCRIPTION_EDEFAULT;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.INPUT_SET__NAME:
    		return getName() != NAME_EDEFAULT;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.INPUT_SET__DATA_INPUT_REFS:
    		return getDataInputRefs() != null && !getDataInputRefs().isEmpty();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.INPUT_SET__OPTIONAL_INPUT_REFS:
    		return getOptionalInputRefs() != null && !getOptionalInputRefs().isEmpty();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.INPUT_SET__WHILE_EXECUTING_INPUT_REFS:
    		return getWhileExecutingInputRefs() != null && !getWhileExecutingInputRefs().isEmpty();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.INPUT_SET__OUTPUT_SET_REFS:
    		return getOutputSetRefs() != null && !getOutputSetRefs().isEmpty();
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.INPUT_SET__ID:
    		setId(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.INPUT_SET__EXTENSION_DEFINITIONS:
    		getExtensionDefinitions().clear();
    		getExtensionDefinitions().addAll((Collection) newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.INPUT_SET__EXTENSION_VALUES:
    		getExtensionValues().clear();
    		getExtensionValues().addAll((Collection) newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.INPUT_SET__DOCUMENTATION:
    		getDocumentation().clear();
    		getDocumentation().addAll((Collection) newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.INPUT_SET__DESCRIPTION:
    		setDescription(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.INPUT_SET__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.INPUT_SET__DATA_INPUT_REFS:
    		getDataInputRefs().clear();
    		getDataInputRefs().addAll((Collection) newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.INPUT_SET__OPTIONAL_INPUT_REFS:
    		getOptionalInputRefs().clear();
    		getOptionalInputRefs().addAll((Collection) newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.INPUT_SET__WHILE_EXECUTING_INPUT_REFS:
    		getWhileExecutingInputRefs().clear();
    		getWhileExecutingInputRefs().addAll((Collection) newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.INPUT_SET__OUTPUT_SET_REFS:
    		getOutputSetRefs().clear();
    		getOutputSetRefs().addAll((Collection) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
