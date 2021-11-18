package Pages999;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage999 {
    private WebDriver driver;

    public LoginPage999(WebDriver driver) {
        this.driver = driver;
    }
    By LoginField = By.xpath("//input[@name='login']");
    By PassField = By.xpath("//input[@name='password']");
    By EnterButton = By.xpath("//button[@class='login__form__footer__submit']");

    public void typeData(){
        driver.findElement(LoginField).sendKeys("Chrisstmass");
        driver.findElement(PassField).sendKeys("7991cmvw");
        driver.findElement(EnterButton).click();
    }
}
