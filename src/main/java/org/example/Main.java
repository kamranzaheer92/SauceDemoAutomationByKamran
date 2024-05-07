package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.config.DriverManagerType;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverInfo;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import static io.github.bonigarcia.wdm.config.DriverManagerType.CHROME;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        /*WebDriver driver = new ChromeDriver();
      //  WebDriverManager.getInstance(DriverManagerType.CHROME).setup();
        driver.get("https://www.saucedemo.com/v1/");
        // Get Title
        String title= driver.getTitle();
        //Printing the title of the page
        System.out.println("Title of the page is " + title); */

        // Login using ID
       /* driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();*/

        // Login using Name
        /*locateElementByName(driver);
        locateElementById(driver);*/
       // locateElementByCssSelector(driver);
    /*    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        locateElementByXpath(driver);
        driver.quit();  */




    }


/*    public static void launchBrowser() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/v1/");
    }

    public static void locateElementByName(WebDriver driver) {
        driver.findElement(By.name("user-name")).sendKeys("standard_user");
        driver.findElement(By.name("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();

    }

    public static void locateElementById(WebDriver driver) {
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();

    }
    public static void locateElementByCssSelector(WebDriver driver) {
        driver.findElement(By.cssSelector("input[data-test='username']")).sendKeys("standard_user");
        driver.findElement(By.cssSelector("input[placeholder=\"Password\"]")).sendKeys("secret_sauce");
        driver.findElement(By.className("btn_action")).click();

    }
    public static void locateElementByXpath(WebDriver driver) {
        driver.findElement(By.xpath("//input[@class='form_input']")).sendKeys("standard_user");
        driver.findElement(By.xpath("//input[@class='form_input'][2]")).sendKeys("secret_sauce");
        driver.findElement(By.xpath("//input[@value='LOGIN']")).click();

    } */

}