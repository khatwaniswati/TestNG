import org.testng.annotations.Test;

public class FirstTestCase {

    @Test(priority = 1)
    public void setUp(){
        System.out.println("This is setUp method...");
    }

    @Test(priority = 2)
    public void login(){
        System.out.println("This is login method...");
    }

    @Test(priority = 3)
    public void tearDown(){
        System.out.println("This is tearDown method...");
    }

}
