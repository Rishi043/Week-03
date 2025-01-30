package HashMapandHashFunctions.longestconsecutivesequence;

public class Main {
    public static void main(String[] args) {
        LongestConsective longest=new LongestConsective();

        int [] arr={1,2,3,4,8,9,5};
        longest.consective(arr);
        longest.maxConsecutive();
    }
}