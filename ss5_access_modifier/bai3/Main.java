package ss5_access_modifier.bai3;

import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        ProductManagement productManagement = new ProductManagement();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("----MENU----");
            System.out.println("1. Thêm sản phẩm");
            System.out.println("2. Hiển thị sản phẩm");
            System.out.println("3. Xóa sản phẩm");
            System.out.println("4. Tìm kiếm sản phẩm");
            System.out.println("5. Cập nhật sản phẩm");
            System.out.println("0. Thoát");
            System.out.println("Chọn chức năng");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    System.out.println("Nhập id: ");
                    int id = Integer.parseInt(scanner.nextLine());
                    System.out.println("Nhập tên: ");
                    String name = scanner.nextLine();
                    System.out.println("Nhập giá: ");
                    double price = Double.parseDouble(scanner.nextLine());
                    Product product = new Product(id, name, price);
                    productManagement.add(product);
                    System.out.println("Thêm thành công");
                    break;
                case 2:
                    productManagement.display();
                    break;
                case 3:
                    System.out.println("Nhập id cần xóa: ");
                    int deleteId = Integer.parseInt(scanner.nextLine());
                    productManagement.delete(deleteId);
                    break;
                case 4:
                    System.out.println("Nhập tên cần tìm: ");
                    String searchName = scanner.nextLine();
                    productManagement.search(searchName);
                    break;
                case 5:
                    System.out.println("Nhập id cần cập nhật: ");
                    int updateId = Integer.parseInt(scanner.nextLine());
                    System.out.println("Nhập tên mới: ");
                    String newName = scanner.nextLine();
                    System.out.println("Nhập giá mới: ");
                    double newPrice = Double.parseDouble(scanner.nextLine());
                    productManagement.update(updateId, newName, newPrice);
                    break;
                case 0:
                    running = false;
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
            }
        }
    }
}
