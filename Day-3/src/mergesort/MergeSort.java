package mergesort;

public class MergeSort {
    public static void sort(int [] arr){
        if (arr.length < 2) return;  // Base case: already sorted

        int mid = arr.length / 2;
        int[] left = new int[mid];
        int[] right = new int[arr.length - mid];

        // Copying elements into left and right arrays
        System.arraycopy(arr, 0, left, 0, mid);
        System.arraycopy(arr, mid, right, 0, arr.length - mid);

        // Recursively sort and merge
        sort(left);
        sort(right);
        merge(arr, left, right);
    }

    // Creating Method with name merge to "combine two sorted arrays"

    public static void merge(int[] arr, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;

        // Merging the two sorted arrays into the original array

        // k is the index

        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }
        // If there are remaining elements in left array, copy them
        while (i < left.length) {
            arr[k++] = left[i++];
        }

        // If there are remaining elements in right array, copy them
        while (j < right.length) {
            arr[k++] = right[j++];
        }
    }
}
