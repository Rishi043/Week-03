package binarysearch_test.peakelement;

import binarysearch.peakelement.PeakElementSearch;
import org.junit.Assert;
import org.junit.Test;

public class peakelement_test {
    @Test
    public void tester(){
//        int[] arr = {1, 3, 20, 4, 1, 0};

        // Assert.assertEquals(20, PeakElementSearch.findPeakElement(arr));

        // Directly provide the array in the method call
        Assert.assertEquals(20, PeakElementSearch.findPeakElement(new int[]{1, 3, 20, 4, 1, 0}));

    }
}
