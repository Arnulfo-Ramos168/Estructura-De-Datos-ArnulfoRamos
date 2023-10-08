package edu.arnulfo.ramos.utils.sorting;

import java.util.Random;

public class Secuencial extends Sorter {

    /**
     * Este método ordena el arreglo utilizando el algoritmo de búsqueda secuencial.
     * @param arr El arreglo que se va a ordenar.
     */
    public void sort(int[] arr) {
        // Llama al método de búsqueda secuencial con un valor aleatorio.
        busquedaSecuencial(arr, new Random().nextInt(Integer.MAX_VALUE + Short.MIN_VALUE) + Short.MIN_VALUE);
    }

    /**
     * Este método realiza una búsqueda secuencial en el arreglo para encontrar un elemento.
     * @param arreglo El arreglo en el que se va a realizar la búsqueda.
     * @param elementoBuscado El elemento que se está buscando.
     * @return La posición del elemento buscado si se encuentra, o -1 si no se encuentra.
     */
    public int busquedaSecuencial(int[] arreglo, int elementoBuscado) {
        for (int i = 0; i < arreglo.length; i++) {
            COMPARACIONES++;
            if (arreglo[i] == elementoBuscado) {
                return i; // El elemento buscado ha sido encontrado.
            }
        }
        return -1; // El elemento buscado no se encontró en el arreglo.
    }
}
