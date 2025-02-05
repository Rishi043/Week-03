package inputstreamreader.userinput;
import java.io.*;

public class UserInputtoFile {

    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

            String path = "C:\\Users\\asus\\Desktop\\userInput.txt";

            try (FileWriter fw = new FileWriter(path)) {
                System.out.println("Enter text and type ('exit' to stop):");
                String s;
                while (!(s = br.readLine()).equalsIgnoreCase("exit")) fw.write(s + "\n");

                System.out.println("Saved to: " + path);
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}