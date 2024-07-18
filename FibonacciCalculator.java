//package com.mycompany.fibonaccicalculator;

/**
 *
 * @author Group A
 */
public class FibonacciCalculator {

     private int limit;

    // Constructor
    public FibonacciCalculator(int limit) {
        this.limit = limit;
    }

    // Non-static method to get the sum of even Fibonacci terms up to the limit
    public int sumOfEvenFibonacciTerms() {
        int sum = 0;
        int a = 1;
        int b = 2;
        while (b <= limit) {
            if (b % 2 == 0) {
                sum += b;
            }
            int next = a + b;
            a = b;
            b = next;
        }
        return sum;
    }

    // Static method to generate the Fibonacci sequence up to a certain number of terms
    public static void generateFibonacci(int terms) {
        int a = 1;
        int b = 2;
        System.out.print(a + " " + b);
        for (int i = 3; i <= terms; i++) {
            int next = a + b;
            System.out.print(" " + next);
            a = b;
            b = next;
        }
        System.out.println();
    }

    // Static method to print the sum of even Fibonacci terms up to the limit
    public static void printSumOfEvenFibonacciTerms(int limit) {
        FibonacciCalculator calculator = new FibonacciCalculator(limit);
        int sum = calculator.sumOfEvenFibonacciTerms();
        System.out.println("The sum of even Fibonacci terms up to " + limit + ": " + sum);
    }

    public static void main(String[] args) {
        // Example usage
        int terms = 10;
        int limit = 4000000;
        
        System.out.println("The first " + terms + " terms of the Fibonacci sequence:");
        generateFibonacci(terms);

        printSumOfEvenFibonacciTerms(limit);
    }
}
