package llamadasHerencia;

public final class LlamadaProvincial extends Llamada {

    public LlamadaProvincial(String nOrigen, String nDestino, double tiempoLlamada) {
        super(nOrigen, nDestino, tiempoLlamada);
        this.coste=calcularCostes();
    }

    @Override
    public double calcularCostes() {
        coste=tiempoLlamada*15;
        return coste;
    }

    @Override
    public String mostrarDatos() {
        return super.mostrarDatos()+String.format(" %.2f%n",coste);
    }
}
