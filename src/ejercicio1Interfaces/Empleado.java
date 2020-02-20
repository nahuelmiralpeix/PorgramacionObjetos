package ejercicio1Interfaces;

public final class Empleado extends Trabajador{
    private String puesto;
    public Empleado(String dni, String nombre, String apellidos, double sueldo,String puesto ) {
        super(dni, nombre, apellidos, sueldo);
        this.puesto=puesto;
    }

    @Override
    public String mostrarDatos() {
        return super.mostrarDatos() + String.format(" Puesto: %s%n",puesto);
    }
}
