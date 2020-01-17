import Trigonometria.Triangulo;

import java.util.Scanner;

public class EntradaTrigonometria {
    public static void main(String[] args) {
        int opcion=0;
        Scanner teclado= new Scanner(System.in);
            do {
            System.out.printf("1-Trabajar con tríangulos%n" +
                    "2-Trabajar con círculos%n" +
                    "3-Trabajar con cuadrados%n" +
                    "4-Salir%n");
            opcion=teclado.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("Introduce base:");
                    int base=teclado.nextInt();
                    System.out.println("Introduce altura:");
                    int altura=teclado.nextInt();
                    Triangulo triangulo=new Triangulo(base,altura);

                    break;
            }
        }while (opcion!=4);


    }
}
