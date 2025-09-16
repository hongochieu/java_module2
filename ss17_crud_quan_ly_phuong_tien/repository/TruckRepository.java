package ss17_crud_quan_ly_phuong_tien.repository;

import ss17_crud_quan_ly_phuong_tien.entity.Truck;

import java.util.ArrayList;
import java.util.List;

public class TruckRepository {
    private List<Truck> listTrucks = new ArrayList<>();

    public TruckRepository() {
        listTrucks.add(new Truck("43C-012.34", "Huyndai", 2019, "Nguyễn Văn A", 3));
        listTrucks.add(new Truck("43C-47.678", "Dongfeng", 2020, "Nguyễn Văn B", 9));
        listTrucks.add(new Truck("43C-45.235", "Hino", 2021, "Nguyễn Văn C", 12));
    }

    public void addTruck(Truck truck) {
        listTrucks.add(truck);
    }

    public List<Truck> getTrucks() {
        return listTrucks;
    }

    public boolean deleteTruckByLicensePlate(String licensePlate) {
        return listTrucks.removeIf(truck -> truck.getLicensePlate().equals(licensePlate));
    }
}
