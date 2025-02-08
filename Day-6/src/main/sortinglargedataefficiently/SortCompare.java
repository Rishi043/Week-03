package sortinglargedataefficiently;

public class SortCompare {

    // bubble sort
    public static void bubblesort(int [] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }
            }
        }
    }

    // merge sort
   public static void mergesort(int [] arr){
        if (arr.length < 2) return;  // Base case: already sorted

        int mid = arr.length / 2;
        int[] left = new int[mid];
        int[] right = new int[arr.length - mid];

        // Copying elements into left and right arrays
        System.arraycopy(arr, 0, left, 0, mid);
        System.arraycopy(arr, mid, right, 0, arr.length - mid);

        // Recursively sort and merge
        mergesort(left);
        mergesort(right);
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


    public static int partition(int arr[], int low, int high){
        int pivot = arr[high];    // let the last element be "pivot"
        int i = low-1;

        for (int j=low; j<high; j++){
            if (arr[j] < pivot){
                i++;

                //swap arr[i], arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;      // incrementing to put pivot element at right position

        // swap arr[i], arr[high]
        int temp = arr[i];
        arr[i] = pivot;
        arr[high] = temp;
        return i;                  // returns the index of pivot element
    }

    //quick sort
    public static void quickSort(int arr[], int low, int high){
        if (low < high){
            int pivot_index = partition(arr, low, high);

            quickSort(arr, low, pivot_index-1);
            quickSort(arr, pivot_index+1, high);
        }
    }

    // Compare sort performance
    public static double[] compare(int size) {
        int[] data = new int[size]; // Create array of given size
        double[] output = new double[3];
        for (int i = 0; i < size; i++) {
            data[i] = i;                     // Fill array with 0 to size-1
        }

        // BubbleSort Performance
        long start = System.nanoTime();
        bubblesort(data);
        long bubblesortTime = System.nanoTime() - start; // Calculate bubble sort time

        // Merge sort Performance

        start = System.nanoTime();
        mergesort(data);
        long mergesortTime = System.nanoTime() - start; // Calculate merge sort time

        // for quick sort

        start = System.nanoTime();
        quickSort(data, 0, data.length-1);
        long quicksortTime = System.nanoTime() - start;


        output[0] = bubblesortTime / 1000000.0; // Convert time to milliseconds
        output[1] = mergesortTime / 1000000.0;
        output[2] = quicksortTime / 1000000.0;

        System.out.println("Dataset Size: " + size);
        System.out.println("Bubble Sort Time: " + output[0] + " ms");
        System.out.println("Merge Sort Time: " + output[1] + " ms");
        System.out.println("Quick Sort Time: " + output[2] + " ms");

        System.out.println("---------------------------------");
        return output;
    }
}
