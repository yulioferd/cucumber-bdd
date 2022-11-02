package StepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class HooksDemoSteps {

//    WebDriver driver = null;
//
//    @Before(order = 1)
//    public void browserSetup(){
//        System.out.println("I am inside browser setup");
//        System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");
//        driver = new ChromeDriver();
//
//        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        driver.manage().window().maximize();
//    }
//    @Before(order = 0)
//    public void setup2(){
//        System.out.println("I am inside setup 2");
//    }
//    @After(order = 1)
//    public void teardown(){
//        System.out.println("I am inside teardown");
//        driver.close();
//        driver.quit();
//    }
//    @After(order = 2)
//    public void teardown2(){
//        System.out.println("I am inside teardown2");
//    }
//    @BeforeStep
//    public void beforeSteps(){
//        System.out.println("I am inside before steps");
//    }
//    @AfterStep
//    public void afterSteps(){
//        System.out.println("I am inside after steps");
//    }
//    @Given("user is on login page")
//    public void user_is_login_page(){
//        System.out.println("test");
//    }
//    @When("user enters valid username and password")
//    public void userr_enters_username_and_password(){
//        System.out.println("test");
//
//    }
//    @And("user clicks on login button")
//    public void clicks_on_login_page(){
//        System.out.println("test");
//
//    }
//    @Then("user is navigated to the home page")
//    public void user_is_navigated_yo_the_home_page(){
//        System.out.println("test");
//    }
}
