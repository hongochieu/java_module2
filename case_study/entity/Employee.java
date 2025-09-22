package case_study.entity;

public class Employee extends Person {
    private String level;
    private String position;
    private double salary;

    public Employee() {}

    public Employee(String id, String name, String birthday, String gender,
                    String idCard, String phone, String email,
                    String level, String position, double salary) {
        super(id, name, birthday, gender, idCard, phone, email);
        this.level = level;
        this.position = position;
        this.salary = salary;
    }

    public String getLevel() { return level; }
    public void setLevel(String level) { this.level = level; }
    public String getPosition() { return position; }
    public void setPosition(String position) { this.position = position; }
    public double getSalary() { return salary; }
    public void setSalary(double salary) { this.salary = salary; }

    public String toCSV() {
        return String.join(",",
                getId(), getName(), getBirthday(), getGender(),
                getIdCard(), getPhone(), getEmail(),
                level, position, String.valueOf(salary));
    }

    public static Employee fromCSV(String line) {
        String[] t = line.split(",");
        return new Employee(
                t[0], // id
                t[1], // name
                t[2], // birthday
                t[3], // gender
                t[4], // idCard
                t[5], // phone
                t[6], // email
                t[7], // level
                t[8], // position
                Double.parseDouble(t[9]) // salary
        );
    }
}
