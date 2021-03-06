package cleon.website.spec.static_content.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Image extends DynamicResource implements IImage {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IImage> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IImage>() {
    
    @Override
    public IImage create() {
      return new Image();
    }
    
    @Override
    public IImage create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Image(resourceRepository, resource);
    }
  
  };

  public Image() {
    super(IImage.TYPE_ID);
  }
  
  public Image(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IImage.TYPE_ID);
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
  public cleon.website.spec.static_content.javamodel.IImageType selectType() {
    return _getSingle(cleon.website.spec.static_content.javamodel.IImageType.class, cleon.website.spec.static_content.Static_contentPackage.Image_type);
  }

  public Image setType(cleon.website.spec.static_content.javamodel.IImageType type) {
    _setSingle(cleon.website.spec.static_content.Static_contentPackage.Image_type, type);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Image setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptSingle(cleon.website.spec.static_content.javamodel.IImageType.class, cleon.website.spec.static_content.Static_contentPackage.Image_type, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.website.spec.static_content.javamodel.IImage> selectToMeType(cleon.website.spec.static_content.javamodel.IImageType object) {
    return _getToMeList(object.getRepository(), cleon.website.spec.static_content.javamodel.IImage.class, cleon.website.spec.static_content.Static_contentPackage.Image_type, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,c844cab0-afde-11e5-a548-13e054f2d74f,EmzstQxS2OGQR//IXFrb1C1RpI0=] */
