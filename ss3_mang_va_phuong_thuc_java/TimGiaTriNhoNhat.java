package ss3_mang_va_phuong_thuc_java;
import java.util.Scanner;

public class TimGiaTriNhoNhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Nhập số phần tử của mảng (SIZE): ");
        int size = scanner.nextInt();

        int[] array = new int[size];


        for (int i = 0; i < size; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        int min = array[0];

        for (int i = 1; i < size; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }

        System.out.println("Giá trị nhỏ nhất trong mảng là: " + min);

        scanner.close();
    }
}
