package stringbuilder.removeduplicates;

import java.util.*;

public class RemoveDuplicate {
    public static String removeDuplicates(String str){
        StringBuilder sb = new StringBuilder();
        // Create a HashSet to keep track of characters we've already seen
        HashSet<Character> seenCharacter = new HashSet<>();

        for(char ch : str.toCharArray()){
            if (!seenCharacter.contains(ch))
            {
                // if it is not present
                sb.append(ch);
                // Append the character to the StringBuilder

                // Add the character to the HashSet to mark it as seen
                seenCharacter.add(ch);
            }
        }
        // Convert the StringBuilder to a string and return it
        return sb.toString();
    }

    public static void main(String [] args){
        String str = "I am Rishi Thakur";

        System.out.println("String after removing duplicates: " + removeDuplicates(str));
    }

}

