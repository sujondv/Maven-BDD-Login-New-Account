package runners;


import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\ARIF RAHMAN\\Desktop\\BDD New Account\\MavenBDDLoginAndNewAccount\\src\\test\\java\\features", glue = {
 "steps" },
 tags = { "@SmokeTest"},
 dryRun = false,
 monochrome = true,
 plugin = {"pretty", "html:test-output"}
 )
public class NewAccountRunner {
	
	

}
