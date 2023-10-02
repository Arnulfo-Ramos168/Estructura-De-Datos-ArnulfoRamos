package edu.arnulfo.ramos.utils.sorting;

import java.util.Arrays;
import java.util.Random;

/**
 * Clase PerformanceTester que evalúa el rendimiento de algoritmos de ordenamiento.
 */
public class PerformanceTester {

    // Variables estáticas para contar comparaciones y movimientos.
    public static int COMPARACIONES = 0;
    public static int MOVIMIENTOS = 0;

    /**
     * Método para evaluar el rendimiento de un algoritmo de ordenamiento.
     * @param sorter Objeto que implementa la interfaz Sorter y contiene el algoritmo de ordenamiento a evaluar.
     */
    public static void testPerformance(Sorter sorter) {
        final int RANGO = 1_000;
        final int ITERACIONES = 500;
        final int INCREMENTOS = 100;

        // Arreglo bidimensional para almacenar los resultados de rendimiento.
        double[][] performanceResults = new double[RANGO / INCREMENTOS][2];

        // Itera sobre diferentes tamaños de arreglo.
        for (int N = 1, k = 0; N <= RANGO; N += INCREMENTOS, k++) {
            // Reinicia contadores de comparaciones y movimientos.
            COMPARACIONES = 0;
            MOVIMIENTOS = 0;

            // Llama al algoritmo de ordenamiento 'ITERACIONES' veces para obtener un promedio.
            for (int i = 0; i < ITERACIONES; i++) {
                // Genera un arreglo aleatorio de tamaño 'N'.
                int[] array = getRandomArray(N, Short.MIN_VALUE, Integer.MAX_VALUE);
                // Ordena el arreglo con el algoritmo de ordenamiento proporcionado.
                sorter.sort(array);
            }

            // Calcula el promedio de comparaciones y movimientos.
            performanceResults[k][0] += sorter.getComparaciones();
            performanceResults[k][1] += sorter.getMovimientos();
            performanceResults[k][0] = performanceResults[k][0] / ((double) ITERACIONES);
            performanceResults[k][1] = performanceResults[k][1] / ((double) ITERACIONES);
        }

        // Imprime los resultados de rendimiento.
        System.out.println("{algoritmo}: ");
        System.out.println(performanceResults.length);
        for(double[] results: performanceResults)
            System.out.println(Arrays.toString(results).replace("[","").replace("]","").replace(",",""));
    }

    /**
     * Método para generar un arreglo aleatorio de enteros dentro de un rango específico.
     * @param n Tamaño del arreglo.
     * @param minVal Valor mínimo del rango.
     * @param maxVal Valor máximo del rango.
     * @return Arreglo de enteros aleatorios.
     */
    public static int[] getRandomArray(int n, int minVal, int maxVal) {
        Random random = new Random();
        return random.ints(n, minVal, maxVal).toArray();
    }

    /**
     * Método para intercambiar dos elementos en un arreglo.
     * @param N Arreglo en el que se realizan los intercambios.
     * @param i Índice del primer elemento.
     * @param j Índice del segundo elemento.
     */
    public static void swap(int[] N, int i, int j) {
        int aux = N[i];
        N[i] = N[j];
        N[j] = aux;
    }
}