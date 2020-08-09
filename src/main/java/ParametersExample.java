import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersExample {

    @BeforeClass
    @Parameters({"browser", "url"})
    public void setup(String browser, String app) {
        System.out.println("this is setup method.."+browser);
        if (browser.equalsIgnoreCase("chrome")) {
            System.out.println("Chrome");
        } else if (browser.equalsIgnoreCase("firefox")) {
            System.out.println("Firefox");
        }
        System.out.println(app);
    }

    @Test
    public void logoTest() {
        Assert.assertTrue(1 == 1, "false condition will print this statement");
        System.out.println("logoTest method executed");
    }

    @Test
    void homePageTitleTest() {
        Assert.assertEquals("A", "A", "false condition will print this statement");
        System.out.println("homePageTitleTest method executed");
    }

    @AfterClass
    void tearDown() {
        System.out.println("this is teardown method...");
    }

}