package ss7_abtract_class_va_interface.bai1;

public class Rectangle implements Resizeable {
    private double width;
    private double height;

    public Rectangle (double width, double height){
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }
    @Override
    public void resize(double percent) {
        width += width * percent / 100;
        height += height * percent / 100;
    }
    @Override
    public String toString() {
        return "Rectangle with width: " + width + ", height" + height;
    }
}
