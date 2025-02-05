package challengeproblem.linearandbinarysearch;


import java.util.Arrays;

public class LinearAndBinarySearch {
    public static void main(String[] args) {
        int[] arr = {3, 4, -1, 1}; // Example list of integers
        int target = 4; // Target value to search

        // Find the first missing positive integer
        int firstMissingPositive = findFirstMissingPositive(arr);
        System.out.println("First missing positive integer: " + firstMissingPositive);

        // Sort the array for binary search
        Arrays.sort(arr);

        // Find the index of the target value using binary search
        int targetIndex = binarySearch(arr, target);
        System.out.println("Index of target value: " + (targetIndex != -1 ? targetIndex : "Not found"));
    }

    // Linear Search to find the first missing positive integer
    public static int findFirstMissingPositive(int[] arr) {
        int n = arr.length;

        // Mark numbers out of range and negative numbers
        for (int i = 0; i < n; i++) {
            if (arr[i] <= 0 || arr[i] > n) arr[i] = n + 1;
        }

        // Mark the presence of numbers in the array
        for (int i = 0; i < n; i++) {
            int num = Math.abs(arr[i]);
            if (num <= n) arr[num - 1] = -Math.abs(arr[num - 1]);
        }

        // Find the first positive number
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) return i + 1;
        }

        return n + 1; // If all numbers are present
    }

    // Binary Search to find the index of the target value
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) return mid; // Target found
            if (arr[mid] < target) left = mid + 1; // Search in the right half
            else right = mid - 1; // Search in the left half
        }

        return -1; // Target not found
    }
}

