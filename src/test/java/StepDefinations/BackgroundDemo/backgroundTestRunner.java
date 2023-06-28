package StepDefinations.BackgroundDemo;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features/BackgeroundDemo", glue = {
                "StepDefinations/BackgroundDemo" }, monochrome = true
,plugin = {"pretty", "html:target/htmlReports.html"}
)
public class backgroundTestRunner {

}
