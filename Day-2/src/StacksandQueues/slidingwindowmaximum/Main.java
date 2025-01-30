package StacksandQueues.slidingwindowmaximum;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        SlidingWindowCode s=new SlidingWindowCode();
        int[] arr = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        int[] result = s.Sliding(arr, k);

        System.out.println(Arrays.toString(result));
    }
}
