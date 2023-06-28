package StepDefinations.StepsForHooks;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Hooks", glue = {"StepDefinations"},
        monochrome = true
//        ,plugin = {"pretty", "json:target/jsonReports.json"}
)
public class TestRunnerHooks {



}
