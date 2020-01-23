package Asignaturas;

public class Profesor {
    public void ponerNotas(Alumno alumno){
        alumno.getAsign1().setCalificacion(Math.random()*10);
        alumno.getAsign2().setCalificacion(Math.random()*10);
        alumno.getAsign3().setCalificacion(Math.random()*10);

        /*Asignatura asignatura1 = alumno.getAsign1();
        Asignatura asignatura2 = alumno.getAsign2();
        Asignatura asignatura3 = alumno.getAsign3();

        asignatura1.setCalificacion(Math.random()*10);
        asignatura2.setCalificacion(Math.random()*10);
        asignatura3.setCalificacion(Math.random()*10);*/

    }

    public double calcularMedia(Alumno alumno){

        /*Asignatura asignatura1=alumno.getAsign1();
        Asignatura asignatura2=alumno.getAsign2();
        Asignatura asignatura3=alumno.getAsign3();

        double media=(asignatura1.getCalificacion()+asignatura2.getCalificacion()+asignatura3.getCalificacion())/3;*/
        double mediaCompleta=(alumno.getAsign1().getCalificacion()+alumno.getAsign2().getCalificacion()+
                alumno.getAsign3().getCalificacion())/3;
        return mediaCompleta;
    }
}
