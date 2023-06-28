package StepDefinations.StepsForHooks;

import io.cucumber.java.After;
import io.cucumber.java.*;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class HookSteps {
    // WebDriver driver = null;

    // @Before(value = "@Smoke", order = 0)
    // public void beforeTest(){
    //     System.setProperty("webdriver.chrome.driver","src/test/resources/Drivers/chromedriver");
    //     driver = new ChromeDriver();
    //     driver.manage().window().maximize();
    //     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    //     driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
    // }
    // @BeforeStep
    // public void beforeStep(){}
    // @AfterStep
    // public void afterStep(){}
    // @After
    // public void afterTest(){
    //     driver.close();
    //     driver.quit();
    // }
    // @Given("user is on login page")
    // public void user_is_on_login_page() {
    //     System.out.println("1");
    // }
    // @When("user enters valid username and password")
    // public void user_enters_valid_username_and_password() {
    //     System.out.println("2");
    // }
    // @And("clicks on the login button")
    // public void clicks_on_the_login_button() {
    //     System.out.println("3");
    // }
    // @Then("user is land on home page")
    // public void user_is_land_on_home_page() throws InterruptedException {
    //     System.out.println("4");
    //     Thread.sleep(3000);
    // }
}
