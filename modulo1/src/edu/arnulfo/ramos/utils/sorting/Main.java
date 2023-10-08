package edu.arnulfo.ramos.utils.sorting;

import edu.arnulfo.ramos.utils.*;

public class Main {
    public static void main(String[] args) {
        // Aquí comienza la ejecución del programa.

        // Descomenta una de las siguientes líneas para seleccionar el algoritmo de ordenamiento a probar:

        // 1. Insertion Sort
        // Sorter sorter = SelectorAlgoritmos.getSorter(MetodosSorter.INSERTION);

        // 2. Bubble Sort
        // Sorter sorter = SelectorAlgoritmos.getSorter(MetodosSorter.BUBBLE);

        // 3. Selection Sort
        // Sorter sorter = SelectorAlgoritmos.getSorter(MetodosSorter.SELECTION);

        // 4. Merge Sort
        // Sorter sorter = SelectorAlgoritmos.getSorter(MetodosSorter.MERGE);

        // 5. Heap Sort
        // Sorter sorter = SelectorAlgoritmos.getSorter(MetodosSorter.HEAP);

        // 6. Quick Sort
        Sorter sorter = SelectorAlgoritmos.getSorter(MetodosSorter.QUICK);

        // Descomenta una de las siguientes líneas para seleccionar el método de búsqueda a probar:

        // 1. Búsqueda Secuencial
        // Sorter sorter = Buscador.getBuscador(MetodosDeBusqueda.SECUENCIAL);

        // 2. Búsqueda Binaria
        // Sorter sorter = Buscador.getBuscador(MetodosDeBusqueda.BINARIO);

        // Aquí se instancia un objeto 'sorter' que corresponde al algoritmo de ordenamiento o búsqueda seleccionado.

        // Luego, inicia la prueba del método 'sorter' seleccionado.
        PerformanceTester.testPerformance(sorter);
    }
}
