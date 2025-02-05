package stringbuilder.reversestring;

import java.util.*;

public class ReverseStringUsingStringBuilder {
    public static String reverse(String str){
        StringBuilder sb = new StringBuilder(str);
//        sb.reverse();
        return sb.reverse().toString();
    }

    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string to reverse: ");
        String input = sc.next();
        System.out.println("Reversed String: " + reverse(input));
    }
}