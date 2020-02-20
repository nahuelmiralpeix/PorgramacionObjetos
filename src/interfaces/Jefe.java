package interfaces;

import ejercicio1Interfaces.Trabajador;

public final class Jefe extends Trabajador {
    private int beneficio;
    public Jefe(String dni, String nombre, String apellidos, double sueldo,int beneficio) {
        super(dni, nombre, apellidos, sueldo);
        this.beneficio=beneficio;
    }

    @Override
    public String mostrarDatos() {
        return super.mostrarDatos()+String.format(" Beneficio: %d%n",beneficio);
    }
}
