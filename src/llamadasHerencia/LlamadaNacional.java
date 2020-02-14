package llamadasHerencia;

public final class LlamadaNacional extends Llamada {
    private int franja;
    public LlamadaNacional(String nOrigen, String nDestino, double tiempoLlamada, int franja) {
        super(nOrigen, nDestino, tiempoLlamada);
        this.franja=franja;
        this.coste=calcularCostes();
    }

    @Override
    public double calcularCostes() {
        if (franja==1){
            coste=tiempoLlamada*20;
        }else if (franja==2){
            coste=tiempoLlamada*25;
        }else if (franja==3){
            coste=tiempoLlamada*30;
        }else{
            System.out.println("Franja no valida");
        }
        return coste;
    }

    @Override
    public String mostrarDatos() {
        return super.mostrarDatos()+String.format(" %.2f, %s%n",coste,franja);
    }
}
