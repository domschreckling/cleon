package cleon.sda.spec.requirementsmanagement.requirements.requirement.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IRequirement extends cleon.doc.spec.javamodel.ISimpleDescription, cleon.sda.spec.requirementsmanagement.javamodel.INotes, cleon.doc.spec.document.javamodel.INamedSubDocument {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("54365cab-ff9b-11e4-ac0a-959b440f987f");
  
  // relations
  
  public cleon.sda.spec.requirementsmanagement.requirements.requirement.javamodel.IState selectState();
  
  public java.util.List<? extends cleon.sda.spec.requirementsmanagement.requirements.requirement.javamodel.IRequirement> selectConcretizes();
  
  public java.util.List<? extends cleon.sda.spec.requirementsmanagement.requirements.requirement.javamodel.IRequirement> selectAggregates();
  
  public java.util.List<? extends cleon.sda.spec.requirementsmanagement.motivation.sources.javamodel.ISource> selectOriginatesFrom();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,54365cab-ff9b-11e4-ac0a-959b440f987f,uX0cWvRs3zEZ6Q4OZQnmmAt0s7s=] */
