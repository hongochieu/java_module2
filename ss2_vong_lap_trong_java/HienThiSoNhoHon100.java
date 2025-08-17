package ss2_vong_lap_trong_java;
import java.util.Scanner;
public class HienThiSoNhoHon100 {
    public static void main(String[] args) {
        for (int number = 2; number < 100; number++) {
            if (isPrime(number)) {
                System.out.print(number + " ");
            }
        }
    }

    public static boolean isPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
