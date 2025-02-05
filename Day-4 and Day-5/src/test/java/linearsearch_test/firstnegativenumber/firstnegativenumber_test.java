package linearsearch_test.firstnegativenumber;

import linearsearch.firstnegativenumber.FirstNegativeSearch;
import org.junit.Assert;
import org.junit.Test;

public class firstnegativenumber_test {
    @Test
    public void tester(){
        int[] arr = {10, -20, 30, -40, 50};

        Assert.assertEquals(1, FirstNegativeSearch.findFirstNegative(arr));
    }
}








