package org.gemoc.bpmn2.xbpmn;

import fr.inria.diverse.melange.lib.IModelType;
import java.io.IOException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

@SuppressWarnings("all")
public interface XBPMNMT extends IModelType {
  public EList<EObject> getContents();
  
  public org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Factory getBpmn2Factory();
  
  public org.gemoc.bpmn2.xbpmn.xbpmnmt.di.DiFactory getDiFactory();
  
  public org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmdi.BpmdiFactory getBpmdiFactory();
  
  public org.gemoc.bpmn2.xbpmn.xbpmnmt.dc.DcFactory getDcFactory();
  
  public void save(final String uri) throws IOException;
}
