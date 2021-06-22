package org.gemoc.bpmn2.xbpmn.xbpmn.adapters.xbpmnmt.bpmn2;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.bpmn2.xbpmn.xbpmn.adapters.xbpmnmt.XBPMNMTAdaptersFactory;
import org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Import;

@SuppressWarnings("all")
public class ImportAdapter extends EObjectAdapter<Import> implements org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Import {
  private XBPMNMTAdaptersFactory adaptersFactory;
  
  public ImportAdapter() {
    super(org.gemoc.bpmn2.xbpmn.xbpmn.adapters.xbpmnmt.XBPMNMTAdaptersFactory.getInstance());
    adaptersFactory = org.gemoc.bpmn2.xbpmn.xbpmn.adapters.xbpmnmt.XBPMNMTAdaptersFactory.getInstance();
  }
  
  @Override
  public String getImportType() {
    return adaptee.getImportType();
  }
  
  @Override
  public void setImportType(final String o) {
    adaptee.setImportType(o);
  }
  
  @Override
  public String getLocation() {
    return adaptee.getLocation();
  }
  
  @Override
  public void setLocation(final String o) {
    adaptee.setLocation(o);
  }
  
  @Override
  public String getNamespace() {
    return adaptee.getNamespace();
  }
  
  @Override
  public void setNamespace(final String o) {
    adaptee.setNamespace(o);
  }
  
  @Override
  public String getId() {
    return adaptee.getId();
  }
  
  @Override
  public void setId(final String o) {
    adaptee.setId(o);
  }
  
  protected static final String IMPORT_TYPE_EDEFAULT = null;
  
  protected static final String LOCATION_EDEFAULT = null;
  
  protected static final String NAMESPACE_EDEFAULT = null;
  
  protected static final String ID_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.eINSTANCE.getImport();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.IMPORT__IMPORT_TYPE:
    		return getImportType();
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.IMPORT__LOCATION:
    		return getLocation();
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.IMPORT__NAMESPACE:
    		return getNamespace();
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.IMPORT__ID:
    		return getId();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.IMPORT__IMPORT_TYPE:
    		return getImportType() != IMPORT_TYPE_EDEFAULT;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.IMPORT__LOCATION:
    		return getLocation() != LOCATION_EDEFAULT;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.IMPORT__NAMESPACE:
    		return getNamespace() != NAMESPACE_EDEFAULT;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.IMPORT__ID:
    		return getId() != ID_EDEFAULT;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.IMPORT__IMPORT_TYPE:
    		setImportType(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.IMPORT__LOCATION:
    		setLocation(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.IMPORT__NAMESPACE:
    		setNamespace(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.IMPORT__ID:
    		setId(
    		(java.lang.String)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
