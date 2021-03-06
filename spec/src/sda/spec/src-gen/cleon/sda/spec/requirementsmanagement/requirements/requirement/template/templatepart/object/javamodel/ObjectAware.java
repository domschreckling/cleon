package cleon.sda.spec.requirementsmanagement.requirements.requirement.template.templatepart.object.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class ObjectAware extends DynamicResource implements IObjectAware {

  // abstract implementation, only used for static method calls
  private ObjectAware() {
    super(IObjectAware.TYPE_ID);
  }
  
  // toMeRelations
  
  public static java.util.List<cleon.sda.spec.requirementsmanagement.requirements.requirement.template.templatepart.object.javamodel.IObjectAware> selectToMeObject(cleon.sda.spec.requirementsmanagement.requirements.requirement.template.templatepart.object.javamodel.IObject object) {
    return _getToMeList(object.getRepository(), cleon.sda.spec.requirementsmanagement.requirements.requirement.template.templatepart.object.javamodel.IObjectAware.class, cleon.sda.spec.requirementsmanagement.requirements.requirement.template.templatepart.object.ObjectPackage.ObjectAware_object, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,7fb40f58-debd-11e5-bf7d-117d548070bb,L07HiQho8PmmqbDkF5LhuFW4+pI=] */
