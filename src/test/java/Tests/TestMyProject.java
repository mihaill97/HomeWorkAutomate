package Tests;

import PageHtml.MainPageHtml;
import Settings.SettingsForHtmlPage;
import org.junit.Test;

public class TestMyProject extends SettingsForHtmlPage {
    @Test
    public void Navigation() throws InterruptedException {
        MainPageHtml mainPageHtml = new MainPageHtml(driver);
        mainPageHtml.ClickLink1();
        Thread.sleep(1000);
        mainPageHtml.ClickLink2();
        Thread.sleep(1000);
        mainPageHtml.ClickLink3();
    }

    
}
