package ejemploEnum;

public enum Posicion {
    DEFENSA,
    MEDIO,
    DELANTERO,
    PORTERO;

    private String situacion;
    private int nivel1,nivel2,nivel3;

    Posicion(int l1,int l2 ,int l3,String pos){
        this.nivel1=l1;
        this.nivel2=l2;
        this.nivel3=l3;
        this.situacion=pos;
    }
    Posicion(){

    }

    public int getNivel1() {
        return nivel1;
    }

    public int getNivel2() {
        return nivel2;
    }

    public int getNivel3() {
        return nivel3;
    }

    public String getSituacion() {
        return situacion;
    }

    public void setNivel1(int nivel1) {
        this.nivel1 = nivel1;
    }

    public void setNivel2(int nivel2) {
        this.nivel2 = nivel2;
    }

    public void setNivel3(int nivel3) {
        this.nivel3 = nivel3;
    }

    public void setSituacion(String situacion) {
        this.situacion = situacion;
    }
}
