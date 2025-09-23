package case_study.controller;

import case_study.service.*;

import java.util.Scanner;

public class FuramaController {
    private final Scanner sc = new Scanner(System.in);

    private final IEmployeeService employeeService = new EmployeeService();
    private final ICustomerService customerService = new CustomerService();

    public void displayMainMenu() {
        while (true) {
            System.out.println("======= QUẢN LÝ FURAMA =======");
            System.out.println("1. Quản lý nhân viên");
            System.out.println("2. Quản lý khách hàng");
            System.out.println("3. Thoát");
            System.out.print("Chọn một tùy chọn: ");

            String choice = sc.nextLine();
            switch (choice) {
                case "1": employeeMenu(); break;
                case "2": customerMenu(); break;
                case "3":
                    System.out.println("Exiting program...");
                    return;
                default:
                    System.out.println("❌ Lựa chọn không hợp lệ, vui lòng thử lại!");
            }
        }
    }

    private void employeeMenu() {
        while (true) {
            System.out.println("---- Quản lý nhân viên ----");
            System.out.println("1. Hiển thị danh sách nhân viên");
            System.out.println("2. Thêm nhân viên mới");
            System.out.println("3. Chỉnh sửa nhân viên");
            System.out.println("4. Xóa nhân viên");
            System.out.println("5. Quay lại menu chính");
            System.out.print("Chọn một tùy chọn: ");

            String choice = sc.nextLine();
            switch (choice) {
                case "1": employeeService.display(); break;
                case "2": employeeService.add(); break;
                case "3": employeeService.edit(); break;
                case "4": employeeService.delete(); break;
                case "5": return;
                default: System.out.println("❌ Lựa chọn không hợp lệ!");
            }
        }
    }

    private void customerMenu() {
        while (true) {
            System.out.println("---- Quản lý khách hàng ----");
            System.out.println("1. Hiển thị danh sách khách hàng");
            System.out.println("2. Thêm khách hàng mới");
            System.out.println("3. Chỉnh sửa khách hàng");
            System.out.println("4. Xóa khách hàng");
            System.out.println("5. Quay lại menu chính");
            System.out.print("Chọn một tùy chọn: ");

            String choice = sc.nextLine();
            switch (choice) {
                case "1": customerService.display(); break;
                case "2": customerService.add(); break;
                case "3": customerService.edit(); break;
                case "4": customerService.delete(); break;
                case "5": return;
                default: System.out.println("❌ Lựa chọn không hợp lệ!");
            }
        }
    }
}
