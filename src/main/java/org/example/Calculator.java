package org.example;

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        // This is not correct
        return a * b;
    }

    public int divide (int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Divisor cannot be zero! Can't divide by zero!");
        }
        return a / b;
    }
}