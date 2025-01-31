package insertionsort;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no. of employees: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // calling the insertion sort method
        InsertionSort.sort(arr);

        System.out.println("Sorted Employee IDs");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
