package edu.arnulfo.ramos.utils.sorting;


/**
 * Clase Bubble que hereda de la clase Sorter.
 * Implementa el algoritmo de ordenamiento conocido como Bubble Sort.
 */
public class Bubble extends Sorter {

    /**
     * Método para ordenar un arreglo de enteros utilizando el algoritmo Bubble Sort.
     * @param N Arreglo de enteros a ordenar.
     */
    @Override
    public void sort(int[] N) {
        // Obtiene la longitud del arreglo.
        var len = N.length;
        // Variable que indica si se ha realizado un intercambio en la iteración actual.
        var swapped = true;

        // Inicia un ciclo while que continúa mientras se sigan realizando intercambios.
        while(swapped){
            // Inicializa la variable de intercambio como falso para iniciar una nueva iteración.
            swapped = false;

            // Itera sobre el arreglo.
            for(int i=1; i< len; i++){
                // Incrementa el contador de comparaciones.
                COMPARACIONES++;

                // Compara el elemento actual con el elemento anterior.
                if(N[i-1]>N[i]){
                    // Llama al método 'swap' para intercambiar los elementos.
                    swap(N, i-1, i);
                    // Incrementa el contador de movimientos.
                    MOVIMIENTOS++;
                    // Indica que se ha realizado un intercambio en esta iteración.
                    swapped = true;
                }
            }
        }
    }
}