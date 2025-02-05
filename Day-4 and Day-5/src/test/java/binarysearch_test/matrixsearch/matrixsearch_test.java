package binarysearch_test.matrixsearch;

import binarysearch.matrixsearch.MatrixSearch;
import org.junit.Assert;
import org.junit.Test;

public class matrixsearch_test {
    @Test
    public void test(){
        int[][] matrix = { // Example 2D matrix
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 60}
        };
        int target = 3; // Target value to search

        Assert.assertEquals(true, MatrixSearch.searchMatrix(matrix, target));

    }
}
