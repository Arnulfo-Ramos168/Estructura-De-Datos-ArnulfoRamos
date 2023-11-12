package edu.arnulfo.ramos.tarea13.ui;

import edu.arnulfo.ramos.tarea13.process.CalculadorMediana;

import java.util.Scanner;

/**
 * Clase que contiene métodos para interactuar con el usuario y calcular la mediana.
 */
public class CLI {

    /**
     * Obtiene valores ingresados por el usuario.
     *
     * @return Un array de enteros con los valores ingresados.
     */
    public static int[] obtenerValores() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Cuántos valores deseas ingresar?");
        int tamaño = scanner.nextInt();

        int[] valores = new int[tamaño];
        for (int i = 0; i < tamaño; i++) {
            System.out.println("Inserta el valor " + (i + 1) + ": ");
            valores[i] = scanner.nextInt();
        }

        return valores;
    }

    /**
     * Muestra los valores ingresados por el usuario.
     *
     * @param valores Un array de enteros que se mostrarán.
     */
    public static void mostrarValores(int[] valores) {
        System.out.print("Valores ingresados: ");
        for (int valor : valores) {
            System.out.print(valor + " | ");
        }
        System.out.println();
    }

    /**
     * Ejecuta el programa completo, incluyendo la obtención de valores, la
     * visualización de los valores y el cálculo de la mediana.
     */
    public static void ejecutar() {
        int[] valores = CLI.obtenerValores();
        CLI.mostrarValores(valores);

        double mediana = CalculadorMediana.calcularMediana(valores);
        System.out.println("La mediana de los valores es: " + mediana);
    }
}
