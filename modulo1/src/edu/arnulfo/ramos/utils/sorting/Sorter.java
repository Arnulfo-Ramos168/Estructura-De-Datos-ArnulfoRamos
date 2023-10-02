package edu.arnulfo.ramos.utils.sorting;

import java.util.Arrays;
import java.util.Random;

/**
 * Clase abstracta Sorter que define el esqueleto para los algoritmos de ordenamiento.
 */
public abstract class Sorter {
    // Variables protegidas para llevar un registro de comparaciones y movimientos.
    protected int COMPARACIONES = 0;
    protected int MOVIMIENTOS = 0;

    /**
     * Método abstracto que debe ser implementado por las subclases para realizar el ordenamiento.
     *
     * @param N Arreglo de enteros a ordenar.
     */
    public abstract void sort(int[] N);

    /**
     * Genera un arreglo de enteros aleatorios dentro de un rango específico.
     *
     * @param N      Tamaño del arreglo.
     * @param minVal Valor mínimo del rango.
     * @param maxVal Valor máximo del rango.
     * @return Arreglo de enteros aleatorios.
     */
    public static int[] getRandomArray(int N, int minVal, int maxVal) {
        Random random = new Random();
        return random.ints(N, minVal, maxVal).toArray();
    }

    /**
     * Intercambia dos elementos en un arreglo.
     *
     * @param N Arreglo en el que se realizan los intercambios.
     * @param i Índice del primer elemento.
     * @param j Índice del segundo elemento.
     */
    public static void swap(int[] N, int i, int j) {
        int tmp = N[i];
        N[i] = N[j];
        N[j] = tmp;
    }

    /**
     * Imprime el contenido de un arreglo en la consola.
     *
     * @param N Arreglo a imprimir.
     */
    private static void printArray(int[] N) {
        System.out.println(Arrays.toString(N));
    }

    /**
     * Verifica si un arreglo está ordenado en orden ascendente.
     *
     * @param N Arreglo a verificar.
     * @return true si el arreglo está ordenado, false en caso contrario.
     */
    public static boolean isSorted(int[] N) {
        for (int i = 0; i < N.length - 1; i++) {
            if (N[i] > N[i + 1]) {
                return false;
            }
        }
        return true;
    }

    /**
     * Obtiene el número total de comparaciones realizadas durante el proceso de ordenamiento.
     *
     * @return Número de comparaciones.
     */
    public int getComparaciones() {
        return COMPARACIONES;
    }

    /**
     * Obtiene el número total de movimientos realizados durante el proceso de ordenamiento.
     *
     * @return Número de movimientos.
     */
    public int getMovimientos() {
        return MOVIMIENTOS;
    }
}
