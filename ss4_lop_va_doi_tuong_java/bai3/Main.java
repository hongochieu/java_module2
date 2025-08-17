package  ss4_lop_va_doi_tuong_java.bai3;
public class Main {
    public static void main(String[] args) {
        // Fan 1: tốc độ FAST, radius = 10, màu vàng, bật
        Fan fan1 = new Fan();
        fan1.setSpeed(Fan.FAST);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setOn(true);

        // Fan 2: tốc độ MEDIUM, radius = 5, màu xanh, tắt
        Fan fan2 = new Fan();
        fan2.setSpeed(Fan.MEDIUM);
        fan2.setRadius(5);
        fan2.setColor("blue");
        fan2.setOn(false);

        // In thông tin bằng toString()
        System.out.println(fan1.toString());
        System.out.println(fan2.toString());
    }
}