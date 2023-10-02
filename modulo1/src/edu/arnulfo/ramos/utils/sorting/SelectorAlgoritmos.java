package edu.arnulfo.ramos.utils.sorting;
import edu.arnulfo.ramos.utils.MetodosSorter;




public class SelectorAlgoritmos {
    public static Sorter getSorter(MetodosSorter methods){
        return switch(methods){
            case BUBBLE-> new Sorter(){
                public void sort(int[] N){
                    var len = N.length;
                    var swapped = true;
                    while(swapped){
                        swapped = false;
                        for(int i=1; i< len; i++){
                            COMPARACIONES++;
                            if(N[i-1]>N[i]){
                                swap(N, i-1, i);
                                MOVIMIENTOS++;
                                swapped = true;
                            }
                        }
                    }
                }
            };

            case SELECTION-> new Sorter(){
                public void sort(int[] N) {
                    for(int i=0; i<N.length-1; i++){
                        int minIndex = i;

                        for(int j=i+1; j<N.length; j++){
                            COMPARACIONES++;
                            if(N[minIndex]>N[j]){
                                minIndex = j;
                            }
                        }

                        COMPARACIONES++;
                        if(minIndex!=i){
                            swap(N, minIndex, i);
                            MOVIMIENTOS++;
                        }
                    }
                }
            };
            case INSERTION-> new Sorter(){
                public void sort(int[] N) {
                    for(int i=1; i<N.length; i++){

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
            };
            case SHELL-> null;
            case MERGE -> null;
            case QUICK -> null;
            case HEAP -> null;
            default -> throw new IllegalStateException("Unexpected value");


        };
    }
}

