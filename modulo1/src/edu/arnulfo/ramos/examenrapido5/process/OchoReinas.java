package edu.arnulfo.ramos.examenrapido5.process;

public class OchoReinas {
    static final int x = 8;
    public static int [] soluciones = new int[x];

    /**
     * ImprimirTablero es un metodo que se encarga de imprimir las reinas en donde hay un espacio libre, y en donde no es valido
     * se imprime un "[]"
     */
    static void imprimirTablero(){
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                if (soluciones[i] == j){
                    System.out.print("Q");
                }else {
                    System.out.print("[]");
                }

            }
            System.out.println();
        }
        System.out.println();
    }

    /**}
     * Este metodo lo que hace es validar si donde se coloca una reina se valide donde es posible colocar otra reina
     * @param filas
     * @param columnas
     * @return
     */
    static boolean validar(int filas, int columnas) {
        for (int i = 0; i < filas; i++) {
            if (soluciones[i] == columnas ||
                soluciones[i] - i == columnas - filas ||
                soluciones[i] + i == columnas + filas) {
            return false;
            }
        }
        return true;
    }

    /**
     * este metodo integra los metodos anteriores para dar una solucion final
     * @param filas
     */
    public static void resolverReinas(int filas){
        if (filas == x){
            imprimirTablero();
            return;
        }
        for (int i = 0; i < x; i++) {
           if (validar(filas,i)){
               soluciones[filas] = i;
               resolverReinas(filas + 1);
           }
            
        }
    }
}
