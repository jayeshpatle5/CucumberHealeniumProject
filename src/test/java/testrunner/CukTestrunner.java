package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/featurefile/sampleformpage.feature",
glue={"stepdefinitions","Hooks"},
plugin={"pretty",
		"html:target/cucumber-reports.html",
		"json:target/cucumberJson/cucumber.json"}
)
public class CukTestrunner{

}
