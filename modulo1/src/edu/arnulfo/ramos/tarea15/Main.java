package edu.arnulfo.ramos.tarea15;

import edu.arnulfo.ramos.utils.Collections.ArbolBinario32;

public class Main {
    public static void main(String[] args) {
        ArbolBinario32 bTree = new ArbolBinario32();

        // Insertar algunos valores en el árbol
        bTree.insert(5);
        bTree.insert(3);
        bTree.insert(15);
        bTree.insert(20);
        bTree.insert(1);
        bTree.insert(25);
        bTree.insert(13);
        bTree.insert(14);
        bTree.insert(24);
        bTree.insert(23);
        bTree.insert(22);

        // Buscar valores en el árbol
        System.out.println("22: " + bTree.search(12)); // Debería imprimir false
        System.out.println("16: " + bTree.search(16)); // Debería imprimir false
        System.out.println("14: " + bTree.search(14)); // Debería imprimir false
        System.out.println("22: " + bTree.search(22)); // Debería imprimir false
        System.out.println("6: " + bTree.search(6)); // Debería imprimir false
    }
}
