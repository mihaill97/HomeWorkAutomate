package PagesSauce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;
    public LoginPage(WebDriver driver){this.driver = driver;}

    By LoginField = By.id("user-name");
    By PassField = By.id("password");
    By ButtonLogin = By.id("login-button");



    public void PositiveData(){
        driver.findElement(LoginField).sendKeys("standard_user");
        driver.findElement(PassField).sendKeys("secret_sauce");
        driver.findElement(ButtonLogin).click();
    }

}
