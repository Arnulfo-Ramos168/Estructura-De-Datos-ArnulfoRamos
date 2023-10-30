package edu.arnulfo.ramos.utils.Collections;

import java.util.ArrayList;

import java.util.HashMap;
import java.util.List;


/**
 * Una implementación básica de una tabla hash.
 *
 * @param <K> Tipo de las claves.
 * @param <V> Tipo de los valores.
 */
public class Hashtable<K,V> {

    private HashMap<K,V> elements = new HashMap<>();

    /**
     * Verifica si la Hashtable está vacía.
     *
     * @return Verdadero si la Hashtable está vacía, de lo contrario falso.
     */
    public boolean isEmpty(){
        return elements.isEmpty();
    }

    /**
     * Obtiene el número de elementos en la Hashtable.
     *
     * @return El número de elementos en la Hashtable.
     */
    public int size(){
        return elements.size();
    }

    /**
     * Agrega un nuevo par clave-valor a la Hashtable.
     *
     * @param key   La clave a agregar.
     * @param value El valor asociado a la clave.
     * @return La Hashtable actualizada.
     * @throws IllegalArgumentException Si la clave ya existe en la Hashtable.
     */
    public Hashtable<K,V> add(K key, V value){
        if(elements.containsKey(key)){
            throw new IllegalArgumentException("La clave ya existe");
        }
        elements.put(key, value);
        return this;
    }

    /**
     * Obtiene el/los valor(es) asociado(s) con una clave particular.
     *
     * @param key La clave a buscar en la Hashtable.
     * @return Una lista de valores asociados con la clave dada.
     */
    public List<V> getByKey(K key){
        List<V> values = new ArrayList<>();
        if(elements.containsKey(key)){
            values.add(elements.get(key));
        }
        return values;
    }

    /**
     * Obtiene todos los valores presentes en la Hashtable.
     *
     * @return Una lista de todos los valores en la Hashtable.
     */
    public List<V> getValues(){
        return new ArrayList<>(elements.values());
    }
}
