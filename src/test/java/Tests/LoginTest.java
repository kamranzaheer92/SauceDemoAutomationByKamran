package Tests;

import Driver.TestBase;
import Pages.Login;
import org.apache.commons.logging.Log;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

public class LoginTest extends TestBase {


    @Test (description = "Verify valid swag labs login ")
    public void verifyValidLogin () {

        Login login = new Login(driver);
        login.enterUsername("standard_user");
        login.enterPassword("secret_sauce");
        login.clickLoginBtn();
        String ActualTitle= driver.getTitle();
        //Printing the title of the page
        Assert.assertEquals(ActualTitle,"Swag Labs");
    }
   @Test(description = "Verify invalid swag labs login")
    public void invalidLogin() {
        Login login2 = new Login(driver);
        login2.enterUsername("problem_user");
        login2.enterPassword("secret_sauce1");
        login2.clickLoginBtn();
        Assert.assertTrue(login2.getLoginErrorText());
    }

}
