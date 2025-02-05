package stringbuffer.buffervsbuilder;

public class StringBufferVsStringBuilder {
    public static void main(String[] args) {
        int n = 1000000; // Number of times we will append the string
        String str = "hello";

        // StringBuffer
        StringBuffer stringBuffer = new StringBuffer();
        long startTimeBuffer = System.nanoTime(); // Start time for StringBuffer
        for (int i = 0; i < n; i++) {
            stringBuffer.append(str);
        }
        long endTimeBuffer = System.nanoTime(); // End time for StringBuffer
        long timeTakenBuffer = endTimeBuffer - startTimeBuffer;

        // StringBuilder
        StringBuilder stringBuilder = new StringBuilder();
        long startTimeBuilder = System.nanoTime(); // Start time for StringBuilder
        for (int i = 0; i < n; i++) {
            stringBuilder.append(str);
        }
        long endTimeBuilder = System.nanoTime(); // End time for StringBuilder
        long timeTakenBuilder = endTimeBuilder - startTimeBuilder;

        // Output the results
        System.out.println("Time taken by StringBuffer: " + timeTakenBuffer + " nanoseconds");
        System.out.println("Time taken by StringBuilder: " + timeTakenBuilder + " nanoseconds");
    }
}
