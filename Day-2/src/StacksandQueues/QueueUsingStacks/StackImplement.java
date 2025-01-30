package StacksandQueues.QueueUsingStacks;

import java.util.Stack;

public class StackImplement {
    Stack <Character> stack1=new Stack<Character>();
    Stack <Character> stack2=new Stack<Character>();
    public void enque(char c){
        stack1.push(c);
    }
    public char deque() {
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
        if (stack2.isEmpty()) {
            System.out.println("Queue is empty");
        }

        return stack2.pop();
    }
}