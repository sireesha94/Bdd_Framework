package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
(
		features = {".//Features//Scenarios.feature"},
		glue ="stepdefinitions",
		plugin= {"pretty",
				"html:Reports/myreport.html",
				
		},
		dryRun = false,
		monochrome =true
		)

public class TestRunner {

}
