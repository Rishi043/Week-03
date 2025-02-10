// test file
package recursiveVSfibonacci_test;
import org.junit.Assert;
import org.junit.Test;

import static recursiveVSfibonacci.RecursivevsIterative.fibonaccicompare;

public class RecursivevsIterativeTest {
    @Test
    public void test(){
        int [] sizes = {10, 30};
        for (int size : sizes){
            double [] ans = fibonaccicompare(size);

            // fibonacci iterative take less time than fibonacci recursive
            Assert.assertEquals(ans[0] > ans[1], true);
        }
    }
}
