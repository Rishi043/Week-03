package insertionsort;

public class InsertionSort {
    public static void sort(int [] arr) {
        for (int i=1;i<arr.length;i++){
            int j = i;   // pointer to  compare with sorted array
            while (j > 0 && arr[j] < arr[j-1]){   // 8 | 4 (j)

                // swap a[j],a[j-1]
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;

                j--;         // most imp step till j at right position
            }
        }
    }
}
