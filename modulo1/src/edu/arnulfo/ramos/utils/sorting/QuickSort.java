package edu.arnulfo.ramos.utils.sorting;

public class QuickSort extends Sorter {

    /**
     * Este método ordena el arreglo utilizando el algoritmo de ordenamiento Quick Sort.
     * @param N El arreglo que se va a ordenar.
     */
    public void sort(int[] N) {
        quickSort(N, 0, N.length - 1);
    }

    /**
     * Este método es una implementación recursiva del algoritmo Quick Sort.
     * @param N El arreglo que se va a ordenar.
     * @param left El índice izquierdo del subarreglo actual.
     * @param right El índice derecho del subarreglo actual.
     */
    private void quickSort(int[] N, int left, int right) {
        int partition;
        if ((right - left) > 0) {
            partition = getPartition(N, left, right);
            quickSort(N, left, partition - 1);
            quickSort(N, partition + 1, right);
        }
    }

    /**
     * Este método encuentra el índice donde se divide el arreglo en dos subarreglos.
     * @param N El arreglo en el que se está trabajando.
     * @param left El índice izquierdo del subarreglo actual.
     * @param right El índice derecho del subarreglo actual.
     * @return El índice donde se encuentra el pivote después de la partición.
     */
    int getPartition(int N[], int left, int right) {
        int pivot = right;
        int firstHigh = left;
        for (int c = left; c < right; c++) {
            COMPARACIONES++;
            if (N[c] < N[pivot]) {
                swap(N, c, firstHigh);
                firstHigh++;
                MOVIMIENTOS++;
            }
        }
        swap(N, pivot, firstHigh);
        MOVIMIENTOS++;
        return firstHigh;
    }
}
