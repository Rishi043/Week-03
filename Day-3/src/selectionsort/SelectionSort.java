package selectionsort;

public class SelectionSort {
    public static void sort(int [] arr){
        for(int i=0;i<arr.length-1;i++){
            // finding the smallest element[index]
            int smallest = i;

            for (int j=i+1;j<arr.length;j+=1){
                if (smallest > arr[j]){
                    smallest = j;          // updating the smallest [index]
                }
            }

            //swap (arr[smallest], arr[i])
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
    }
}
