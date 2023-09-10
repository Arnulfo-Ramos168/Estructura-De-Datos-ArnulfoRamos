package edu.arnulfo.ramos.tarea4.utils;

import java.util.Optional;

/**
 * Clase que implementa una lista enlazada.
 * @param <T> Tipo de dato de la lista.
 */
public class ListaEnlazada<T> implements Lista<T>{

    Optional<Node<T>> head;  // Nodo inicial de la lista
    private int length = 0;  // Longitud de la lista

    /**
     * Constructor de la lista enlazada.
     */
    public ListaEnlazada() {
        this.head = Optional.empty();
    }

    /**
     * Obtiene el tamaño de la lista.
     * @return El tamaño de la lista.
     */
    public int size(){
        return this.length;
    }

    /**
     * Agrega un elemento a la lista.
     * @param data El dato a agregar.
     */
    @Override
    public void add(T data){
        var temp = Optional.ofNullable(new Node<T>(data));  // Crea un nuevo nodo con el dato
        if (head.isPresent()) {
            var X = head;
            while (X.get().next.isPresent()) {
                X = X.get().next;
            }
            X.get().next = temp;  // Agrega el nodo al final de la lista
        }else {
            head = temp;  // Si la lista está vacía, el nuevo nodo se convierte en el primer nodo
        }
        length++;
    }

    /**
     * Agrega un elemento al principio de la lista.
     * @param data El dato a agregar.
     */
    public void addFirst(T data){
        var temp = Optional.ofNullable(new Node<T>(data));  // Crea un nuevo nodo con el dato
        if (head.isPresent()) {
            temp.get().next = head;
            head = temp;  // Establece el nuevo nodo como el primer nodo
        }else {
            head = temp;  // Si la lista está vacía, el nuevo nodo se convierte en el primer nodo
        }
        length++;
    }

    /**
     * Verifica si la lista contiene un elemento específico.
     * @param key El elemento a buscar.
     * @return true si el elemento está en la lista, false en caso contrario.
     */
    @Override
    public boolean contains(T key){
        var temp = head;
        while (temp.isPresent()) {
            if (String.valueOf(temp.get().data).equals(String.valueOf(key))) {
                return true;
            }
            temp = temp.get().next;
        }
        return false;
    }

    /**
     * Obtiene el elemento en la posición especificada.
     * @param index La posición del elemento.
     * @return Un Optional que contiene el elemento si se encuentra en la posición especificada.
     * @throws IndexOutOfBoundsException Si el índice está fuera de los límites de la lista.
     */
    @Override
    public Optional<T> get(int index){
        if (index > length-1 || index < 0) {
            System.out.println("Posición no disponible en LinkedList");
            throw new IndexOutOfBoundsException("Index " + index + " está fuera de los límites  !");
        }
        int pos = 0;
        for (var temp = head; temp.isPresent(); temp = temp.get().next) {
            if (pos == index) return Optional.of(temp.get().data);
            pos++;
        }
        return null;
    }

    /**
     * Actualiza un elemento de la lista con un nuevo valor.
     * @param key El elemento a actualizar.
     * @param newItem El nuevo valor del elemento.
     */
    @Override
    public void update(T key, T newItem){
        var temp = head;
        while (temp.isPresent()) {
            if (String.valueOf(temp.get().data).equals(String.valueOf(key))) {
                temp.get().data = newItem ;
                return;
            }
            temp = temp.get().next;
        }
        System.out.println("El elemento a Actualizar no existe");
    }

    /**
     * Elimina un elemento de la lista.
     * @param key El elemento a eliminar.
     */
    @Override
    public void remove(T key){
        if(length == 0) return;
        var prev = Optional.ofNullable(new Node<T>(null));
        prev.get().next = head;
        var next = head.get().next;
        var temp = head;
        boolean exists = false;
        if (head.get().data == key) {
            head = head.get().next;
            exists = true;
        }
        while (temp.get().next.isPresent()) {
            if (String.valueOf(temp.get().data).equals(String.valueOf(key))) {
                prev.get().next = next;
                exists = true;
                break;
            }
            prev = temp;
            temp = temp.get().next;
            next = temp.get().next;
        }
        if (exists == false && String.valueOf(temp.get().data).equals( String.valueOf(key))) {
            prev.get().next = Optional.empty();
            exists = true;
        }
        if (exists) {
            length--;
        }else {
            System.out.println("El valor dado no esta presente en la lista");
        }
    }

    /**
     * Elimina el último elemento de la lista.
     */
    public void removeLast(){
        if(length == 0) return;
        if(length == 1) {head = Optional.empty();length--;return;};
        int pos = 0;
        for (var temp = head; temp.isPresent(); temp = temp.get().next) {
            if (pos == length-2) {
                temp.get().next = Optional.empty();
                length--;
                return;
            }
            pos++;
        }
    }

    /**
     * Elimina el primer elemento de la lista.
     */
    public void removeFirst(){
        if(length == 0) return;
        if(length == 1) {head = Optional.empty(); return;}
        head = head.get().next;
        length --;
    }

    /**
     * Genera una representación en cadena de la lista.
     * @return Una cadena que representa los elementos de la lista.
     */
    public String toString()
    {
        if (length == 0) return "";
        var X = head;
        String S = "";
        int n=0;
        while (X.isPresent()) {
            S += n + ". " +  String.valueOf(X.get().data) + "\n";
            X = X.get().next;
            n++;
        }
        return S;
    }
}