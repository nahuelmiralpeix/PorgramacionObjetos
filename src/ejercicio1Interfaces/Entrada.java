package ejercicio1Interfaces;

import javax.imageio.plugins.tiff.TIFFDirectory;

public class Entrada {
    public static void main(String[] args) {
        Empresa empresa = new Empresa();
        Empleado empleado1 = new Empleado("123A", "Empleado1", "Apellido", 123,
                Puestos.OPERADOR_UNO);
        Empleado empleado2 = new Empleado("124B", "Empleado2", "Apellido", 123,
                Puestos.OPERADOR_DOS);
        Empleado empleado3 = new Empleado("125C", "Empleado3", "Apellido", 123,
                Puestos.SUPERVISOR);
        Jefe jefe1 = new Jefe("1234123A", "Jefe1", "Apellido", 1000, 123);
        Jefe jefe2 = new Jefe("5896078P", "Jefe2", "Apellido", 1000, 123);
        Directivo directivo1 = new Directivo("12344ASD", "Directivo1", "Apellido", 123);
        Directivo directivo2 = new Directivo("1237978WQ", "Directivo2", "Apellido", 123);
        Directivo directivo3 = new Directivo("1237978WQ", "Directivo2", "Apellido", 123);

        empresa.registrarPersona(empleado1);
        empresa.registrarPersona(empleado2);
        empresa.registrarPersona(empleado3);
        empresa.registrarPersona(jefe1);
        empresa.registrarPersona(jefe2);
        empresa.registrarPersona(directivo1);
        empresa.registrarPersona(directivo2);
        //empresa.registrarPersona(directivo3);
       // empresa.mostrarDatosTodos();
        empresa.mostrarNumeroEmpleados();
       // empresa.mostrarDniConLetraA();
        empresa.registrarVoto(jefe1,2);
        empresa.registrarVoto(directivo1,1);
        empresa.mostrarNumeroVotos();

        empresa.quitarPersona("125C");
        empresa.mostrarNumeroEmpleados();
        Persona personaEliminada=empresa.quitarPersona("125C");
        empresa.mostrarNumeroEmpleados();

        if (personaEliminada==null){
            System.out.println("no encontrada");
        }else{
            System.out.println(personaEliminada.getNombre());
        }
    }
}
