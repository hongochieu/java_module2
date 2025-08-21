package ss6_ke_thua.bai2;

public class TestPoint2D {
    public static void main(String[] args){
        Point2D point2D = new Point2D(3.5f,5.5f);
        System.out.println("Point2D: " + point2D);

        point2D.setX(1.0f);
        point2D.setY(2.0f);

        System.out.println("Sau khi setX và setY: " + point2D);

        point2D.setXY(9.5f, 4.5f);
        float[] xy = point2D.getXY();
        System.out.println("Sau khi setXY:" + point2D);
        System.out.println("X: " + xy[0] + ", Y: " + xy[1]);
    }
}
