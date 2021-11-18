package PageHtml;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPageHtml {
    private WebDriver driver;
    public MainPageHtml(WebDriver driver){this.driver = driver;}

    By Link1 = By.xpath("//a[contains(text(),'Принципы тестирования')]");
    By Link2 = By.xpath("//a[contains(text(),'Мифы о тестировании')]");
    By Link3 = By.xpath("//a[contains(text(),'Автоматизация тестирования')]");

    public void ClickLink1(){
        driver.findElement(Link1).click();

    }public void ClickLink2(){
        driver.findElement(Link2).click();

    }public void ClickLink3(){
        driver.findElement(Link3).click();
    }
}
