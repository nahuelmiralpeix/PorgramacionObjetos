package herencia2;

public class Trabajador extends Persona {

    protected int sueldo;
    public Trabajador(String nombreN,String apellidoN){
        super(nombreN,apellidoN);
    }

    public Trabajador(String nombreN, String apellidoN,int sueldo) {
        super(nombreN, apellidoN);
        this.sueldo=sueldo;
    }
    @Override
    public void mostrarDatos(){
        System.out.println("Impreso desde trabajador");
    }

    public void mostrarDatos(String string){
        System.out.println(string);
    }
}


