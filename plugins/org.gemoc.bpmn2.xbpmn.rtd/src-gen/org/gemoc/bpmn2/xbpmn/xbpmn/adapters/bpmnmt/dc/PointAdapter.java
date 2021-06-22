package org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.dc;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.BPMNMTAdaptersFactory;
import org.gemoc.bpmn2.xbpmn.xbpmn.dc.Point;

@SuppressWarnings("all")
public class PointAdapter extends EObjectAdapter<Point> implements org.obeonetwork.dsl.dd.dc.Point {
  private BPMNMTAdaptersFactory adaptersFactory;
  
  public PointAdapter() {
    super(org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.BPMNMTAdaptersFactory.getInstance());
    adaptersFactory = org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.BPMNMTAdaptersFactory.getInstance();
  }
  
  @Override
  public float getX() {
    return adaptee.getX();
  }
  
  @Override
  public void setX(final float o) {
    adaptee.setX(o);
  }
  
  @Override
  public float getY() {
    return adaptee.getY();
  }
  
  @Override
  public void setY(final float o) {
    adaptee.setY(o);
  }
  
  protected static final float X_EDEFAULT = 0.0F;
  
  protected static final float Y_EDEFAULT = 0.0F;
  
  @Override
  public EClass eClass() {
    return org.obeonetwork.dsl.dd.dc.DcPackage.eINSTANCE.getPoint();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.obeonetwork.dsl.dd.dc.DcPackage.POINT__X:
    		return new java.lang.Float(getX());
    	case org.obeonetwork.dsl.dd.dc.DcPackage.POINT__Y:
    		return new java.lang.Float(getY());
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.obeonetwork.dsl.dd.dc.DcPackage.POINT__X:
    		return getX() != X_EDEFAULT;
    	case org.obeonetwork.dsl.dd.dc.DcPackage.POINT__Y:
    		return getY() != Y_EDEFAULT;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.obeonetwork.dsl.dd.dc.DcPackage.POINT__X:
    		setX(((java.lang.Float) newValue).floatValue());
    		return;
    	case org.obeonetwork.dsl.dd.dc.DcPackage.POINT__Y:
    		setY(((java.lang.Float) newValue).floatValue());
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
