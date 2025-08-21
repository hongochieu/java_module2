package ss7_abtract_class_va_interface.bai2;

public class ColorableTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Square(5.0);
        shapes[1] = new Square(3.0, "blue", true);
        shapes[2] = new Circle(2.0);


        for (Shape shape : shapes) {
            System.out.println("\nHình: " + shape);
            System.out.println("Diện tích: " + shape.getArea());


            if (shape instanceof Colorable) {
                System.out.print("Cách tô màu: ");
                ((Colorable) shape).howToColor();
            } else {
                System.out.println("Hình này không implement Colorable");
            }
        }
    }
}
