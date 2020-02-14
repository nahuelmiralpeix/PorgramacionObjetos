package llamadasHerencia;

public abstract class Llamada {
    protected String nOrigen, nDestino;
    protected double tiempoLlamada;

    public Llamada(String nOrigen, String nDestino, double tiempoLlamada) {
        this.nOrigen = nOrigen;
        this.nDestino = nDestino;
        this.tiempoLlamada = tiempoLlamada;
    }

    protected double coste;

    public abstract double calcularCostes();

    public String mostrarDatos() {
        return String.format("%s, %s, %.2f",nOrigen,nDestino,tiempoLlamada);
    }

    public double getCoste() {
        return coste;
    }
}
