package interfaces;

public abstract class Planta {
    protected int tamanio;
    protected String nombre, familia;

    public Planta(int tamanio, String nombre, String familia) {
        this.tamanio = tamanio;
        this.nombre = nombre;
        this.familia = familia;
    }
}
