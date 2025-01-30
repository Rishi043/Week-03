package StacksandQueues.circulartourproblem;

import java.util.LinkedList;
import java.util.Queue;

public class CircularTour {
    public int result(int[][] arr){
        Queue<Integer> queue = new LinkedList<>();
        int totalSurplus = 0;
        int currentSurplus = 0;
        int startIndex = 0;

        for (int i=0;i<arr.length;i++){
            int petrol = arr[i][0];
            int distance = arr[i][1];  // Distance to next pump
            int balance = petrol - distance;

            totalSurplus += balance;  // Total balance calculation
            currentSurplus += balance;

            if (currentSurplus < 0) {
                // Reset queue (remove elements) and set the next possible start point
                while (!queue.isEmpty()) {
                    queue.poll();  // Remove pumps from the front of the queue
                }
                startIndex = i + 1;  // New start point
                currentSurplus = 0;   // Reset current surplus
            }

        }
        return (totalSurplus >= 0) ? startIndex : -1;

    }

}
