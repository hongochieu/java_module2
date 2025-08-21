package ss6_ke_thua.bai2;
public class TestPoint3D {
    public static void main(String[] args) {
        Point3D point3D = new Point3D(1.0f, 2.0f, 3.0f);
        System.out.println("Point3D: " + point3D);

        point3D.setXYZ(4.0f, 5.0f, 6.0f);
        float[] xyz = point3D.getXYZ();
        System.out.println("Sau khi setXYZ: " + point3D);
        System.out.println("X: " + xyz[0] + ", Y: " + xyz[1] + ", Z: " + xyz[2]);
    }
}
