package cleon.doc.spec.paragraph.remarks.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Important extends DynamicResource implements IImportant {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IImportant> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IImportant>() {
    
    @Override
    public IImportant create() {
      return new Important();
    }
    
    @Override
    public IImportant create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Important(resourceRepository, resource);
    }
  
  };

  public Important() {
    super(IImportant.TYPE_ID);
  }
  
  public Important(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IImportant.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectRemark() {
    return _getSingleAttribute(java.lang.String.class, cleon.doc.spec.paragraph.remarks.RemarksPackage.Remark_remark);
  }
    
  public void setRemark(java.lang.String remark) {
     _setSingleAttribute(cleon.doc.spec.paragraph.remarks.RemarksPackage.Remark_remark, remark);
  }

  // relations
  
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Important setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, cleon.doc.spec.paragraph.remarks.RemarksPackage.Remark_remark, visitor);
    // relations
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,a88de814-466d-11e5-ba74-cb2e95044e1c,g7OdQZdrmyWCdyTQrS2LDManXXQ=] */
