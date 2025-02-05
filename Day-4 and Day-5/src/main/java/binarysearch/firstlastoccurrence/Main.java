package binarysearch.firstlastoccurrence;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 2, 3, 4, 5};
        int target = 2;

        // Call both methods
        int firstOccurrence = FirstLastOccurrence.findFirstOccurrence(arr, target);
        int lastOccurrence = FirstLastOccurrence.findLastOccurrence(arr, target);

        // Print the results
        System.out.println("First Occurrence: " + firstOccurrence);
        System.out.println("Last Occurrence: " + lastOccurrence);
    }
}
