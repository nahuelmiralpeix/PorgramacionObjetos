import AgendaConObjetos.Agenda;
import AgendaConObjetos.Persona;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Scanner;

public class EntradaAgenda {
    static Scanner teclado = new Scanner(System.in);


    public static void main(String[] args) {
        Agenda listaAgenda = new Agenda();
        int opcion = 0;

        do {
            System.out.printf("1: Agregar persona a la agenda\n" +
                    "2: Borrar persona\n" +
                    "3: Editar persona\n" +
                    "4: Buscar persona\n" +
                    "5: Listar agenda\n" +
                    "6: Salir\n" +
                    "¿Que desea hacer:?\n");
            opcion = teclado.nextInt();
            switch (opcion) {
                case 1:
                    String nombre = teclado.next();
                    String dni = teclado.next();
                    int telefono = teclado.nextInt();
                    Persona persona = new Persona(nombre, dni, telefono);
                    listaAgenda.agregarPersona(persona);
                    break;
                case 2:
                    String dniBorrar = teclado.next();
                    listaAgenda.borrarPersona(dniBorrar);
                    break;
                case 3:
                    String dniEditar = teclado.next();
                    listaAgenda.editarPersona(dniEditar);
                    break;
                case 4:
                    String dniBuscar = teclado.next();
                    listaAgenda.buscarPersona(dniBuscar);
                    break;
                case 5:
                    listaAgenda.listaPersonas();
                    break;
                case 6:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no contemplada");
                    break;

            }
        } while (opcion != 6);


    }
}

