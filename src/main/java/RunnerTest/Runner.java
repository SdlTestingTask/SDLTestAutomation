package RunnerTest;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

 

@RunWith(Cucumber.class) 
@CucumberOptions(
		
       features= "C:\\Users\\Anand\\eclipse-workspace\\TestAutomation\\src\\main\\java\\Features\\FeatureFile.feature",
		
		glue = {"StepDefinition"},
		
		//format = {"pretty","httml:test_output"},
		
		dryRun = false
		
		)


public class Runner {

}
