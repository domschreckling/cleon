package cleon.uml.spec.structural.components.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class ComponentCompositionVersionedDependency extends DynamicResource implements IComponentCompositionVersionedDependency {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IComponentCompositionVersionedDependency> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IComponentCompositionVersionedDependency>() {
    
    @Override
    public IComponentCompositionVersionedDependency create() {
      return new ComponentCompositionVersionedDependency();
    }
    
    @Override
    public IComponentCompositionVersionedDependency create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new ComponentCompositionVersionedDependency(resourceRepository, resource);
    }
  
  };

  public ComponentCompositionVersionedDependency() {
    super(IComponentCompositionVersionedDependency.TYPE_ID);
  }
  
  public ComponentCompositionVersionedDependency(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IComponentCompositionVersionedDependency.TYPE_ID);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.uml.spec.structural.components.javamodel.IComponentComposition> selectTo() {
    return _getList(cleon.uml.spec.structural.components.javamodel.IComponentComposition.class, cleon.uml.spec.structural.components.ComponentsPackage.ComponentCompositionDependency_to);
  }

  public ComponentCompositionVersionedDependency setTo(java.util.List<? extends cleon.uml.spec.structural.components.javamodel.IComponentComposition> to) {
    _setList(cleon.uml.spec.structural.components.ComponentsPackage.ComponentCompositionDependency_to, to);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public ComponentCompositionVersionedDependency setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  @Override
  public cleon.resources.spec.versions.javamodel.ISemanticVersion selectVersion() {
    return _getSingle(cleon.resources.spec.versions.javamodel.ISemanticVersion.class, cleon.resources.spec.versions.VersionsPackage.WithVersion_version);
  }

  public ComponentCompositionVersionedDependency setVersion(cleon.resources.spec.versions.javamodel.ISemanticVersion version) {
    _setSingle(cleon.resources.spec.versions.VersionsPackage.WithVersion_version, version);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptList(cleon.uml.spec.structural.components.javamodel.IComponentComposition.class, cleon.uml.spec.structural.components.ComponentsPackage.ComponentCompositionDependency_to, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
    _acceptSingle(cleon.resources.spec.versions.javamodel.ISemanticVersion.class, cleon.resources.spec.versions.VersionsPackage.WithVersion_version, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,966d2038-d40f-11e5-8556-8f55ceb91287,O5O5qsEx1o6Oqu0RGrMA0JQF/2Q=] */
