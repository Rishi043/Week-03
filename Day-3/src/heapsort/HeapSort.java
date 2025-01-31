package heapsort;

public class HeapSort {

        public static void heapSort(int[] arr) {
            int n = arr.length;

            //  Building a Max Heap
            for (int i = n / 2 - 1; i >= 0; i--) {
                heapify(arr, n, i);
            }

            // Extract elements one by one from the heap
            for (int i = n - 1; i > 0; i--) {
                // Swap the root (largest element) with the last element
                swap(arr, 0, i);

                // Reduce heap size and heapify the root again
                heapify(arr, i, 0);
            }
        }

        // Heapify function to maintain max heap property
        private static void heapify(int[] arr, int n, int i) {
            int largest = i;  // Assume root is the largest
            int left = 2 * i + 1;  // Left child
            int right = 2 * i + 2; // Right child

            // Check if left child is larger than root
            if (left < n && arr[left] > arr[largest]) {
                largest = left;
            }

            // Check if right child is larger than the largest so far
            if (right < n && arr[right] > arr[largest]) {
                largest = right;
            }

            // largest is not root, swap and heapify the affected subtree
            if (largest != i) {
                swap(arr, i, largest);
                heapify(arr, n, largest);
            }
        }

        // Swaping
        private static void swap(int[] arr, int i, int j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }