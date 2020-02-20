package ejercicio1Interfaces;

public abstract class Trabajador extends Persona {
    protected int nsSocial;
    protected double sueldo;
    public Trabajador(String dni, String nombre, String apellidos,double sueldo) {
        super(dni, nombre, apellidos);
        this.nsSocial= (int) (Math.random()*1000);
        this.sueldo=sueldo;
    }

    @Override
    public String mostrarDatos() {
        return super.mostrarDatos()+String.format(" Nº Social: %d, Sueldo: %.2f,",nsSocial,sueldo);
    }
}
