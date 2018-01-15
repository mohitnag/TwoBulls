/**
 * Created by mohitnag on 14/1/18.
 */

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "html:TestResults/cucumber-html-report"},
        features = "src/test/Feature"
        ,glue={"StepDefinition"}


)
public class TestRunner {

}
