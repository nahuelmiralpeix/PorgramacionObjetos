package llamadasHerencia;

import java.util.ArrayList;

public class Centralita {
    private ArrayList<Llamada> listaLlamadas;

    public Centralita() {
        listaLlamadas = new ArrayList();
    }

    public void registrarLlamadas(Llamada llamada) {
        listaLlamadas.add(llamada);
    }

    public void mostrarDatosLlamadas() {
        for (Llamada item : listaLlamadas) {
            System.out.println(item.mostrarDatos());
        }
    }

    public double calcularCostesTotales() {
        double costeTotal = 0.0;
        for (Llamada item : listaLlamadas) {
            costeTotal += item.getCoste();
        }
        return costeTotal;
    }
}
