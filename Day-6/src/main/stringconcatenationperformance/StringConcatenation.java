package stringconcatenationperformance;

public class StringConcatenation {

    // string method
    public static void String(int size){
        String str = "";
        for (int i = 0; i < size; i++) {
            str += "a";       // Each concatenation creates a new String object
        }
    }

    // StringBuilder method
    public static void StringBuilder(int size){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            sb.append("a");
        }
    }

    // StringBuffer method
    public static void StringBuffer(int size){
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < size; i++) {
            sb.append("a");
        }
    }

    public static double[] compareString(int size) {
        double[] output = new double[3];

        // String Concatenation Performance
        long start = System.nanoTime();
        String(size);
        long stringConcatenationTime = System.nanoTime() - start; // Calculate bubble sort time

        // String Builder Concatenation Performance
        start = System.nanoTime();
        StringBuilder(size);
        long stringBuilderConcatenationTime = System.nanoTime() - start; // Calculate merge sort time

        // String Buffer Concatenation Performance
        start = System.nanoTime();
        StringBuffer(size);
        long stringBufferConcatenationTime = System.nanoTime() - start;


        output[0] = stringConcatenationTime / 1000000.0; // Convert time to milliseconds
        output[1] = stringBuilderConcatenationTime / 1000000.0;
        output[2] = stringBufferConcatenationTime / 1000000.0;

        System.out.println("Dataset Size: " + size);
        System.out.println("String Concatenation Time: " + output[0] + " ms");
        System.out.println("StringBuilder Concatenation Time: " + output[1] + " ms");
        System.out.println("StringBuffer Concatenation Time: " + output[2] + " ms");

        System.out.println("---------------------------------");
        return output;
    }
}
