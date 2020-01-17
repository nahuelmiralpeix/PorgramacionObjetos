package Trigonometria;

public class Triangulo {
    private int base,altura;
    private double area;
    public Triangulo(){
    }
    public Triangulo(int base, int altura){
        this.altura=altura;
        this.base=base;

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

    public void calculoArea(){
        this.area=(this.base*this.altura)/2;
    }
}
