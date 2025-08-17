package ss3_mang_va_phuong_thuc_java;
import java.util.Scanner;

public class TimGiaTriLonNhatTrongMaTran {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double[][] maTranCoSan = {
                {1.2, 5.4, 3.1},
                {4.8, 9.0, 2.5},
                {3.6, 7.7, 6.3}
        };

        double max = maTranCoSan[0][0];
        int hang = 0, cot = 0;

        for (int i = 0; i < maTranCoSan.length; i++) {
            for (int j = 0; j < maTranCoSan[i].length; j++) {
                if (maTranCoSan[i][j] > max) {
                    max = maTranCoSan[i][j];
                    hang = i;
                    cot = j;
                }
            }
        }

        System.out.println(">> [Ma trận có sẵn]");
        System.out.println("Giá trị lớn nhất là " + max + " tại vị trí [" + hang + "][" + cot + "]");


        System.out.println("\n--- Nhập ma trận từ người dùng ---");
        System.out.print("Nhập số hàng: ");
        int rows = scanner.nextInt();

        System.out.print("Nhập số cột: ");
        int cols = scanner.nextInt();

        double[][] maTran = new double[rows][cols];


        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Nhập phần tử tại [" + i + "][" + j + "]: ");
                maTran[i][j] = scanner.nextDouble();
            }
        }


        double giaTriMax = maTran[0][0];
        int viTriHang = 0, viTriCot = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (maTran[i][j] > giaTriMax) {
                    giaTriMax = maTran[i][j];
                    viTriHang = i;
                    viTriCot = j;
                }
            }
        }

        System.out.println(">> [Ma trận người dùng nhập]");
        System.out.println("Giá trị lớn nhất là " + giaTriMax + " tại vị trí [" + viTriHang + "][" + viTriCot + "]");

        scanner.close();
    }
}
