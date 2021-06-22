package org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.BPMNMTAdaptersFactory;
import org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.ItemDefinition;

@SuppressWarnings("all")
public class ItemDefinitionAdapter extends EObjectAdapter<ItemDefinition> implements org.obeonetwork.dsl.bpmn2.ItemDefinition {
  private BPMNMTAdaptersFactory adaptersFactory;
  
  public ItemDefinitionAdapter() {
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
  public org.obeonetwork.dsl.bpmn2.ItemKind getItemKind() {
    return org.obeonetwork.dsl.bpmn2.ItemKind.get(adaptee.getItemKind().getValue());
  }
  
  @Override
  public void setItemKind(final org.obeonetwork.dsl.bpmn2.ItemKind o) {
    adaptee.setItemKind(org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.ItemKind.get(o.getValue()));
  }
  
  @Override
  public boolean isIsCollection() {
    return adaptee.isIsCollection();
  }
  
  @Override
  public void setIsCollection(final boolean o) {
    adaptee.setIsCollection(o);
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
  public EObject getStructureRef() {
    return adaptee.getStructureRef();
  }
  
  @Override
  public void setStructureRef(final EObject o) {
    if (o != null)
    	adaptee.setStructureRef(((org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.ecore.EObjectAdapter) o).getAdaptee());
    else adaptee.setStructureRef(null);
  }
  
  @Override
  public org.obeonetwork.dsl.bpmn2.Import getImport() {
    return () adaptersFactory.createAdapter(adaptee.getImport(), eResource);
  }
  
  @Override
  public void setImport(final org.obeonetwork.dsl.bpmn2.Import o) {
    if (o != null)
    	adaptee.setImport(((org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.ImportAdapter) o).getAdaptee());
    else adaptee.setImport(null);
  }
  
  protected static final String ID_EDEFAULT = null;
  
  protected static final String DESCRIPTION_EDEFAULT = null;
  
  protected static final org.obeonetwork.dsl.bpmn2.ItemKind ITEM_KIND_EDEFAULT = org.obeonetwork.dsl.bpmn2.ItemKind.PHYSICAL;
  
  protected static final boolean IS_COLLECTION_EDEFAULT = false;
  
  @Override
  public EClass eClass() {
    return org.obeonetwork.dsl.bpmn2.Bpmn2Package.eINSTANCE.getItemDefinition();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.ITEM_DEFINITION__ID:
    		return getId();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.ITEM_DEFINITION__EXTENSION_DEFINITIONS:
    		return getExtensionDefinitions();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.ITEM_DEFINITION__EXTENSION_VALUES:
    		return getExtensionValues();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.ITEM_DEFINITION__DOCUMENTATION:
    		return getDocumentation();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.ITEM_DEFINITION__DESCRIPTION:
    		return getDescription();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.ITEM_DEFINITION__ITEM_KIND:
    		return getItemKind();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.ITEM_DEFINITION__STRUCTURE_REF:
    		return getStructureRef();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.ITEM_DEFINITION__IS_COLLECTION:
    		return isIsCollection() ? Boolean.TRUE : Boolean.FALSE;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.ITEM_DEFINITION__IMPORT:
    		return getImport();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.ITEM_DEFINITION__ID:
    		return getId() != ID_EDEFAULT;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.ITEM_DEFINITION__EXTENSION_DEFINITIONS:
    		return getExtensionDefinitions() != null && !getExtensionDefinitions().isEmpty();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.ITEM_DEFINITION__EXTENSION_VALUES:
    		return getExtensionValues() != null && !getExtensionValues().isEmpty();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.ITEM_DEFINITION__DOCUMENTATION:
    		return getDocumentation() != null && !getDocumentation().isEmpty();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.ITEM_DEFINITION__DESCRIPTION:
    		return getDescription() != DESCRIPTION_EDEFAULT;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.ITEM_DEFINITION__ITEM_KIND:
    		return getItemKind() != ITEM_KIND_EDEFAULT;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.ITEM_DEFINITION__STRUCTURE_REF:
    		return getStructureRef() != null;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.ITEM_DEFINITION__IS_COLLECTION:
    		return isIsCollection() != IS_COLLECTION_EDEFAULT;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.ITEM_DEFINITION__IMPORT:
    		return getImport() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.ITEM_DEFINITION__ID:
    		setId(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.ITEM_DEFINITION__EXTENSION_DEFINITIONS:
    		getExtensionDefinitions().clear();
    		getExtensionDefinitions().addAll((Collection) newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.ITEM_DEFINITION__EXTENSION_VALUES:
    		getExtensionValues().clear();
    		getExtensionValues().addAll((Collection) newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.ITEM_DEFINITION__DOCUMENTATION:
    		getDocumentation().clear();
    		getDocumentation().addAll((Collection) newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.ITEM_DEFINITION__DESCRIPTION:
    		setDescription(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.ITEM_DEFINITION__ITEM_KIND:
    		setItemKind(
    		(org.obeonetwork.dsl.bpmn2.ItemKind)
    		 newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.ITEM_DEFINITION__STRUCTURE_REF:
    		setStructureRef(
    		(org.eclipse.emf.ecore.EObject)
    		 newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.ITEM_DEFINITION__IS_COLLECTION:
    		setIsCollection(((java.lang.Boolean) newValue).booleanValue());
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.ITEM_DEFINITION__IMPORT:
    		setImport(
    		(org.obeonetwork.dsl.bpmn2.Import)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
