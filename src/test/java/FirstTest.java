import org.junit.Assert;

public abstract class FirstTest {

    public static void main(String[] args) {
        System.out.println("Before");
        passTest();
        failTest();
        System.out.println("After");
    }

    private static void failTest() {
        Assert.assertTrue(1==2);
    }

    private static void passTest() {
        Assert.assertTrue(1==1);
    }

}