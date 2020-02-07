package herencia2;

import java.util.ArrayList;

public class Entrada {
    public static void main(String[] args) {

        Trabajador trabajador = new Trabajador("nombre trabajador", "apellidos trabajador");
        Trabajador trabajador2 = new Trabajador("nombre trabajador", "apellidos trabajador", 10000);
        Jefe jefe = new Jefe("nombre jefe", "apellido jefe", 20000, 20);
        JefeSupremo jefeSupremo = new JefeSupremo("asd", "asd", 2000, 27);
        trabajador.mostrarDatos();
        trabajador2.mostrarDatos("jfjffjfj");
        jefe.despedir();

        //System.out.println(trabajador.getClass());
        //trabajador instanceof Jefe ? ((Jefe) trabajador) : null;
        if(trabajador.getClass().getSimpleName().equals("Trabajador")){
            System.out.println("LO soy");
        }else{
            System.out.println("NO lo soy");
        }


        ArrayList<Trabajador> arrayTrabajador = new ArrayList();
        arrayTrabajador.add(trabajador);
        arrayTrabajador.add(trabajador2);
        arrayTrabajador.add(jefe);
        arrayTrabajador.add(jefeSupremo);

        for (Persona item:arrayTrabajador) {
            item.mostrarDatos();
        }

    }
}
