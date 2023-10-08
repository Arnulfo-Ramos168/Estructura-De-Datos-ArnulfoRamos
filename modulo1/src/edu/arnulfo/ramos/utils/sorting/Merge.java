package edu.arnulfo.ramos.utils.sorting;

public class Merge extends Sorter {

    /**
     * Este método ordena el arreglo utilizando el algoritmo de ordenamiento Merge Sort.
     * @param N El arreglo que se va a ordenar.
     */
    public void sort(int N[]) {
        mergeSort(N);
    }

    /**
     * Este método implementa el algoritmo de ordenamiento Merge Sort.
     * @param arr El arreglo que se va a ordenar.
     * @return Un arreglo ordenado.
     */
    public int[] mergeSort(int[] arr) {
        if (arr.length <= 1) {
            return arr; // Si el arreglo tiene uno o menos elementos, está ordenado por definición.
        }
        int midpoint = arr.length / 2;
        int[] left = new int[midpoint];
        int[] right;
        if (arr.length % 2 == 0) {
            right = new int[midpoint];
        } else {
            right = new int[midpoint + 1];
        }
        for (int i = 0; i < midpoint; i++) {
            left[i] = arr[i];
        }
        for (int j = 0; j < right.length; j++) {
            right[j] = arr[midpoint + j];
        }
        int[] result;
        result = merge(mergeSort(left), mergeSort(right));
        return result; // Devuelve el arreglo ordenado.
    }

    /**
     * Este método combina dos arreglos ordenados en uno solo.
     * @param n1 El primer arreglo ordenado.
     * @param n2 El segundo arreglo ordenado.
     * @return Un nuevo arreglo que contiene los elementos ordenados de n1 y n2.
     */
    public int[] merge(int[] n1, int[] n2) {
        int[] N = new int[n1.length + n2.length];
        int index1 = 0;
        int index2 = 0;
        for (int i = 0; i < N.length; i++) {
            if (index1 == n1.length) {
                N[i] = n2[index2];
                index2++;
            } else if (index2 == n2.length) {
                N[i] = n1[index1];
                index1++;
            } else if (n1[index1] < n2[index2]) {
                N[i] = n1[index1];
                index1++;
                ++MOVIMIENTOS;
            } else {
                N[i] = n2[index2];
                index2++;
                ++MOVIMIENTOS;
            }
            ++COMPARACIONES;
        }
        return N; // Devuelve el nuevo arreglo combinado y ordenado.
    }
}
