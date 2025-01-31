package mergesort;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the no. of books: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // calling the merge sort method
        MergeSort.sort(arr);

        System.out.println("Sorted Book Prices");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}