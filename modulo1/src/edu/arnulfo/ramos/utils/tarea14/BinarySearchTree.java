package edu.arnulfo.ramos.utils.tarea14;

public class BinarySearchTree {
    Node root;

    /**
     * Constructor para crear un árbol vacío.
     */
    public BinarySearchTree() {
        root = null;
    }

    /**
     * Inserta un nuevo nodo con el valor dado en el árbol.
     * @param key El valor a insertar.
     */
    public void insert(int key) {
        root = insert(root, key);
    }

    /**
     * Función auxiliar para insertar un nodo en el árbol.
     * @param root El nodo raíz del subárbol.
     * @param key El valor a insertar.
     * @return El nodo raíz del subárbol actualizado.
     */
    Node insert(Node root, int key) {
        if (root == null) {
            root = new Node(key);
            return root;
        }

        if (key < root.key) {
            root.left = insert(root.left, key);
        } else if (key > root.key) {
            root.right = insert(root.right, key);
        }

        return root;
    }

    /**
     * Busca un valor en el árbol.
     * @param key El valor a buscar.
     * @return true si el valor se encuentra en el árbol, false en caso contrario.
     */
    public boolean search(int key) {
        return search(root, key);
    }

    /**
     * Función auxiliar para buscar un valor en el árbol.
     * @param root El nodo raíz del subárbol.
     * @param key El valor a buscar.
     * @return true si el valor se encuentra en el subárbol, false en caso contrario.
     */
    boolean search(Node root, int key) {
        if (root == null || root.key == key) {
            return root != null;
        }

        if (key < root.key) {
            return search(root.left, key);
        } else {
            return search(root.right, key);
        }
    }

    /**
     * Realiza un recorrido en orden del árbol e imprime los valores.
     */
    public void inorder() {
        inorder(root);
    }

    /**
     * Función auxiliar para realizar el recorrido en orden.
     * @param root El nodo raíz del subárbol.
     */
    void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.key + " ");
            inorder(root.right);
        }
    }
    static class Node{
        int key;
        Node left, right;
        /**
         * Constructor para crear un nuevo nodo con un valor específico.
         * @param item El valor del nodo.
         */
        public Node(int item) {
            key = item;
            left = right = null;
        }
    }
}
