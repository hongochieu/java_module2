package case_study.service;

import case_study.entity.Employee;
import case_study.repository.EmployeeRepository;

import java.util.List;
import java.util.Scanner;

public class EmployeeService implements IEmployeeService {
    private final EmployeeRepository repo = new EmployeeRepository();
    private final Scanner sc = new Scanner(System.in);

    @Override
    public void display() {
        List<Employee> list = repo.findAll();
        if (list.isEmpty()) {
            System.out.println("No employees found.");
        } else {
            for (Employee e : list) {
                System.out.println(e);
            }
        }
    }

    @Override
    public void add() {
        System.out.print("Nhập ID nhân viên: ");
        String id = sc.nextLine();
        System.out.print("Nhập tên nhân viên: ");
        String name = sc.nextLine();
        System.out.print("nhập ngày sinh: ");
        String birthday = sc.nextLine();
        System.out.print("Nhập giới tính: ");
        String gender = sc.nextLine();
        System.out.print("Nhập số CMND: ");
        String idCard = sc.nextLine();
        System.out.print("Nhập số điện thoại: ");
        String phone = sc.nextLine();
        System.out.print("Nhập email: ");
        String email = sc.nextLine();
        System.out.print("Trình độ: ");
        String level = sc.nextLine();
        System.out.print("Vị trí: ");
        String position = sc.nextLine();
        System.out.print("Mức lương: ");
        double salary = Double.parseDouble(sc.nextLine());

        Employee emp = new Employee(id, name, birthday, gender, idCard, phone, email, level, position, salary);
        repo.add(emp);
        System.out.println("Nhân viên đã thêm thành công!");
    }

    @Override
    public void edit() {
        System.out.print("Nhập ID nhân viên để chỉnh sửa: ");
        String id = sc.nextLine();

        List<Employee> list = repo.findAll();
        Employee target = list.stream().filter(e -> e.getId().equals(id)).findFirst().orElse(null);

        if (target == null) {
            System.out.println("Không tìm thấy nhân viên!");
            return;
        }

        System.out.print("Nhập mức lương mới: ");
        target.setSalary(Double.parseDouble(sc.nextLine()));

        repo.update(target);
        System.out.println("Nhân viên đã được cập nhật thành công!");
    }

    @Override
    public void delete() {
        System.out.print("Nhập ID nhân viên cần xóa: ");
        String id = sc.nextLine();
        repo.delete(id);
        System.out.println("Nhân viên đã được xóa thành công!");
    }
}
