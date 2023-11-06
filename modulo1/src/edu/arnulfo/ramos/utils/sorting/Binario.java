package edu.arnulfo.ramos.utils.sorting;

import java.util.Random;

//public class Binario extends Sorter {
/**
 * La clase Binario contiene dos métodos de búsqueda binaria: uno iterativo y otro recursivo.
 */
public class Binario {


//    public void sort(int[] arr) {
//        // Llama al método de búsqueda binaria con un valor aleatorio.
//        busquedaBinaria(arr, new Random().nextInt(Integer.MAX_VALUE + Short.MIN_VALUE) + Short.MIN_VALUE);
//    }

    /**
     * Busca un elemento en un arreglo ordenado de enteros de forma iterativa.
     *
     * @param arr           El arreglo en el que se realizará la búsqueda.
     * @param elementoBuscado   El elemento que se está buscando.
     * @return              La posición del elemento buscado si se encuentra en el arreglo, o -1 si no se encuentra.
     */
    public static int busquedaBinaria(int[] arr, int elementoBuscado) {
        int inicio = 0;
        int fin = arr.length - 1;
        while (inicio <= fin) {
            int medio = inicio + (fin - inicio) / 2;
            //COMPARACIONES++;
            if (arr[medio] == elementoBuscado) {
                return medio; // El elemento buscado ha sido encontrado.
            }
           // COMPARACIONES++;
            if (arr[medio] < elementoBuscado) {
                inicio = medio + 1;
            } else {
                fin = medio - 1;
            }
        }
        return -1; // El elemento buscado no se encontró en el arreglo.
    }

    /**
     * Busca un elemento en un arreglo ordenado de enteros de forma recursiva.
     *
     * @param arr           El arreglo en el que se realizará la búsqueda.
     * @param elementoBuscado   El elemento que se está buscando.
     * @param inicio        El índice de inicio de la sublista actual.
     * @param fin           El índice de fin de la sublista actual.
     * @return              La posición del elemento buscado si se encuentra en el arreglo, o -1 si no se encuentra.
     */
    public static int busquedaRecursiva(int[] arr, int elementoBuscado, int inicio, int fin) {
        if (inicio <= fin) {
            int mid = inicio + (fin - inicio) / 2;

            if (arr[mid] == elementoBuscado) {
                return mid;
            }

            if (arr[mid] < elementoBuscado) {
                return busquedaRecursiva(arr, elementoBuscado, mid + 1, fin);
            } else {
                return busquedaRecursiva(arr, elementoBuscado, inicio, mid - 1);
            }
        }
        return -1;
    }
}
