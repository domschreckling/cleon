package cleon.sda.spec.projectmanagement.planning.sprintplanning.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ISprintPlannings extends cleon.doc.spec.chapter.javamodel.IChapter {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("b643c029-c009-11e5-a165-d34765931e10");
  
  // relations
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.sda.spec.projectmanagement.planning.sprintplanning.javamodel.ISprintPlanning> selectSprintplannings();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,b643c029-c009-11e5-a165-d34765931e10,klraBmYLepcDQb2dvNRUL93UPdM=] */
