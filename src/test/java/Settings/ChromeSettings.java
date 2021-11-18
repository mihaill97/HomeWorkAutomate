package Settings;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeSettings {
    protected WebDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Misha\\Desktop\\Soft\\chromedriver2.exe");
        driver = new ChromeDriver();
        driver.get("https://999.md/ru/");
        driver.manage().window().maximize();

    }
    @After
    public void tearDown(){
        if(driver != null)
            driver.quit();
    }
}