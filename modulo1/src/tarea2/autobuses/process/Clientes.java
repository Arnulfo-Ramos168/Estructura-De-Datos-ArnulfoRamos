package tarea2.autobuses.process;

public class Clientes {
    private String name;
    private int number;
    private boolean isVip;


    public Clientes(String name, int number, boolean isVip) {
        this.name = name;
        this.number = number;
        this.isVip = isVip;
    }


    public String getName() {
        return name;
    }


    public int getNumber() {
        return number;
    }


    public boolean isVip() {
        return isVip;
    }


    public String toString() {
        return (isVip ? "*VIP* " : "") + "Nombre: " + name + "/ Numero: " + number;
    }
}
