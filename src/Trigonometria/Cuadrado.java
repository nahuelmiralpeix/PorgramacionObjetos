package Trigonometria;

public class Cuadrado {
    private int base,altura;
    private double area,perimetro;
    // constructores
    public Cuadrado(){}
    public Cuadrado(int base,int altura){
        this.base=base;
        this.altura=altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }
    public void calcularArea(){
        this.area=this.base*this.altura;
    }
    public void calcularPerimtro(){
        this.perimetro=(2*this.altura)+(2*this.base);
    }
}
