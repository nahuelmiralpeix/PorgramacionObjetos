package Trigonometria;

public class Circulo {
    private double radio,diametro,area;
    public Circulo(){}
    public Circulo(double radio){
        this.radio=radio;
    }
    //getter
    public double getArea() {
        return area;
    }

    public double getDiametro() {
        return diametro;
    }

    public double getRadio() {
        return radio;
    }
    //setter
    public void setArea(double area) {
        this.area = area;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    //metodos
    public void calcularArea(){
        this.area=Math.PI*(Math.pow(radio,2));
    }
    public void calcularDiametro(){
        this.diametro=2*this.radio;
    }
}
