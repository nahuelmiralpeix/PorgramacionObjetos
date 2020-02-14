package TrabajadoresHerencia;

import java.util.Enumeration;
import java.util.Hashtable;

public class Empresa {

    private Hashtable<String, Trabajador> empresaElementos;

    public Empresa() {
        empresaElementos = new Hashtable();
    }

    public void agregarTrabajador(Trabajador trabajador) {
        int numeroJefes = 0;
        Enumeration<Trabajador> elementos = empresaElementos.elements();
        while (elementos.hasMoreElements()) {
            if (elementos.nextElement().getClass().getSimpleName().equals("Jefe")) {
                numeroJefes++;
                break;
            }
        }
        if (trabajador.getClass().getSimpleName().equals("Jefe") && numeroJefes == 0) {
            if (!empresaElementos.containsKey(trabajador.getDni())) {
                empresaElementos.put(trabajador.getDni(), trabajador);
            }else{
                System.out.println("El trabajador ya existe");
            }
        }else if (trabajador.getClass().getSimpleName().equals("Jefe") && numeroJefes > 0){
            System.out.println("ya hay un jefe");
        }else if(!trabajador.getClass().getSimpleName().equals("Jefe") && numeroJefes == 0){
            if (!empresaElementos.containsKey(trabajador.getDni())) {
                empresaElementos.put(trabajador.getDni(), trabajador);
            } else {
                System.out.println("No puedes añadir este dni ya existe uno igual");
            }
        }


    }
    public void limpiarEmpresa(){
        Enumeration<Trabajador> elementos=empresaElementos.elements();
        while(elementos.hasMoreElements()){
            Trabajador actual= elementos.nextElement();
            if(elementos.nextElement()instanceof Contratado){
                if(!((Contratado)actual).isContratado()){
                    empresaElementos.remove(actual);
                }
            }
        }
    }

    public void eliminarTrabajador(String dni) {

        if (empresaElementos.containsKey(dni)){
            empresaElementos.remove(dni);
        }else{
            System.out.println("No existe el trabajador");
        }
    }

    public Hashtable<String, Trabajador> getEmpresaElementos() {
        return empresaElementos;
    }
}
