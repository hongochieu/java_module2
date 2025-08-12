package ss1_gioi_thieu_java;

import java.util.Scanner;

public class HienThiLoiChao {
    public static void main(String[] args) {
        System.out.println("Enter your name");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Hello " + name);
    }
}
