package edu.arnulfo.ramos.utils.Math;

/**
 * La clase Factorial contiene dos métodos para calcular el factorial de un número: uno de forma iterativa y otro de forma recursiva.
 */
public class Factorial {

    /**
     * Calcula el factorial de un número de forma iterativa.
     *
     * @param n El número del cual se calculará el factorial.
     * @return El factorial del número n.
     */
    public static long factorialIterativo(int n) {
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }

    /**
     * Calcula el factorial de un número de forma recursiva.
     *
     * @param n El número del cual se calculará el factorial.
     * @return El factorial del número n.
     */
    public static long factorialRecursivo(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * factorialRecursivo(n - 1);
    }
}