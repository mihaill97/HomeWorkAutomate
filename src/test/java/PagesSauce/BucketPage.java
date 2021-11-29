package PagesSauce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BucketPage {
        private WebDriver driver;
        public BucketPage(WebDriver driver) {this.driver = driver;}

        By RemoveItem2 = By.id("remove-sauce-labs-backpack");
        By CheckoutBtn = By.id("checkout");

        public void Actions() throws InterruptedException {
                driver.findElement(RemoveItem2).click();
                Thread.sleep(300);
                driver.findElement(CheckoutBtn).click();
        }





}
