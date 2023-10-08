package edu.arnulfo.ramos.utils.sorting;
import edu.arnulfo.ramos.utils.MetodosSorter;




public class SelectorAlgoritmos {
    public static Sorter getSorter(MetodosSorter methods) {
        Sorter s;
        switch (methods) {
            case BUBBLE:
                s = new Bubble();
                break;

            case SELECTION:
                s= new Selection();
                break;
            case INSERTION:
                s= new Insertion();
                break;
            case QUICK:
                s = new QuickSort();
                break;
            case HEAP:
                s = new HeapSort();
                break;
            case MERGE:
                s = new Merge();
                break;
            default:
                s = null;
        }
        return s;
    }



}


