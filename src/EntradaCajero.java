import CajeroPaquete.Cuenta;
import CajeroPaquete.Persona;

import java.util.Hashtable;
import java.util.Scanner;

public class EntradaCajero {
    public static void main(String[] args) {

        /*Cuenta cuenta= new Cuenta(1,123,1000);
        cuenta.ingresar(500);
        cuenta.sacar(200);
        cuenta.mostrarEstado();

        Persona persona=new Persona("Nahuel","Miralpeix","ASD45",cuenta);
        Cuenta cuenta2=new Cuenta(2,1234,2000);
        persona.agragerCuenta(cuenta2);
        persona.listarCuentas();

        Persona persona2=new Persona("ricardo","martin","asda4");
        persona2.listarCuentas();*/
        Scanner teclado = new Scanner(System.in);
        Hashtable<String, Persona> listaBanco = new Hashtable();
        int opcion;
        int id = 0;
        do {
            System.out.println("1- Crear cuenta");
            System.out.println("2- Sacar dinero");
            System.out.println("3- Ingresar dinero");
            System.out.println("4- Mostrar datos");
            System.out.println("5- Salir");
            System.out.println("Introducir opción:");
            opcion = teclado.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("introduce nombre,apellido,dni");
                    String nombre = teclado.next();
                    String apellido = teclado.next();
                    String dni = teclado.next();
                    System.out.println("introduce pin y saldo");
                    int pin = teclado.nextInt();
                    double saldo = teclado.nextDouble();
                    Cuenta cuenta = new Cuenta(id, pin, saldo);
                    if (listaBanco.containsKey(dni)) {
                        Persona persona = listaBanco.get(dni);
                        persona.agragerCuenta(cuenta);
                    } else {
                        Persona persona = new Persona(nombre, apellido, dni, cuenta);
                        listaBanco.put(persona.getDni(), persona);
                    }
                    id++;
                    break;
                case 2:
                    System.out.println("Introduce dni");
                    String dniSacar = teclado.next();
                    if (listaBanco.containsKey(dniSacar)) {
                        System.out.println("Introduce número de cuenta");
                        int idSacar = teclado.nextInt();
                        Persona persona = listaBanco.get(dniSacar);
                        for (Cuenta cuentaIterada : persona.getListasCuentas()) {
                            if (cuentaIterada.getId() == idSacar) {
                                System.out.println("Introdcuce pin");
                                int pinSacar = teclado.nextInt();
                                if (cuentaIterada.getPin() == pinSacar) {
                                    System.out.println("introduce saldo a sacar");
                                    int saldoSacar = teclado.nextInt();
                                    cuentaIterada.sacarDinero(saldoSacar);
                                    persona.agragerCuenta(cuentaIterada);
                                }
                            }
                        }

                    }

                    break;
                case 3:


                    break;
                case 4:
                    System.out.println("Introduce dni");
                    String dniBuscar = teclado.next();
                    if (listaBanco.containsKey(dniBuscar)) {
                        Persona persona = listaBanco.get(dniBuscar);
                        persona.listarCuentas();
                    } else {
                        System.out.println("No hay nadie con ese dni");
                    }

                    break;
            }
        } while (opcion != 5);


    }
}
