package interfaces;

public final class Camiseta extends Ropa implements Producto, Impuesto {

    private String color;
    private int precio;

    public Camiseta(String material, int talla, String nombre, String color, int precio) {
        super(material, talla, nombre);
        this.color = color;
        this.precio = precio;
    }

    public void mostrarColor() {
        System.out.println(color);
    }

    @Override
    public void mostrarPrecio() {
        System.out.println(precio);
    }

    @Override
    public int getPrecio() {
        return precio;
    }

    @Override
    public void calcularImpuesto() {
        System.out.println(this.precio * this.IVA);
    }
}
