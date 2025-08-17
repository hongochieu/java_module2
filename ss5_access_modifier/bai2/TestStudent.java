package ss5_access_modifier.bai2;

public class TestStudent {
    public static void main (String[] args) {
        Student student = new Student();

        student .setName("Hiếu");
        student.setClasses("C0225L1");

        System.out.println(student.getInfo());
    }
}
