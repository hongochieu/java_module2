package ss8_clean_code.view;

import ss8_clean_code.entity.Customer;
import java.util.List;

public class CustomerView {
    public void showMenu() {
        System.out.println("\n=== QUẢN LÝ KHÁCH HÀNG ===");
        System.out.println("1. Thêm khách hàng");
        System.out.println("2. Hiển thị danh sách khách hàng");
        System.out.println("3. Cập nhật khách hàng");
        System.out.println("4. Xóa khách hàng");
        System.out.println("5. Thoát");
        System.out.print("👉 Chọn chức năng: ");
    }

    public void showAll(List<Customer> customers) {
        System.out.println("\n=== DANH SÁCH KHÁCH HÀNG ===");
        for (Customer customer : customers) {
            System.out.println(customer);
        }
    }
}
