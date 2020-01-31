package herencia;

public class Entrada {
    public static void main(String[] args) {
        //Persona persona2=new Persona("nombre","apellido","asd");
        //Persona persona1=new Persona();
        TrabajadorAsalariado persona3=new TrabajadorAsalariado("Nasalariado","m"
                ,"qwe",14,30000);
        persona3.mostrarDatos();
        TrabajadorAutonomo persona4= new TrabajadorAutonomo("Nautonomo","AAutonomo"
                ,"vff",300);
        System.out.printf(persona4.mostrarDatos());
        System.out.println();
        System.out.printf(persona3.mostrarDatos());
        System.out.println("");
        System.out.printf(persona3.toString());
        System.out.println("");
        System.out.printf(persona4.toString());

    }
}
