package PagesSauce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutOverwiewPage {
    private WebDriver driver;
    public CheckoutOverwiewPage(WebDriver driver){this.driver = driver;}

    By FinishBtn = By.id("finish");
    By BackHomeBtn = By.id("back-to-products");

    public void ClickFinish() throws InterruptedException {
        driver.findElement(FinishBtn).click();
        Thread.sleep(500);
        driver.findElement(BackHomeBtn).click();
    }
}
