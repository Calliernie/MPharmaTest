package main;

import io.github.bonigarcia.wdm.WebDriverManager;
import main.Setup;
import org.junit.After;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Setup{
    static WebDriver driver;
    //this method will run once before all other tests run
    @BeforeClass
    public static void setUp(){
        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();
        driver.get("http://localhost:3000/");
        driver.manage().window().maximize();
    }

    @After
    public void tearDown(){
        driver.quit();
    }
}