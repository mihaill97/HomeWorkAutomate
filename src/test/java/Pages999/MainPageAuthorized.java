package Pages999;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class MainPageAuthorized {
    private WebDriver driver;

    public MainPageAuthorized(WebDriver driver) {
        this.driver = driver;
    }
    By UserNameBtn = By.xpath("//button[@id='user-username-btn']");
    By LogoutBtn = By.xpath("//button[@class='user-item-dropdown-btn' and contains (text(),'выход')]");

    public void Logout(){
        WebElement userMenu = driver.findElement(By.id("user-username-btn"));

        Actions action = new Actions(driver);
        action.moveToElement(userMenu).perform();

        WebElement button = driver.findElement(By.xpath("//button[@class='user-item-dropdown-btn' and contains (text(),'выход')]"));
        button.click();

//        driver.findElement(UserNameBtn).click();
//        driver.findElement(LogoutBtn).click();
    }
}