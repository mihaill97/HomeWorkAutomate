package PackajeFormy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Formy {
    private WebDriver driver;
    public Formy(WebDriver driver){this.driver = driver;}
    By FistName = By.id("first-name");
    By LastName = By.id("last-name");
    By JobTitle = By.id("job-title");
    By Education1 = By.id("radio-button-1");
    By Sex = By.id("checkbox-1");
    By SelectMenu = By.id("select-menu");
    By Value = By.xpath("//option[@value='4']");
    By DatePicker = By.id("datepicker");
    By Button = By.xpath("//a[@role='button']");

    public void TypeData(){
        driver.findElement(FistName).sendKeys("Mihail");
        driver.findElement(LastName).sendKeys("Craciun");
        driver.findElement(JobTitle).sendKeys("Qa Manager");
        driver.findElement(Education1).click();
        driver.findElement(Sex).click();
        driver.findElement(SelectMenu).click();
        driver.findElement(Value).click();
        driver.findElement(DatePicker).sendKeys("11/24/2020");
        driver.findElement(Button).click();


    }
}
