package ss17_crud_quan_ly_phuong_tien.controller;
import ss17_crud_quan_ly_phuong_tien.entity.Car;
import ss17_crud_quan_ly_phuong_tien.entity.Motobike;
import ss17_crud_quan_ly_phuong_tien.entity.Truck;
import ss17_crud_quan_ly_phuong_tien.service.*;
import ss17_crud_quan_ly_phuong_tien.view.MainView;

import java.util.List;
import java.util.Scanner;

public class MainController {
    private ITruckService iTruckService = new TruckService();
    private CarService carService = new CarService();
    private IMotobikeService iMotobikeService = new MotobikeService();
    private static Scanner sc = new Scanner(System.in);
    MainView mainView = new MainView();

    public static void main(String[] args) {
        MainController mainController = new MainController();
        mainController.displayMenu();

    }

    public void displayMenu() {
        System.out.println("===============================================");
        System.out.println("Chương trình quản lý phương tiện giao thông ");
        System.out.println("Chọn chức năng: ");
        System.out.println("1.Thêm mới phương tiện");
        System.out.println("2.Hiện thị phương tiện");
        System.out.println("3.Xoóa phương tiện");
        System.out.println("4.Thoát");
        System.out.println("Mời bạn nhập lựa chọn của bạn: ");
        int choice = Integer.parseInt(sc.nextLine());
        switch (choice) {
            case 1:
                showAddMenuVehicle();
                break;
            case 2:
                showListVehicles();
                break;
            case 3:
                showDeleteMenuVehicle();
                break;
            case 4:
                System.out.println("Thoát chương trình!");
                System.exit(0);
            default:
                System.out.println("Lựa chọn không hợp lệ!");
        }

    }

    public void showDeleteMenuVehicle() {
        int choice = mainView.deleteView(); // menu xóa trong MainView
        switch (choice) {
            case 1:
                System.out.print("Nhập biển số xe tải cần xóa: ");
                String truckPlate = sc.nextLine();
                iTruckService.deleteTruck(truckPlate);
                break;
            case 2:
                System.out.print("Nhập biển số ô tô cần xóa: ");
                String carPlate = sc.nextLine();
                carService.deleteCar(carPlate);
                break;
            case 3:
                System.out.print("Nhập biển số xe máy cần xóa: ");
                String motobikePlate = sc.nextLine();
                iMotobikeService.deleteMotobike(motobikePlate);
                break;
            default:
                System.out.println("Lựa chọn không hợp lệ!");
        }
        displayMenu();
    }


    public void showAddMenuVehicle() {

        int choice = mainView.addView();
        switch (choice) {
            case 1:
                addTruck();
                break;

            case 2:

                addCar();

                break;
            case 3:
                addMotobike();
                break;

        }
    }

    public void showListVehicles() {
        int choice = mainView.listView();
        switch (choice) {
            case 1:
                List<Truck> trucks = iTruckService.getTrucks();
                if (trucks.isEmpty()) {
                    System.out.println("Không có xe tải nào trong hệ thống.");
                } else {
                    System.out.println("Danh sách xe tải:");
                    for (Truck truck : trucks) {
                        System.out.println("Biển số: " + truck.getLicensePlate());
                        System.out.println("Hãng sản xuất: " + truck.getManufacturerName());
                        System.out.println("Năm sản xuất: " + truck.getManufactureYear());
                        System.out.println("Chủ sở hữu: " + truck.getOwnerName());
                        System.out.println("Tải trọng: " + truck.getLoadCapacity() + " tấn");
                        System.out.println("--------------------------------------------");
                    }
                }
                break;
            case 2:
                List<Car> cars = carService.findAll();
                for (Car car : cars) {
                    System.out.println(car);
                }
                break;

            case 3:
                List<Motobike> motobikes= iMotobikeService.getListMotobike();
                if (motobikes.isEmpty()) {
                    System.out.println("Không có xe máy nào trong hệ thống");
                }
                else {
                    for (Motobike motobike : motobikes) {
                        System.out.println("Bien so xe" + motobike.getLicensePlate());
                        System.out.println("Hãng sản xuất: " + motobike.getManufacturerName());
                        System.out.println("Năm sản xuất: "+motobike.getManufactureYear());
                        System.out.println("Chủ sỡ huu: "+motobike.getOwnerName());
                        System.out.println("Công suất: "+motobike.getHorsePower());
                        System.out.println("---------------------------------");
                    }
                }
        }
    }

    public void addTruck() {
        System.out.print("Nhập biển số xe tải: ");
        String licensePlate = sc.nextLine();

        System.out.print("Nhập tên hãng sản xuất: ");
        String manufacturerName = sc.nextLine();

        System.out.print("Nhập năm sản xuất: ");
        int manufactureYear = Integer.parseInt(sc.nextLine());

        System.out.print("Nhập chủ sở hữu: ");
        String ownerName = sc.nextLine();
        System.out.print("Nhập tải trọng: ");
        double loadCapacity = Double.parseDouble(sc.nextLine());
        Truck truck = new Truck(licensePlate, manufacturerName, manufactureYear, ownerName, loadCapacity);

        iTruckService.addTruck(truck);

        System.out.println("Xe tải đã được thêm thành công.");
        displayMenu();
    }

    public void addCar() {
        System.out.print("Nhập biển số xe oto: ");
        String licensePlate = sc.nextLine();

        System.out.print("Nhập tên hãng sản xuất: ");
        String manufacturerName = sc.nextLine();

        System.out.print("Nhập năm sản xuất: ");
        int manufactureYear = Integer.parseInt(sc.nextLine());

        System.out.print("Nhập chủ sở hữu: ");
        String ownerName = sc.nextLine();

        System.out.print("Nhập số lượng ghế ngoi: ");
        Integer seatCount = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập kiểu xe: ");
        String carType = sc.nextLine();

        Car car = new Car(licensePlate, manufacturerName, manufactureYear, ownerName, seatCount, carType);
        carService.addCar(car);

        System.out.println("Xe oto được thêm thành công.");
        displayMenu();
    }

    public void addMotobike() {
        System.out.print("Nhập biển số xe máy: ");
        String licensePlate = sc.nextLine();

        System.out.print("Nhập tên hãng sản xuất: ");
        String manufacturerName = sc.nextLine();

        System.out.print("Nhập năm sản xuất: ");
        int manufactureYear = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập chủ sở hữu: ");
        String ownerName = sc.nextLine();
        System.out.print("Nhập công suất: ");
        double horsePower = Double.parseDouble(sc.nextLine());

        Motobike motobike = new Motobike(licensePlate, manufacturerName, manufactureYear, ownerName, horsePower);
        iMotobikeService.addMotobike(motobike);

        System.out.println("Xe máy đuược thêm thành công. ");
        displayMenu();

    }
}