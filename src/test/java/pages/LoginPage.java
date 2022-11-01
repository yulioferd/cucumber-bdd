package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    protected WebDriver driver;
    By txt_username = By.id("nama");
    By txt_password = By.id("password");
    By btn_login = By.id("login");
    By btn_logout = By.id("logout");

    public LoginPage(WebDriver driver){
        if (!driver.getTitle().equals("TestProject Demo")){
            throw new IllegalStateException("This is not login page"+driver.getCurrentUrl());
        }
        this.driver = driver;
    }

    public void enterUsername(String username){
        driver.findElement(txt_username).sendKeys(username);
    }
    public void enterPassword(String password){
        driver.findElement(txt_password).sendKeys(password);

    }
    public void clickLogin(){
        driver.findElement(btn_login).click();
    }
    public void checkLogoutIsDisplayes(){
        driver.findElement(btn_logout).isDisplayed();
    }
    public void loginValidUser(String username, String password){
        driver.findElement(txt_username).sendKeys(username);
        driver.findElement(txt_password).sendKeys(password);
        driver.findElement(btn_login).click();
    }
}
