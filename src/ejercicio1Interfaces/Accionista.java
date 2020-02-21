package ejercicio1Interfaces;

public interface Accionista {

    String empresa="MIEMPRESAACC";
     default void mostrarAccionista(){
         System.out.println("Soy un accionista de"+empresa);
     }
     int emitirVoto(int voto);

}
