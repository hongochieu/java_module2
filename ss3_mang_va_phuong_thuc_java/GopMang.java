package ss3_mang_va_phuong_thuc_java;
import java.util.Scanner;

public class GopMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Nhập số phần tử của mảng thứ nhất: ");
        int size1 = scanner.nextInt();
        System.out.print("Nhập số phần tử của mảng thứ hai: ");
        int size2 = scanner.nextInt();

        int[] array1 = new int[size1];
        int[] array2 = new int[size2];


        System.out.println("Nhập các phần tử của mảng thứ nhất:");
        for (int i = 0; i < size1; i++) {
            System.out.print("array1[" + i + "] = ");
            array1[i] = scanner.nextInt();
        }


        System.out.println("Nhập các phần tử của mảng thứ hai:");
        for (int i = 0; i < size2; i++) {
            System.out.print("array2[" + i + "] = ");
            array2[i] = scanner.nextInt();
        }


        int[] mergedArray = new int[size1 + size2];


        for (int i = 0; i < size1; i++) {
            mergedArray[i] = array1[i];
        }


        for (int i = 0; i < size2; i++) {
            mergedArray[size1 + i] = array2[i];
        }


        System.out.println("Mảng sau khi gộp:");
        for (int i = 0; i < mergedArray.length; i++) {
            System.out.print(mergedArray[i] + " ");
        }

        scanner.close();
    }
}
