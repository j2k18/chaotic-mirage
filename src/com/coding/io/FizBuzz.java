package com.coding.io;

public class FizBuzz {

    private static void printFizBuzz(int n){
        if (n%15 == 0)
            System.out.println("FizBuzz");
        else if (n%3 == 0)
            System.out.println("Fizz");
        else if (n%5 == 0)
            System.out.println("Buzz");
        else System.out.println(n);
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            printFizBuzz(i);
        }
    }
}
