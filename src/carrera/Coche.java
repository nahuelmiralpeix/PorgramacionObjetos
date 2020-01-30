package carrera;

public class Coche {
    private int cv,velocidad;
    private String matricula,modelo;
    private double km;

    public Coche(){
        this.cv=0;
        this.velocidad=0;
        this.matricula="0000AAA";
        this.modelo="sin modelo";
        this.km=0.0;
    }
    public Coche(String matricula,String modelo,int cv){
        this.modelo=modelo;
        this.matricula=matricula;
        this.cv=cv;
        this.velocidad=0;
        this.km=0.0;
    }
    public void acelerar(int velocidadAumentar){
        if(this.velocidad+velocidadAumentar>=180){
            this.velocidad=180;
            System.out.println("Cuidado vas muy rápido");
        }else {
            this.velocidad += velocidadAumentar;
        }
        double aleatorio = (Math.random() * 9) + 1;
        this.km += (this.velocidad * (this.cv * aleatorio));
    }
    public void frenar(int velocidadFrenar){
        if((this.velocidad-=velocidadFrenar)<=0){
            this.velocidad=0;
            System.out.println("Has frenado demasiado");
        }else{
            this.velocidad-=velocidadFrenar;
        }
    }
    public void parar(){
        this.velocidad=0;
    }
    public void resetear(){
        this.velocidad=0;
        this.km=0;
    }
    public void mostrarDatos(){
        String mensaje="Matrícula: %s Modelo: %s CV: %d Velocidad: %d KM: %.2f%n";
        System.out.printf(String.format(mensaje,this.matricula,this.modelo,this.cv,this.velocidad,this.km));
    }

    public int getCv() {
        return cv;
    }

    public void setCv(int cv) {
        this.cv = cv;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getKm() {
        return km;
    }

    public void setKm(double km) {
        this.km = km;
    }
}
