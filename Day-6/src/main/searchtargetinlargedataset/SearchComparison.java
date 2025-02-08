package searchtargetinlargedataset;
import java.util.Arrays;

public class SearchComparison {

    // Linear Search (O(N)): Checks each element one by one
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) { // Iterate through the array
            if (arr[i] == target) { // If element equals target, return index
                return i;
            }
        }
        return -1; // Return -1 if target not found
    }

    // Iterative Binary Search (O(log N)): Efficiently searches in sorted array
    public static int binarySearchIterative(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left <= right) { // While there is a search space
            int mid = left + (right - left) / 2; // Calculate middle index

            if (arr[mid] == target) return mid; // If target found, return index
            else if (arr[mid] < target) left = mid + 1; // Search in right half
            else right = mid - 1; // Search in left half
        }
        return -1;               // Return -1 if target not found
    }

    // Compare search performance
    public static double[] compare(int size) {
        int[] data = new int[size]; // Create array of given size
        double[] output = new double[2];
        for (int i = 0; i < size; i++) {
            data[i] = i;                     // Fill array with 0 to size-1
        }
        int target = size - 1; // Set target to the last element

        // Linear Search Performance
        long start = System.nanoTime();
        linearSearch(data, target);
        long linearTime = System.nanoTime() - start; // Calculate linear search time

        // Binary Search Performance
        Arrays.sort(data); // Sort array before binary search
        start = System.nanoTime();
        binarySearchIterative(data, target);
        long binaryIterTime = System.nanoTime() - start; // Calculate binary search time

        output[0] = linearTime / 1000000.0; // Convert time to milliseconds
        output[1] = binaryIterTime / 1000000.0;

        System.out.println("Dataset Size: " + size);
        System.out.println("Linear Search Time: " + output[0] + " ms");
        System.out.println("Binary Search Time: " + output[1] + " ms");
        System.out.println("---------------------------------");
        return output;
    }
}
