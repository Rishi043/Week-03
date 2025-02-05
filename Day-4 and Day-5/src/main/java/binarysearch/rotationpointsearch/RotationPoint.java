package binarysearch.rotationpointsearch;

public class RotationPoint {

        // Function to find rotation point using binary search
        public static int findRotationPoint(int[] arr) {
            int left = 0;
            int right = arr.length - 1;

            while (left < right) {
                int mid = left + (right - left) / 2;

                if (arr[mid] > arr[right]) { // Smallest element is in the right half
                    left = mid + 1;
                } else { // Smallest element is in the left half
                    right = mid;
                }
            }
            return left; // Rotation point index
        }
    }
