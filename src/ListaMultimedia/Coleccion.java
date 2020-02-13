package ListaMultimedia;

import java.util.ArrayList;
import java.util.Hashtable;

public class Coleccion {
    private ArrayList<Elemento> listaElementos;

    public Coleccion() {
        listaElementos = new ArrayList();
    }

    public void agregarElemento(Elemento elemento) {
        if (listaElementos.isEmpty()) {
            listaElementos.add(elemento);
        } else {
            boolean existe = false;
            for (Elemento item : listaElementos) {
                if (item.getIdentificador() == elemento.getIdentificador()) {
                    existe = true;
                    break;
                }
            }
            if (existe) {
                System.out.println("El elemento ya existe");
            } else {
                listaElementos.add(elemento);
            }
        }
    }

    public void eliminar(int identificador) {
        if (listaElementos.isEmpty()) {
            System.out.println("No hay elementos a borrar");
        } else {
            boolean existe = false;
            Elemento elemento = null;
            for (Elemento item : listaElementos) {
                if (item.getIdentificador() == identificador) {
                    existe = true;
                    elemento = item;
                    break;
                }
            }
            if (existe == true) {
                listaElementos.remove(elemento);
                System.out.println("borrado");
            } else {
                System.out.println("No se ha encontrado");
            }
        }


    }

    public void listarElementos(String nombreClase) {

        if (nombreClase.equals("Todos")) {
            for (Elemento item : listaElementos) {
                System.out.println(item.mostrarDatos());
            }
        } else {

            for (Elemento item : listaElementos) {
                if (item.getClass().getSimpleName().equals(nombreClase)) {
                    System.out.println(item.mostrarDatos());
                }
            }
        }
    }
}
