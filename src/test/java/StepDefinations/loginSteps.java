package StepDefinations;

import Pages.HomePage;
import Pages.LoginPage;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;

public class loginSteps {
    private Base base = new Base();
    String url   = "https://opensource-demo.orangehrmlive.com/";
    LoginPage login;
    HomePage homePage = new HomePage(Base.driver);

    String username = "Admin";
    String password = "admin123";




    @Given("Browser is open")
    public void browser_is_open() {
       System.out.println("Browser is opened");

    }
    @And("User is on login page")
    public void user_is_on_login_page() throws InterruptedException {
        Base.driver.navigate().to(url);
    }
    @When("user enters username and password.")
    public void user_enters_username_and_password() throws InterruptedException {
        login = new LoginPage(Base.driver);
        login.loginPageAssertions();
        login.enterUsername(username);
        login.enterPassword(password);
    }
    @And("user clicks on Login button")
    public void user_clicks_on_Login_button(){
        login.clickLogin();
    }

    @Then("user is navigated to the home page")
    public void user_is_navigated_to_the_home_page(){
        homePage = new HomePage(Base.driver);
        login = new LoginPage(Base.driver);
        homePage.HomePageElementPresentAssertions();
    }

    @Then("user is navigated to the home page with valid credentials")
    public void user_is_navigated_to_the_home_page_with_valid_credentials(){
        homePage = new HomePage(Base.driver);
        login = new LoginPage(Base.driver);
        login.navigateToHomeScreen(username, password);
        homePage.HomePageElementPresentAssertions();
    }

}
