package StepDefinations;
import io.cucumber.java.*;
import io.cucumber.java.AfterStep;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import java.time.Duration;

public class Base {

    public static WebDriver driver;

    @Before
    public void BeforeTest() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("headless");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));
        System.out.println("this is @Before method");
    }

    @After // execute after each scenario
    public void afterTest() {
        System.out.println("this is @after method");

        driver.close();
        driver.quit();
    }

    @AfterStep
    public void takeScreenshot(Scenario scenario) {
        final byte []  screenshot =((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
        scenario.attach(screenshot, "img/png", "image");
    }



}