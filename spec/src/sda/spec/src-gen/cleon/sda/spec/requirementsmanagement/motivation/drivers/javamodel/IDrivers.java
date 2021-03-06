package cleon.sda.spec.requirementsmanagement.motivation.drivers.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IDrivers extends cleon.doc.spec.document.javamodel.ISubDocument, cleon.doc.spec.document.javamodel.INoSubDocuments, cleon.doc.spec.chapter.javamodel.INoChapters, cleon.sda.spec.requirementsmanagement.javamodel.IRequirementDocument {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("e54f10bf-a950-11e5-bda2-a7fc3bd7c783");
  
  // relations
  
  public java.util.List<? extends cleon.sda.spec.requirementsmanagement.motivation.drivers.javamodel.IDriver> selectDrivers();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,e54f10bf-a950-11e5-bda2-a7fc3bd7c783,QSE0qAO7+16oGgMMogn9yoBqWI8=] */
