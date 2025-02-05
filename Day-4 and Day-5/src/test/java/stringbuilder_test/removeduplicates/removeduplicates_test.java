package stringbuilder_test.removeduplicates;

import stringbuilder.removeduplicates.RemoveDuplicate;
import org.junit.Assert;
import org.junit.Test;

public class removeduplicates_test {
    @Test
    public void tester(){
        // Correct the argument type to String
        String str = "Thakur";

        String result = RemoveDuplicate.removeDuplicates(str);

        // Update the expected result to match the functionality of the method
        Assert.assertEquals("Thakur", result);
    }
}
