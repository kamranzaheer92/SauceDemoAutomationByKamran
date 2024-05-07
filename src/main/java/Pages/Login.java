package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {

    WebDriver driver;

    public Login(WebDriver driver) {
        this.driver=driver;
    }

    public By username = By.id("user-name");
    public By password = By.id("password");

    public By loginBtn = By.id("login-button");

    public By loginError = By.xpath("//h3[@data-test='error']");

    public void enterUsername (String Username ) {
        driver.findElement(this.username).sendKeys(Username);
    }
    public void enterPassword (String Password) {
        driver.findElement(this.password).sendKeys(Password);
    }
    public void clickLoginBtn () {
        driver.findElement(this.loginBtn).click();
    }
    public boolean getLoginErrorText() {
       return driver.findElement(this.loginError).isDisplayed();
    }
}
