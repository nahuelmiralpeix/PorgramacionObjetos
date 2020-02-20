package interfaces;

public final class Rosa extends Planta implements Producto {

    private String color;
    private int precio;

    public Rosa(int tamanio, String nombre, String familia, String color, int precio) {
        super(tamanio, nombre, familia);
        this.color = color;
        this.precio = precio;
    }

    @Override
    public void mostrarPrecio() {
        System.out.println(this.precio);
    }

    @Override
    public int getPrecio() {
        return precio;
    }
}
