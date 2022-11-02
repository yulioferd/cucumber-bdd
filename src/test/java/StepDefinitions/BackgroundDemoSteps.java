package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BackgroundDemoSteps {
    @Given("user in on login page")
    public void user_in_on_login_page() {
        System.out.println("test");
    }

    @When("user enters username and password")
    public void user_enters_username_and_password() {
        System.out.println("test");
    }

    @When("user clicks on login button")
    public void user_clicks_on_login_button() {
        System.out.println("test");
    }

    @Then("user is navigated to the home page")
    public void user_is_navigated_to_the_home_page() {
        System.out.println("test");
    }

    @Given("user is logged in")
    public void user_is_logged_in() {
        System.out.println("test");
    }
    @When("user clicks on welcome link")
    public void user_clicks_on_welcome_link() {
        System.out.println("test");
    }
    @Then("logout link is displayed")
    public void logout_link_is_displayed() {
        System.out.println("test");
    }
    @When("user clicks on dashboard link")
    public void user_clicks_on_dashboard_link() {
        System.out.println("test");
    }
    @Then("quick launch toolbar is displayed")
    public void quick_launch_toolbar_is_displayed() {
        System.out.println("test");
    }
}
