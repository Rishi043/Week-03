//Test file
package searchtargetinlargedataset_test;

import org.junit.Assert;
import org.junit.Test;
import searchtargetinlargedataset.SearchComparison;


public class SearchComparisonTest {
    @Test
    public void test(){
        int [] sizes = {1000, 10000, 100000, 10000000};
        for (int i : sizes) {
            double[] ans = SearchComparison.compare(i);
            Assert.assertEquals(ans[0] > ans[1], true);
        }

    }
}
