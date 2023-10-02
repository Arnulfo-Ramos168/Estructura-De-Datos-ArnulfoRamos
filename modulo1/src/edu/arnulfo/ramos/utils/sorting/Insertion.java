package edu.arnulfo.ramos.utils.sorting;
import edu.arnulfo.ramos.utils.*;
public class Insertion extends Sorter{
    @Override
    public void sort(int[] N) {
        for (int i = 1; i < N.length; i++){

            int j = i-1;
            int current = N[i];

            while( j>=0 && N[j]>current){
                N[j+1] = N[j--];
                COMPARACIONES++;
                MOVIMIENTOS++;

            }
            N[j+1] = current;
            MOVIMIENTOS++;
        }
    }
}
