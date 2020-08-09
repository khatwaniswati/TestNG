import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class ParallelTest1 {

    @Test
    void logoTest() throws InterruptedException  {
        System.out.println("logoTest. Thread id -->: " + Thread.currentThread().getId());
        Assert.assertTrue(1==1, "failure statement");
        Thread.sleep(5000);
    }

    @Test
    public void homePageTitle() throws InterruptedException {
        System.out.println("homePageTitle. Thread id  -->: " + Thread.currentThread().getId());
        Assert.assertEquals("A", "A", "failure statement");
        Thread.sleep(5000);
    }

    @AfterTest
    void tearDown()
    {
        System.out.println("teardown");
    }

}
