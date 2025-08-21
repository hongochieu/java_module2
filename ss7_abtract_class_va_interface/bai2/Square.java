package ss7_abtract_class_va_interface.bai2;

public class Square extends Shape implements Colorable{
    private double side;

    public Square(){
    }
    public Square(double side){
        this.side = side;
    }
    public Square(double side, String color, boolean filled){
        super(color, filled);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
    @Override
    public double getArea(){
        return side * side;
    }
    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }
    @Override
    public String toString() {
        return "A Square with side=" + side + ", which is a subclass of " + super.toString();
    }
}
