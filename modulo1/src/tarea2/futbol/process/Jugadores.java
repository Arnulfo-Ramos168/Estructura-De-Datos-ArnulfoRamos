package tarea2.futbol.process;

/**
 * Esta clase representa los atributos de los jugadores
 */
public class Jugadores {
    /**
     * Construye nuevos jugadores
     */
    private String name;
    private int number;
    private boolean isCaptain;


    public Jugadores(String name, int number, boolean isCaptain) {
        this.name = name;
        this.number = number;
        this.isCaptain = isCaptain;
    }


    public String getName() {
        return name;
    }


    /**
     *
     * @return el numero del jugador
     */
    public int getNumber() {
        return number;
    }

    /**
     * verifica si el jugador es un capitan
     * @return es true su el jugador es un capitan, y false si no lo es
     */
    public boolean isCaptain() {
        return isCaptain;
    }

    /**
     * representa con un String la representacion de los atributos de los jugadores
     * @return un String que contiene la informacion de los jugadores
     */
    public String toString() {
        return (isCaptain ? "*Capitan* " : "") + "Nombre: " + name + "/ Numero: " + number;
    }
}
