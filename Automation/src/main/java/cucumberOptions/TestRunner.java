package cucumberOptions;




import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/main/java/features",
    			glue="stepdefinition"
		
		
		)





public class TestRunner {

}
