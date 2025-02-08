// test file
package sortinglargedataefficiently_test;

import org.junit.Assert;
import org.junit.Test;
import sortinglargedataefficiently.SortCompare;


public class SortCompareTest {
    @Test
    public void test(){
        int [] sizes = {1000, 10000};
        for (int i : sizes) {
            double[] ans = SortCompare.compare(i);

            // compare merge < bubble && merge < quick
            Assert.assertEquals(ans[1] < ans[0] && ans[1] < ans[2], true);

        }
    }
}
