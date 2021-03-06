package cleon.sda.spec.projectmanagement.protocols.protocolsitems.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Information extends DynamicResource implements IInformation {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IInformation> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IInformation>() {
    
    @Override
    public IInformation create() {
      return new Information();
    }
    
    @Override
    public IInformation create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Information(resourceRepository, resource);
    }
  
  };

  public Information() {
    super(IInformation.TYPE_ID);
  }
  
  public Information(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IInformation.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, cleon.sda.spec.projectmanagement.protocols.ProtocolsPackage.ProtocolItem_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(cleon.sda.spec.projectmanagement.protocols.ProtocolsPackage.ProtocolItem_name, name);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.sda.spec.projectmanagement.resourcemanagement.persons.javamodel.IPerson> selectResponsibles() {
    return _getList(cleon.sda.spec.projectmanagement.resourcemanagement.persons.javamodel.IPerson.class, cleon.sda.spec.projectmanagement.protocols.ProtocolsPackage.ProtocolItem_responsibles);
  }

  public Information setResponsibles(java.util.List<? extends cleon.sda.spec.projectmanagement.resourcemanagement.persons.javamodel.IPerson> responsibles) {
    _setList(cleon.sda.spec.projectmanagement.protocols.ProtocolsPackage.ProtocolItem_responsibles, responsibles);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Information setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, cleon.sda.spec.projectmanagement.protocols.ProtocolsPackage.ProtocolItem_name, visitor);
    // relations
    _acceptList(cleon.sda.spec.projectmanagement.resourcemanagement.persons.javamodel.IPerson.class, cleon.sda.spec.projectmanagement.protocols.ProtocolsPackage.ProtocolItem_responsibles, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,53d1f9cb-b463-11e5-a3f4-497fd75158dc,OjqyEskKVh96T57YGk84Viw6wsY=] */
