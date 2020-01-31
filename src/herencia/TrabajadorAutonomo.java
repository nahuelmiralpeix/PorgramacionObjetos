package herencia;

public class TrabajadorAutonomo extends Persona {
    private int cuota;

    public TrabajadorAutonomo(String nombre, String apellido, String dni, int cuota) {
        super(nombre, apellido, dni);
        this.cuota = cuota;
    }

    @Override
    public String mostrarDatos() {
        return super.mostrarDatos()+ "Cuotas: "+cuota;
    }
    /*public void mostrarDatos(){
        System.out.printf("Nombre: %s DNI: %s Pagas: %d Cuota: %.2f%n",nombre,dni,cuota);
    }*/
}