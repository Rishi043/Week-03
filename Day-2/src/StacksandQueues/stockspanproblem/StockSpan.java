package StacksandQueues.stockspanproblem;

import java.util.Stack;

public class StockSpan {
    int[] span;
    public void calculate(int[] arr){
        Stack <Integer> stack1 = new Stack<>();

        span=new int[arr.length];

        for(int i=0;i<arr.length;i++){
            while(!stack1.isEmpty() && arr[stack1.peek()]<=arr[i]) {
                stack1.pop();

            }
            span[i] = (stack1.isEmpty()) ? i + 1 : i - stack1.peek();

            // Push the current day index to the stack
            stack1.push(i);
        }

    }
    public void display(){
        for (int i = 0; i < span.length; i++) {
            System.out.println("Day " + (i + 1) + ": Span = " + span[i]);
        }
    }
}