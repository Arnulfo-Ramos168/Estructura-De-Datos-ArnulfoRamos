package edu.arnulfo.ramos.tarea9;

import edu.arnulfo.ramos.utils.*;
import java.util.LinkedList;
import java.util.Stack;
import edu.arnulfo.ramos.utils.Collections.Grafo;

public class SearchGraph {


    /**
     * Realiza una búsqueda en amplitud (BFS) en el grafo dado, comenzando desde el vértice de inicio
     * y tratando de encontrar el vértice objetivo.
     *
     * @param grafo     Grafo en el que se realiza la búsqueda.
     * @param inicio    Identificador del vértice de inicio.
     * @param objetivo  Identificador del vértice objetivo.
     * @return          Vértice objetivo si se encuentra, o null si no se encuentra.
     */
    public static Vertice breadthFirstSearch(Grafo grafo, String inicio, String objetivo) {
        // Crear un objeto que representa el vértice objetivo
        var target = new Vertice(objetivo);

        // Si el vértice de inicio es igual al vértice objetivo, retornar el objetivo inmediatamente
        if (target.equals(new Vertice(inicio))) return target;

        // Crear listas de aristas visitadas y una cola para el BFS
        LinkedList<Arista> visited = new LinkedList<Arista>();
        LinkedList<Arista> queue = new LinkedList<Arista>();

        // Agregar todas las aristas adyacentes al vértice de inicio a la cola
        queue = new LinkedList<Arista>(grafo.getAdyacencias(new Vertice(inicio)));

        // Comenzar el proceso de búsqueda
        while (!queue.isEmpty()) {
            // Tomar la primera arista en la cola
            var currentEdge = queue.poll();

            // Si el vértice de destino de la arista es igual al objetivo, retornar el objetivo
            if (currentEdge.getV2().equals(target)) {
                return currentEdge.getV2();
            } else {
                // Agregar la arista a la lista de visitadas
                visited.add(currentEdge);

                // Agregar todas las aristas adyacentes al vértice de destino de la arista actual a la cola
                queue.addAll(new LinkedList<Arista>(grafo.getAdyacencias(currentEdge.getV2())));

                // Remover las aristas visitadas de la cola
                queue.removeAll(visited);
            }
        }

        // Si no se encuentra el objetivo, retornar null
        return null;
    }



    /**
     * Realiza una búsqueda en profundidad (DFS) en el grafo dado, comenzando desde el vértice de inicio
     * y tratando de encontrar el vértice objetivo.
     *
     * @param grafo     Grafo en el que se realiza la búsqueda.
     * @param inicio    Identificador del vértice de inicio.
     * @param objetivo  Identificador del vértice objetivo.
     * @return          Vértice objetivo si se encuentra, o null si no se encuentra.
     */
    public static Vertice deepFirstSearch(Grafo grafo, String inicio, String objetivo) {
        // Crear un objeto que representa el vértice objetivo
        var target = new Vertice(objetivo);

        // Si el vértice de inicio es igual al vértice objetivo, retornar el objetivo inmediatamente
        if (target.equals(new Vertice(inicio))) return target;

        // Crear una pila para el DFS y una pila para mantener las aristas visitadas
        var stack = new Stack<Arista>();
        var visited = new Stack<Arista>();

        // Agregar todas las aristas adyacentes al vértice de inicio a la pila
        stack.addAll(grafo.getAdyacencias(new Vertice(inicio)));

        // Comenzar el proceso de búsqueda
        while (!stack.isEmpty()) {
            // Tomar la última arista en la pila
            var current = stack.pop();

            // Si el vértice de destino de la arista es igual al objetivo, retornar el objetivo
            if (current.getV2().equals(target)) {
                return current.getV2();
            }

            // Agregar la arista a la pila de visitadas
            visited.push(current);

            // Agregar todas las aristas adyacentes al vértice de destino de la arista actual a la pila
            stack.addAll(grafo.getAdyacencias(current.getV2()));

            // Remover las aristas visitadas de la pila
            stack.removeAll(visited);
        }

        // Si no se encuentra el objetivo, retornar null
        return null;
    }

}