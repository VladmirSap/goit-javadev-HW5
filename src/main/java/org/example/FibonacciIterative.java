package org.example;

// Часова складність: O(n)
// Просторова складність: O(1)

public class FibonacciIterative {
    public static int fibonacci(int n) {
        if (n <= 1) return n;
        int firstNumber = 0;
        int secondNumber = 1;
        int tempNumber = 0;
        for (int i = 2; i <= n; i++) {
            tempNumber = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = tempNumber;
        }
        return secondNumber;
    }
}
