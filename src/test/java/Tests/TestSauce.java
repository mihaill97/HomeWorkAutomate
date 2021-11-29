package Tests;

import PagesSauce.*;
import Settings.SetUpSauceDemo;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class TestSauce extends SetUpSauceDemo {

    @Test
    public void LoginPositive() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        MainPage mainPage = new MainPage(driver);
        BucketPage bucketPage = new BucketPage(driver);
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        CheckoutOverwiewPage checkoutOverwiewPage = new CheckoutOverwiewPage(driver);
        //actions
        loginPage.PositiveData();
        assertEquals("https://www.saucedemo.com/inventory.html", driver.getCurrentUrl());
        mainPage.ActionsMain();
        Thread.sleep(300);
        assertEquals("https://www.saucedemo.com/cart.html", driver.getCurrentUrl());
        bucketPage.Actions();
        Thread.sleep(300);
        assertEquals("https://www.saucedemo.com/checkout-step-one.html", driver.getCurrentUrl());
        checkoutPage.TypeData();
        Thread.sleep(300);
        assertEquals("https://www.saucedemo.com/checkout-step-two.html", driver.getCurrentUrl());
        checkoutOverwiewPage.ClickFinish();
        Thread.sleep(300);
        assertEquals("https://www.saucedemo.com/inventory.html", driver.getCurrentUrl());
        mainPage.LogoutAction();
    }

}
