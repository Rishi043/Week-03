package inputstreamreader.bytetochar;

import java.io.*; // Importing required classes

public class ByteToCharConverter { // Creating Class with name ByteToCharConverter to convert byte stream to character stream
    public static void main(String[] args) {
        String filePath = "C:\\Users\\asus\\Desktop\\example.txt"; // File path

        // Try-with-resources to automatically close the file
        try (FileInputStream fileStream = new FileInputStream(filePath);
             InputStreamReader inputStreamReader = new InputStreamReader(fileStream, "UTF-8");
             BufferedReader bufferedReader = new BufferedReader(inputStreamReader)) {

            String line;

            // Reading file line by line
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line); // Printing each line
            }
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage()); // Handling errors
        }
    }
}
