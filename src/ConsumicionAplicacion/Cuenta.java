package ConsumicionAplicacion;

import java.util.ArrayList;

public class Cuenta {
    private int identificador;
    private boolean estado;
    private ArrayList<Articulo> articulos;

    public void agregarArticulo(Articulo articulo){
        articulos.add(articulo);
    }

    public int numeroArticulos(){
        return articulos.size();
    }

    public double costeTotal(){
        double coste=0.0;
        for (Articulo a:articulos) {
            coste+=a.getCoste();
        }
        return coste;
    }

    public void setEstado(boolean estado){
        this.estado=estado;
    }


}
