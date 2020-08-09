import org.testng.annotations.Test;

public class SecondTestCase {

    @Test(priority = 1)
    public void setUp() {
        System.out.println("This is setUp method...");
    }

    @Test(priority = 3)
    public void searchCustomer() {
        System.out.println("This is searchCustomer method...");
    }

    @Test(priority = 2)
    public void addCustomer() {
        System.out.println("This is addCustomer method...");
    }

    @Test(priority = 4)
    public void tearDown() {
        System.out.println("This is tearDown method...");
    }

}
