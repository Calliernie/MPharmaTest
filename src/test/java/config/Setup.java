package config;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Setup {
    protected static WebDriver driver;

//    @BeforeClass
    public static WebDriver getDriver(){
        if(driver == null){
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();

            driver.get("http://localhost:3000/");
            driver.manage().window().maximize();
        }
        return driver;
    }

    @AfterClass
    public static void tearDown(){
        driver.quit();
    }
}
