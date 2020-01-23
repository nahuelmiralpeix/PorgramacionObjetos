package Asignaturas;

public class Alumno {
    private Asignatura asign1;
    private Asignatura asign2;
    private Asignatura asign3;

    public Alumno(Asignatura asign1,Asignatura asign2,Asignatura asign3){
        this.asign1=asign1;
        this.asign2=asign2;
        this.asign3=asign3;
    }
    public Alumno(int a1,int a2,int a3){
        this.asign1=new Asignatura(a1);
        this.asign2=new Asignatura(a2);
        this.asign3=new Asignatura(a3);
    }

    public Asignatura getAsign1() {
        return asign1;
    }

    public Asignatura getAsign2() {
        return asign2;
    }

    public Asignatura getAsign3() {
        return asign3;
    }

    @Override
    public String toString(){
        return super.toString();
    }

}







