package ListaMultimedia;

public abstract class Elemento {
    protected int identificador;
    protected String titulo, autor, formato;
    protected double tamanio;

    public Elemento(int identificador, String titulo, String autor, String formato, double tamanio) {
        this.identificador = identificador;
        this.titulo = titulo;
        this.autor = autor;
        this.formato = formato;
        this.tamanio = tamanio;
    }

    public String mostrarDatos() {
        return String.format("%d, %s, %s, %s, %.2f", identificador, titulo, autor, formato, tamanio);
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setId(int identificador) {
        this.identificador = identificador;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public double getTamanio() {
        return tamanio;
    }

    public void setTamanio(double tamanio) {
        this.tamanio = tamanio;
    }
}
