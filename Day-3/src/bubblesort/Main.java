package bubblesort;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no. of students: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the marks of " + n + " students:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // Calling the Bubble Sort method
        BubbleSort.sort(arr);                    // because of static

        // Displaying sorted marks
        System.out.println("Sorted Marks:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();

        sc.close();   // closing the scanner object
    }
}

