package quicksort;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the no. of products: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // calling the quick sort method
        QuickSort.quickSort(arr, 0, n-1);

        System.out.println("Sorted Product Prices");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}