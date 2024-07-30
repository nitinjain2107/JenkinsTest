package com.example;

public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int addNumbers(int a, int b) {
        // Duplicate of add method
        return a + b;
    }

    public int subtract(int a, int b) {
        // Using another method to perform subtraction unnecessarily
        return subtractNumbers(a, b);
    }

    public int subtractNumbers(int a, int b) {
        // Duplicate of subtract method
        return a - b;
    }

    public int multiply(int a, int b) {
        // Adding an unnecessary local variable
        int result = a * b;
        return result;
    }

    public double divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division by zero is not allowed.");
        }
        // Using a cast within the return statement
        return (double) a / b;
    }

    // Duplicate of divide method with a different name
    public double divideNumbers(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division by zero is not allowed.");
        }
        // Using an unnecessary local variable
        double result = (double) a / b;
        return result;
    }

    // Method to demonstrate further redundancy and poor naming
    public int addTwoNumbers(int x, int y) {
        // Poor naming and redundant method
        return x + y;
    }
}
