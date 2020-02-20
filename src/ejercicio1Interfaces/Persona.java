package ejercicio1Interfaces;

public abstract class Persona {
    protected String dni,nombre,apellidos;

    public Persona(String dni, String nombre, String apellidos) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    public String mostrarDatos(){
        return String.format("DNI: %s, Nombre: %s, Apellido: %s,",dni,nombre,apellidos);
    }

}
