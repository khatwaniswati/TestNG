import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class ParallelTest2 {

    @Test
    public void LoginTest() throws InterruptedException  {
        System.out.println("LoginTest. Thread id -->: " + Thread.currentThread().getId());
        Assert.assertEquals("A","A");
        Thread.sleep(5000);
    }

    @AfterTest
    void tearDown()
    {
        System.out.println("teardown");
    }

}
