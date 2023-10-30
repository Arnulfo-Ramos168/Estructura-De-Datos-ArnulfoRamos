package edu.arnulfo.ramos.tarea11;

import edu.arnulfo.ramos.utils.Collections.Hashtable;

import java.util.List;


/**
 * Clase principal que demuestra el uso de la clase Hashtable.
 */
public class Main {

    /**
     * Método principal de la aplicación.
     *
     * @param args Argumentos de la línea de comandos (no se utilizan en este ejemplo).
     */
    public static void main(String[] args) {

        // Crear una instancia de Hashtable con claves de tipo String y valores de tipo Integer
        Hashtable<String, Integer> tabla = new Hashtable<>();

        // Agregar elementos a la tabla
        tabla.add("uno", 1);
        tabla.add("dos", 2);
        tabla.add("tres", 3);

        // Verificar si la tabla está vacía
        System.out.println("¿La tabla está vacía? " + tabla.isEmpty());

        // Obtener el tamaño de la tabla
        System.out.println("Tamaño de la tabla: " + tabla.size());

        // Obtener los valores asociados a la clave "dos"
        List<Integer> valoresParaDos = tabla.getByKey("dos");
        System.out.println("Valores para 'dos': " + valoresParaDos);

        // Obtener todos los valores en la tabla
        List<Integer> todosLosValores = tabla.getValues();
        System.out.println("Todos los valores en la tabla: " + todosLosValores);
    }
}
