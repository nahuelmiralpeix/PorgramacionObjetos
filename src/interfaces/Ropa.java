package interfaces;

public abstract class Ropa {

    protected String material;
    protected int talla;
    protected String nombre;

    public Ropa(String material, int talla, String nombre) {
        this.material = material;
        this.talla = talla;
        this.nombre = nombre;
    }
}
