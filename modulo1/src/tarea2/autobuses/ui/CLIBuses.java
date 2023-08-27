package tarea2.autobuses.ui;
import tarea2.autobuses.process.Clientes;
import tarea2.utils.ListaEnlazada;


import java.util.Scanner;

/**
 * Esta clase representa unba interfas para interactuar con los pasajeros
 */
public class CLIBuses {
    static Scanner in = new Scanner(System.in);
    static String name;
    static int number;
    static String choice;
    static boolean isVip;

    static ListaEnlazada<Clientes> passengerList = new ListaEnlazada<>();


    /**
     * Lee la informacion de los pasajeros
     * @return
     */
    static Clientes readPasajeros() {
        System.out.print("Nombre del Pasajero: ");
        name = in.nextLine();
        System.out.print("El miembro es VIP? [True/False]: ");
        isVip = in.nextBoolean();
        System.out.print("Registro del Pasajero: ");
        number = in.nextInt();
        System.out.println();
        in.nextLine();

        return new Clientes(name, number, isVip);
    }


    /**
     * Imprime la cantidad de pasajeros
     */
    static void printPasajero() {
        System.out.println("Pasajeros Registrados: ");
        System.out.print(passengerList);
    }


    /**
     * Agrega un nuevo pasajero a la lista de pasajeros
     */
    static void addPasajero() {
        passengerList.add(readPasajeros());
    }


    /**
     * Elimina a un pasajero de la lista
     */
    static void deletePasajero() {
        passengerList.remove(readPasajeros());
    }

    /**
     * Muestra la informacion de algun pasajero
     */
    static void getPaajero() {
        System.out.println("Hay " + passengerList.size() + " pasajeros.");
        System.out.print("Numero de Pasajero: ");
        number = in.nextInt();
        System.out.println("Datos del Pasajero: " + passengerList.get(number));
        in.nextLine();
    }


    public static void interactuarBus() {
        boolean exit = true;
        do {
            System.out.println("\n\nSeleccione una de las siguientes acciones");
            System.out.println("Añadir Pasajero: 1");
            System.out.println("Eliminar Pasajero: 2");
            System.out.println("Visualizar Pasajero: 3");
            System.out.println("Visualizar Pasajeros: 4");
            System.out.println("Salir: 5");
            System.out.print("Opcion: ");
            choice = in.nextLine();
            System.out.println();

            switch (choice) {
                case "1":
                    addPasajero();
                    break;
                case "2":
                    deletePasajero();
                    break;
                case "3":
                    getPaajero();
                    break;
                case "4":
                    printPasajero();
                    break;
                default:
                    exit = false;
                    break;
            }
        } while (exit);
    }
}
