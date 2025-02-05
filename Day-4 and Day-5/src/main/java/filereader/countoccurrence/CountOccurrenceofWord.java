package filereader.countoccurrence;
import java.io.*;

public class CountOccurrenceofWord {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\asus\\Desktop\\example.txt"; // File path
        String targetWord = "maven"; // Word to count
        int wordCount = 0; // Counter for word occurrences

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) // Read file line by line
                for (String word : line.split("\\s+")) // Split line into words
                    if (word.replaceAll("[^a-zA-Z]", "").equalsIgnoreCase(targetWord))
                        // Clean and compare

                        wordCount++; // Increment counter
            System.out.println("The word '" + targetWord + "' appears " + wordCount + " times."); // Output result

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage()); // Handle errors
        }
    }
}