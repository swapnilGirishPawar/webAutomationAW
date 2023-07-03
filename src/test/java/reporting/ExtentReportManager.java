package reporting;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class ExtentReportManager {

    @BeforeSuite
    public void setup(){
        ExtentSparkReporter SparkReporter = new ExtentSparkReporter("target/ExtentReports/report.html");
        ExtentReports extent = new ExtentReports();
        extent.attachReporter(SparkReporter);
    }

    @AfterSuite
    public void tearDown(){

    }

}
