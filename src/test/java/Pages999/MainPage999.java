package Pages999;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage999 {
    private WebDriver driver;

    public MainPage999(WebDriver driver) {
        this.driver = driver;
    }
    By CloseNotification = By.xpath("//button[@class='mfp-close']");
    By LoginLink = By.xpath("//a[@rel='nofollow' and contains (text(),'вход')]");


    public void CloseNotif(){
        driver.findElement(CloseNotification).click();
    }
    public void lodinLink(){
        driver.findElement(LoginLink).click();
    }
}