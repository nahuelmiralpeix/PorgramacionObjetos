package ConsumicionAplicacion;

import java.util.ArrayList;

public class Cuenta {
    private int identificador;
    private boolean estado;
    private ArrayList<Articulo> listaArticulos;

    public Cuenta(int identificador) {
        this.identificador = identificador;
        this.estado = false;
        listaArticulos = new ArrayList();
    }

    public void agregarArticulo(Articulo articulo) {
        listaArticulos.add(articulo);
    }

    public int numeroArticulos() {
        return listaArticulos.size();
    }

    public double costeTotal() {
        double coste = 0.0;
        for (Articulo a : listaArticulos) {
            coste += a.getCoste();
        }
        return coste;
    }

    public void setEstado(boolean estado) {

        this.estado = estado;
    }

    public int getIdentificador() {
        return identificador;
    }

    public boolean isEstado() {
        return estado;
    }
}
