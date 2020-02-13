package TrabajadoresHerencia;

public class Autonomos extends Trabajador {
    private double sueldo;
    private boolean contratado;
    public Autonomos(String nombre, String apellido, String dni) {
        super(nombre, apellido, dni);
        this.sueldo=sueldo;
        this.contratado=true;
    }

}
