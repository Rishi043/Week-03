package StacksandQueues.QueueUsingStacks;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StackImplement s=new StackImplement();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string :- ");
        String input=sc.nextLine();

        for(int i=0;i<input.length();i++){
            s.enque(input.charAt(i));
        }
        for(int i=0;i<input.length();i++){
            System.out.println(s.deque());
        }

    }
}
