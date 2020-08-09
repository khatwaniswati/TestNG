import org.testng.annotations.Test;

public class PriorityExample {
    @Test(priority=0)
    public void TestOne(){
        System.out.println("This is Test1.");
    }

    @Test(priority=10)
    public void TestTwo(){
        System.out.println("This is Test2.");
    }

    @Test(priority=20)
    public void TestThree(){
        System.out.println("This is Test3.");
    }

    @Test(priority=33,enabled = false)
    public void TestFour(){
        System.out.println("This is Test4.");
    }
}
