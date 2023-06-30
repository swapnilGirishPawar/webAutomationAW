package StepDefinations;

import io.cucumber.testng.*;



@CucumberOptions(features = "src/test/resources/Features", glue = {"StepDefinations"},
        monochrome = true
       ,plugin = {"pretty", "json:target/jsonReports.json"}
)
public class TestRunner extends AbstractTestNGCucumberTests {
}