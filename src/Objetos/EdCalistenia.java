package Objetos;

import java.util.ArrayList;
import java.util.Scanner;
public class EdCalistenia {
    static Scanner teclado = new Scanner(System.in);
    static ArrayList<Object[]> rutinas;

    public static void main(String[] args) {
        String opcion;
        rutinas = new ArrayList();

        do {
            System.out.printf("1-Agregar ejercicio%n" +
                    "2-Listar rutina%n" +
                   "3-Eliminar ejercicio%n" +
                    "4-Eliminar toda la rutina%n" +
                    "5-Salir%n" +
                    "Que desea hacer?%n");

            opcion =  teclado.next();
            switch (opcion) {
                case "1":
                    agregarEjercicio();
                    break;
                case "2":
                    listarRutina();
                    break;
                case "3":
                    System.out.println("Introduzca el ejercicio a buscar");
                    String ejercBorrar = teclado.next();
                    eliminarEjercicio(ejercBorrar);
                    break;
                case "4":
                    eliminarRutina();
                    break;
                case "5":
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Introduce opción válida");
                    break;

            }

        }while (!opcion.equals("5"));

    }

   public static void eliminarEjercicio(String ejercBorrar) {
        Object[] borrado = null;
        for (int i = 0; i < rutinas.size(); i++) {
            Object[] elemento = rutinas.get(i);
            if (elemento[0].equals(ejercBorrar)) {
                borrado = rutinas.remove(i);
                break;
            }
        }
        if (borrado != null) {
            System.out.println("Ejercicio borrado correctamente");
        } else {
            System.out.println("Ejercicio no encontrado");
        }
    }

    public static void eliminarRutina() {
        if(!rutinas.isEmpty()){
            rutinas.clear();
            System.out.println("Rutina borrada correctamente");
        }else{
            System.out.println("No hay rutinas!.");
        }
    }

    public static void listarRutina() {
        if (!rutinas.isEmpty()) {
            for (Object[] elemento : rutinas) {
                for (int i = 0;i<elemento.length;i++) {
                    if (i==0){
                        System.out.print(elemento[i]+  " ");
                    }else if(i == 1){
                        System.out.print(elemento[i]+  " x ");
                    }else{
                        System.out.print(elemento[i]);
                    }

                }
                System.out.println();
            }
        } else {
            System.out.println("No tienes ninguna rutina.");
        }
    }

    public static void agregarEjercicio() {

    System.out.println("Introducir ejercicio");
    String ejercicio = teclado.next();
    teclado.nextLine();
    System.out.println("Introducir número de repeticiones");
    int repeticiones = teclado.nextInt();
    System.out.println("Introducir número de series");
    int series = teclado.nextInt();

    Object[] unEjercicio = {ejercicio, repeticiones,series};
    boolean existe = false;
    for (Object[] elemento : rutinas) {
        if (elemento[0].equals(ejercicio)) {
            existe = true;
            break;
        } else {
            existe = false;
        }
    }
    if (existe) {
        System.out.println("El ejercicio no se puede agregar ya existe");
    } else {
        rutinas.add(unEjercicio);
    }




}
}
