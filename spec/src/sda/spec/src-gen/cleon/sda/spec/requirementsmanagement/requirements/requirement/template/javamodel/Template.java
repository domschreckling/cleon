package cleon.sda.spec.requirementsmanagement.requirements.requirement.template.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Template extends DynamicResource implements ITemplate {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITemplate> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITemplate>() {
    
    @Override
    public ITemplate create() {
      return new Template();
    }
    
    @Override
    public ITemplate create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Template(resourceRepository, resource);
    }
  
  };

  public Template() {
    super(ITemplate.TYPE_ID);
  }
  
  public Template(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ITemplate.TYPE_ID);
  }

  // relations
  
  @Override
  public cleon.sda.spec.requirementsmanagement.requirements.requirement.template.templatepart.condition.javamodel.ICondition selectCondition() {
    return _getSingle(cleon.sda.spec.requirementsmanagement.requirements.requirement.template.templatepart.condition.javamodel.ICondition.class, cleon.sda.spec.requirementsmanagement.requirements.requirement.template.TemplatePackage.Template_condition);
  }

  public Template setCondition(cleon.sda.spec.requirementsmanagement.requirements.requirement.template.templatepart.condition.javamodel.ICondition condition) {
    _setSingle(cleon.sda.spec.requirementsmanagement.requirements.requirement.template.TemplatePackage.Template_condition, condition);
    return this;
  }
    
  @Override
  public cleon.sda.spec.requirementsmanagement.requirements.requirement.template.templatepart.importance.javamodel.IImportance selectImportance() {
    return _getSingle(cleon.sda.spec.requirementsmanagement.requirements.requirement.template.templatepart.importance.javamodel.IImportance.class, cleon.sda.spec.requirementsmanagement.requirements.requirement.template.templatepart.importance.ImportancePackage.ImportanceAware_importance);
  }

  public Template setImportance(cleon.sda.spec.requirementsmanagement.requirements.requirement.template.templatepart.importance.javamodel.IImportance importance) {
    _setSingle(cleon.sda.spec.requirementsmanagement.requirements.requirement.template.templatepart.importance.ImportancePackage.ImportanceAware_importance, importance);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Template setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptSingle(cleon.sda.spec.requirementsmanagement.requirements.requirement.template.templatepart.condition.javamodel.ICondition.class, cleon.sda.spec.requirementsmanagement.requirements.requirement.template.TemplatePackage.Template_condition, visitor);
    _acceptSingle(cleon.sda.spec.requirementsmanagement.requirements.requirement.template.templatepart.importance.javamodel.IImportance.class, cleon.sda.spec.requirementsmanagement.requirements.requirement.template.templatepart.importance.ImportancePackage.ImportanceAware_importance, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.sda.spec.requirementsmanagement.requirements.requirement.template.javamodel.ITemplate> selectToMeCondition(cleon.sda.spec.requirementsmanagement.requirements.requirement.template.templatepart.condition.javamodel.ICondition object) {
    return _getToMeList(object.getRepository(), cleon.sda.spec.requirementsmanagement.requirements.requirement.template.javamodel.ITemplate.class, cleon.sda.spec.requirementsmanagement.requirements.requirement.template.TemplatePackage.Template_condition, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,1b9992b4-d574-11e5-89ea-2d8d86e9ef89,0cGR4Cd/b4WjzbFqFZYwdqb29F0=] */
