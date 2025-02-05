package challengeproblem.compareall4;


import java.io.*; // Required classes import karna
import java.util.StringTokenizer; // StringTokenizer class ka import

public class CompareAll4 {
    public static void main(String[] args) {
        // StringBuilder ka time measure karna
        long t1 = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 1000000; i++) sb.append("hello");
        System.out.println("StringBuilder: " + (System.nanoTime() - t1) / 1000000 + " ms");

        // StringBuffer ka time measure karna
        t1 = System.nanoTime();
        StringBuffer sbf = new StringBuffer();
        for (int i = 0; i < 1000000; i++) sbf.append("hello");
        System.out.println("StringBuffer: " + (System.nanoTime() - t1) / 1000000 + " ms");

        // File ka path define karna
        String path = "C:\\Users\\asus\\Desktop\\userInput.txt";

        // FileReader ka test karna
        t1 = System.nanoTime();
        int wordsFR = countWords(path, true);
        System.out.println("FileReader - Words: " + wordsFR + ", Time: " + (System.nanoTime() - t1) / 1000000 + " ms");

        // InputStreamReader ka test karna
        t1 = System.nanoTime();
        int wordsISR = countWords(path, false);
        System.out.println("InputStreamReader - Words: " + wordsISR + ", Time: " + (System.nanoTime() - t1) / 1000000 + " ms");
    }

    // FileReader ya InputStreamReader ka use karke words count karna
    private static int countWords(String path, boolean useFileReader) {
        try (BufferedReader br = new BufferedReader(useFileReader ? new FileReader(path) : new InputStreamReader(new FileInputStream(path)))) {
            int count = 0;
            String line;
            while ((line = br.readLine()) != null) count += new StringTokenizer(line).countTokens();
            return count;
        } catch (IOException e) {
            System.out.println((useFileReader ? "FR" : "ISR") + " Error: " + e.getMessage());
            return 0;
        }
    }
}

