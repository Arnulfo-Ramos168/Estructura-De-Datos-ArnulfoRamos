package edu.arnulfo.ramos.utils;


public class Vertice {
    private final String name;

    /**
     * Compara dos vértices para determinar si son iguales.
     * @param o El objeto con el que se compara.
     * @return true si los vértices son iguales, false en caso contrario.
     */
    @Override
    public boolean equals(Object o) {
        return o instanceof Vertice && ((Vertice) o).getName().equals(name);
    }

    /**
     * Genera un código hash para el vértice.
     * @return El código hash del vértice.
     */
    @Override
    public int hashCode() {
        return name.hashCode();
    }

    /**
     * Devuelve una representación en forma de cadena del vértice.
     * @return Representación del vértice en formato String.
     */
    @Override
    public String toString() {
        return "Vertice: " + name;
    }

    /**
     * Devuelve el nombre del vértice.
     * @return El nombre del vértice.
     */
    public String getName() {
        return name;
    }

    /**
     * Constructor de la clase Vertice.
     * @param name Nombre del vértice.
     */
    public Vertice(String name) {
        this.name = name;
    }
}
