package cleon.testing.spec.levels.unitests.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class TestClass extends DynamicResource implements ITestClass {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITestClass> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITestClass>() {
    
    @Override
    public ITestClass create() {
      return new TestClass();
    }
    
    @Override
    public ITestClass create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new TestClass(resourceRepository, resource);
    }
  
  };

  public TestClass() {
    super(ITestClass.TYPE_ID);
  }
  
  public TestClass(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ITestClass.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectComment() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment);
  }
    
  public void setComment(java.lang.String comment) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.Commentable_comment, comment);
  }

  @Override
  public java.util.List<java.lang.String> selectDescriptions() {
    return _getListAttribute(java.lang.String.class, cleon.doc.spec.SpecPackage.SimpleDescription_descriptions);
  }
    
  public void setDescriptions(java.util.List<java.lang.String> descriptions) {
     _setListAttribute(cleon.doc.spec.SpecPackage.SimpleDescription_descriptions, descriptions);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.doc.spec.chapter.javamodel.IChapterOwnDocumentElementComposite> selectChapters() {
    return _getList(cleon.doc.spec.chapter.javamodel.IChapterOwnDocumentElementComposite.class, cleon.doc.spec.chapter.ChapterPackage.ChapterOwnDocumentElementComposite_chapters);
  }

  public TestClass setChapters(java.util.List<? extends cleon.doc.spec.chapter.javamodel.IChapterOwnDocumentElementComposite> chapters) {
    _setList(cleon.doc.spec.chapter.ChapterPackage.ChapterOwnDocumentElementComposite_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.arc42.spec._05_buildingblockview.javamodel.IDecomposite> selectDecompose() {
    return _getList(cleon.arc42.spec._05_buildingblockview.javamodel.IDecomposite.class, cleon.arc42.spec._05_buildingblockview._05_buildingblockviewPackage.DecompositionBuildingBlock_decompose);
  }

  public TestClass setDecompose(java.util.List<? extends cleon.arc42.spec._05_buildingblockview.javamodel.IDecomposite> decompose) {
    _setList(cleon.arc42.spec._05_buildingblockview._05_buildingblockviewPackage.DecompositionBuildingBlock_decompose, decompose);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.uml.spec.structural.classes.method.javamodel.IMethod> selectMethods() {
    return _getList(cleon.uml.spec.structural.classes.method.javamodel.IMethod.class, cleon.uml.spec.structural.classes.method.MethodPackage.MethodClass_methods);
  }

  public TestClass setMethods(java.util.List<? extends cleon.uml.spec.structural.classes.method.javamodel.IMethod> methods) {
    _setList(cleon.uml.spec.structural.classes.method.MethodPackage.MethodClass_methods, methods);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.javamodel.IDocumentElement> selectOwnDocumentElements() {
    return _getList(cleon.doc.spec.javamodel.IDocumentElement.class, cleon.doc.spec.SpecPackage.OwnDocumentElementComposite_ownDocumentElements);
  }

  public TestClass setOwnDocumentElements(java.util.List<? extends cleon.doc.spec.javamodel.IDocumentElement> ownDocumentElements) {
    _setList(cleon.doc.spec.SpecPackage.OwnDocumentElementComposite_ownDocumentElements, ownDocumentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.paragraph.javamodel.IParagraph> selectParagraphes() {
    return _getList(cleon.doc.spec.paragraph.javamodel.IParagraph.class, cleon.doc.spec.paragraph.ParagraphPackage.ParagraphOwnDocumentElementComposite_paragraphes);
  }

  public TestClass setParagraphes(java.util.List<? extends cleon.doc.spec.paragraph.javamodel.IParagraph> paragraphes) {
    _setList(cleon.doc.spec.paragraph.ParagraphPackage.ParagraphOwnDocumentElementComposite_paragraphes, paragraphes);
    return this;
  }
    
  @Override
  public IMultiMapOrdered<ch.actifsource.core.Resource, ? extends cleon.testing.spec.levels.unitests.javamodel.ITestMethod> selectTestMethods() {
    return _getMultiMap(cleon.testing.spec.levels.unitests.javamodel.ITestMethod.class, cleon.testing.spec.levels.unitests.UnitestsPackage.TestClass_testMethods);
  }

  public TestClass setTestMethods(IMultiMapOrdered<ch.actifsource.core.Resource, ? extends cleon.testing.spec.levels.unitests.javamodel.ITestMethod> testMethods) {
    _setMultiMap(cleon.testing.spec.levels.unitests.UnitestsPackage.TestClass_testMethods, testMethods);
    return this;
  }
    
  @Override
  public IMultiMapOrdered<ch.actifsource.core.Resource, ? extends cleon.testing.spec.levels.unitests.javamodel.ITestProperty> selectTestProperties() {
    return _getMultiMap(cleon.testing.spec.levels.unitests.javamodel.ITestProperty.class, cleon.testing.spec.levels.unitests.UnitestsPackage.TestClass_testProperties);
  }

  public TestClass setTestProperties(IMultiMapOrdered<ch.actifsource.core.Resource, ? extends cleon.testing.spec.levels.unitests.javamodel.ITestProperty> testProperties) {
    _setMultiMap(cleon.testing.spec.levels.unitests.UnitestsPackage.TestClass_testProperties, testProperties);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public TestClass setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.doc.spec.SpecPackage.SimpleDescription_descriptions, visitor);
    // relations
    _acceptList(cleon.doc.spec.chapter.javamodel.IChapterOwnDocumentElementComposite.class, cleon.doc.spec.chapter.ChapterPackage.ChapterOwnDocumentElementComposite_chapters, visitor);
    _acceptList(cleon.arc42.spec._05_buildingblockview.javamodel.IDecomposite.class, cleon.arc42.spec._05_buildingblockview._05_buildingblockviewPackage.DecompositionBuildingBlock_decompose, visitor);
    _acceptList(cleon.uml.spec.structural.classes.method.javamodel.IMethod.class, cleon.uml.spec.structural.classes.method.MethodPackage.MethodClass_methods, visitor);
    _acceptList(cleon.doc.spec.javamodel.IDocumentElement.class, cleon.doc.spec.SpecPackage.OwnDocumentElementComposite_ownDocumentElements, visitor);
    _acceptList(cleon.doc.spec.paragraph.javamodel.IParagraph.class, cleon.doc.spec.paragraph.ParagraphPackage.ParagraphOwnDocumentElementComposite_paragraphes, visitor);
    _acceptMultiMap(cleon.testing.spec.levels.unitests.javamodel.ITestMethod.class, cleon.testing.spec.levels.unitests.UnitestsPackage.TestClass_testMethods, visitor);
    _acceptMultiMap(cleon.testing.spec.levels.unitests.javamodel.ITestProperty.class, cleon.testing.spec.levels.unitests.UnitestsPackage.TestClass_testProperties, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.testing.spec.levels.unitests.javamodel.ITestClass selectToMeTestMethods(cleon.testing.spec.levels.unitests.javamodel.ITestMethod object) {
    return _getToMeSingle(object.getRepository(), cleon.testing.spec.levels.unitests.javamodel.ITestClass.class, cleon.testing.spec.levels.unitests.UnitestsPackage.TestClass_testMethods, object.getResource());
  }
  
  public static cleon.testing.spec.levels.unitests.javamodel.ITestClass selectToMeTestProperties(cleon.testing.spec.levels.unitests.javamodel.ITestProperty object) {
    return _getToMeSingle(object.getRepository(), cleon.testing.spec.levels.unitests.javamodel.ITestClass.class, cleon.testing.spec.levels.unitests.UnitestsPackage.TestClass_testProperties, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,c17728d0-df47-11e2-b229-cd1bd4a07953,s4pnMOD2iQQ4Vg62EJjY6JfJn4s=] */
