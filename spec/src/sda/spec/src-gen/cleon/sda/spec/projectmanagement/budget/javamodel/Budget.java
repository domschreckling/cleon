package cleon.sda.spec.projectmanagement.budget.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Budget extends DynamicResource implements IBudget {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IBudget> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IBudget>() {
    
    @Override
    public IBudget create() {
      return new Budget();
    }
    
    @Override
    public IBudget create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Budget(resourceRepository, resource);
    }
  
  };

  public Budget() {
    super(IBudget.TYPE_ID);
  }
  
  public Budget(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IBudget.TYPE_ID);
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

  public Budget setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,0aa32df9-a7df-11e5-82dd-3b995d9c840c,wikTiMYNxV2jfnnSEN0eUIHdIHo=] */
