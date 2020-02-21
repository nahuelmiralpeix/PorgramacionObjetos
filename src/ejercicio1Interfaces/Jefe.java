package ejercicio1Interfaces;

import ejercicio1Interfaces.Trabajador;

public final class Jefe extends Trabajador implements Accionista {
    private int beneficio;

    public Jefe(String dni, String nombre, String apellidos, double sueldo, int beneficio) {
        super(dni, nombre, apellidos, sueldo);
        this.beneficio = beneficio;
    }

    @Override
    public String mostrarDatos() {
        return super.mostrarDatos() + String.format(" Beneficio: %d%n", beneficio);
    }

    @Override
    public int emitirVoto(int voto) {
        return voto*2;
    }

}
