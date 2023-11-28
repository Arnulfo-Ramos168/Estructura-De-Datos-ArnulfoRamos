package edu.arnulfo.ramos.utils;

import java.util.Optional;

public class Stack <T>{
    private final ListaEnlazada<T> list;
    /**
     * Constructor que crea una pila vacía.
     */
    public Stack() {
        list = new ListaEnlazada<>();
    }
    /**
     * Constructor que crea una pila con una lista enlazada proporcionada.
     *
     * @param l La lista enlazada que se utilizará como base para la pila.
     */
    Stack(ListaEnlazada<T> l) {
        list = l;
    }
    /**
     * Obtiene el número de elementos en la pila.
     *
     * @return El número de elementos en la pila.
     */
    public int size() {
        return list.size();
    }
    /**
     * Verifica si la pila está vacía.
     *
     * @return true si la pila está vacía, false en caso contrario.
     */
    public boolean isEmpty() {
        return size() == 0;
    }
    /**
     * Elimina y devuelve el elemento en la parte superior de la pila.
     *
     * @return Un objeto Optional que contiene el elemento eliminado de la pila,
     *         o empty si la pila está vacía.
     */
    public Optional<T> pop() {
        var e = peek();
        list.removeLast();
        return e;
    }
    /**
     * Obtiene el elemento en la parte superior de la pila sin eliminarlo.
     *
     * @return Un objeto Optional que contiene el elemento en la parte superior de la pila,
     *         o empty si la pila está vacía.
     */
    public Optional<T> peek() {
        if (isEmpty()) return Optional.empty();
        return list.get(list.size() - 1);
    }
    /**
     * Agrega un elemento a la parte superior de la pila.
     *
     * @param element El elemento a agregar a la pila.
     */
    public void push(T element) {
        list.add(element);
    }
    /**
     * Crea una pila alternativa combinando elementos de dos pilas.
     *
     * @param s La segunda pila con la que se alternarán los elementos.
     * @return Una nueva pila que contiene elementos alternados de ambas pilas.
     */
    public Stack<T> alternate(Stack<T> s) {
        var alt = new Stack<T>();
        while (s.size() + size() != 0) {
            var e = s.size() >= size() ? s.pop() : pop();
            alt.push(e.get());
        }
        return alt.inverse();
    }
    /**
     * Invierte el orden de los elementos en la pila.
     *
     * @return Una nueva pila con los elementos en orden inverso.
     */
    public Stack<T> inverse() {
        var s = new Stack<T>();
        var t = new Stack<T>(list);
        while (!t.isEmpty()) {
            s.push(t.pop().get());
        }
        return s;
    }
    /**
     * Convierte la pila en una cadena de caracteres para su representación.
     *
     * @return Una cadena que representa los elementos de la pila.
     */
    public String toString() {
        return list.toString();
    }
}
