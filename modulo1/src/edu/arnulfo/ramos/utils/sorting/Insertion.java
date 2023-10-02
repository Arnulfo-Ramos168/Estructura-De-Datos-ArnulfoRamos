package edu.arnulfo.ramos.utils.sorting;

/**
 * Clase Insertion que hereda de la clase Sorter.
 * Implementa el algoritmo de ordenamiento conocido como Insertion Sort.
 */
public class Insertion extends Sorter {

    /**
     * Método para ordenar un arreglo de enteros utilizando el algoritmo Insertion Sort.
     * @param N Arreglo de enteros a ordenar.
     */
    @Override
    public void sort(int[] N) {
        // Itera sobre el arreglo a partir del segundo elemento.
        for (int i = 1; i < N.length; i++){
            // Guarda el valor actual en la variable 'current'.
            int j = i-1;
            int current = N[i];

            // Comienza un bucle para mover los elementos mayores hacia la derecha.
            while( j>=0 && N[j]>current){
                N[j+1] = N[j--];
                // Incrementa los contadores de comparaciones y movimientos.
                COMPARACIONES++;
                MOVIMIENTOS++;
            }

            // Coloca 'current' en su posición correcta.
            N[j+1] = current;
            // Incrementa el contador de movimientos.
            MOVIMIENTOS++;
        }
    }
}