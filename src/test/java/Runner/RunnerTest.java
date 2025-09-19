package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
// @CucumberOptions(features="src/test/java/Features", tags="@Test",glue = {"StepDefinition","base"},
// plugin = {"pretty", "html:target/HTML-reports/test.html","json:target/cucumber-report/cucumber.json"})
  @CucumberOptions(
    plugin = {"pretty", "json:target/cucumber-reports/Cucumber.json"},
    features = "src/test/resources/features",
    glue = {"stepDefinitions"}
)


public class RunnerTest {

}
