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
        tags="@RegressionTest or ~@SmokeTest",
        plugin = "json:target/cucumber-reports/CucumberTestReport.json"
		)

// if want to ignore any tag or exclude any particular tag user ~ special symbol before tag
//"@RegressionTest or ~@SmokeTest",

public class TestRunner {

}
