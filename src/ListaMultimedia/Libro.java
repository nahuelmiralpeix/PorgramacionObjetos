package ListaMultimedia;

public final class Libro extends Elemento {
    private int isbn;
    private int nPaginas;

    public Libro(int identificador, String titulo, String autor, String formato, double tamanio, int isbn, int nPaginas) {
        super(identificador, titulo, autor, formato, tamanio);
        this.isbn = isbn;
        this.nPaginas = nPaginas;

    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public int getnPaginas() {
        return nPaginas;
    }

    public void setnPaginas(int nPaginas) {
        this.nPaginas = nPaginas;
    }

    @Override
    public String mostrarDatos() {
        return super.mostrarDatos() + String.format(" %d, %d%n", isbn, nPaginas);
    }
}
