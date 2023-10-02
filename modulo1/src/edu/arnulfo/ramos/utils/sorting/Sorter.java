package edu.arnulfo.ramos.utils.sorting;

import java.util.Arrays;
import java.util.Random;

public abstract class Sorter{
    protected int COMPARACIONES = 0;
    protected int MOVIMIENTOS = 0;
    public abstract void sort(int[]N);

    public static int[] getRandomArray(int N, int minVal, int maxVal){
        Random random = new Random();
       return random.ints(N,minVal, maxVal).toArray();

    }
    public static void swap(int[] N, int i, int j){
        int tmp = N [i];
        N[i] = N[j];
        N[j] = tmp;
    }
    private static void printArray(int[] N){

        System.out.println(Arrays.toString(N));
    }
    public static boolean isSorted(int[] N){
        for (int i = 0; 1 < N.length-1; i++){
            if (N[i] > N [i + 1]){
                return false;
            }
        }
        return true;
    }
    public int getComparaciones(){
        return COMPARACIONES;
    }
    public int getMovimientos(){
        return MOVIMIENTOS;
    }
}
