package TrabajadoresHerencia;

public final class Asalariado extends Contratado {

    private int nPagas;

    public Asalariado(String nombre, String apellido, String dni,int sueldo, int nPagas) {
        super(nombre, apellido, dni,sueldo);
        this.nPagas = nPagas;
    }

    @Override
    public String mostrarDatos() {
        return super.mostrarDatos()+String.format(", %d%n",nPagas);
    }

    public int getnPagas() {
        return nPagas;
    }

    public void setnPagas(int nPagas) {
        this.nPagas = nPagas;
    }
}
