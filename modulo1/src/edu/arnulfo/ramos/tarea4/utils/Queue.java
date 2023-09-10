package edu.arnulfo.ramos.tarea4.utils;

import java.util.Optional;

/**
 * Clase que representa una cola (queue) implementada utilizando una ListaEnlazada.
 * @param <T> Tipo de dato de la cola.
 */
public class Queue<T> {
    private final ListaEnlazada<T> list; // Lista enlazada utilizada para implementar la cola

    /**
     * Constructor que crea una cola vacía.
     */
    public Queue() {
        list = new ListaEnlazada<>();
    }

    /**
     * Constructor que crea una cola a partir de una ListaEnlazada existente.
     * @param l La ListaEnlazada que se utilizará para inicializar la cola.
     */
    public Queue(ListaEnlazada<T> l) {
        list = l;
    }

    /**
     * Obtiene el tamaño de la cola.
     * @return El tamaño de la cola.
     */
    public int size() {
        return list.size();
    }

    /**
     * Verifica si la cola está vacía.
     * @return true si la cola está vacía, false en caso contrario.
     */
    public boolean isEmpty() {
        return size() == 0;
    }

    /**
     * Remueve y retorna el elemento en el frente de la cola.
     * @return Un Optional que contiene el elemento en el frente de la cola, o vacío si la cola está vacía.
     */
    public Optional<T> poll() {
        var e = peek();
        list.removeLast();
        return e;
    }

    /**
     * Retorna el elemento en el frente de la cola sin removerlo.
     * @return Un Optional que contiene el elemento en el frente de la cola, o vacío si la cola está vacía.
     */
    public Optional<T> peek() {
        if (isEmpty()) return Optional.empty();
        return list.get(list.size() - 1);
    }

    /**
     * Agrega un elemento al final de la cola.
     * @param element El elemento a agregar.
     */
    public void offer(T element) {
        list.add(element);
    }

    /**
     * Crea una nueva cola que contiene elementos alternados de la cola original y otra cola dada.
     * @param s La otra cola con la que se alternarán los elementos.
     * @return Una nueva cola con elementos alternados.
     */
    public Queue<T> alternate(Queue<T> s) {
        var alt = new Queue<T>();
        while (s.size() + size() != 0) {
            var e = s.size() >= size() ? s.poll() : poll();
            alt.offer(e.get());
        }
        return alt.inverse();
    }

    /**
     * Invierte el orden de los elementos en la cola.
     * @return Una nueva cola con los elementos en orden inverso.
     */
    public Queue<T> inverse() {
        Queue<T> reversedQueue = new Queue<>();
        Queue<T> tempQueue = new Queue<>(list);

        while (!tempQueue.isEmpty()) {
            T element = tempQueue.poll().orElse(null);
            if (element != null) {
                reversedQueue.offer(element);
            }
        }

        return reversedQueue;
    }

    /**
     * Genera una representación en cadena de la cola.
     * @return Una cadena que representa los elementos de la cola.
     */
    public String toString() {
        return list.toString();
    }
}