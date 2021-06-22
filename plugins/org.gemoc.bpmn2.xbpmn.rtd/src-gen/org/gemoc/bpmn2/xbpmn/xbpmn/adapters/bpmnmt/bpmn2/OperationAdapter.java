package org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.BPMNMTAdaptersFactory;
import org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Operation;

@SuppressWarnings("all")
public class OperationAdapter extends EObjectAdapter<Operation> implements org.obeonetwork.dsl.bpmn2.Operation {
  private BPMNMTAdaptersFactory adaptersFactory;
  
  public OperationAdapter() {
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
  public org.obeonetwork.dsl.bpmn2.Message getInMessageRef() {
    return () adaptersFactory.createAdapter(adaptee.getInMessageRef(), eResource);
  }
  
  @Override
  public void setInMessageRef(final org.obeonetwork.dsl.bpmn2.Message o) {
    if (o != null)
    	adaptee.setInMessageRef(((org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.MessageAdapter) o).getAdaptee());
    else adaptee.setInMessageRef(null);
  }
  
  @Override
  public org.obeonetwork.dsl.bpmn2.Message getOutMessageRef() {
    return () adaptersFactory.createAdapter(adaptee.getOutMessageRef(), eResource);
  }
  
  @Override
  public void setOutMessageRef(final org.obeonetwork.dsl.bpmn2.Message o) {
    if (o != null)
    	adaptee.setOutMessageRef(((org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.MessageAdapter) o).getAdaptee());
    else adaptee.setOutMessageRef(null);
  }
  
  private /* EList<org.obeonetwork.dsl.bpmn2.Error> */Object errorRefs_;
  
  @Override
  public /* EList<org.obeonetwork.dsl.bpmn2.Error> */Object getErrorRefs() {
    if (errorRefs_ == null)
    	errorRefs_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getErrorRefs(), adaptersFactory, eResource);
    return errorRefs_;
  }
  
  @Override
  public EObject getImplementationRef() {
    return adaptee.getImplementationRef();
  }
  
  @Override
  public void setImplementationRef(final EObject o) {
    if (o != null)
    	adaptee.setImplementationRef(((org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.ecore.EObjectAdapter) o).getAdaptee());
    else adaptee.setImplementationRef(null);
  }
  
  protected static final String ID_EDEFAULT = null;
  
  protected static final String DESCRIPTION_EDEFAULT = null;
  
  protected static final String NAME_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return org.obeonetwork.dsl.bpmn2.Bpmn2Package.eINSTANCE.getOperation();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.OPERATION__ID:
    		return getId();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.OPERATION__EXTENSION_DEFINITIONS:
    		return getExtensionDefinitions();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.OPERATION__EXTENSION_VALUES:
    		return getExtensionValues();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.OPERATION__DOCUMENTATION:
    		return getDocumentation();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.OPERATION__DESCRIPTION:
    		return getDescription();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.OPERATION__NAME:
    		return getName();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.OPERATION__IN_MESSAGE_REF:
    		return getInMessageRef();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.OPERATION__OUT_MESSAGE_REF:
    		return getOutMessageRef();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.OPERATION__ERROR_REFS:
    		return getErrorRefs();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.OPERATION__IMPLEMENTATION_REF:
    		return getImplementationRef();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.OPERATION__ID:
    		return getId() != ID_EDEFAULT;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.OPERATION__EXTENSION_DEFINITIONS:
    		return getExtensionDefinitions() != null && !getExtensionDefinitions().isEmpty();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.OPERATION__EXTENSION_VALUES:
    		return getExtensionValues() != null && !getExtensionValues().isEmpty();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.OPERATION__DOCUMENTATION:
    		return getDocumentation() != null && !getDocumentation().isEmpty();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.OPERATION__DESCRIPTION:
    		return getDescription() != DESCRIPTION_EDEFAULT;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.OPERATION__NAME:
    		return getName() != NAME_EDEFAULT;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.OPERATION__IN_MESSAGE_REF:
    		return getInMessageRef() != null;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.OPERATION__OUT_MESSAGE_REF:
    		return getOutMessageRef() != null;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.OPERATION__ERROR_REFS:
    		return getErrorRefs() != null && !getErrorRefs().isEmpty();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.OPERATION__IMPLEMENTATION_REF:
    		return getImplementationRef() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.OPERATION__ID:
    		setId(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.OPERATION__EXTENSION_DEFINITIONS:
    		getExtensionDefinitions().clear();
    		getExtensionDefinitions().addAll((Collection) newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.OPERATION__EXTENSION_VALUES:
    		getExtensionValues().clear();
    		getExtensionValues().addAll((Collection) newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.OPERATION__DOCUMENTATION:
    		getDocumentation().clear();
    		getDocumentation().addAll((Collection) newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.OPERATION__DESCRIPTION:
    		setDescription(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.OPERATION__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.OPERATION__IN_MESSAGE_REF:
    		setInMessageRef(
    		(org.obeonetwork.dsl.bpmn2.Message)
    		 newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.OPERATION__OUT_MESSAGE_REF:
    		setOutMessageRef(
    		(org.obeonetwork.dsl.bpmn2.Message)
    		 newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.OPERATION__ERROR_REFS:
    		getErrorRefs().clear();
    		getErrorRefs().addAll((Collection) newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.OPERATION__IMPLEMENTATION_REF:
    		setImplementationRef(
    		(org.eclipse.emf.ecore.EObject)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
