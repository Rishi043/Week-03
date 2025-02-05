package filereader.readfile;

import java.io.*;

public class ReadFileUsingFileReader {
    public static void main(String[] args) {

        // path of the file
        String filePath = "C:\\Users\\asus\\Desktop\\example.txt";

        // try-with-resources to automatically close the file
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;

            // To read the file line by line
            while ((line = reader.readLine()) != null) {
                // Print each line
                System.out.println(line);
            }
        } catch (IOException e) {
            // Handle errors (e.g., file not found)
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}

