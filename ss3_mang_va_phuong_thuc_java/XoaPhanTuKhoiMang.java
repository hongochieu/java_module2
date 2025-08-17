package ss3_mang_va_phuong_thuc_java;
import java.util.Scanner;

public class XoaPhanTuKhoiMang {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        // Bước 1: Nhập số phần tử của mảng
        System.out.print("Nhập số phần tử của mảng: ");
        int n = scanner.nextInt();

        int[] array = new int[n];

        // Bước 1: Nhập giá trị cho các phần tử
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + i + ": ");
            array[i] = scanner.nextInt();
        }

        // Bước 2: Nhập phần tử cần xóa
        System.out.print("Nhập phần tử cần xóa: ");
        int x = scanner.nextInt();

        // Bước 3: Tìm vị trí phần tử cần xóa (nếu có)
        int indexDel = -1;
        for (int i = 0; i < n; i++) {
            if (array[i] == x) {
                indexDel = i;
                break;
            }
        }

        if (indexDel == -1) {
            System.out.println("Không tìm thấy phần tử " + x + " trong mảng.");
        } else {

            for (int i = indexDel; i < n - 1; i++) {
                array[i] = array[i + 1];
            }
            array[n - 1] = 0;


            System.out.print("Mảng sau khi xóa: ");
            for (int i = 0; i < n; i++) {
                System.out.print(array[i] + " ");
            }
        }

        scanner.close();
    }
}
