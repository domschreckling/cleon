package cleon.uml.spec.structural.classes.method.parameter.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ITemplateParameter extends cleon.uml.spec.structural.classes.method.parameter.javamodel.IParameter {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("d944e6c4-a3bb-11e3-8095-f11af53ab806");
  
  // relations
  
  public cleon.uml.spec.structural.classes.template.javamodel.ITemplateClass selectType();
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.uml.spec.structural.classes.template.javamodel.ITemplate> selectParam();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,d944e6c4-a3bb-11e3-8095-f11af53ab806,blhCcPqR1Jnm/3b630e3FZzz4zA=] */
