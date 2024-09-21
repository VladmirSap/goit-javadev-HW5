package org.example;

// Часова складність: O(2^n)
// Просторова складність: O(n) (для рекурсивного стеку)

public class FibonacciRecursive {
    public static int fibonacci(int n) {
        if (n <= 1) return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
