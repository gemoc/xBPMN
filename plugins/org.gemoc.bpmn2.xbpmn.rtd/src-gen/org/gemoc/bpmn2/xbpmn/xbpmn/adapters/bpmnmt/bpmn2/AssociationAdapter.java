package org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.BPMNMTAdaptersFactory;
import org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Association;

@SuppressWarnings("all")
public class AssociationAdapter extends EObjectAdapter<Association> implements org.obeonetwork.dsl.bpmn2.Association {
  private BPMNMTAdaptersFactory adaptersFactory;
  
  public AssociationAdapter() {
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
  public org.obeonetwork.dsl.bpmn2.AssociationDirection getAssociationDirection() {
    return org.obeonetwork.dsl.bpmn2.AssociationDirection.get(adaptee.getAssociationDirection().getValue());
  }
  
  @Override
  public void setAssociationDirection(final org.obeonetwork.dsl.bpmn2.AssociationDirection o) {
    adaptee.setAssociationDirection(org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.AssociationDirection.get(o.getValue()));
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
  public org.obeonetwork.dsl.bpmn2.BaseElement getSourceRef() {
    return () adaptersFactory.createAdapter(adaptee.getSourceRef(), eResource);
  }
  
  @Override
  public void setSourceRef(final org.obeonetwork.dsl.bpmn2.BaseElement o) {
    if (o != null)
    	adaptee.setSourceRef(((org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.BaseElementAdapter) o).getAdaptee());
    else adaptee.setSourceRef(null);
  }
  
  @Override
  public org.obeonetwork.dsl.bpmn2.BaseElement getTargetRef() {
    return () adaptersFactory.createAdapter(adaptee.getTargetRef(), eResource);
  }
  
  @Override
  public void setTargetRef(final org.obeonetwork.dsl.bpmn2.BaseElement o) {
    if (o != null)
    	adaptee.setTargetRef(((org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.BaseElementAdapter) o).getAdaptee());
    else adaptee.setTargetRef(null);
  }
  
  protected static final String ID_EDEFAULT = null;
  
  protected static final String DESCRIPTION_EDEFAULT = null;
  
  protected static final org.obeonetwork.dsl.bpmn2.AssociationDirection ASSOCIATION_DIRECTION_EDEFAULT = org.obeonetwork.dsl.bpmn2.AssociationDirection.NONE;
  
  @Override
  public EClass eClass() {
    return org.obeonetwork.dsl.bpmn2.Bpmn2Package.eINSTANCE.getAssociation();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.ASSOCIATION__ID:
    		return getId();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.ASSOCIATION__EXTENSION_DEFINITIONS:
    		return getExtensionDefinitions();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.ASSOCIATION__EXTENSION_VALUES:
    		return getExtensionValues();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.ASSOCIATION__DOCUMENTATION:
    		return getDocumentation();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.ASSOCIATION__DESCRIPTION:
    		return getDescription();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.ASSOCIATION__ASSOCIATION_DIRECTION:
    		return getAssociationDirection();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.ASSOCIATION__SOURCE_REF:
    		return getSourceRef();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.ASSOCIATION__TARGET_REF:
    		return getTargetRef();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.ASSOCIATION__ID:
    		return getId() != ID_EDEFAULT;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.ASSOCIATION__EXTENSION_DEFINITIONS:
    		return getExtensionDefinitions() != null && !getExtensionDefinitions().isEmpty();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.ASSOCIATION__EXTENSION_VALUES:
    		return getExtensionValues() != null && !getExtensionValues().isEmpty();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.ASSOCIATION__DOCUMENTATION:
    		return getDocumentation() != null && !getDocumentation().isEmpty();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.ASSOCIATION__DESCRIPTION:
    		return getDescription() != DESCRIPTION_EDEFAULT;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.ASSOCIATION__ASSOCIATION_DIRECTION:
    		return getAssociationDirection() != ASSOCIATION_DIRECTION_EDEFAULT;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.ASSOCIATION__SOURCE_REF:
    		return getSourceRef() != null;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.ASSOCIATION__TARGET_REF:
    		return getTargetRef() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.ASSOCIATION__ID:
    		setId(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.ASSOCIATION__EXTENSION_DEFINITIONS:
    		getExtensionDefinitions().clear();
    		getExtensionDefinitions().addAll((Collection) newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.ASSOCIATION__EXTENSION_VALUES:
    		getExtensionValues().clear();
    		getExtensionValues().addAll((Collection) newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.ASSOCIATION__DOCUMENTATION:
    		getDocumentation().clear();
    		getDocumentation().addAll((Collection) newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.ASSOCIATION__DESCRIPTION:
    		setDescription(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.ASSOCIATION__ASSOCIATION_DIRECTION:
    		setAssociationDirection(
    		(org.obeonetwork.dsl.bpmn2.AssociationDirection)
    		 newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.ASSOCIATION__SOURCE_REF:
    		setSourceRef(
    		(org.obeonetwork.dsl.bpmn2.BaseElement)
    		 newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.ASSOCIATION__TARGET_REF:
    		setTargetRef(
    		(org.obeonetwork.dsl.bpmn2.BaseElement)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
