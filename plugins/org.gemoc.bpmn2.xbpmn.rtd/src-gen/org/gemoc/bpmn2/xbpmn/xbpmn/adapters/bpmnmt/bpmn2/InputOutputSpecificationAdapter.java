package org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.BPMNMTAdaptersFactory;
import org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.InputOutputSpecification;

@SuppressWarnings("all")
public class InputOutputSpecificationAdapter extends EObjectAdapter<InputOutputSpecification> implements org.obeonetwork.dsl.bpmn2.InputOutputSpecification {
  private BPMNMTAdaptersFactory adaptersFactory;
  
  public InputOutputSpecificationAdapter() {
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
  
  private /* EList<org.obeonetwork.dsl.bpmn2.InputSet> */Object inputSets_;
  
  @Override
  public /* EList<org.obeonetwork.dsl.bpmn2.InputSet> */Object getInputSets() {
    if (inputSets_ == null)
    	inputSets_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getInputSets(), adaptersFactory, eResource);
    return inputSets_;
  }
  
  private /* EList<org.obeonetwork.dsl.bpmn2.OutputSet> */Object outputSets_;
  
  @Override
  public /* EList<org.obeonetwork.dsl.bpmn2.OutputSet> */Object getOutputSets() {
    if (outputSets_ == null)
    	outputSets_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOutputSets(), adaptersFactory, eResource);
    return outputSets_;
  }
  
  private /* EList<org.obeonetwork.dsl.bpmn2.DataInput> */Object dataInputs_;
  
  @Override
  public /* EList<org.obeonetwork.dsl.bpmn2.DataInput> */Object getDataInputs() {
    if (dataInputs_ == null)
    	dataInputs_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getDataInputs(), adaptersFactory, eResource);
    return dataInputs_;
  }
  
  private /* EList<org.obeonetwork.dsl.bpmn2.DataOutput> */Object dataOutputs_;
  
  @Override
  public /* EList<org.obeonetwork.dsl.bpmn2.DataOutput> */Object getDataOutputs() {
    if (dataOutputs_ == null)
    	dataOutputs_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getDataOutputs(), adaptersFactory, eResource);
    return dataOutputs_;
  }
  
  protected static final String ID_EDEFAULT = null;
  
  protected static final String DESCRIPTION_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return org.obeonetwork.dsl.bpmn2.Bpmn2Package.eINSTANCE.getInputOutputSpecification();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.INPUT_OUTPUT_SPECIFICATION__ID:
    		return getId();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.INPUT_OUTPUT_SPECIFICATION__EXTENSION_DEFINITIONS:
    		return getExtensionDefinitions();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.INPUT_OUTPUT_SPECIFICATION__EXTENSION_VALUES:
    		return getExtensionValues();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.INPUT_OUTPUT_SPECIFICATION__DOCUMENTATION:
    		return getDocumentation();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.INPUT_OUTPUT_SPECIFICATION__DESCRIPTION:
    		return getDescription();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.INPUT_OUTPUT_SPECIFICATION__INPUT_SETS:
    		return getInputSets();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.INPUT_OUTPUT_SPECIFICATION__OUTPUT_SETS:
    		return getOutputSets();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.INPUT_OUTPUT_SPECIFICATION__DATA_INPUTS:
    		return getDataInputs();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.INPUT_OUTPUT_SPECIFICATION__DATA_OUTPUTS:
    		return getDataOutputs();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.INPUT_OUTPUT_SPECIFICATION__ID:
    		return getId() != ID_EDEFAULT;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.INPUT_OUTPUT_SPECIFICATION__EXTENSION_DEFINITIONS:
    		return getExtensionDefinitions() != null && !getExtensionDefinitions().isEmpty();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.INPUT_OUTPUT_SPECIFICATION__EXTENSION_VALUES:
    		return getExtensionValues() != null && !getExtensionValues().isEmpty();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.INPUT_OUTPUT_SPECIFICATION__DOCUMENTATION:
    		return getDocumentation() != null && !getDocumentation().isEmpty();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.INPUT_OUTPUT_SPECIFICATION__DESCRIPTION:
    		return getDescription() != DESCRIPTION_EDEFAULT;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.INPUT_OUTPUT_SPECIFICATION__INPUT_SETS:
    		return getInputSets() != null && !getInputSets().isEmpty();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.INPUT_OUTPUT_SPECIFICATION__OUTPUT_SETS:
    		return getOutputSets() != null && !getOutputSets().isEmpty();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.INPUT_OUTPUT_SPECIFICATION__DATA_INPUTS:
    		return getDataInputs() != null && !getDataInputs().isEmpty();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.INPUT_OUTPUT_SPECIFICATION__DATA_OUTPUTS:
    		return getDataOutputs() != null && !getDataOutputs().isEmpty();
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.INPUT_OUTPUT_SPECIFICATION__ID:
    		setId(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.INPUT_OUTPUT_SPECIFICATION__EXTENSION_DEFINITIONS:
    		getExtensionDefinitions().clear();
    		getExtensionDefinitions().addAll((Collection) newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.INPUT_OUTPUT_SPECIFICATION__EXTENSION_VALUES:
    		getExtensionValues().clear();
    		getExtensionValues().addAll((Collection) newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.INPUT_OUTPUT_SPECIFICATION__DOCUMENTATION:
    		getDocumentation().clear();
    		getDocumentation().addAll((Collection) newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.INPUT_OUTPUT_SPECIFICATION__DESCRIPTION:
    		setDescription(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.INPUT_OUTPUT_SPECIFICATION__INPUT_SETS:
    		getInputSets().clear();
    		getInputSets().addAll((Collection) newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.INPUT_OUTPUT_SPECIFICATION__OUTPUT_SETS:
    		getOutputSets().clear();
    		getOutputSets().addAll((Collection) newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.INPUT_OUTPUT_SPECIFICATION__DATA_INPUTS:
    		getDataInputs().clear();
    		getDataInputs().addAll((Collection) newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.INPUT_OUTPUT_SPECIFICATION__DATA_OUTPUTS:
    		getDataOutputs().clear();
    		getDataOutputs().addAll((Collection) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
