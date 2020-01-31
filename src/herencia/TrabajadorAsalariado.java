package herencia;

public class TrabajadorAsalariado extends Persona {

    //nombre,apellido,dni
    private int pagas;
    private double sueldo;
    public TrabajadorAsalariado(String nombre, String apellido, String dni,int pagas,double sueldo) {
        super(nombre, apellido, dni);
        this.pagas=pagas;
        this.sueldo=sueldo;
    }
    public double calcularSueldoMes(){
        return this.sueldo/this.pagas;
    }

    @Override
    public String mostrarDatos() {
        return super.mostrarDatos() + "Pagas: "+pagas+"Sueldo: "+sueldo;
    }
/*public void mostrarDatos(){
        System.out.printf("Nombre: %s DNI: %s Pagas: %d Sueldo: %.2f%n",nombre,dni,pagas,sueldo);
    }*/

    @Override
    public String toString() {
        return "TrabajadorAsalariado{" +
                "pagas=" + pagas +
                ", sueldo=" + sueldo +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", dni='" + dni + '\'' +
                '}';
    }
}
