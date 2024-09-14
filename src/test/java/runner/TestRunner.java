package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/Features/cucumbertagging.feature",
        glue = {"stepdefination"},
        dryRun = false,
        monochrome = true,
        tags="@RegressionTest or @SmokeTest or @tag3",
        plugin = "json:target/cucumber-reports/CucumberTestReport.json"
		)

public class TestRunner {

}
