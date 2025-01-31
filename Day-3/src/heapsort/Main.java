package heapsort;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no. of applicants: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // calling the heap sort method
        HeapSort.heapSort(arr);

        System.out.println("Sorted Job Applicants by Salary:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}

