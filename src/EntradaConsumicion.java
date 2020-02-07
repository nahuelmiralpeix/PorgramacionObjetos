import ConsumicionAplicacion.Articulo;
import ConsumicionAplicacion.Cuenta;

import java.util.Enumeration;
import java.util.Hashtable;

public class EntradaConsumicion {
    public static void main(String[] args) {
        Hashtable<Integer , Cuenta> hastable= new Hashtable();
        Cuenta cuenta=new Cuenta(0);
        hastable.put(cuenta.getIdentificador(),cuenta);
        Articulo a = new Articulo("Refresco",1.20);
        hastable.get(0).agregarArticulo(a);
        hastable.get(0).agregarArticulo(a);
        hastable.get(0).agregarArticulo(a);
        hastable.get(0).agregarArticulo(a);
        System.out.println("El coste total es: "+hastable.get(0).costeTotal());
        hastable.get(0).setEstado(true);
        Enumeration<Cuenta> elementos=hastable.elements();
        while (elementos.hasMoreElements()){
            Cuenta c = elementos.nextElement();
            if (c.isEstado()==true){
                c.costeTotal();
            }
        }


    }
}
