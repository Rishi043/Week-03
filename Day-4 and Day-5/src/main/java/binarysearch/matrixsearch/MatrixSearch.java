package binarysearch.matrixsearch;

public class MatrixSearch {
    // Function to perform binary search in 2D matrix
    public static boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0) return false;

        int rows = matrix.length;
        int cols = matrix[0].length;
        int left = 0;
        int right = rows * cols - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int midValue = matrix[mid / cols][mid % cols]; // Convert mid to row and column

            if (midValue == target)
                return true; // Target found
            if (midValue < target)
                left = mid + 1; // Search right half
            else
                right = mid - 1; // Search left half
        }
        return false; // Target not found
    }
}
