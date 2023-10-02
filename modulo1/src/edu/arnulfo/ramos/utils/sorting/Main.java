package edu.arnulfo.ramos.utils.sorting;

import edu.arnulfo.ramos.utils.MetodosSorter;

public class Main {
    public static void main(String[] args) {

        //Sorter sorter = SelectorAlgoritmos.getSorter(MetodosSorter.INSERTION);
        //Sorter sorter = SelectorAlgoritmos.getSorter(MetodosSorter.BUBBLE);
        Sorter sorter = SelectorAlgoritmos.getSorter(MetodosSorter.SELECTION);

        // Inicia la prueba del metodo sorter seleccionado
        PerformanceTester.testPerformance(sorter);
    }
}
