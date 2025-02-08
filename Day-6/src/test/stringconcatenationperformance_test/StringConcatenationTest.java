// test file
package stringconcatenationperformance_test;

import org.junit.Assert;
import org.junit.Test;
import stringconcatenationperformance.StringConcatenation;

public class StringConcatenationTest {
    @Test
    public void test(){
        int [] sizes = {1000, 10000};
        for (int size : sizes){
            double [] ans = StringConcatenation.compareString(size);

            // String builder will take less time than String
            // String builder will also take less time than String Buffer
            Assert.assertEquals(ans[1] < ans[0] && ans[1] < ans[2], true);
        }
    }
}
