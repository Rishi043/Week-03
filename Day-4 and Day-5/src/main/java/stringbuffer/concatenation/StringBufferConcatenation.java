package stringbuffer.concatenation;
import java.util.*;

public class StringBufferConcatenation {

    // Using varargs to accept multiple strings
    public static String concatenateStrings(String... str){
        StringBuffer sb = new StringBuffer();

        // Iterate through the array and append each string to the StringBuffer
        for (String s : str) {
            sb.append(s.replaceAll("\\s+", "")); // remove spaces before appending
//            sb.append(s);             // append in the StringBuffer object
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        // Calling the method with multiple string arguments without using an array
        System.out.println(concatenateStrings("Hello", "I", "am", "Rishi"));
    }
}

