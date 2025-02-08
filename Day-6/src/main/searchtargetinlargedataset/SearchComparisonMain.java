package searchtargetinlargedataset;
import static searchtargetinlargedataset.SearchComparison.compare;

public class SearchComparisonMain {

    // Main function to call compare
    public static void main(String[] args) {
        int [] sizes = {1000, 10000, 1000000}; // Different dataset sizes

        for (int i : sizes) {
            compare(i); // Call compare for each dataset size
        }
    }
}