package llamadasHerencia;

public final class LlamadaLocal extends Llamada{


    public LlamadaLocal(String nOrigen, String nDestino, double tiempoLlamada) {
        super(nOrigen, nDestino, tiempoLlamada);
        this.coste=calcularCostes();
    }

    @Override
    public double calcularCostes() {
        return 0;
    }

    @Override
    public String mostrarDatos() {
        return super.mostrarDatos()+String.format(" %.2f%n",coste);
    }
}
