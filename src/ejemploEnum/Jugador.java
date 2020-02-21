package ejemploEnum;

public class Jugador {
    private String nombre, apellido;
    private Posicion posicion;

    public Jugador(String nombre, String apellido, Posicion posicion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.posicion = posicion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Posicion getPosicion() {
        return posicion;
    }

    public void setPosicion(Posicion posicion) {
        this.posicion = posicion;
    }
}
