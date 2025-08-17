package ss5_access_modifier.bai1;
public class TestCircle {
    public static void main(String[] args) {
        ss5_access_modifier.bai1.Circle circle = new ss5_access_modifier.bai1.Circle(5.0);
        System.out.println("Radius: " + circle.getRadius());
        System.out.println("Area: " + circle.getArea());
    }
}