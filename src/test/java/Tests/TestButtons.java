package Tests;

import PackajeFormy.Buttons;
import PackajeFormy.Formy;
import Settings.SetUpFormy_project;
import org.junit.Test;
import org.openqa.selenium.By;

public class TestButtons extends SetUpFormy_project {
    @Test
    public void FindAndClickButtons() throws InterruptedException {
        driver.get("https://formy-project.herokuapp.com/buttons#");
        Buttons buttons = new Buttons(driver);
        buttons.IneractionsWithElements();
        buttons.DropDownIn();

    }
@Test
    public void Scroll () throws InterruptedException {
        driver.get("https://formy-project.herokuapp.com/scroll");
        driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Я могу скролить без доп метода!!)");
        driver.findElement(By.id("date")).sendKeys("11/11/2001");
        //Thread.sleep(3000);
}

@Test
    public void Form(){
        driver.get("https://formy-project.herokuapp.com/form");
    Formy formy = new Formy(driver);
    formy.TypeData();
}
}
