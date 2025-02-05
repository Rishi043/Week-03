package binarysearch.matrixsearch;

public class Main {
    public static void main(String[] args) {
        int[][] matrix = { // Example 2D matrix
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 60}
        };

        int target = 8; // Target value to search

        // Call search function and print result
        boolean found = MatrixSearch.searchMatrix(matrix, target);
        System.out.println(found);
    }
}
