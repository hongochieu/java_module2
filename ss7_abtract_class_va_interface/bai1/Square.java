package ss7_abtract_class_va_interface.bai1;

public class Square implements ss7_abtract_class_va_interface.bai1.Resizeable {
    private double side;

    public Square(double side){
        this.side = side;
    }
    public double getArea() {
        return side * side;
    }
    @Override
    public void resize(double percent) {
        side += side * percent / 100;
    }
    @Override
    public String toString() {
        return "Square with side: " + side;
    }
}
