package ejercicio1Interfaces;

import java.util.Enumeration;
import java.util.Hashtable;

public class Empresa {

    private Hashtable<String, Persona> listaPersonas;
    private int votos;

    public Empresa() {
        this.listaPersonas = new Hashtable();
    }

    public void registrarPersona(Persona persona) {
        if (listaPersonas.containsKey(persona.getDni())) {
            System.out.println("No se puede agregar");
        } else {
            listaPersonas.put(persona.getDni(), persona);
        }
    }

    public Persona quitarPersona(String dni) {
        return listaPersonas.remove(dni);
    }

    public void registrarVoto(Accionista accionista,int nVoto) {

        votos += accionista.emitirVoto(nVoto);
    }

    public void mostrarNumeroVotos() {
        System.out.println("Los votos totales son: " + votos);
    }

    public void mostrarDatosTodos() {
        Enumeration<Persona> elementos = listaPersonas.elements();
        while (elementos.hasMoreElements()) {
            System.out.println(elementos.nextElement().mostrarDatos());
        }

    }
    public void mostrarDniConLetraA(){
        Enumeration<String> claves = listaPersonas.keys();
        while (claves.hasMoreElements()) {
            String claveEvaluar=claves.nextElement();
            if(claveEvaluar.contains("A")){
                System.out.println(listaPersonas.get(claveEvaluar).mostrarDatos());
            }
        }
    }
    public void mostrarNumeroEmpleados(){
        System.out.println("La empresa tiene "+listaPersonas.size()+" trabajadores");
    }

}
