package org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmdi;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.BPMNMTAdaptersFactory;
import org.gemoc.bpmn2.xbpmn.xbpmn.bpmdi.BPMNPlane;

@SuppressWarnings("all")
public class BPMNPlaneAdapter extends EObjectAdapter<BPMNPlane> implements org.obeonetwork.dsl.bpmn2.bpmdi.BPMNPlane {
  private BPMNMTAdaptersFactory adaptersFactory;
  
  public BPMNPlaneAdapter() {
    super(org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.BPMNMTAdaptersFactory.getInstance());
    adaptersFactory = org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.BPMNMTAdaptersFactory.getInstance();
  }
  
  @Override
  public org.obeonetwork.dsl.dd.di.Diagram getOwningDiagram() {
    return () adaptersFactory.createAdapter(adaptee.getOwningDiagram(), eResource);
  }
  
  @Override
  public org.obeonetwork.dsl.dd.di.DiagramElement getOwningElement() {
    return () adaptersFactory.createAdapter(adaptee.getOwningElement(), eResource);
  }
  
  private /* EList<org.obeonetwork.dsl.dd.di.DiagramElement> */Object ownedElement_;
  
  @Override
  public /* EList<org.obeonetwork.dsl.dd.di.DiagramElement> */Object getOwnedElement() {
    if (ownedElement_ == null)
    	ownedElement_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOwnedElement(), adaptersFactory, eResource);
    return ownedElement_;
  }
  
  @Override
  public EObject getModelElement() {
    return adaptee.getModelElement();
  }
  
  @Override
  public org.obeonetwork.dsl.dd.di.Style getStyle() {
    return () adaptersFactory.createAdapter(adaptee.getStyle(), eResource);
  }
  
  private /* EList<org.obeonetwork.dsl.dd.di.DiagramElement> */Object planeElement_;
  
  @Override
  public /* EList<org.obeonetwork.dsl.dd.di.DiagramElement> */Object getPlaneElement() {
    if (planeElement_ == null)
    	planeElement_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getPlaneElement(), adaptersFactory, eResource);
    return planeElement_;
  }
  
  @Override
  public org.obeonetwork.dsl.bpmn2.BaseElement getBpmnElement() {
    return () adaptersFactory.createAdapter(adaptee.getBpmnElement(), eResource);
  }
  
  @Override
  public void setBpmnElement(final org.obeonetwork.dsl.bpmn2.BaseElement o) {
    if (o != null)
    	adaptee.setBpmnElement(((org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.BaseElementAdapter) o).getAdaptee());
    else adaptee.setBpmnElement(null);
  }
  
  @Override
  public boolean plane_element_type(final DiagnosticChain diagnostics);
  
  @Override
  public EClass eClass() {
    return org.obeonetwork.dsl.bpmn2.bpmdi.BpmnDiPackage.eINSTANCE.getBPMNPlane();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.obeonetwork.dsl.bpmn2.bpmdi.BpmnDiPackage.BPMN_PLANE__OWNING_DIAGRAM:
    		return getOwningDiagram();
    	case org.obeonetwork.dsl.bpmn2.bpmdi.BpmnDiPackage.BPMN_PLANE__OWNING_ELEMENT:
    		return getOwningElement();
    	case org.obeonetwork.dsl.bpmn2.bpmdi.BpmnDiPackage.BPMN_PLANE__OWNED_ELEMENT:
    		return getOwnedElement();
    	case org.obeonetwork.dsl.bpmn2.bpmdi.BpmnDiPackage.BPMN_PLANE__MODEL_ELEMENT:
    		return getModelElement();
    	case org.obeonetwork.dsl.bpmn2.bpmdi.BpmnDiPackage.BPMN_PLANE__STYLE:
    		return getStyle();
    	case org.obeonetwork.dsl.bpmn2.bpmdi.BpmnDiPackage.BPMN_PLANE__PLANE_ELEMENT:
    		return getPlaneElement();
    	case org.obeonetwork.dsl.bpmn2.bpmdi.BpmnDiPackage.BPMN_PLANE__BPMN_ELEMENT:
    		return getBpmnElement();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.obeonetwork.dsl.bpmn2.bpmdi.BpmnDiPackage.BPMN_PLANE__OWNING_DIAGRAM:
    		return getOwningDiagram() != null;
    	case org.obeonetwork.dsl.bpmn2.bpmdi.BpmnDiPackage.BPMN_PLANE__OWNING_ELEMENT:
    		return getOwningElement() != null;
    	case org.obeonetwork.dsl.bpmn2.bpmdi.BpmnDiPackage.BPMN_PLANE__OWNED_ELEMENT:
    		return getOwnedElement() != null && !getOwnedElement().isEmpty();
    	case org.obeonetwork.dsl.bpmn2.bpmdi.BpmnDiPackage.BPMN_PLANE__MODEL_ELEMENT:
    		return getModelElement() != null;
    	case org.obeonetwork.dsl.bpmn2.bpmdi.BpmnDiPackage.BPMN_PLANE__STYLE:
    		return getStyle() != null;
    	case org.obeonetwork.dsl.bpmn2.bpmdi.BpmnDiPackage.BPMN_PLANE__PLANE_ELEMENT:
    		return getPlaneElement() != null && !getPlaneElement().isEmpty();
    	case org.obeonetwork.dsl.bpmn2.bpmdi.BpmnDiPackage.BPMN_PLANE__BPMN_ELEMENT:
    		return getBpmnElement() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.obeonetwork.dsl.bpmn2.bpmdi.BpmnDiPackage.BPMN_PLANE__PLANE_ELEMENT:
    		getPlaneElement().clear();
    		getPlaneElement().addAll((Collection) newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.bpmdi.BpmnDiPackage.BPMN_PLANE__BPMN_ELEMENT:
    		setBpmnElement(
    		(org.obeonetwork.dsl.bpmn2.BaseElement)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
