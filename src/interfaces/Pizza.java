package interfaces;

public final class Pizza extends Comida implements Producto, Impuesto {

    private String[] ingredientes;
    private int precio;

    public Pizza(int calorias, int hidratos, int proteinas, String[] ingredientes, int precio) {
        super(calorias, hidratos, proteinas);
        this.ingredientes = ingredientes;
        this.precio = precio;
    }

    public void mostrarIngredientes() {
        for (int i = 0; i < ingredientes.length; i++) {
            System.out.println(ingredientes[i]);
        }

    }

    @Override
    public void mostrarPrecio() {
        System.out.println(precio);
    }

    public int getPrecio() {
        return precio;
    }


    @Override
    public void calcularImpuesto() {
        System.out.println(precio * IVA);
    }
}
