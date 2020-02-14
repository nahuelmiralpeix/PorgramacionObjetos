package TrigonometriaHerencia;

public abstract class FiguraLados extends  Figura {

    protected int base,altura;

    public FiguraLados(int lado, int altura) {
        this.base = lado;
        this.altura = altura;
    }
}
