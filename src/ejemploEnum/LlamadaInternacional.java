package ejemploEnum;

public class LlamadaInternacional {
    public enum EnumAnidado {
        TARIFA_MANIANA(0.20), TARIFA_TARDE(0.25), TARIFA_NOCHE(0.30);

        private double coste;

        EnumAnidado(double coste) {
            this.coste = coste;
        }

        EnumAnidado() {

        }

        public void setCoste(int coste) {
            this.coste = coste;
        }

        public double getCoste() {
            return coste;
        }
    }

    private int nOrigen;
    private int nDestino;
    private int duracion;
    private int coste;
    private String franja;

    public LlamadaInternacional(int nOrigen, int nDestino, int duracion, String franja) {
        this.nOrigen = nOrigen;
        this.nDestino = nDestino;
        this.duracion = duracion;
        this.coste = coste;
        this.franja = franja;
        switch (franja.toLowerCase()) {
            case "A":
                this.coste = (int) (duracion * EnumAnidado.TARIFA_MANIANA.getCoste());
                break;
            case "B":
                this.coste = (int) (duracion * EnumAnidado.TARIFA_TARDE.getCoste());
                break;
            case "C":
                this.coste = (int) (duracion * EnumAnidado.TARIFA_NOCHE.getCoste());
                break;

        }
    }
    public static LlamadaInternacional nuevaInstancia(int n0,int nD,int d,String f){
        LlamadaInternacional llamadaInternacional=new LlamadaInternacional(n0,nD,d,f);
        return llamadaInternacional;
    }
}
