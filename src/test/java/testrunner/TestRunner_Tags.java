package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(features="./features/Tags.feature",
	              glue="stepdefination",
	            		 
	     	             dryRun=true,
	     	             monochrome=true,
	            		 tags= "@smoke"
	)
	
	
public class TestRunner_Tags {

}
	
		