package StepDefinations.BackgroundDemo;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class backgroundSteps {

    @Given("user is logged in")
    public void user_is_logged_in() {
        System.out.println("user logged in ");
    }

    @When("user clicks on user details info button")
    public void user_clicks_on_user_details_info_button() {
        System.out.println("user clicks info button");
    }

    @Then("logout button is displayed")
    public void logout_button_is_displayed() {
        System.out.println("logout button displayed");
    }

    @When("user clicks on dashboard button")
    public void user_clicks_on_dashboard_button() {
        System.out.println("user clicked dashbaord button");
    }

    @Then("quick launch toolbar is displayed")
    public void quick_launch_toolbar_is_displayed() {
        System.out.println("quick launch tool bar displayd");
    }


    @Given("user is on login page")
public void user_is_on_login_page() {
    System.out.println("bg: user is on login page");
   
}
@When("user enters username and password")
public void user_enters_username_and_password() {
   System.out.println("bg: user enters usrnm and pss");
}
@When("clicks on the login button")
public void clicks_on_the_login_button() {
   System.out.println("bg: user clicks login button");
}
@Then("user is navigate to the home page")
public void user_is_navigate_to_the_home_page() {
   System.out.println("bg: user is on home page");
}

}
