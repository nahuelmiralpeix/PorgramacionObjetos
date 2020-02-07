package herencia2;

public  class Jefe extends Trabajador {
    protected int horas;

    public Jefe(String nombreN, String apellidoN, int sueldo, int horas) {
        super(nombreN, apellidoN, sueldo);
        this.horas=horas;
    }

    public void despedir(){
        System.out.println("despedido");
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Impreso desde jefe");
    }
}
