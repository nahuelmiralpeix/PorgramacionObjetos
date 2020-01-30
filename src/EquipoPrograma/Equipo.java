package EquipoPrograma;

import java.util.ArrayList;


public class Equipo {
    private String nombre;
    private int nivelAtaque, nivelCentro, nivelDefensa;
    private int goles;
    private ArrayList<Jugador>listaJugadores;

    public Equipo(String nombre) {
        this.nombre = nombre;
        this.nivelAtaque = (int) (Math.random() * 100);
        this.nivelCentro = (int) (Math.random() * 100);
        this.nivelDefensa = (int) (Math.random() * 100);
        this.goles = 0;
        this.listaJugadores=new ArrayList();
    }

    public Equipo(String nombre, int nivelAtaque, int nivelCentro, int nivelDefensa) {
        this.nombre = nombre;
        this.nivelAtaque = nivelAtaque;
        this.nivelCentro = nivelCentro;
        this.nivelDefensa = nivelDefensa;
        this.listaJugadores=new ArrayList();
    }


    public void agregarJugador(Jugador jugador){
        //this.listaJugadores.add(jugador);
        boolean encontrado=false;
        for (int i = 0; i <listaJugadores.size() ; i++) {
            Jugador jugadorActual=listaJugadores.get(i);
            if (jugadorActual.getNombre().equals(jugador.getNombre())){
                encontrado=true;
                break;
            }


        }

        if (encontrado==true){
            System.out.println("lo siento ya existe");
        }else{
            listaJugadores.add(jugador);
        }

    }

    public void listarDelanteros(){
        for (Jugador jugador:this.listaJugadores) {
            if (jugador.getPosicion().toLowerCase().equals("delantero")){
                jugador.mostrarDatos();
            }
        }
    }
    public void listarPlantilla(){
        for (Jugador jugador:listaJugadores) {
            jugador.mostrarDatos();
        }
    }

    public boolean atacar() {
        boolean marcarGol;
        if ((this.nivelAtaque * (Math.random() * 2)) + ((this.nivelCentro * (Math.random() * 2)) / 2) > 90) {
            marcarGol = true;
            goles++;
        } else {
            marcarGol = false;
        }
        return marcarGol;
    }

    public void mostrarDatos() {
        String mensaje = "El nombre del equipo %s su nivel de Ataque %d de Centro %d de Defensa %d y sus goles %d%n";
        System.out.printf(String.format(mensaje, this.nombre, this.nivelAtaque, this.nivelCentro,
                this.nivelDefensa, this.goles));
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNivelAtaque() {
        return nivelAtaque;
    }

    public void setNivelAtaque(int nivelAtaque) {
        this.nivelAtaque = nivelAtaque;
    }

    public int getNivelCentro() {
        return nivelCentro;
    }

    public void setNivelCentro(int nivelCentro) {
        this.nivelCentro = nivelCentro;
    }

    public int getNivelDefensa() {
        return nivelDefensa;
    }

    public void setNivelDefensa(int nivelDefensa) {
        this.nivelDefensa = nivelDefensa;
    }

    public int getGoles() {
        return goles;
    }

    public void setGoles(int goles) {
        this.goles = goles;
    }

    public ArrayList<Jugador> getListaJugadores() {
        return listaJugadores;
    }

    public void setListaJugadores(ArrayList<Jugador> listaJugadores) {
        this.listaJugadores = listaJugadores;
    }
}
