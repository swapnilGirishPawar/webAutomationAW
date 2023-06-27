package StepDefinations;

import PageFactory.HomePage_PF;
import PageFactory.LoginPage_PF;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LoginPage;

import java.util.concurrent.TimeUnit;

public class loginSteps_PF {
    WebDriver driver = null;
    String url   = "https://opensource-demo.orangehrmlive.com/";
    LoginPage_PF login;
    HomePage_PF homePage = new HomePage_PF(driver);
    String username = "Admin";
    String password = "admin123";

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
    @When("user enters username and password")
    public void user_enters_username_and_password() {
        login = new LoginPage_PF(driver);
        login.enterUsername(username);
        login.enterPassword(password);
    }
    @And("user clicks on Login button")
    public void user_clicks_on_Login_button(){
        login.clickLoginButton();
    }

    @Then("user is navigated to the home page")
    public void user_is_navigated_to_the_home_page() {
        WebElement element = driver.findElement(By.xpath("//a[@class='oxd-main-menu-item']"));
        homePage.elementPresent(element);
    }

}
