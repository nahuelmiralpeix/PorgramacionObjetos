import EquipoPrograma.Equipo;
import EquipoPrograma.Jugador;

public class EntradaEquipo {
    public static void main(String[] args) {
        Equipo equipoA = new Equipo("Barça");
        Equipo equipoB = new Equipo("RealMadrid");
        Jugador jugador = new Jugador("Lucas Vazquez", "delantero", 70);
        equipoA.agregarJugador(jugador);
        jugador = new Jugador("Benzema", "delantero", 91);
        equipoA.agregarJugador(jugador);
        jugador = new Jugador("Sergio Ramos", "defensa", 91);
        equipoB.agregarJugador(jugador);
        equipoA.listarPlantilla();


        if (equipoA.getListaJugadores().isEmpty() || equipoB.getListaJugadores().isEmpty()) {
            System.out.println("No se puede jugar el partido");
        } else {
            for (int i = 0; i < 3; i++) {
                equipoA.atacar();
                equipoB.atacar();
            }
        }
        System.out.printf(String.format("El resultado final es %s: %d x %s: %d", equipoA.getNombre(), equipoA.getGoles(),
                equipoB.getNombre(), equipoB.getGoles()));


    }
}
