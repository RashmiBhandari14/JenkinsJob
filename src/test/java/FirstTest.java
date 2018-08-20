import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class FirstTest {

    @BeforeClass
    public static void beforeMethod() {
        System.out.println("Before");
    }

    @Test
    public void failTest() {
        Assert.assertTrue(1 == 2);
    }

    @Test
    public void passTest() {
        Assert.assertTrue(1 == 1);
    }

    @AfterClass
    public static void afterMethod() {
        System.out.println("After");
    }
}