package ss8_clean_code.controller;

import ss8_clean_code.entity.Customer;
import ss8_clean_code.service.CustomerService;
import ss8_clean_code.service.ICustomerService;
import ss8_clean_code.view.CustomerView;

import java.util.Scanner;

public class CustomerController {
    private final ICustomerService service = new CustomerService();
    private final CustomerView view = new CustomerView();
    private final Scanner scanner = new Scanner(System.in);

    public void run() {
        int choice;
        do {
            view.showMenu();
            choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1 -> addCustomer();
                case 2 -> viewAllCustomers();
                case 3 -> updateCustomer();
                case 4 -> deleteCustomer();
                case 5 -> System.out.println("👋 Thoát chương trình!");
                default -> System.out.println("❌ Lựa chọn không hợp lệ!");
            }
        } while (choice != 5);
    }

    private void addCustomer() {
        System.out.print("Nhập ID: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập tên: ");
        String name = scanner.nextLine();
        System.out.print("Nhập email: ");
        String email = scanner.nextLine();
        System.out.print("Nhập địa chỉ: ");
        String address = scanner.nextLine();

        Customer customer = new Customer(id, name, email, address);
        service.addCustomer(customer);
        System.out.println("✅ Thêm khách hàng thành công!");
    }

    private void viewAllCustomers() {
        view.showAll(service.getAllCustomers());
    }

    private void updateCustomer() {
        System.out.print("Nhập ID khách hàng cần sửa: ");
        int id = Integer.parseInt(scanner.nextLine());

        Customer old = service.getCustomerById(id);
        if (old == null) {
            System.out.println("❌ Không tìm thấy khách hàng!");
            return;
        }

        System.out.print("Nhập tên mới: ");
        String name = scanner.nextLine();
        System.out.print("Nhập email mới: ");
        String email = scanner.nextLine();
        System.out.print("Nhập địa chỉ mới: ");
        String address = scanner.nextLine();

        service.updateCustomer(new Customer(id, name, email, address));
        System.out.println("✅ Cập nhật thành công!");
    }

    private void deleteCustomer() {
        System.out.print("Nhập ID khách hàng cần xóa: ");
        int id = Integer.parseInt(scanner.nextLine());
        service.deleteCustomer(id);
        System.out.println("✅ Xóa thành công!");
    }
}
