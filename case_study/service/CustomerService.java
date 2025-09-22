package case_study.service;

import case_study.entity.Customer;
import case_study.repository.CustomerRepository;

import java.util.List;
import java.util.Scanner;

public class CustomerService implements ICustomerService {
    private final CustomerRepository repo = new CustomerRepository();
    private final Scanner sc = new Scanner(System.in);

    @Override
    public void display() {
        List<Customer> list = repo.findAll();
        if (list.isEmpty()) {
            System.out.println("No customers found.");
        } else {
            for (Customer c : list) {
                System.out.println(c);
            }
        }
    }

    @Override
    public void add() {
        System.out.print("Nhập mã khách hàng: ");
        String id = sc.nextLine();
        System.out.print("Nhập tên: ");
        String name = sc.nextLine();
        System.out.print("Nhập ngày sinh: ");
        String birthday = sc.nextLine();
        System.out.print("Nhập giới tính: ");
        String gender = sc.nextLine();
        System.out.print("Nhập số CMND: ");
        String idCard = sc.nextLine();
        System.out.print("Nhập số điện thoại: ");
        String phone = sc.nextLine();
        System.out.print("Nhập email: ");
        String email = sc.nextLine();
        System.out.print("Nhập loại khách hàng: ");
        String type = sc.nextLine();
        System.out.print("Nhập địa chỉ: ");
        String address = sc.nextLine();

        Customer c = new Customer(id, name, birthday, gender, idCard, phone, email, type, address);
        repo.add(c);
        System.out.println("✔ Khách hàng đã được thêm thành công!");
    }

    @Override
    public void edit() {
        System.out.print("Nhập ID khách hàng cần sửa: ");
        String id = sc.nextLine();

        List<Customer> list = repo.findAll();
        Customer target = list.stream().filter(c -> c.getId().equals(id)).findFirst().orElse(null);

        if (target == null) {
            System.out.println("✘ Không tìm thấy khách hàng!");
            return;
        }

        System.out.print("Nhập địa chỉ mới: ");
        target.setAddress(sc.nextLine());

        repo.update(target);
        System.out.println("✔ Khách hàng đã được cập nhật thành công!");
    }

    @Override
    public void delete() {
        System.out.print("Nhập ID khách hàng cần xóa: ");
        String id = sc.nextLine();
        repo.delete(id);
        System.out.println("✔ Khách hàng đã xóa thành công!");
    }
}
