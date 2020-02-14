package TrabajadoresHerencia;

public final class Jefe extends Trabajador {

    private int beneficio;
    private int acciones;

    public Jefe(String nombre, String apellido, String dni, int beneficio, int acciones) {
        super(nombre, apellido, dni);
        this.beneficio = beneficio;
        this.acciones = acciones;
    }

    public void despedirTrabajador(Contratado contratado){
        contratado.setContratado(false);
    }

    @Override
    public String mostrarDatos() {
        return super.mostrarDatos()+String.format(" %d, %d%n",beneficio,acciones);
    }
}


