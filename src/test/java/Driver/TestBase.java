package Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import org.testng.log4testng.Logger;

import java.time.Duration;

public class TestBase {

   public static WebDriver driver;
   public static Logger log;
    @BeforeMethod
    public void driverSetup() throws InterruptedException {

        this.driver = new ChromeDriver();
        if(driver==null){
            log.info("Driver cannot be null");
        }
        this.driver.get("https://www.saucedemo.com/v1/");
        this.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        this.driver.manage().window().maximize();
    }
     @AfterMethod
    public void driverQuit() throws InterruptedException {
        driver.quit();
    }
}
