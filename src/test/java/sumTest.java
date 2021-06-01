import org.testng.Assert;
import org.testng.annotations.Test;

public class sumTest {
    @Test
    public void test(){
        int expect=11;
        sum sum = new sum();
        int add =sum.add(5, 6);
        Assert.assertEquals(add,expect);


    }
}
