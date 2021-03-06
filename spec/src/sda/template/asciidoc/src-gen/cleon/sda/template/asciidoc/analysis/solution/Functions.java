package cleon.sda.template.asciidoc.analysis.solution;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[de8668e7-3c32-11e5-9962-cf3035adb922,imports]] */

/* End Protected Region   [[de8668e7-3c32-11e5-9962-cf3035adb922,imports]] */

public class Functions {

  /* Begin Protected Region [[de8668e7-3c32-11e5-9962-cf3035adb922]] */
  
  /* End Protected Region   [[de8668e7-3c32-11e5-9962-cf3035adb922]] */


  public static interface IGoalsFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("bccc26cd-3cf8-11e5-871f-6beac6a7c24b")
    public java.lang.String RenderChapterContent();

  }
  
  public static interface IGoalsFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class GoalsFunctionsImpl implements IGoalsFunctionsImpl {

    public static final IGoalsFunctionsImpl INSTANCE = new GoalsFunctionsImpl();

    private GoalsFunctionsImpl() {}

  }
  
  public static class GoalsFunctions {

    private GoalsFunctions() {}

  }

  public static interface ISolutionsEvaluationFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("4925332e-3d0a-11e5-871f-6beac6a7c24b")
    public java.lang.Integer CalculateScore();

    @IDynamicResourceExtension.MethodId("839e0d4a-3c33-11e5-9962-cf3035adb922")
    public java.lang.String RenderChapterContent();

  }
  
  public static interface ISolutionsEvaluationFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("4925332e-3d0a-11e5-871f-6beac6a7c24b")
    public java.lang.Integer CalculateScore(final cleon.sda.spec.analysis.solution.evaluation.javamodel.ISolutionsEvaluation solutionsEvaluation);

  }
  
  public static class SolutionsEvaluationFunctionsImpl implements ISolutionsEvaluationFunctionsImpl {

    public static final ISolutionsEvaluationFunctionsImpl INSTANCE = new SolutionsEvaluationFunctionsImpl();

    private SolutionsEvaluationFunctionsImpl() {}

    @Override
    public java.lang.Integer CalculateScore(final cleon.sda.spec.analysis.solution.evaluation.javamodel.ISolutionsEvaluation solutionsEvaluation) {
      /* Begin Protected Region [[4925332e-3d0a-11e5-871f-6beac6a7c24b]] */
    	return solutionsEvaluation.selectEvaluation().values().stream().mapToInt(p -> EvaluationFunctionsImpl.INSTANCE.CalculateScore(p)).sum(); 
      /* End Protected Region   [[4925332e-3d0a-11e5-871f-6beac6a7c24b]] */
    }

  }
  
  public static class SolutionsEvaluationFunctions {

    private SolutionsEvaluationFunctions() {}

    public static java.lang.Integer CalculateScore(final cleon.sda.spec.analysis.solution.evaluation.javamodel.ISolutionsEvaluation solutionsEvaluation) {
      return DynamicResourceUtil.invoke(ISolutionsEvaluationFunctionsImpl.class, SolutionsEvaluationFunctionsImpl.INSTANCE, solutionsEvaluation).CalculateScore(solutionsEvaluation);
    }

  }

  public static interface IBestFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("fe83bf61-3d16-11e5-871f-6beac6a7c24b")
    public java.lang.String RenderContent();

  }
  
  public static interface IBestFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class BestFunctionsImpl implements IBestFunctionsImpl {

    public static final IBestFunctionsImpl INSTANCE = new BestFunctionsImpl();

    private BestFunctionsImpl() {}

  }
  
  public static class BestFunctions {

    private BestFunctions() {}

  }

  public static interface IEvaluationFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("52c3bb3b-3d08-11e5-871f-6beac6a7c24b")
    public java.lang.Integer CalculateScore();

  }
  
  public static interface IEvaluationFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("52c3bb3b-3d08-11e5-871f-6beac6a7c24b")
    public java.lang.Integer CalculateScore(final cleon.sda.spec.analysis.solution.evaluation.javamodel.IEvaluation evaluation);

  }
  
  public static class EvaluationFunctionsImpl implements IEvaluationFunctionsImpl {

    public static final IEvaluationFunctionsImpl INSTANCE = new EvaluationFunctionsImpl();

    private EvaluationFunctionsImpl() {}

    @Override
    public java.lang.Integer CalculateScore(final cleon.sda.spec.analysis.solution.evaluation.javamodel.IEvaluation evaluation) {
      /* Begin Protected Region [[52c3bb3b-3d08-11e5-871f-6beac6a7c24b]] */
        int importance = Integer.parseInt(evaluation.selectGoal().selectImportance().selectName());
        int score = Integer.parseInt(evaluation.selectScore().selectName());
        return importance * score;
      /* End Protected Region   [[52c3bb3b-3d08-11e5-871f-6beac6a7c24b]] */
    }

  }
  
  public static class EvaluationFunctions {

    private EvaluationFunctions() {}

    public static java.lang.Integer CalculateScore(final cleon.sda.spec.analysis.solution.evaluation.javamodel.IEvaluation evaluation) {
      return DynamicResourceUtil.invoke(IEvaluationFunctionsImpl.class, EvaluationFunctionsImpl.INSTANCE, evaluation).CalculateScore(evaluation);
    }

  }

  public static interface IAnalysisDocumentFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("1f166999-c02a-11e5-b927-b1b055d0575f")
    public java.lang.String GetDocumentPath();

  }
  
  public static interface IAnalysisDocumentFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class AnalysisDocumentFunctionsImpl implements IAnalysisDocumentFunctionsImpl {

    public static final IAnalysisDocumentFunctionsImpl INSTANCE = new AnalysisDocumentFunctionsImpl();

    private AnalysisDocumentFunctionsImpl() {}

  }
  
  public static class AnalysisDocumentFunctions {

    private AnalysisDocumentFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,de8668e7-3c32-11e5-9962-cf3035adb922,Y70jPW2AjlIdSyI1lEmAHfnxRu8=] */
