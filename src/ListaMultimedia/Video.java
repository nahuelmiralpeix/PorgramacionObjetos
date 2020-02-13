package ListaMultimedia;

public final class Video extends Elemento {

    private String actores, directores;

    public Video(int identificador, String titulo, String autor, String formato, double tamanio, String actores, String directores) {
        super(identificador, titulo, autor, formato, tamanio);
        this.actores = actores;
        this.directores = directores;
    }

    public String getActores() {
        return actores;
    }

    public void setActores(String actores) {
        this.actores = actores;
    }

    public String getDirectores() {
        return directores;
    }

    public void setDirectores(String directores) {
        this.directores = directores;
    }

    @Override
    public String mostrarDatos() {
        return super.mostrarDatos() + String.format(" %s, %s%n", actores, directores);
    }
}
