package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LoginDemoSteps {
    WebDriver driver = null;

    @Given("browser is open")
    public void browser_is_open(){
        System.out.println("Inside step - browser is open");
        String projectPath = System.getProperty("user.dir");
        System.out.println("Project path is " + projectPath);
        System.setProperty("webdriver.chrome.driver", projectPath +"/src/test/resources/drivers/chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);

//        driver.manage().window().maximize();

    }
    @And("user is on login page")
    public void user_is_on_login_page(){
        driver.navigate().to("https://example.testproject.io/web/");
    }
    @When("^user enters (.*) and (.*)$")
    public void user_enters_username_and_password(String username, String password){
        driver.findElement(By.id("name")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
    }
    @And("user clicks on login")
    public void user_clicks_on_login(){
        driver.findElement(By.id("login")).click();
    }
    @Then("user is navigated to the home page")
    public void user_is_navigated_to_the_home_page(){
        driver.findElement(By.id("logout")).isDisplayed();
        driver.close();
        driver.quit();
    }
}
