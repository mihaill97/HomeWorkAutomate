package PackajeFormy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
public class Buttons {
    private WebDriver driver;
    public Buttons(WebDriver driver){this.driver = driver;}

    By Primary = By.xpath("//button[normalize-space()='Primary']");
    By Success = By.xpath("//button[normalize-space()='Success']");
    By Info = By.xpath("//button[normalize-space()='Info']");
    By Warning = By.xpath("//button[normalize-space()='Warning']");
    By Danger = By.xpath("//button[normalize-space()='Danger']");
    By Link = By.xpath("//button[normalize-space()='Link']");
    By Left = By.xpath("//button[normalize-space()='Left']");
    By Middle = By.xpath("//button[normalize-space()='Middle']");
    By Right = By.xpath("//button[normalize-space()='Right']");
    By One = By.xpath("//button[normalize-space()='1']");
    By Two = By.xpath("//button[normalize-space()='2']");
    By DropDown = By.xpath("//button[@id='btnGroupDrop1']");
    By DropDown1 = By.xpath("//a[normalize-space()='Dropdown link 1']");
    By DropDown2 = By.xpath("//a[normalize-space()='Dropdown link 2']");

    public void IneractionsWithElements(){
        driver.findElement(Primary).click();
        driver.findElement(Success).click();
        driver.findElement(Info).click();
        driver.findElement(Warning).click();
        driver.findElement(Danger).click();
        driver.findElement(Link).click();
        driver.findElement(Left).click();
        driver.findElement(Middle).click();
        driver.findElement(Right).click();
        driver.findElement(One).click();
        driver.findElement(Two).click();
        //driver.findElement(DropDown).click();
//        driver.findElement(DropDown1).click();
//        driver.findElement(DropDown2).click();
    }
    public void DropDownIn() throws InterruptedException {
        driver.findElement(DropDown).click();
        Thread.sleep(1000);
        driver.findElement(DropDown1).click();
        Thread.sleep(1000);
        driver.findElement(DropDown).click();
        Thread.sleep(1000);
        driver.findElement(DropDown2).click();
    }

}
