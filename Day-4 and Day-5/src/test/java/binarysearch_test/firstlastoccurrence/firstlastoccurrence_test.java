package binarysearch_test.firstlastoccurrence;

import binarysearch.firstlastoccurrence.FirstLastOccurrence;
import org.junit.Assert;
import org.junit.Test;

public class firstlastoccurrence_test {
    @Test
    public void test(){
        int[] arr = {2, 4, 4, 4, 5, 5, 7, 9}; // Sorted array
        int target = 4; // Target value to search

        Assert.assertEquals(1, FirstLastOccurrence.findFirstOccurrence(arr, target));
        Assert.assertEquals(3, FirstLastOccurrence.findLastOccurrence(arr, target));

    }
}
