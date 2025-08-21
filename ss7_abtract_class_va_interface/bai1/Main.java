package ss7_abtract_class_va_interface.bai1;
import java.util.Random;
public class Main {
    public static void main(String[]args) {
        Resizeable[] shapes = new Resizeable[3];
        shapes[0] = new ss7_abtract_class_va_interface.bai1.Circle(10);
        shapes[1] = new Rectangle(5, 10);
        shapes[2] = new Square(7);

        Random random = new Random();

        for (Resizeable shape : shapes) {
            double percent = 1 + random.nextInt(100);
            double oldArea = 0;
            double newArea = 0;

            if (shape instanceof ss7_abtract_class_va_interface.bai1.Circle) {
                ss7_abtract_class_va_interface.bai1.Circle circle = (ss7_abtract_class_va_interface.bai1.Circle) shape;
                oldArea = circle.getArea();
                circle.resize(percent);
                newArea = circle.getArea();
            } else if (shape instanceof Square) {
                Square square = (Square) shape;
                oldArea = square.getArea();
                square.resize(percent);
                newArea = square.getArea();
            } else if (shape instanceof Rectangle) {
                Rectangle rectangle = (Rectangle) shape;
                oldArea = rectangle.getArea();
                rectangle.resize(percent);
                newArea = rectangle.getArea();
            }
            System.out.printf("Before resize: %.2f, after resize with %.2f%%: %.2f\n", oldArea, percent, newArea);
        }
    }
}
