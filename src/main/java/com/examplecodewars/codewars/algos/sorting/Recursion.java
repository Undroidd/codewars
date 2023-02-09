package com.examplecodewars.codewars.algos.sorting;

public class Recursion {

    public static int factorial(int n) {
        if(n == 0 ) {
            return 1;
        }

        return n * factorial(n-1);
    }

    public static int fibonaci(int n) {
        if(n == 1 || n == 2 ) {
            return 1;
        }

        return fibonaci(n-2) + fibonaci(n-1);
    }

    // n = 2 => 2
    public static int frogways(int n) {
        if(n <= 0 ) {
            return 1;
        }

        if(n - 2 > 0) {

        }

        return frogways(n - 1) + frogways(n - 2);
    }
}
