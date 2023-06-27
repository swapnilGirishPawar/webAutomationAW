package StepDefinations;

import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class loginSteps {
    WebDriver driver = null;
    String url   = "https://opensource-demo.orangehrmlive.com/";

    @Given("Browser is open")
    public void browser_is_open() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }
    @And("User is on login page")
    public void user_is_on_login_page() {
        driver.navigate().to(url);
    }
    @When("user enters (.*) and (.*)")
    public void user_enters_username_and_password(String username, String password) {
        driver.findElement(By.name("username")).sendKeys(username);
        driver.findElement(By.name("password")).sendKeys(password);

    }
    @And("user clicks on Login button")
    public void user_clicks_on_Login_button(){
        driver.findElement(By.xpath("//button[@type='submit']")).sendKeys(Keys.ENTER);
    }

    @Then("user is navigated to the home page")
    public void user_is_navigated_to_the_home_page() {
        WebElement component = driver.findElement(By.xpath("//a[@class='oxd-main-menu-item']"));
        Boolean status = component.isDisplayed();
        if(status)
            System.out.println("Test Passed");
    }

}
