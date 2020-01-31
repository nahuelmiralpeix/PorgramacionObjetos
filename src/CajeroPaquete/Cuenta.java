package CajeroPaquete;

public class Cuenta {
    private int id, pin;
    private double saldo;



    public Cuenta(int id, int pin, double saldo) {
        this.id = id;
        this.pin = pin;
        this.saldo = saldo;
    }

    public Cuenta(int id, int pin) {
        this.pin = pin;
        this.id = id;
    }

    public void ingresar(int dineroIngresar) {
        if (dineroIngresar > 0) {
            this.saldo += dineroIngresar;
        } else {
            System.out.println("No puedes hacer la operación");
        }

    }

    public void sacarDinero(int dineroSacar) {
        if (dineroSacar < 0 || (this.saldo - dineroSacar) < 0) {
            System.out.println("No puedes hacer la operación");
        } else {
            saldo -= dineroSacar;
        }

    }

    public void mostrarEstado() {
        System.out.printf("El saldo de la cuenta es: %.2f%n",this.saldo);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


}
