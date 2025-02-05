package stringbuilder_test.reversestring;

// package name . subpackage name . class name. method name
import stringbuilder.reversestring.ReverseStringUsingStringBuilder;
import org.junit.Assert;
import org.junit.Test;

public class reversestring_test  {
    @Test
    public void tester(){

        String str = "rishi";

        //Assert.assertEquals("ihsir", result);
        Assert.assertEquals("ihsir", ReverseStringUsingStringBuilder.reverse(str));
    }
}
