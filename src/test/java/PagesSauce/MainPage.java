package PagesSauce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage {
    private WebDriver driver;
    public MainPage(WebDriver driver){this.driver = driver;}

    By DropPrice = By.xpath("//select[@class='product_sort_container']");
    By HighToLow = By.xpath("//option[@value='hilo']");
    By Item1 = By.id("add-to-cart-sauce-labs-fleece-jacket");
    By Item2 = By.id("add-to-cart-sauce-labs-backpack");
    By Bucket = By.xpath("//a[@class='shopping_cart_link']");
    By SideMenu = By.id("react-burger-menu-btn");
    By Logout = By.id("logout_sidebar_link");

    public void ActionsMain() throws InterruptedException {
        driver.findElement(DropPrice).click();
        driver.findElement(HighToLow).click();
        Thread.sleep(300);
        driver.findElement(Item1).click();
        driver.findElement(Item2).click();
        driver.findElement(Bucket).click();
    }
    public void LogoutAction() throws InterruptedException {
        driver.findElement(SideMenu).click();
        Thread.sleep(100);
        driver.findElement(Logout).click();
    }
}
