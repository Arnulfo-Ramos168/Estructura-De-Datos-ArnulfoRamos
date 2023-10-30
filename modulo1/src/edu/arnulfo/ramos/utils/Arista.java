package edu.arnulfo.ramos.utils;

import java.lang.Comparable;

public class Arista implements Comparable<Arista> {
    private final Vertice v1;
    private final Vertice v2;
    private final double weight;

    /**
     * Devuelve una representación en forma de cadena de la arista.
     * @return Representación de la arista en formato String.
     */
    @Override
    public String toString() {
        return v1.getName() + " -> (" + weight + ") -> " + v2.getName();
    }

    /**
     * Devuelve el primer vértice de la arista.
     * @return El primer vértice.
     */
    public Vertice getV1() {
        return v1;
    }

    /**
     * Devuelve el segundo vértice de la arista.
     * @return El segundo vértice.
     */
    public Vertice getV2() {
        return v2;
    }

    /**
     * Devuelve el peso asociado a la arista.
     * @return El peso de la arista.
     */
    public double getWeight() {
        return weight;
    }

    /**
     * Compara dos aristas basándose en sus pesos.
     * @param a2 La arista con la cual se compara.
     * @return Un valor negativo si this es menor que a2, un valor positivo si this es mayor que a2, 0 si tienen el mismo peso.
     */
    @Override
    public int compareTo(Arista a2) {
        if (weight < a2.getWeight())
            return -1;

        if (weight > a2.getWeight())
            return 1;

        return 0;
    }

    /**
     * Determina si dos aristas son iguales.
     * @param o El objeto con el que se compara.
     * @return true si las aristas son iguales, false en caso contrario.
     */
    @Override
    public boolean equals(Object o) {
        return o instanceof Arista && (((Arista) o).getV1().equals(v1) && ((Arista) o).getV2().equals(v2)) || (((Arista) o).getV1().equals(v2) && ((Arista) o).getV2().equals(v1));
    }

    /**
     * Constructor de la clase Arista.
     * @param v1     Primer vértice de la arista.
     * @param v2     Segundo vértice de la arista.
     * @param weight Peso o costo asociado a la arista.
     */
    public Arista(Vertice v1, Vertice v2, double weight) {
        this.v1 = v1;
        this.v2 = v2;
        this.weight = weight;
    }
}
