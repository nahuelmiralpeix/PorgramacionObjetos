package TrabajadoresHerencia;

public class Asalariados extends Trabajador {
    //sueldo, número de pagas, contratado
    private double sueldo;
    private int nPagas;
    private boolean contratado;
     public Asalariados(String nombre, String apellido, String dni,double sueldo,int nPagas,boolean contratado) {
        super(nombre, apellido, dni);
        this.sueldo=sueldo;
        this.nPagas=nPagas;
        this.contratado=true;

    }
}
