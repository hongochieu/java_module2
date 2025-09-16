package ss17_crud_quan_ly_phuong_tien.view;

import java.util.Scanner;

public class MainView {
    private static Scanner sc = new Scanner(System.in);


    public int addView() {
        System.out.println("========================");
        System.out.println("1. Thêm xe tải");
        System.out.println("2. Thêm oto");
        System.out.println("3.Thêm xe máy");
        System.out.println("4.Thoat");
        System.out.println("Moi ban nhap lua chon cua ban");

        int choice = Integer.parseInt(sc.nextLine());
        return choice;
    }

    public int listView() {
        System.out.println("========================");
        System.out.println("1.Hiển thị xe tải");
        System.out.println("2.Hiển thị xe oto");
        System.out.println("3.Hiển thị xe máy");
        int choice = Integer.parseInt(sc.nextLine());
        return choice;
    }

    public int deleteView() {
        System.out.println("----- XÓA PHƯƠNG TIỆN -----");
        System.out.println("1. Xóa xe tải");
        System.out.println("2. Xóa ô tô");
        System.out.println("3. Xóa xe máy");
        System.out.print("Mời bạn chọn: ");
        return Integer.parseInt(new Scanner(System.in).nextLine());
    }

}