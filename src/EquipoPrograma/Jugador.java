package EquipoPrograma;

public class Jugador {
    private String nombre, posicion;
    private boolean estrella;
    private int calidad;

    public Jugador(String nombre, String posicion, int calidad) {
       this.nombre=nombre;
       this.posicion=posicion;
       this.calidad=calidad;
       if(calidad>=90){
           this.estrella=true;
       }
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public boolean isEstrella() {
        return estrella;
    }

    public void setEstrella(boolean estrella) {
        this.estrella = estrella;
    }

    public int getCalidad() {
        return calidad;
    }

    public void setCalidad(int calidad) {
        this.calidad = calidad;
    }

    public void  mostrarDatos(){
        String mensaje="Nombre: %s, Posición: %s, Calidad: %d, Estrella:%b%n";
        System.out.printf(mensaje,this.nombre,this.posicion, this.calidad,this.estrella);
    }

}
