package TrigonometriaHerencia;

public class EntradaTrigonometria {
    public static void main(String[] args) {
        Triangulo triangulo = new Triangulo(2,5);
        Rectangulo rectangulo=new Rectangulo(5,6);
        Circulo circulo=new Circulo(6);
        triangulo.lanzarMensaje();
        System.out.println(triangulo.calcularArea());

        Figura figura = new Rectangulo(23,23);
        Rectangulo rectangulo1= new Rectangulo(123,123);
        rectangulo1.mostrarDAtosRectangulo();
        figura.lanzarMensaje();
    }
}
