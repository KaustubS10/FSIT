package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/Login/Login.feature"},
glue="StepDefinition",
//tags="@Login",
dryRun = false,//it will check to find if i miss any steps
monochrome = true,//to make console output in better format
plugin= {"html:testoutput/kaustub.html","junit:testoutput/cucumbur.xml","json:testoutput/cucumbur.json"},
strict=true)
public class TestRunner {

}
