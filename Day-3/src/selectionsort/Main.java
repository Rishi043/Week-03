package selectionsort;

import insertionsort.InsertionSort;

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

        // calling the selection sort method
        SelectionSort.sort(arr);

        System.out.println("Sorted Exam Scores: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}

