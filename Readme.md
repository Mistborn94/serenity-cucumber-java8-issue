# Readme 

This project is a minimal project to illustrate that serenity-cucumber does not work with cucumber's [lambda step definitions](https://cucumber.io/docs/cucumber/step-definitions/).

## Running
 
Run `mvn clean verify` to execute the tests 
 
## Exception
The following exception gets thrown attempting to run the tests
``` 
java.lang.NullPointerException: No BaseStepListener has been registered
     at com.google.common.base.Preconditions.checkNotNull(Preconditions.java:900)
     at net.thucydides.core.steps.StepEventBus.getBaseStepListener(StepEventBus.java:137)
     at cucumber.runtime.SerenityObjectFactory.newInstance(SerenityObjectFactory.java:77)
     at cucumber.runtime.SerenityObjectFactory.cacheNewInstance(SerenityObjectFactory.java:58)
     at cucumber.runtime.SerenityObjectFactory.getInstance(SerenityObjectFactory.java:48)
     at io.cucumber.java8.Java8Backend.buildWorld(Java8Backend.java:64)
     at io.cucumber.core.runner.Runner.buildBackendWorlds(Runner.java:99)
     at io.cucumber.core.runner.Runner.runPickle(Runner.java:65)
     at io.cucumber.junit.PickleRunners$NoStepDescriptions.run(PickleRunners.java:151)
     at io.cucumber.junit.FeatureRunner.runChild(FeatureRunner.java:135)
     at io.cucumber.junit.FeatureRunner.runChild(FeatureRunner.java:27)
     at org.junit.runners.ParentRunner$4.run(ParentRunner.java:331)
     at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:79)
     at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:329)
     at org.junit.runners.ParentRunner.access$100(ParentRunner.java:66)
     at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:293)
     at org.junit.runners.ParentRunner$3.evaluate(ParentRunner.java:306)
     at org.junit.runners.ParentRunner.run(ParentRunner.java:413)
     at io.cucumber.junit.CucumberSerenityRunner.runChild(CucumberSerenityRunner.java:234)
     at io.cucumber.junit.CucumberSerenityRunner.runChild(CucumberSerenityRunner.java:57)
     at org.junit.runners.ParentRunner$4.run(ParentRunner.java:331)
     at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:79)
     at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:329)
     at org.junit.runners.ParentRunner.access$100(ParentRunner.java:66)
     at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:293)
     at io.cucumber.junit.CucumberSerenityRunner$RunCucumber.evaluate(CucumberSerenityRunner.java:262)
     at org.junit.internal.runners.statements.RunBefores.evaluate(RunBefores.java:26)
     at org.junit.runners.ParentRunner$3.evaluate(ParentRunner.java:306)
     at org.junit.runners.ParentRunner.run(ParentRunner.java:413)
     at org.apache.maven.surefire.junit4.JUnit4Provider.execute(JUnit4Provider.java:283)
     at org.apache.maven.surefire.junit4.JUnit4Provider.executeWithRerun(JUnit4Provider.java:173)
     at org.apache.maven.surefire.junit4.JUnit4Provider.executeTestSet(JUnit4Provider.java:153)
     at org.apache.maven.surefire.junit4.JUnit4Provider.invoke(JUnit4Provider.java:128)
     at org.apache.maven.surefire.booter.ForkedBooter.invokeProviderInSameClassLoader(ForkedBooter.java:203)
     at org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:155)
     at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:103)
```