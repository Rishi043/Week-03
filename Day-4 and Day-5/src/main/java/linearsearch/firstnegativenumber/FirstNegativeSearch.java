package linearsearch.firstnegativenumber;

public class FirstNegativeSearch {
    // Linear search function to find first negative number
    public static int findFirstNegative(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) return i; // Return index if negative number is found
        }
        return -1; // Return -1 if no negative number is found
    }

    public static void main(String[] args) {
        int[] arr = {10, -20, 30, -40, 50}; // Example array

        // Linear search function call
        int index = findFirstNegative(arr);
        System.out.println(index != -1 ? "First negative number at index: " + index : "No negative number found");
    }
}
