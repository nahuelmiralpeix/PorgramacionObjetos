package herencia2;

public abstract class Persona {
    protected String nombre,apellido;



    public Persona(String nombre,String apellido) {
        this.nombre = nombre;
        this.apellido=apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void mostrarDatos(){
        System.out.println("Datos mostrados desde objeto persona");
    }
}
