package Settings;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetUpFormy_project {
    protected WebDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Misha\\Desktop\\Soft\\chromedriver2.exe");
        driver = new ChromeDriver();
        //driver.get("");
        driver.manage().window().maximize();

    }
    @After
    public void tearDown(){
        if(driver != null)
            driver.quit();
    }
}
