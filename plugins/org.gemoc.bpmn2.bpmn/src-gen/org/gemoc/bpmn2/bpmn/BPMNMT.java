package org.gemoc.bpmn2.bpmn;

import fr.inria.diverse.melange.lib.IModelType;
import java.io.IOException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.obeonetwork.dsl.bpmn2.Bpmn2Factory;
import org.obeonetwork.dsl.bpmn2.bpmdi.BpmnDiFactory;
import org.obeonetwork.dsl.dd.dc.DcFactory;
import org.obeonetwork.dsl.dd.di.DiFactory;

@SuppressWarnings("all")
public interface BPMNMT extends IModelType {
  public EList<EObject> getContents();
  
  public Bpmn2Factory getBpmn2Factory();
  
  public BpmnDiFactory getBpmnDiFactory();
  
  public DiFactory getDiFactory();
  
  public DcFactory getDcFactory();
  
  public void save(final String uri) throws IOException;
}
