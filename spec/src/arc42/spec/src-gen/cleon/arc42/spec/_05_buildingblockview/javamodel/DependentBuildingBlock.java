package cleon.arc42.spec._05_buildingblockview.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class DependentBuildingBlock extends DynamicResource implements IDependentBuildingBlock {

  // abstract implementation, only used for static method calls
  private DependentBuildingBlock() {
    super(IDependentBuildingBlock.TYPE_ID);
  }
  
  // toMeRelations
  
  public static cleon.arc42.spec._05_buildingblockview.javamodel.IDependentBuildingBlock selectToMeHasDependency(cleon.arc42.spec._05_buildingblockview.javamodel.IDependency object) {
    return _getToMeSingle(object.getRepository(), cleon.arc42.spec._05_buildingblockview.javamodel.IDependentBuildingBlock.class, cleon.arc42.spec._05_buildingblockview._05_buildingblockviewPackage.DependentBuildingBlock_hasDependency, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,2fc8dc46-ffba-11e4-ac0a-959b440f987f,CqQn3GmUESf3BlkA9FBuik0TLwo=] */
