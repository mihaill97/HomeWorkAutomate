package PagesSauce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage {
    private WebDriver driver;
    public CheckoutPage(WebDriver driver){this.driver=driver;}

    By FirstNameField = By.id("first-name");
    By LastNameField = By.id("last-name");
    By ZipPostal = By.id("postal-code");
    By BtnContinue = By.id("continue");

    public void TypeData(){
        driver.findElement(FirstNameField).sendKeys("Mihail");
        driver.findElement(LastNameField).sendKeys("Craciun");
        driver.findElement(ZipPostal).sendKeys("112-001");
        driver.findElement(BtnContinue).click();
    }

}
