package cleon.sda.spec.requirementsmanagement.requirements.requirement.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class State extends DynamicResource implements IState {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IState> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IState>() {
    
    @Override
    public IState create() {
      return new State();
    }
    
    @Override
    public IState create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new State(resourceRepository, resource);
    }
  
  };

  public State() {
    super(IState.TYPE_ID);
  }
  
  public State(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IState.TYPE_ID);
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

  public State setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.doc.spec.SpecPackage.SimpleDescription_descriptions, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // accept enum value visitors

  @Override
  public <R> R accept(IValueVisitor<R> visitor) {
    if (isIdentified()) return visitor.visitIdentified();
    if (isAligned()) return visitor.visitAligned();
    if (isApproved__F___N_By__F_Supplier__O_()) return visitor.visitApproved__F___N_By__F_Supplier__O_();
    if (isApproved()) return visitor.visitApproved();
    if (isImplemented()) return visitor.visitImplemented();
    if (isFulfilled()) return visitor.visitFulfilled();
    if (isRejected__F___N_Out__S_Of__S_Scope__O_()) return visitor.visitRejected__F___N_Out__S_Of__S_Scope__O_();
    if (isRejected__F___N_Beistellung__O_()) return visitor.visitRejected__F___N_Beistellung__O_();
    if (isRejected__F___N_QS__O_()) return visitor.visitRejected__F___N_QS__O_();
    throw new IllegalStateException("unknown enumvalue: " + fResource);
  }
  
  @Override
  public void accept(IValueVoidVisitor visitor) {
    if (isIdentified()) {
      visitor.visitIdentified();
      return;
    }
    if (isAligned()) {
      visitor.visitAligned();
      return;
    }
    if (isApproved__F___N_By__F_Supplier__O_()) {
      visitor.visitApproved__F___N_By__F_Supplier__O_();
      return;
    }
    if (isApproved()) {
      visitor.visitApproved();
      return;
    }
    if (isImplemented()) {
      visitor.visitImplemented();
      return;
    }
    if (isFulfilled()) {
      visitor.visitFulfilled();
      return;
    }
    if (isRejected__F___N_Out__S_Of__S_Scope__O_()) {
      visitor.visitRejected__F___N_Out__S_Of__S_Scope__O_();
      return;
    }
    if (isRejected__F___N_Beistellung__O_()) {
      visitor.visitRejected__F___N_Beistellung__O_();
      return;
    }
    if (isRejected__F___N_QS__O_()) {
      visitor.visitRejected__F___N_QS__O_();
      return;
    }
    throw new IllegalStateException("unknown enumvalue: " + fResource);
  }
  
  // isValue-Methods
    
  @Override
  public boolean isIdentified() {
    return getResource().equals(cleon.sda.spec.requirementsmanagement.requirements.requirement.RequirementPackage.State_Identified);
  }
  
  @Override
  public boolean isAligned() {
    return getResource().equals(cleon.sda.spec.requirementsmanagement.requirements.requirement.RequirementPackage.State_Aligned);
  }
  
  @Override
  public boolean isApproved__F___N_By__F_Supplier__O_() {
    return getResource().equals(cleon.sda.spec.requirementsmanagement.requirements.requirement.RequirementPackage.State_Approved__F___N_By__F_Supplier__O_);
  }
  
  @Override
  public boolean isApproved() {
    return getResource().equals(cleon.sda.spec.requirementsmanagement.requirements.requirement.RequirementPackage.State_Approved);
  }
  
  @Override
  public boolean isImplemented() {
    return getResource().equals(cleon.sda.spec.requirementsmanagement.requirements.requirement.RequirementPackage.State_Implemented);
  }
  
  @Override
  public boolean isFulfilled() {
    return getResource().equals(cleon.sda.spec.requirementsmanagement.requirements.requirement.RequirementPackage.State_Fulfilled);
  }
  
  @Override
  public boolean isRejected__F___N_Out__S_Of__S_Scope__O_() {
    return getResource().equals(cleon.sda.spec.requirementsmanagement.requirements.requirement.RequirementPackage.State_Rejected__F___N_Out__S_Of__S_Scope__O_);
  }
  
  @Override
  public boolean isRejected__F___N_Beistellung__O_() {
    return getResource().equals(cleon.sda.spec.requirementsmanagement.requirements.requirement.RequirementPackage.State_Rejected__F___N_Beistellung__O_);
  }
  
  @Override
  public boolean isRejected__F___N_QS__O_() {
    return getResource().equals(cleon.sda.spec.requirementsmanagement.requirements.requirement.RequirementPackage.State_Rejected__F___N_QS__O_);
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,db79c858-294d-11e5-b035-b579d7e91534,TVHJjJrVK0AOHXBOqiD5yM7lujI=] */
