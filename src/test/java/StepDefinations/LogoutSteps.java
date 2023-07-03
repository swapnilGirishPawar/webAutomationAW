package StepDefinations;

import Pages.HomePage;
import Pages.LoginPage;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;

public class LogoutSteps{
    private Base base = new Base();
    LoginPage login;
    HomePage homePage = null;

    @When("user clicks on admin image button")
    public void user_clicks_on_admin_image_button() {
        homePage = new HomePage(Base.driver);
        homePage.clickAdminImageSection();
    }

    @And("user clicks on Logout button")
    public void user_clicks_on_logout_button() {
        homePage = new HomePage(Base.driver);
        homePage.clickLogoutButton();
    }

    @Then("user is navigated to the login page")
    public void user_is_navigated_to_the_login_page(){
        login = new LoginPage(Base.driver);
        login.loginPageAssertions();
    }

    @AfterMethod
    public void afterMethod(){
        homePage.clickAdminImageSection();
        homePage.clickLogoutButton();
        System.out.println("this is @AfterMethod by testNg");
        System.out.println("THIS RTHI STHIS sfkdhvbxckjbfs.dakbjclb sjkbxfhbdscflsdfhvegrktcgrwlbhesliluhbkgvf k");
    }


}
