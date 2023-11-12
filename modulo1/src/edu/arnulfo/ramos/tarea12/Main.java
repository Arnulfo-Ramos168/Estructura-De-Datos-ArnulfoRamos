package edu.arnulfo.ramos.tarea12;
import edu.arnulfo.ramos.utils.sorting.Binario;
import edu.arnulfo.ramos.utils.Math.*;
public class Main {
    public static void main(String[] args) {
        // Prueba de la serie Fibonacci
        System.out.println("Serie de Fibonacci (iterativo):");
        for (int i = 0; i < 10; i++) {
            System.out.print(Fibonacci.fibonacciIterativo(i) + " ");
        }
        System.out.println();

        System.out.println("Serie de Fibonacci (recursivo):");
        for (int i = 0; i < 10; i++) {
            System.out.print(Fibonacci.fibonacciRecursivo(i) + " ");
        }
        System.out.println();

        // Prueba del cálculo factorial
        int num = 5;
        System.out.println("Factorial de " + num + " (iterativo): " + Factorial.factorialIterativo(num));
        System.out.println("Factorial de " + num + " (recursivo): " + Factorial.factorialRecursivo(num));

        // Prueba de búsqueda binaria
        int[] sortedArray = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
        int target = 11;
        int indexIterative = Binario.busquedaBinaria(sortedArray, target);
        int indexRecursive = Binario.busquedaRecursiva(sortedArray, target, 0, sortedArray.length - 1);

        System.out.println("Búsqueda binaria (iterativo) - Elemento " + target + " encontrado en el índice: " + indexIterative);
        System.out.println("Búsqueda binaria (recursivo) - Elemento " + target + " encontrado en el índice: " + indexRecursive);
    }
}


