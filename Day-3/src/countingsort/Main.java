package countingsort;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no. of students: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // calling the heap sort method
        CountingSort.countingSort(arr,10,18);

        System.out.println("Sorted Student Ages:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}


