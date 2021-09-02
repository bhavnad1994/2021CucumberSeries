package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = { "/2021CucumberSeleniumPractice/src/main/java/features/youtube.feature"},
		glue ={"stepdefinitions"},
		monochrome=true,
		dryRun=false,
		//tags={"@Smoke","@Regression"},
		plugin= {"pretty","html:test-output"}
		
				
		)

public class CucumberTestRunner {

}
