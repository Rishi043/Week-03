package binarysearch.firstlastoccurrence;

public class FirstLastOccurrence {

    // Method to find the first occurrence of the target element
    public static int findFirstOccurrence(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        int firstOccurrence = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                firstOccurrence = mid;
                right = mid - 1; // Search in the left half
            } else if (arr[mid] < target) {
                left = mid + 1; // Search in the right half
            } else {
                right = mid - 1; // Search in the left half
            }
        }
        return firstOccurrence;
    }

    // Method to find the last occurrence of the target element
    public static int findLastOccurrence(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        int lastOccurrence = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                lastOccurrence = mid;
                left = mid + 1; // Search in the right half
            } else if (arr[mid] < target) {
                left = mid + 1; // Search in the right half
            } else {
                right = mid - 1; // Search in the left half
            }
        }
        return lastOccurrence;
    }
}