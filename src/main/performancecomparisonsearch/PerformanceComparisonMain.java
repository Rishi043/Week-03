package performancecomparisonsearch;

import static performancecomparisonsearch.PerformanceComparison.comparePerformance;

public class PerformanceComparisonMain {
    public static void main(String[] args) {
        int [] sizes = {1000, 100000, 1000000};

        for (int i : sizes){
            comparePerformance(i);
        }
    }
}
