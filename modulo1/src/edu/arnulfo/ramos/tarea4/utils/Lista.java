package edu.arnulfo.ramos.tarea4.utils;

import java.util.Optional;

/**
 * Interfaz que define las operaciones básicas de una lista.
 * @param <T> Tipo de dato de la lista.
 */
public interface Lista<T> {

    /**
     * Agrega un elemento a la lista.
     * @param t El elemento a agregar.
     */
    void add(T t);

    /**
     * Elimina un elemento de la lista.
     * @param t El elemento a eliminar.
     */
    void remove(T t);

    /**
     * Obtiene el elemento en la posición especificada.
     * @param index La posición del elemento.
     * @return Un Optional que contiene el elemento si se encuentra en la posición especificada.
     */
    Optional<T> get(int index);

    /**
     * Actualiza un elemento de la lista con un nuevo valor.
     * @param oldValue El valor antiguo del elemento.
     * @param newValue El nuevo valor del elemento.
     */
    void update(T oldValue, T newValue);

    /**
     * Obtiene el tamaño de la lista.
     * @return El tamaño de la lista.
     */
    int size();

    /**
     * Verifica si la lista contiene un elemento específico.
     * @param t El elemento a buscar.
     * @return true si el elemento está en la lista, false en caso contrario.
     */
    boolean contains(T t);
}