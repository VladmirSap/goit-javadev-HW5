package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int n = 8;

        //  Iterative
        int fibonacci = FibonacciIterative.fibonacci(n);
        System.out.println("Iterative fibonacci n = " + n + ", fibonacci = " + fibonacci);

        // Recursive
        int fibonacciR = FibonacciRecursive.fibonacci(n);
        System.out.println("Recursive fibonacci n = " + n + ", fibonacci = " + fibonacciR);

        // Dynamic programmming
        int fibonacciDP = FibonacciDP.fibonacci(n);
        System.out.println("DP fibonacci n = " + n + ", fibonacci = " + fibonacciDP);

    }
}