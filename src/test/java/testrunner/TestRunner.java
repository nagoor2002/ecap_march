package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features=".//features//login.feature",
	              glue="stepdefination",
	              plugin= {"pretty","html:target/cucumber-reports"},
	             dryRun=true,
	             monochrome=true
	)
	
	
	public class TestRunner {
}
