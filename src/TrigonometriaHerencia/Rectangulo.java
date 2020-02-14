package TrigonometriaHerencia;

public final class Rectangulo extends FiguraLados {

    public Rectangulo(int lado, int altura) {
        super(lado, altura);
    }

    @Override
    public double calcularArea() {
        this.area=this.base*this.altura;
        return area;
    }

    public void mostrarDAtosRectangulo(){
        System.out.println("Datos rectangulo");
    }
    @Override
    public void lanzarMensaje() {
        System.out.println("Mensaje lanzado desde rectangulo");
    }
}
