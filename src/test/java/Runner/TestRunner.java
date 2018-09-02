package Runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.java.Before;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "Feature"
		,glue={"example.project"}
		,plugin = { "pretty", "html:target/cucumber-reports" }
		,monochrome = true
		)
 
public class TestRunner
{
 

}


