package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/Features/loginparameter.feature",
        glue = {"stepdefination"},
        dryRun = false,
        monochrome = true,
        plugin = "json:target/cucumber-reports/CucumberTestReport.json"
		)

public class TestRunner {

}
