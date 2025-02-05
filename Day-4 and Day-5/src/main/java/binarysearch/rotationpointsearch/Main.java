package binarysearch.rotationpointsearch;

public class Main {
    public static void main(String[] args) {
        int[] arr = {50, 60, 70, 10, 20, 30, 40}; // Rotated sorted array

        // Call binary search function to find rotation point

        System.out.println("Rotation point index: " + RotationPoint.findRotationPoint(arr)); // Output: 3
    }
}
