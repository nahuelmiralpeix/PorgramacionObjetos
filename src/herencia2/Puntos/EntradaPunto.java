package herencia2.Puntos;

import java.awt.*;

public class EntradaPunto {
    public static void main(String[] args) {
        Point punto1 = new Point(2, 3);
        Punto3D punto2 = new Punto3D(2, 3, 4);
        Punto4D punto3 = new Punto4D(4, 5, 6, 2);
        punto1.move(4, 6);
        punto2.translate(2, 1, 0);
        punto3.translate(2, 1, 0, 4);
        System.out.println(punto1.toString());
        System.out.println(punto2.toString());
        System.out.println(punto3.toString());

        punto1.move(1,1);
        System.out.println("Movido 1,1");
        System.out.println(punto1.toString());
        punto1.translate(3,2);
        System.out.println("Transladado 3 2");
        System.out.println(punto1.toString());

        punto2.move(0,0,0);
        System.out.println("Movido a 0 , 0");
        System.out.println(punto2.toString());
    }
}
