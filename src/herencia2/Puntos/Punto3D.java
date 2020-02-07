package herencia2.Puntos;

import java.awt.*;

public class Punto3D extends Point {
    protected int z;

    public Punto3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }


    public void move(int x, int y, int z) {
        super.move(x, y);
        this.z = z;
    }


    public void translate(int dx, int dy, int dz) {
        super.translate(dx, dy);
        this.z += dz;
    }

    @Override
    public String toString() {
        return "Punto3D{" +
                "z=" + z +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
