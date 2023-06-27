package StepDefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;
import pages.LoginPage;

import java.util.concurrent.TimeUnit;

public class loginSteps_POM {
    WebDriver driver = null;
    LoginPage login;
    HomePage homePage;
    String url   = "https://opensource-demo.orangehrmlive.com/";
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
        login = new LoginPage(driver);
        login.enterUsername(this.username);
        login.enterPassword(this.password);

    }
    @And("user clicks on Login button")
    public void user_clicks_on_Login_button(){
        login.clickLogin();
    }

    @Then("user is navigated to the home page")
    public void user_is_navigated_to_the_home_page() {
        homePage = new HomePage();
        WebElement element = driver.findElement(By.xpath("//a[@class='oxd-main-menu-item']"));
        homePage.elementPresent(element);
    }
}
