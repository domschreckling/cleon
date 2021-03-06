package cleon.sda.spec.projectmanagement.planning.calendar.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Day extends DynamicResource implements IDay {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IDay> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IDay>() {
    
    @Override
    public IDay create() {
      return new Day();
    }
    
    @Override
    public IDay create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Day(resourceRepository, resource);
    }
  
  };

  public Day() {
    super(IDay.TYPE_ID);
  }
  
  public Day(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IDay.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.Integer selectIdentifier() {
    return _getSingleAttribute(java.lang.Integer.class, cleon.sda.spec.projectmanagement.planning.calendar.CalendarPackage.CalendarItem_identifier);
  }
    
  public void setIdentifier(java.lang.Integer identifier) {
     _setSingleAttribute(cleon.sda.spec.projectmanagement.planning.calendar.CalendarPackage.CalendarItem_identifier, identifier);
  }

  // relations
  
  @Override
  public cleon.sda.spec.projectmanagement.planning.calendar.javamodel.ICalendarItem selectNoMore() {
    return _getSingle(cleon.sda.spec.projectmanagement.planning.calendar.javamodel.ICalendarItem.class, cleon.sda.spec.projectmanagement.planning.calendar.CalendarPackage.Day_noMore);
  }

  public Day setNoMore(cleon.sda.spec.projectmanagement.planning.calendar.javamodel.ICalendarItem noMore) {
    _setSingle(cleon.sda.spec.projectmanagement.planning.calendar.CalendarPackage.Day_noMore, noMore);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.sda.spec.projectmanagement.planning.calendar.javamodel.ICalendarItem> selectSubCalendarItems() {
    return _getList(cleon.sda.spec.projectmanagement.planning.calendar.javamodel.ICalendarItem.class, cleon.sda.spec.projectmanagement.planning.calendar.CalendarPackage.CalendarItem_subCalendarItems);
  }

  public Day setSubCalendarItems(java.util.List<? extends cleon.sda.spec.projectmanagement.planning.calendar.javamodel.ICalendarItem> subCalendarItems) {
    _setList(cleon.sda.spec.projectmanagement.planning.calendar.CalendarPackage.CalendarItem_subCalendarItems, subCalendarItems);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Day setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.Integer.class, cleon.sda.spec.projectmanagement.planning.calendar.CalendarPackage.CalendarItem_identifier, visitor);
    // relations
    _acceptSingle(cleon.sda.spec.projectmanagement.planning.calendar.javamodel.ICalendarItem.class, cleon.sda.spec.projectmanagement.planning.calendar.CalendarPackage.Day_noMore, visitor);
    _acceptList(cleon.sda.spec.projectmanagement.planning.calendar.javamodel.ICalendarItem.class, cleon.sda.spec.projectmanagement.planning.calendar.CalendarPackage.CalendarItem_subCalendarItems, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.sda.spec.projectmanagement.planning.calendar.javamodel.IDay selectToMeNoMore(cleon.sda.spec.projectmanagement.planning.calendar.javamodel.ICalendarItem object) {
    return _getToMeSingle(object.getRepository(), cleon.sda.spec.projectmanagement.planning.calendar.javamodel.IDay.class, cleon.sda.spec.projectmanagement.planning.calendar.CalendarPackage.Day_noMore, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,5b27bd7f-c37c-11e5-9455-d97b1b986284,cxN/vBIf3wlTAfJIegLu8o30YZ4=] */
