import org.testng.annotations.*;

public class TC1 {

    @BeforeClass
    public void beforeClass(){
        System.out.println("this is before class...");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("this is before method...");
    }

    @Test
    public void test1(){
        System.out.println("this is test1 method...");
    }

    @Test
    public void test2(){
        System.out.println("this is test2 method...");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("this is after method...");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("this is after class...");
    }

}
