package TrigonometriaHerencia;

public final class Triangulo extends FiguraLados {

    public Triangulo(int base, int altura) {
        super(base, altura);
    }

    @Override
    public double calcularArea() {
        this.area=(this.base*altura)/2;
        return area;
    }

    @Override
    public void lanzarMensaje() {
        System.out.println("Lanzado desde triangulo");
    }
}
