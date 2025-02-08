package sortinglargedataefficiently;

public class SortCompareMain {
    public static void main(String[] args) {
        int [] sizes = {1000, 10000, 1000000}; // Different dataset

        // will not give the ans for bubble sort of "1000000"

        for (int i : sizes) {
            SortCompare.compare(i); // Call compare for each dataset size
        }
    }
}
