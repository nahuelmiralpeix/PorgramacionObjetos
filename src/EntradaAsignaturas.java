import Asignaturas.Alumno;
import Asignaturas.Asignatura;
import Asignaturas.Profesor;

public class EntradaAsignaturas {
    public static void main(String[] args) {
        Asignatura asignatura1=new Asignatura(1);
        Asignatura asignatura2=new Asignatura(2);
        Asignatura asignatura3=new Asignatura(3);

        Alumno alumno = new Alumno(asignatura1,asignatura2,asignatura3);
        Alumno alumno2= new Alumno(1,2,3);

        Profesor profesor= new Profesor();
        profesor.ponerNotas(alumno);
        System.out.println(alumno.getAsign1().getCalificacion());
        if(alumno.getAsign1().getCalificacion()>=5){
            System.out.println("Aprobado");
        }else{
            System.out.println("Suspenso");
        }
    }
}
