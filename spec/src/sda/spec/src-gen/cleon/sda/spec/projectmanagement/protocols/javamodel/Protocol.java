package cleon.sda.spec.projectmanagement.protocols.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Protocol extends DynamicResource implements IProtocol {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IProtocol> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IProtocol>() {
    
    @Override
    public IProtocol create() {
      return new Protocol();
    }
    
    @Override
    public IProtocol create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Protocol(resourceRepository, resource);
    }
  
  };

  public Protocol() {
    super(IProtocol.TYPE_ID);
  }
  
  public Protocol(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IProtocol.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectEndtime() {
    return _getSingleAttribute(java.lang.String.class, cleon.sda.spec.projectmanagement.protocols.ProtocolsPackage.Protocol_endtime);
  }
    
  public void setEndtime(java.lang.String endtime) {
     _setSingleAttribute(cleon.sda.spec.projectmanagement.protocols.ProtocolsPackage.Protocol_endtime, endtime);
  }

  @Override
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
  }

  @Override
  public java.lang.String selectStarttime() {
    return _getSingleAttribute(java.lang.String.class, cleon.sda.spec.projectmanagement.protocols.ProtocolsPackage.Protocol_starttime);
  }
    
  public void setStarttime(java.lang.String starttime) {
     _setSingleAttribute(cleon.sda.spec.projectmanagement.protocols.ProtocolsPackage.Protocol_starttime, starttime);
  }

  @Override
  public java.lang.Boolean selectWithToC() {
    return _getSingleAttribute(java.lang.Boolean.class, cleon.doc.spec.document.DocumentPackage.Document_withToC);
  }
    
  public void setWithToC(java.lang.Boolean withToC) {
     _setSingleAttribute(cleon.doc.spec.document.DocumentPackage.Document_withToC, withToC);
  }

  // relations
  
  @Override
  public cleon.sda.spec.projectmanagement.protocols.javamodel.IAgenda selectAgenda() {
    return _getSingle(cleon.sda.spec.projectmanagement.protocols.javamodel.IAgenda.class, cleon.sda.spec.projectmanagement.protocols.ProtocolsPackage.Protocol_agenda);
  }

  public Protocol setAgenda(cleon.sda.spec.projectmanagement.protocols.javamodel.IAgenda agenda) {
    _setSingle(cleon.sda.spec.projectmanagement.protocols.ProtocolsPackage.Protocol_agenda, agenda);
    return this;
  }
    
  @Override
  public cleon.doc.spec.autor.javamodel.IAutor selectAutor() {
    return _getSingle(cleon.doc.spec.autor.javamodel.IAutor.class, cleon.sda.spec.projectmanagement.protocols.ProtocolsPackage.Protocol_autor);
  }

  public Protocol setAutor(cleon.doc.spec.autor.javamodel.IAutor autor) {
    _setSingle(cleon.sda.spec.projectmanagement.protocols.ProtocolsPackage.Protocol_autor, autor);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.autor.javamodel.IAutor> selectAutors() {
    return _getList(cleon.doc.spec.autor.javamodel.IAutor.class, cleon.doc.spec.autor.AutorPackage.Autors_autors);
  }

  public Protocol setAutors(java.util.List<? extends cleon.doc.spec.autor.javamodel.IAutor> autors) {
    _setList(cleon.doc.spec.autor.AutorPackage.Autors_autors, autors);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.chapter.javamodel.IChapterOwnDocumentElementComposite> selectChapters() {
    return _getList(cleon.doc.spec.chapter.javamodel.IChapterOwnDocumentElementComposite.class, cleon.doc.spec.chapter.ChapterPackage.ChapterOwnDocumentElementComposite_chapters);
  }

  public Protocol setChapters(java.util.List<? extends cleon.doc.spec.chapter.javamodel.IChapterOwnDocumentElementComposite> chapters) {
    _setList(cleon.doc.spec.chapter.ChapterPackage.ChapterOwnDocumentElementComposite_chapters, chapters);
    return this;
  }
    
  @Override
  public cleon.sda.spec.projectmanagement.planning.calendar.javamodel.IDay selectDate() {
    return _getSingle(cleon.sda.spec.projectmanagement.planning.calendar.javamodel.IDay.class, cleon.sda.spec.projectmanagement.protocols.ProtocolsPackage.Protocol_date);
  }

  public Protocol setDate(cleon.sda.spec.projectmanagement.planning.calendar.javamodel.IDay date) {
    _setSingle(cleon.sda.spec.projectmanagement.protocols.ProtocolsPackage.Protocol_date, date);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.document.javamodel.ISubDocument> selectDocuments() {
    return _getList(cleon.doc.spec.document.javamodel.ISubDocument.class, cleon.doc.spec.document.DocumentPackage.AbstractDocument_documents);
  }

  public Protocol setDocuments(java.util.List<? extends cleon.doc.spec.document.javamodel.ISubDocument> documents) {
    _setList(cleon.doc.spec.document.DocumentPackage.AbstractDocument_documents, documents);
    return this;
  }
    
  @Override
  public cleon.sda.spec.projectmanagement.resourcemanagement.locations.javamodel.ILocation selectLocation() {
    return _getSingle(cleon.sda.spec.projectmanagement.resourcemanagement.locations.javamodel.ILocation.class, cleon.sda.spec.projectmanagement.protocols.ProtocolsPackage.Protocol_location);
  }

  public Protocol setLocation(cleon.sda.spec.projectmanagement.resourcemanagement.locations.javamodel.ILocation location) {
    _setSingle(cleon.sda.spec.projectmanagement.protocols.ProtocolsPackage.Protocol_location, location);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.sda.spec.projectmanagement.resourcemanagement.persons.javamodel.IPerson> selectMembers() {
    return _getList(cleon.sda.spec.projectmanagement.resourcemanagement.persons.javamodel.IPerson.class, cleon.sda.spec.projectmanagement.protocols.ProtocolsPackage.Protocol_members);
  }

  public Protocol setMembers(java.util.List<? extends cleon.sda.spec.projectmanagement.resourcemanagement.persons.javamodel.IPerson> members) {
    _setList(cleon.sda.spec.projectmanagement.protocols.ProtocolsPackage.Protocol_members, members);
    return this;
  }
    
  @Override
  public cleon.doc.spec.autor.javamodel.IAutor selectModerator() {
    return _getSingle(cleon.doc.spec.autor.javamodel.IAutor.class, cleon.sda.spec.projectmanagement.protocols.ProtocolsPackage.Protocol_moderator);
  }

  public Protocol setModerator(cleon.doc.spec.autor.javamodel.IAutor moderator) {
    _setSingle(cleon.sda.spec.projectmanagement.protocols.ProtocolsPackage.Protocol_moderator, moderator);
    return this;
  }
    
  @Override
  public cleon.doc.spec.document.javamodel.ISubDocument selectNoDocuments() {
    return _getSingle(cleon.doc.spec.document.javamodel.ISubDocument.class, cleon.doc.spec.document.DocumentPackage.NoSubDocuments_noDocuments);
  }

  public Protocol setNoDocuments(cleon.doc.spec.document.javamodel.ISubDocument noDocuments) {
    _setSingle(cleon.doc.spec.document.DocumentPackage.NoSubDocuments_noDocuments, noDocuments);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.javamodel.IDocumentElement> selectOwnDocumentElements() {
    return _getList(cleon.doc.spec.javamodel.IDocumentElement.class, cleon.doc.spec.SpecPackage.OwnDocumentElementComposite_ownDocumentElements);
  }

  public Protocol setOwnDocumentElements(java.util.List<? extends cleon.doc.spec.javamodel.IDocumentElement> ownDocumentElements) {
    _setList(cleon.doc.spec.SpecPackage.OwnDocumentElementComposite_ownDocumentElements, ownDocumentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.paragraph.javamodel.IParagraph> selectParagraphes() {
    return _getList(cleon.doc.spec.paragraph.javamodel.IParagraph.class, cleon.doc.spec.paragraph.ParagraphPackage.ParagraphOwnDocumentElementComposite_paragraphes);
  }

  public Protocol setParagraphes(java.util.List<? extends cleon.doc.spec.paragraph.javamodel.IParagraph> paragraphes) {
    _setList(cleon.doc.spec.paragraph.ParagraphPackage.ParagraphOwnDocumentElementComposite_paragraphes, paragraphes);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.sda.spec.projectmanagement.protocols.javamodel.IProtocolItems> selectProtocol() {
    return _getMap(cleon.sda.spec.projectmanagement.protocols.javamodel.IProtocolItems.class, cleon.sda.spec.projectmanagement.protocols.ProtocolsPackage.Protocol_protocol);
  }

  public Protocol setProtocol(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.sda.spec.projectmanagement.protocols.javamodel.IProtocolItems> protocol) {
    _setMap(cleon.sda.spec.projectmanagement.protocols.ProtocolsPackage.Protocol_protocol, protocol);
    return this;
  }
    
  @Override
  public cleon.doc.spec.document.style.javamodel.IStyle selectStyle() {
    return _getSingle(cleon.doc.spec.document.style.javamodel.IStyle.class, cleon.doc.spec.document.DocumentPackage.Document_style);
  }

  public Protocol setStyle(cleon.doc.spec.document.style.javamodel.IStyle style) {
    _setSingle(cleon.doc.spec.document.DocumentPackage.Document_style, style);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Protocol setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.javamodel.IDocumentElement> selectUseDocumentElements() {
    return _getList(cleon.doc.spec.javamodel.IDocumentElement.class, cleon.doc.spec.SpecPackage.UseDocumentElementComposite_useDocumentElements);
  }

  public Protocol setUseDocumentElements(java.util.List<? extends cleon.doc.spec.javamodel.IDocumentElement> useDocumentElements) {
    _setList(cleon.doc.spec.SpecPackage.UseDocumentElementComposite_useDocumentElements, useDocumentElements);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, cleon.sda.spec.projectmanagement.protocols.ProtocolsPackage.Protocol_endtime, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.sda.spec.projectmanagement.protocols.ProtocolsPackage.Protocol_starttime, visitor);
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.doc.spec.document.DocumentPackage.Document_withToC, visitor);
    // relations
    _acceptSingle(cleon.sda.spec.projectmanagement.protocols.javamodel.IAgenda.class, cleon.sda.spec.projectmanagement.protocols.ProtocolsPackage.Protocol_agenda, visitor);
    _acceptSingle(cleon.doc.spec.autor.javamodel.IAutor.class, cleon.sda.spec.projectmanagement.protocols.ProtocolsPackage.Protocol_autor, visitor);
    _acceptList(cleon.doc.spec.autor.javamodel.IAutor.class, cleon.doc.spec.autor.AutorPackage.Autors_autors, visitor);
    _acceptList(cleon.doc.spec.chapter.javamodel.IChapterOwnDocumentElementComposite.class, cleon.doc.spec.chapter.ChapterPackage.ChapterOwnDocumentElementComposite_chapters, visitor);
    _acceptSingle(cleon.sda.spec.projectmanagement.planning.calendar.javamodel.IDay.class, cleon.sda.spec.projectmanagement.protocols.ProtocolsPackage.Protocol_date, visitor);
    _acceptList(cleon.doc.spec.document.javamodel.ISubDocument.class, cleon.doc.spec.document.DocumentPackage.AbstractDocument_documents, visitor);
    _acceptSingle(cleon.sda.spec.projectmanagement.resourcemanagement.locations.javamodel.ILocation.class, cleon.sda.spec.projectmanagement.protocols.ProtocolsPackage.Protocol_location, visitor);
    _acceptList(cleon.sda.spec.projectmanagement.resourcemanagement.persons.javamodel.IPerson.class, cleon.sda.spec.projectmanagement.protocols.ProtocolsPackage.Protocol_members, visitor);
    _acceptSingle(cleon.doc.spec.autor.javamodel.IAutor.class, cleon.sda.spec.projectmanagement.protocols.ProtocolsPackage.Protocol_moderator, visitor);
    _acceptSingle(cleon.doc.spec.document.javamodel.ISubDocument.class, cleon.doc.spec.document.DocumentPackage.NoSubDocuments_noDocuments, visitor);
    _acceptList(cleon.doc.spec.javamodel.IDocumentElement.class, cleon.doc.spec.SpecPackage.OwnDocumentElementComposite_ownDocumentElements, visitor);
    _acceptList(cleon.doc.spec.paragraph.javamodel.IParagraph.class, cleon.doc.spec.paragraph.ParagraphPackage.ParagraphOwnDocumentElementComposite_paragraphes, visitor);
    _acceptMap(cleon.sda.spec.projectmanagement.protocols.javamodel.IProtocolItems.class, cleon.sda.spec.projectmanagement.protocols.ProtocolsPackage.Protocol_protocol, visitor);
    _acceptSingle(cleon.doc.spec.document.style.javamodel.IStyle.class, cleon.doc.spec.document.DocumentPackage.Document_style, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
    _acceptList(cleon.doc.spec.javamodel.IDocumentElement.class, cleon.doc.spec.SpecPackage.UseDocumentElementComposite_useDocumentElements, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.sda.spec.projectmanagement.protocols.javamodel.IProtocol> selectToMeDate(cleon.sda.spec.projectmanagement.planning.calendar.javamodel.IDay object) {
    return _getToMeList(object.getRepository(), cleon.sda.spec.projectmanagement.protocols.javamodel.IProtocol.class, cleon.sda.spec.projectmanagement.protocols.ProtocolsPackage.Protocol_date, object.getResource());
  }
  
  public static java.util.List<cleon.sda.spec.projectmanagement.protocols.javamodel.IProtocol> selectToMeMembers(cleon.sda.spec.projectmanagement.resourcemanagement.persons.javamodel.IPerson object) {
    return _getToMeList(object.getRepository(), cleon.sda.spec.projectmanagement.protocols.javamodel.IProtocol.class, cleon.sda.spec.projectmanagement.protocols.ProtocolsPackage.Protocol_members, object.getResource());
  }
  
  public static cleon.sda.spec.projectmanagement.protocols.javamodel.IProtocol selectToMeAgenda(cleon.sda.spec.projectmanagement.protocols.javamodel.IAgenda object) {
    return _getToMeSingle(object.getRepository(), cleon.sda.spec.projectmanagement.protocols.javamodel.IProtocol.class, cleon.sda.spec.projectmanagement.protocols.ProtocolsPackage.Protocol_agenda, object.getResource());
  }
  
  public static cleon.sda.spec.projectmanagement.protocols.javamodel.IProtocol selectToMeProtocol(cleon.sda.spec.projectmanagement.protocols.javamodel.IProtocolItems object) {
    return _getToMeSingle(object.getRepository(), cleon.sda.spec.projectmanagement.protocols.javamodel.IProtocol.class, cleon.sda.spec.projectmanagement.protocols.ProtocolsPackage.Protocol_protocol, object.getResource());
  }
  
  public static java.util.List<cleon.sda.spec.projectmanagement.protocols.javamodel.IProtocol> selectToMeAutor(cleon.doc.spec.autor.javamodel.IAutor object) {
    return _getToMeList(object.getRepository(), cleon.sda.spec.projectmanagement.protocols.javamodel.IProtocol.class, cleon.sda.spec.projectmanagement.protocols.ProtocolsPackage.Protocol_autor, object.getResource());
  }
  
  public static java.util.List<cleon.sda.spec.projectmanagement.protocols.javamodel.IProtocol> selectToMeModerator(cleon.doc.spec.autor.javamodel.IAutor object) {
    return _getToMeList(object.getRepository(), cleon.sda.spec.projectmanagement.protocols.javamodel.IProtocol.class, cleon.sda.spec.projectmanagement.protocols.ProtocolsPackage.Protocol_moderator, object.getResource());
  }
  
  public static java.util.List<cleon.sda.spec.projectmanagement.protocols.javamodel.IProtocol> selectToMeLocation(cleon.sda.spec.projectmanagement.resourcemanagement.locations.javamodel.ILocation object) {
    return _getToMeList(object.getRepository(), cleon.sda.spec.projectmanagement.protocols.javamodel.IProtocol.class, cleon.sda.spec.projectmanagement.protocols.ProtocolsPackage.Protocol_location, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,2140b619-b45f-11e5-b1fb-4fb16b224b5b,NmZutP4vqGih/+b2lBDjgoKIpj0=] */
