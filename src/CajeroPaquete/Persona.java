package CajeroPaquete;

import javax.swing.*;
import java.util.ArrayList;

public class Persona {
    private String apellido;
    private String nombre;
    private ArrayList<Cuenta> listasCuentas;
    private String dni;

    public Persona(String nombre, String apellido, String dni, Cuenta cuenta) {
        this.nombre = nombre;
        this.dni = dni;
        this.apellido = apellido;
        this.listasCuentas = new ArrayList();
        this.listasCuentas.add(cuenta);
    }

    public Persona(String apellido, String nombre, String dni) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.dni = dni;
        this.listasCuentas=new ArrayList();
    }

    public void agragerCuenta(Cuenta nuevaCuenta) {
        this.listasCuentas.add(nuevaCuenta);
    }

    public void listarCuentas() {
        double saldoTotal = 0.0;
        if (listasCuentas.isEmpty()) {
            System.out.println("No tiene cuentas asignadas");
        } else {
            System.out.println("El saldo de cada una de tus cuentas es:");
            for (Cuenta cuenta : this.listasCuentas) {
                cuenta.mostrarEstado();
                saldoTotal += cuenta.getSaldo();
            }
            System.out.printf("El saldo total de tus cuentas es: %.2f%n", saldoTotal);
        }
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Cuenta> getListasCuentas() {
        return listasCuentas;
    }

    public void setListasCuentas(ArrayList<Cuenta> listasCuentas) {
        this.listasCuentas = listasCuentas;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
}
