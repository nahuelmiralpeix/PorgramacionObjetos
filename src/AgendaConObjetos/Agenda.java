package AgendaConObjetos;

import java.util.Enumeration;
import java.util.Hashtable;

public class Agenda {
    Hashtable<String,Persona>listaPersonas=new Hashtable();

    public void agregarPersona(Persona persona){
        if(listaPersonas.containsKey(persona.getDni())){
            System.out.println("La persona ya existe");
        }else{
            listaPersonas.put(persona.getDni(),persona);
            System.out.println("Persona agregada correctamente");
        }
    }
    public void borrarPersona(String dni) {
        if (listaPersonas.containsKey(dni)) {
            listaPersonas.remove(dni);
            System.out.println("Persona borrada correctamente");
        } else {
            System.out.println("La persona no existe");
        }
    }

    public void editarPersona(String dni){
        if(listaPersonas.containsKey(dni)){
            Persona personaEncontrada=listaPersonas.get(dni);
            personaEncontrada.setNombre("Nombre modificado");
            listaPersonas.replace(personaEncontrada.getDni(),personaEncontrada);

            System.out.println("Persona editada correctamente");

        }else{
            System.out.println("La persona no existe");
        }
    }

    public void buscarPersona(String dni){
        if(listaPersonas.containsKey(dni)){
            //Persona personaEncontrada=listaPersonas.get(dni);
            // personaEncontrada.mostrarDatos();
            listaPersonas.get(dni).mostrarDatos();
        }else{
            System.out.println("La persona no existe");
        }
    }

    public void listaPersonas() {
        Enumeration<Persona> personas= listaPersonas.elements();
        while (personas.hasMoreElements()){
            personas.nextElement().mostrarDatos();
        }
    }
}


