package edu.arnulfo.ramos.tarea13.process;

import java.util.Arrays;

/**
 * Clase que proporciona métodos para calcular la mediana de un conjunto de valores.
 */
public class CalculadorMediana {

    /**
     * Calcula la mediana de un array de enteros.
     *
     * @param valores Un array de enteros del cual se calculará la mediana.
     * @return La mediana de los valores en formato double.
     */
    public static double calcularMediana(int[] valores) {
        // Se clona el array para evitar modificar el array original durante la clasificación.
        int[] orden = valores.clone();
        Arrays.sort(orden);  // Se ordena el array en orden ascendente.

        int tamaño = orden.length;

        if (tamaño % 2 == 0) {
            // Si la cantidad de elementos es par, se promedia los dos valores centrales.
            int mitad = orden[tamaño / 2 - 1];
            int mitad2 = orden[tamaño / 2];
            return (double) (mitad + mitad2) / 2;
        } else {
            // Si la cantidad de elementos es impar, se devuelve el valor central.
            return (double) orden[tamaño / 2];
        }
    }
}

