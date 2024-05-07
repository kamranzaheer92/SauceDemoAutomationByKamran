package Tests;

import org.testng.annotations.*;

public class AnnotationsTest {

  /*  @BeforeSuite
    public void beforeSuite() {
        System.out.println("This will run only once before all test in the suite execute");
    }*/
  /*  @AfterSuite
    public void afterSuite() {
        System.out.println("This will run only once after all test in the suite executed");
    }*/
    @BeforeGroups (groups = {"reg"})
    public void beforeGroup() {
        System.out.println("This will run before the first test execution of regression group ");
    }
    @AfterGroups (groups = {"reg"})
    public void afterGroup () {
        System.out.println("This will run after last test executed of regression group");
    }

    @BeforeClass
    public void beforeClass () {
        System.out.println("This will run only once before first Test in the class");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("This will run before every test execution");
    }
    @Test (groups = {"reg"})
    public void Test1() {
        System.out.println("This is the test");
    }
    @Test (groups = {"reg"})
    public void Test2() {
        System.out.println("This is test no 2");
    }
    @AfterMethod
    public void afterMethod() {
        System.out.println("This will run after every test executed");
    }
    @AfterClass
    public void afterClass() {
        System.out.println("This will run only once after all test run in the class");
    }
}
