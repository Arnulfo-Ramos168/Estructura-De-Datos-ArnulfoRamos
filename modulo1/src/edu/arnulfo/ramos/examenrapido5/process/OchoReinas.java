package edu.arnulfo.ramos.examenrapido5.process;

public class OchoReinas {
    static final int x = 8;
    public static int [] soluciones = new int[x];
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
