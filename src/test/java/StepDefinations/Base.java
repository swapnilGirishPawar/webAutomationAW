package StepDefinations;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Base {

    public static WebDriver driver;


    @Before
    public void BeforeTest(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));
        driver.manage().window().maximize();
    }
    @After
    public void afterTest(){
        driver.close();
        driver.quit();
    }


}