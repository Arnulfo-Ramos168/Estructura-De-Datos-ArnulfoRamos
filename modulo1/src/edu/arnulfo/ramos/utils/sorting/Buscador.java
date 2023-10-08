package edu.arnulfo.ramos.utils.sorting;

public class Buscador {
    /**
     * Este método devuelve una instancia de una clase que hereda de Sorter, según el método de búsqueda especificado.
     * @param method El método de búsqueda a utilizar (SECUENCIAL o BINARIO).
     * @return Una instancia de una clase que implementa el método de búsqueda seleccionado, o null si el método no es reconocido.
     */
    public static Sorter getBuscador(MetodosDeBusqueda method) {
        Sorter s;
        switch (method) {
            case SECUENCIAL:
                s = new Secuencial(); // Crea una instancia de la clase Secuencial (que hereda de Sorter).
                break;
            case BINARIO:
                s = new Binario(); // Crea una instancia de la clase Binario (que hereda de Sorter).
                break;
            default:
                s = null; // En caso de que el método no sea reconocido, asigna null a 's'.
        }
        return s; // Devuelve la instancia del buscador correspondiente.
    }
}

