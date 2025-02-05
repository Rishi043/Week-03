package binarysearch.peakelement;

public class PeakElementSearch {

    // Method to find a peak element
    public static int findPeakElement(int[] arr) {
        int n = arr.length;

        // Edge case: single element
        if (n == 1) return arr[0];

        // Check first and last elements
        if (arr[0] >= arr[1]) return arr[0];
        if (arr[n - 1] >= arr[n - 2]) return arr[n - 1];

        // Check middle elements
        for (int i = 1; i < n - 1; i++) {
            if (arr[i] >= arr[i - 1] && arr[i] >= arr[i + 1]) {
                return arr[i];
            }
        }

        return -1; // This line will never be reached
    }
}
