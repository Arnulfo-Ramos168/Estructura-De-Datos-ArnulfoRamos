package edu.arnulfo.ramos.tarea4.utils;

import java.util.Optional;

/**
 * Clase que representa un nodo en una estructura de datos enlazada.
 * @param <T> Tipo de dato que almacenará el nodo.
 */
public class Node<T> {
    T data;
    Optional<Node<T>> next;

    /**
     * Constructor de la clase Node.
     * @param data El dato que se almacenará en el nodo.
     */
    Node(T data) {
        this.data = data;
        this.next = Optional.empty(); // El siguiente nodo se inicializa como vacío.
    }
}