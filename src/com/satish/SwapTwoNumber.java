package com.satish;

public class SwapTwoNumber {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        b = a + b;
        System.out.println("b " + b);
        a = b - a;
        System.out.println("a " + a);
        b = b - a;
        System.out.println("b again " + b);
    }
}
