package stringconcatenationperformance;

import static stringconcatenationperformance.StringConcatenation.compareString;

public class StringConcatenationMain {

    public static void main(String[] args) {
        int [] sizes = {1000, 10000, 1000000}; // Different dataset

        // will not give the ans for Adding "1000000" Elements

        for (int i : sizes) {
            compareString(i); // Call compare for each dataset size
        }
    }
}
