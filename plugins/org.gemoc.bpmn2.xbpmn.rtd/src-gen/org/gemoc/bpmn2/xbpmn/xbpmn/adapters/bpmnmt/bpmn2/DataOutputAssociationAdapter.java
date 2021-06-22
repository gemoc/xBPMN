package org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.BPMNMTAdaptersFactory;
import org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.DataOutputAssociation;

@SuppressWarnings("all")
public class DataOutputAssociationAdapter extends EObjectAdapter<DataOutputAssociation> implements org.obeonetwork.dsl.bpmn2.DataOutputAssociation {
  private BPMNMTAdaptersFactory adaptersFactory;
  
  public DataOutputAssociationAdapter() {
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
  public org.obeonetwork.dsl.bpmn2.FormalExpression getTransformation() {
    return () adaptersFactory.createAdapter(adaptee.getTransformation(), eResource);
  }
  
  @Override
  public void setTransformation(final org.obeonetwork.dsl.bpmn2.FormalExpression o) {
    if (o != null)
    	adaptee.setTransformation(((org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.FormalExpressionAdapter) o).getAdaptee());
    else adaptee.setTransformation(null);
  }
  
  private /* EList<org.obeonetwork.dsl.bpmn2.Assignment> */Object assignment_;
  
  @Override
  public /* EList<org.obeonetwork.dsl.bpmn2.Assignment> */Object getAssignment() {
    if (assignment_ == null)
    	assignment_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getAssignment(), adaptersFactory, eResource);
    return assignment_;
  }
  
  @Override
  public org.obeonetwork.dsl.bpmn2.ItemAwareElement getTargetRef() {
    return () adaptersFactory.createAdapter(adaptee.getTargetRef(), eResource);
  }
  
  @Override
  public void setTargetRef(final org.obeonetwork.dsl.bpmn2.ItemAwareElement o) {
    if (o != null)
    	adaptee.setTargetRef(((org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.ItemAwareElementAdapter) o).getAdaptee());
    else adaptee.setTargetRef(null);
  }
  
  private /* EList<org.obeonetwork.dsl.bpmn2.ItemAwareElement> */Object sourceRef_;
  
  @Override
  public /* EList<org.obeonetwork.dsl.bpmn2.ItemAwareElement> */Object getSourceRef() {
    if (sourceRef_ == null)
    	sourceRef_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getSourceRef(), adaptersFactory, eResource);
    return sourceRef_;
  }
  
  protected static final String ID_EDEFAULT = null;
  
  protected static final String DESCRIPTION_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return org.obeonetwork.dsl.bpmn2.Bpmn2Package.eINSTANCE.getDataOutputAssociation();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.DATA_OUTPUT_ASSOCIATION__ID:
    		return getId();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.DATA_OUTPUT_ASSOCIATION__EXTENSION_DEFINITIONS:
    		return getExtensionDefinitions();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.DATA_OUTPUT_ASSOCIATION__EXTENSION_VALUES:
    		return getExtensionValues();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.DATA_OUTPUT_ASSOCIATION__DOCUMENTATION:
    		return getDocumentation();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.DATA_OUTPUT_ASSOCIATION__DESCRIPTION:
    		return getDescription();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.DATA_OUTPUT_ASSOCIATION__TRANSFORMATION:
    		return getTransformation();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.DATA_OUTPUT_ASSOCIATION__ASSIGNMENT:
    		return getAssignment();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.DATA_OUTPUT_ASSOCIATION__TARGET_REF:
    		return getTargetRef();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.DATA_OUTPUT_ASSOCIATION__SOURCE_REF:
    		return getSourceRef();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.DATA_OUTPUT_ASSOCIATION__ID:
    		return getId() != ID_EDEFAULT;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.DATA_OUTPUT_ASSOCIATION__EXTENSION_DEFINITIONS:
    		return getExtensionDefinitions() != null && !getExtensionDefinitions().isEmpty();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.DATA_OUTPUT_ASSOCIATION__EXTENSION_VALUES:
    		return getExtensionValues() != null && !getExtensionValues().isEmpty();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.DATA_OUTPUT_ASSOCIATION__DOCUMENTATION:
    		return getDocumentation() != null && !getDocumentation().isEmpty();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.DATA_OUTPUT_ASSOCIATION__DESCRIPTION:
    		return getDescription() != DESCRIPTION_EDEFAULT;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.DATA_OUTPUT_ASSOCIATION__TRANSFORMATION:
    		return getTransformation() != null;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.DATA_OUTPUT_ASSOCIATION__ASSIGNMENT:
    		return getAssignment() != null && !getAssignment().isEmpty();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.DATA_OUTPUT_ASSOCIATION__TARGET_REF:
    		return getTargetRef() != null;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.DATA_OUTPUT_ASSOCIATION__SOURCE_REF:
    		return getSourceRef() != null && !getSourceRef().isEmpty();
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.DATA_OUTPUT_ASSOCIATION__ID:
    		setId(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.DATA_OUTPUT_ASSOCIATION__EXTENSION_DEFINITIONS:
    		getExtensionDefinitions().clear();
    		getExtensionDefinitions().addAll((Collection) newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.DATA_OUTPUT_ASSOCIATION__EXTENSION_VALUES:
    		getExtensionValues().clear();
    		getExtensionValues().addAll((Collection) newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.DATA_OUTPUT_ASSOCIATION__DOCUMENTATION:
    		getDocumentation().clear();
    		getDocumentation().addAll((Collection) newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.DATA_OUTPUT_ASSOCIATION__DESCRIPTION:
    		setDescription(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.DATA_OUTPUT_ASSOCIATION__TRANSFORMATION:
    		setTransformation(
    		(org.obeonetwork.dsl.bpmn2.FormalExpression)
    		 newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.DATA_OUTPUT_ASSOCIATION__ASSIGNMENT:
    		getAssignment().clear();
    		getAssignment().addAll((Collection) newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.DATA_OUTPUT_ASSOCIATION__TARGET_REF:
    		setTargetRef(
    		(org.obeonetwork.dsl.bpmn2.ItemAwareElement)
    		 newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.DATA_OUTPUT_ASSOCIATION__SOURCE_REF:
    		getSourceRef().clear();
    		getSourceRef().addAll((Collection) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
