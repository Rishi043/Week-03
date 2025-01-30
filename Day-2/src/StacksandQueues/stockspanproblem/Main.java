package StacksandQueues.stockspanproblem;

public class Main {
    public static void main(String[] args) {
        StockSpan s=new StockSpan();
        int[] prices = {10, 4, 5, 90, 120, 80};  // Example stock prices
        s.calculate(prices);
        s.display();
    }
}
