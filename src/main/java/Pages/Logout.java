package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Logout {

    WebDriver driver;

    public Logout(WebDriver driver) {
        this.driver=driver;
    }

    public By menuBtn = By.xpath("//div[@class='bm-burger-button']/button");
    public By logoutLink = By.linkText("Logout");

    public String getCurrentUrlBeforeLogout() {
        return driver.getCurrentUrl();
    }

    public void clickMenuBtn() {
        driver.findElement(this.menuBtn).click();
    }
    public void clickLogoutBtn() {
        driver.findElement(this.logoutLink).click();
    }
    public String getCurrentUrlAfterLogout() {
       return driver.getCurrentUrl();
    }

}
