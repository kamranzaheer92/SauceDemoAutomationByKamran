package Tests;

import Driver.TestBase;
import Pages.Logout;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LogoutTest extends TestBase {
    @Test
    public void performLogout() {
        Logout log = new Logout(driver);
        log.clickMenuBtn();
        String urlbeforelogout = log.getCurrentUrlBeforeLogout();
        System.out.println(urlbeforelogout);
        log.clickLogoutBtn();
        String urlafterlogout = log.getCurrentUrlAfterLogout();
        System.out.println(urlafterlogout);
        //Example of hard assertion
       // Assert.assertNotEquals(urlbeforelogout,urlafterlogout);

        // Example of Soft Assertion

        SoftAssert softassert = new SoftAssert();
        softassert.assertNotEquals(urlbeforelogout,urlafterlogout);
        System.out.println("This line also executes even the assertion above is failing");
        softassert.assertAll(); // This code throws exception and the test is now marked as failed









    }
}
