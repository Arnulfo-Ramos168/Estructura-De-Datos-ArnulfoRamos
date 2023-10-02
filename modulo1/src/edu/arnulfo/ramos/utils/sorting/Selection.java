package edu.arnulfo.ramos.utils.sorting;

public class Selection extends Sorter {

    @Override
    public void sort(int[] N) {
        int n = N.length;

        for (int i = 0; i < n-1; i++) {
            int minIndex = i;
            for (int j = i+1; j < n; j++) {
                if (N[j] < N[minIndex]) {
                    minIndex = j;
                }
                COMPARACIONES++;
            }

            int temp = N[minIndex];
            N[minIndex] = N[i];
            N[i] = temp;
            MOVIMIENTOS++;
        }
    }

    @Override
    public int getComparaciones() {
        return super.getComparaciones();
    }

    @Override
    public int getMovimientos() {
        return super.getMovimientos();
    }
}