package edu.arnulfo.ramos.utils.sorting;

import java.util.Random;

public class Binario extends Sorter {

    /**
     * Este método ordena el arreglo utilizando el algoritmo de búsqueda binaria.
     * @param arr El arreglo que se va a ordenar.
     */
    public void sort(int[] arr) {
        // Llama al método de búsqueda binaria con un valor aleatorio.
        busquedaBinaria(arr, new Random().nextInt(Integer.MAX_VALUE + Short.MIN_VALUE) + Short.MIN_VALUE);
    }

    /**
     * Este método realiza una búsqueda binaria en el arreglo para encontrar un elemento.
     * @param arr El arreglo en el que se va a realizar la búsqueda.
     * @param elementoBuscado El elemento que se está buscando.
     * @return La posición del elemento buscado si se encuentra, o -1 si no se encuentra.
     */
    public int busquedaBinaria(int[] arr, int elementoBuscado) {
        int inicio = 0;
        int fin = arr.length - 1;
        while (inicio <= fin) {
            int medio = inicio + (fin - inicio) / 2;
            COMPARACIONES++;
            if (arr[medio] == elementoBuscado) {
                return medio; // El elemento buscado ha sido encontrado.
            }
            COMPARACIONES++;
            if (arr[medio] > elementoBuscado) {
                fin = medio - 1;
            } else {
                inicio = medio + 1;
            }
        }
        return -1; // El elemento buscado no se encontró en el arreglo.
    }
}
