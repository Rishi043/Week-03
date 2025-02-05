package stringbuffer.concatenation_test;

import org.junit.Assert;
import org.junit.Test;
import stringbuffer.concatenation.StringBufferConcatenation;

public class bufferconcatenation_test {

    @Test
    public void tester() {
        // Passing multiple string arguments
        String result = StringBufferConcatenation.concatenateStrings("Hello", " I am", " Rishi");

        // Verify the result
        Assert.assertEquals("HelloIamRishi", result);
    }
}
