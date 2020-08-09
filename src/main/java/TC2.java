import org.testng.annotations.*;

public class TC2 {

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("this is before suite...");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("this is before test...");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("this is before class...");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("this is before method...");
    }

    @Test
    public void test3() {
        System.out.println("this is test3 method...");
    }

    @Test
    public void test4() {
        System.out.println("this is test4 method...");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("this is after method...");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("this is after class...");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("this is after test...");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("this is after suite...");
    }
}
