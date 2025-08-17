package ss3_mang_va_phuong_thuc_java;
import java.util.Scanner;

public class ThemPhanTuVaoMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int[] array = new int[10];
        int currentSize = 5;
        array[0] = 10;
        array[1] = 4;
        array[2] = 6;
        array[3] = 7;
        array[4] = 8;


        System.out.print("Nhập giá trị cần chèn X: ");
        int x = scanner.nextInt();


        System.out.print("Nhập vị trí cần chèn (0 - " + (array.length - 1) + "): ");
        int index = scanner.nextInt();


        if (index < 0 || index >= array.length - 1 || currentSize >= array.length) {
            System.out.println("Không thể chèn vào mảng tại vị trí này.");
        } else {

            for (int i = currentSize; i > index; i--) {
                array[i] = array[i - 1];
            }

            array[index] = x;
            currentSize++;


            System.out.print("Mảng sau khi chèn: ");
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
            }
        }

        scanner.close();
    }
}
