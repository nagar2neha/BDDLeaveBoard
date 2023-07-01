package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"C:\\QA\\SeleniumWorkSpace\\LeaveBoardBDDProject\\src\\main\\java\\Features\\taggedHooks.feature"},//the path of the feature files
		glue={"stepDefinitions"},//step Definition Package Name
		plugin = {"pretty","html:report/cucumber-output.html","junit:output/cucumber.xml"},
		monochrome = true,
		dryRun = false
		//tags = "@SmokeTest" 
		)
public class Runnerclass {

}
