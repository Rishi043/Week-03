package quicksort;

public class QuickSort {
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

public static void quickSort(int arr[], int low, int high){
        if (low < high){
            int pivot_index = partition(arr, low, high);

            quickSort(arr, low, pivot_index-1);
            quickSort(arr, pivot_index+1, high);
        }
}
}
