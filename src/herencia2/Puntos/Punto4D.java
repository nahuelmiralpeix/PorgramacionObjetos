package herencia2.Puntos;

public class Punto4D extends Punto3D {
    protected int j;

    public Punto4D(int x, int y, int z, int j) {
        super(x, y, z);
        this.j = j;
    }


    public void move(int x, int y, int z,int j) {
        super.move(x, y, z);
        this.j=j;
    }


    public void translate(int dx, int dy, int dz,int dj) {
        super.translate(dx, dy, dz);
        this.j+=dj;
    }

    @Override
    public String toString() {
        return "Punto4D{" +
                "j=" + j +
                ", z=" + z +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
