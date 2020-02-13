package ListaMultimedia;

public final class Audio extends Elemento {
    private double duracion;
    private String soporte;

    public Audio(int identificador, String titulo, String autor, String formato, double tamanio, double duracion, String soporte) {
        super(identificador, titulo, autor, formato, tamanio);
        this.duracion = duracion;
        this.soporte = soporte;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    public String getSoporte() {
        return soporte;
    }

    public void setSoporte(String soporte) {
        this.soporte = soporte;
    }

    @Override
    public String mostrarDatos() {
        return super.mostrarDatos() + String.format(" %b, %s%n", duracion, soporte);
    }
}
