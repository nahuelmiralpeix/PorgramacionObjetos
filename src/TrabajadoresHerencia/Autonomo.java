package TrabajadoresHerencia;

public final class Autonomo extends Contratado {


    public Autonomo(String nombre, String apellido, String dni, int sueldo) {
        super(nombre, apellido, dni, sueldo);
    }

    @Override
    public String mostrarDatos() {
        return super.mostrarDatos()+"\n";
    }
}
