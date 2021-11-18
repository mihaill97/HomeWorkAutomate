package Pages999;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPageAuthorized {
    private WebDriver driver;

    public MainPageAuthorized(WebDriver driver) {
        this.driver = driver;
    }
    By UserNameBtn = By.xpath("//button[@id='user-username-btn']");
    By LogoutBtn = By.xpath("//button[@class='user-item-dropdown-btn' and contains (text(),'выход')]");

    public void Logout(){
        driver.findElement(UserNameBtn).click();
        driver.findElement(LogoutBtn).click();
    }
}