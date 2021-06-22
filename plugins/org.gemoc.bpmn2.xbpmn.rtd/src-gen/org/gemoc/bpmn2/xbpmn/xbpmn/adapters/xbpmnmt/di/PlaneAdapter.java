package org.gemoc.bpmn2.xbpmn.xbpmn.adapters.xbpmnmt.di;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.gemoc.bpmn2.xbpmn.xbpmn.adapters.xbpmnmt.XBPMNMTAdaptersFactory;
import org.gemoc.bpmn2.xbpmn.xbpmn.di.Plane;

@SuppressWarnings("all")
public class PlaneAdapter extends EObjectAdapter<Plane> implements org.gemoc.bpmn2.xbpmn.xbpmnmt.di.Plane {
  private XBPMNMTAdaptersFactory adaptersFactory;
  
  public PlaneAdapter() {
    super(org.gemoc.bpmn2.xbpmn.xbpmn.adapters.xbpmnmt.XBPMNMTAdaptersFactory.getInstance());
    adaptersFactory = org.gemoc.bpmn2.xbpmn.xbpmn.adapters.xbpmnmt.XBPMNMTAdaptersFactory.getInstance();
  }
  
  @Override
  public org.gemoc.bpmn2.xbpmn.xbpmnmt.di.Diagram getOwningDiagram() {
    return () adaptersFactory.createAdapter(adaptee.getOwningDiagram(), eResource);
  }
  
  @Override
  public org.gemoc.bpmn2.xbpmn.xbpmnmt.di.DiagramElement getOwningElement() {
    return () adaptersFactory.createAdapter(adaptee.getOwningElement(), eResource);
  }
  
  private /* EList<org.gemoc.bpmn2.xbpmn.xbpmnmt.di.DiagramElement> */Object ownedElement_;
  
  @Override
  public /* EList<org.gemoc.bpmn2.xbpmn.xbpmnmt.di.DiagramElement> */Object getOwnedElement() {
    if (ownedElement_ == null)
    	ownedElement_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOwnedElement(), adaptersFactory, eResource);
    return ownedElement_;
  }
  
  @Override
  public EObject getModelElement() {
    return adaptee.getModelElement();
  }
  
  @Override
  public org.gemoc.bpmn2.xbpmn.xbpmnmt.di.Style getStyle() {
    return () adaptersFactory.createAdapter(adaptee.getStyle(), eResource);
  }
  
  private /* EList<org.gemoc.bpmn2.xbpmn.xbpmnmt.di.DiagramElement> */Object planeElement_;
  
  @Override
  public /* EList<org.gemoc.bpmn2.xbpmn.xbpmnmt.di.DiagramElement> */Object getPlaneElement() {
    if (planeElement_ == null)
    	planeElement_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getPlaneElement(), adaptersFactory, eResource);
    return planeElement_;
  }
  
  @Override
  public boolean plane_element_type(final DiagnosticChain diagnostics);
  
  @Override
  public EClass eClass() {
    return org.gemoc.bpmn2.xbpmn.xbpmnmt.di.DiPackage.eINSTANCE.getPlane();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.di.DiPackage.PLANE__OWNING_DIAGRAM:
    		return getOwningDiagram();
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.di.DiPackage.PLANE__OWNING_ELEMENT:
    		return getOwningElement();
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.di.DiPackage.PLANE__OWNED_ELEMENT:
    		return getOwnedElement();
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.di.DiPackage.PLANE__MODEL_ELEMENT:
    		return getModelElement();
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.di.DiPackage.PLANE__STYLE:
    		return getStyle();
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.di.DiPackage.PLANE__PLANE_ELEMENT:
    		return getPlaneElement();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.di.DiPackage.PLANE__OWNING_DIAGRAM:
    		return getOwningDiagram() != null;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.di.DiPackage.PLANE__OWNING_ELEMENT:
    		return getOwningElement() != null;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.di.DiPackage.PLANE__OWNED_ELEMENT:
    		return getOwnedElement() != null && !getOwnedElement().isEmpty();
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.di.DiPackage.PLANE__MODEL_ELEMENT:
    		return getModelElement() != null;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.di.DiPackage.PLANE__STYLE:
    		return getStyle() != null;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.di.DiPackage.PLANE__PLANE_ELEMENT:
    		return getPlaneElement() != null && !getPlaneElement().isEmpty();
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.di.DiPackage.PLANE__PLANE_ELEMENT:
    		getPlaneElement().clear();
    		getPlaneElement().addAll((Collection) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
