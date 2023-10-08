package edu.arnulfo.ramos.utils.sorting;

public class HeapSort extends Sorter {

    /**
     * Este método implementa el algoritmo de ordenamiento Heap Sort.
     * @param N El arreglo que se va a ordenar.
     */
    @Override
    public void sort(int[] N) {
        int parent, current, bch;
        for (int i = 1; i < N.length; i++) {
            parent = getParent(i);
            current = i;
            while (current >= 0 && N[current] > N[parent]) {
                swap(N, current, parent);
                current = parent;
                parent = getParent(current);
                COMPARACIONES++;
                MOVIMIENTOS++;
            }
        }
        for (int fp = N.length - 1; fp > 1; fp--) {
            current = 0;
            swap(N, current, fp);
            bch = getBiggestChild(N, current, fp);
            while (bch < fp && N[current] < N[bch]) {
                MOVIMIENTOS++;
                COMPARACIONES++;
                swap(N, current, bch);
                current = bch;
                bch = getBiggestChild(N, current, fp);
            }
        }
    }

    /**
     * Este método calcula el índice del padre de un nodo en un árbol binario.
     * @param i El índice del nodo.
     * @return El índice del padre del nodo.
     */
    private int getParent(int i) {
        return (i - 1) / 2;
    }

    /**
     * Este método determina cuál de los hijos de un nodo es el mayor.
     * @param N El arreglo en el que se está trabajando.
     * @param current El índice del nodo actual.
     * @param end El índice del último elemento en el arreglo.
     * @return El índice del hijo más grande.
     */
    private static int getBiggestChild(int[] N, int current, int end) {
        int leftChild = 2 * current + 1;
        int rightChild = 2 * current + 2;
        if (rightChild < end && N[leftChild] < N[rightChild]) {
            return rightChild;
        } else {
            return leftChild;
        }
    }
}
