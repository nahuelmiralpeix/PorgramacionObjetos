package TrabajadoresHerencia;

public class EntradaTrabajadores {
    public static void main(String[] args) {
        Empresa empresa = new Empresa();
        Jefe jefe= new Jefe("Njefe","Njefe","asd",34,34);
        Jefe jefe2= new Jefe("Njefe","Njefe","asdw",34,34);
        Asalariado asalariado=new Asalariado("Nasalariado","Aasalariado","qwe",34090,13);
        Autonomo autonomo=new Autonomo("NAutonomo","AAutonomo","zxc",20000);
        Autonomo autonomo2=new Autonomo("NPepe","AAutonomo","zxc",20000);

        System.out.println(jefe.mostrarDatos());
        System.out.println(asalariado.mostrarDatos());
        System.out.println(autonomo.mostrarDatos());

        empresa.agregarTrabajador(asalariado);
        empresa.agregarTrabajador(autonomo);
        //empresa.agregarTrabajador(autonomo2);
        empresa.agregarTrabajador(jefe);
        //empresa.agregarTrabajador(jefe2);
        jefe.despedirTrabajador(asalariado);
        System.out.println("despues de despedir");
        System.out.println(asalariado.mostrarDatos());
        empresa.eliminarTrabajador(asalariado.getDni());
        System.out.println(empresa.getEmpresaElementos().size());
    }
}
