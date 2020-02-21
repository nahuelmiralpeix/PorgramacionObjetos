package ejemploEnum;

public class Entrada {
    public Enum posiciones;

    public static void main(String[] args) {

        /*System.out.println(Posicion.DEFENSA.name());
        System.out.println(Posicion.MEDIO.name());
        System.out.println(Posicion.DELANTERO.name());
        System.out.println(Posicion.PORTERO.name());*/

        /*Posicion[] posiciones=Posicion.values();
        for (Posicion item: posiciones) {
            System.out.println(item.name().toLowerCase());
        }*/
        //Jugador jugador=new Jugador("Messi","Apellido",Posicion.DELANTERO.name());
        /*Posicion posicionDelantero=Posicion.DELANTERO;
        posicionDelantero.setSituacion("Izquierda");
        posicionDelantero.setNivel1(100);
        posicionDelantero.setNivel2(100);
        posicionDelantero.setNivel3(100);
        Jugador jugador=new Jugador("Messi","Apellido",posicionDelantero);
        System.out.println(jugador.getPosicion().getSituacion());*/

        //LlamadaInternacional llamadaInternacional=new LlamadaInternacional(123,123,12
        //       ,"A");
        //LlamadaInternacional.getLlamada();
        LlamadaInternacional llamada = LlamadaInternacional.nuevaInstancia(123, 123, 12, "B");


    }
}
