package interfaces;

import java.util.ArrayList;

public class Empresa {
    private ArrayList<Producto> listaProductos;

    public Empresa() {
        this.listaProductos = new ArrayList();
    }

    public void mostrarPreciosTotales() {
        for (Producto producto : listaProductos) {
            producto.mostrarPrecio();
        }
    }

    public void registrarProducto(Producto producto) {
        listaProductos.add(producto);
    }

    public void mostrarCosteAcumulado() {
        int suma = 0;
        for (Producto producto : listaProductos) {
            suma += producto.getPrecio();
        }
        System.out.println(suma);
    }
}
