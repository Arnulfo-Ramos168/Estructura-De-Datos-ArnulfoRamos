package tarea2.futbol.ui;
import tarea2.utils.ListaEnlazada;
import tarea2.futbol.process.Jugadores;
import java.util.Scanner;
    /**La clase CLISoccer proporciona una interfaz de línea de comandos para administrar equipos y jugadores de fútbol.
     *Permite al usuario construir equipos, asignar capitanes y seleccionar jugadores para dos equipos: Manchester City y Barcelona.
     */
public class CLISoccer {
    static Scanner in = new Scanner(System.in);
    static String name;
    static int number;
    static boolean isCaptain;

    static ListaEnlazada<Jugadores> jugadores = new ListaEnlazada<>();
    static ListaEnlazada<Jugadores> ManchesterCity = new ListaEnlazada<>();
    static ListaEnlazada<Jugadores> Barcelona = new ListaEnlazada<>();

        /**
         Realiza una sesión de entrenamiento construyendo equipos y mostrando las listas de Manchester City y Barcelona.
         */
    public static void entrenamiento() {
        crearEquipos();
        System.out.println("---------ManchesterCity-----------");
        System.out.println(ManchesterCity);
        System.out.println();
        System.out.println("---------Barcelona-----------");
        System.out.println(Barcelona);
    }

        /**
         * Construye los equipos, asigna capitanes y selecciona jugadores para Manchester City y Barcelona.
         */
    static void crearEquipos() {
        // Capitanes
        ManchesterCity.add(readCapitan());
        Barcelona.add(readCapitan());

        System.out.println("------Registro de Jugadores------");
        for (int i = 0; i < 8; i++) {
            jugadores.add(readJugadores());
        }

        System.out.println("------Eleccion de Jugadores------");
        // Jugadores para el equipo 1
        for (int i = 0; i < 4; i++) {
            asignarEquipoJugadores(ManchesterCity, "1");
        }
        // Jugadores para el equipo 2
        for (int i = 0; i < 4; i++) {
            asignarEquipoJugadores(Barcelona, "2");
        }
    }

        /**
         * Lee y crea al capitan del equipo
         * @return al capitan creado
         */
    static Jugadores readCapitan() {
        System.out.print("Nombre del Capitan: ");
        name = in.nextLine();
        System.out.print("Numero del Capitan: ");
        number = in.nextInt();
        System.out.println();
        in.nextLine();

        return new Jugadores(name, number, true);
    }

        /**
         * Asigna a los jugadores a un equipo
         * @param equipo el equipo al que se asigna el jugador
         * @param nombreEquipo el nombre del equipo
         */
    static void asignarEquipoJugadores(ListaEnlazada<Jugadores> equipo, String nombreEquipo) {
        Jugadores p;
        boolean cont = false;
        do {
            System.out.println("Equipo " + nombreEquipo);
            System.out.print("Nombre del Jugador: ");
            name = in.nextLine();
            System.out.print("Numero del Jugador: ");
            number = in.nextInt();
            System.out.println();
            in.nextLine();
            p = new Jugadores(name, number, false);
            cont = jugadores.contains(p);
            if (cont) {
                equipo.add(p);
                jugadores.remove(p);
            } else {
                System.out.println("El jugador que busca no existe en la lista o ya fue elegido. Intente de nuevo");
            }
        } while (!cont);
    }


        /**
         * Lee y crea a los jugadores
         * @return jugadores
         */
    static Jugadores readJugadores() {
        System.out.print("Nombre del Jugador: ");
        name = in.nextLine();
        System.out.print("Numero del Jugador: ");
        number = in.nextInt();
        System.out.println();
        in.nextLine();

        return new Jugadores(name, number, false);
    }
}
