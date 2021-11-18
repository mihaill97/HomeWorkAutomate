package Tests;

import Pages999.LoginPage999;
import Pages999.MainPage999;
import Pages999.MainPageAuthorized;
import Settings.ChromeSettings;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class Test999 extends ChromeSettings {
    @Test
    public void Login() throws InterruptedException {
        //pages
        MainPage999 mainPage999 = new MainPage999(driver);
        LoginPage999 loginPage999 = new LoginPage999(driver);
        MainPageAuthorized mainPageAuthorized = new MainPageAuthorized(driver);
        //actions
        mainPage999.CloseNotif();
        mainPage999.lodinLink();
        Thread.sleep(1000);
        loginPage999.typeData();
        assertEquals("https://999.md/ru/",driver.getCurrentUrl());
        //mainPageAuthorized.Logout();
        System.out.println("Test passed");
    }
}
