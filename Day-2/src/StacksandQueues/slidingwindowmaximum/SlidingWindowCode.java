package StacksandQueues.slidingwindowmaximum;

import java.util.Deque;
import java.util.LinkedList;

public class SlidingWindowCode {

    public int[] Sliding(int[] arr,int k){
        if(arr==null||k<=0){
            System.out.println("Nothing to print");
        }
        int n = arr.length;
        int[] result = new int[n - k + 1];
        Deque<Integer> deque = new LinkedList<>(); // Store indices

        for (int i = 0; i < n; i++) {
            if (!deque.isEmpty() && deque.peek() < i - k + 1) {
                deque.poll();
            }

            while (!deque.isEmpty() && arr[deque.peekLast()] < arr[i]) {
                deque.pollLast();
            }

            deque.offer(i);

            if (i >= k - 1) {
                result[i - k + 1] = arr[deque.peek()];
            }
        }

        return result;
    }
}