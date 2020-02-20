package interfaces;

public abstract class Comida {

    protected int calorias;
    protected int hidratos;
    protected int proteinas;

    public Comida(int calorias, int hidratos, int proteinas) {
        this.calorias = calorias;
        this.hidratos = hidratos;
        this.proteinas = proteinas;
    }


}
