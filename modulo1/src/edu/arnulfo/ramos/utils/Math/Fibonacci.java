package edu.arnulfo.ramos.utils.Math;

public class Fibonacci {
    public static int fibonacciIterativo(int n) {

        if (n <= 1) {

            return n;

        }

        int a = 0, b = 1, result = 0;

        for (int i = 2; i <= n; i++) {

            result = a + b;

            a = b;

            b = result;

        }

        return result;

    }






    public static int fibonacciRecursivo(int n) {

        if (n <= 1) {

            return n;

        }

        return fibonacciRecursivo(n - 1) + fibonacciRecursivo(n - 2);

    }

}
