package cleon.sda.spec.requirementsmanagement.requirements.group.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class ComponentLevelGroup extends DynamicResource implements IComponentLevelGroup {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IComponentLevelGroup> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IComponentLevelGroup>() {
    
    @Override
    public IComponentLevelGroup create() {
      return new ComponentLevelGroup();
    }
    
    @Override
    public IComponentLevelGroup create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new ComponentLevelGroup(resourceRepository, resource);
    }
  
  };

  public ComponentLevelGroup() {
    super(IComponentLevelGroup.TYPE_ID);
  }
  
  public ComponentLevelGroup(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IComponentLevelGroup.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
  }

  // relations
  
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public ComponentLevelGroup setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,188cbcd3-a95c-11e5-bda2-a7fc3bd7c783,Ker2zU/aI1Pe1ZyBF1cvkcyxgAI=] */
