package StacksandQueues.sortastackusingrecursion;

import java.util.Stack;

public class SortStackUsingRecursion {
    public static void main(String[] args) {
        SortStack s = new SortStack();
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(0);
        st.push(5);
        st.push(4);

        System.out.println("Original Stack: " + st);

        s.sort(st);      // using the method

        System.out.println("After Sorting: " + st);

    }
}
