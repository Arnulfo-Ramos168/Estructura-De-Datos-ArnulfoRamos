package edu.arnulfo.ramos.utils.sorting;

public class Shell extends Sorter{
    @Override
    public void sort(int[] N) {
        int h = 1;
        while(h < N.length / 3){
            h = 3*h + 1;
            COMPARACIONES++;
        }
        while(h >= 1) {
            COMPARACIONES++;
            for (int i = h; i < N.length; i++) {
                int j = i;
                COMPARACIONES++;
                while (j >= h && N[j] < N[j - h]) {
                    swap(N, j, j - h);
                    i = j - h;
                    COMPARACIONES++;
                    MOVIMIENTOS++;
                }
            }
            h = h / 3;
        }
    }
}