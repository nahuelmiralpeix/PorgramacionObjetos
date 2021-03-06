package ejercicio1Interfaces;

import ejercicio1Interfaces.Persona;

public final class Directivo extends Persona implements Accionista {
    private int acciones;
    public Directivo(String dni, String nombre, String apellidos,int acciones) {
        super(dni, nombre, apellidos);
        this.acciones=acciones;
    }

    @Override
    public String mostrarDatos() {
        return super.mostrarDatos()+String.format(" Acciones: %d%n",acciones);
    }

    @Override
    public int emitirVoto(int voto) {
        return voto*4;
    }
}
