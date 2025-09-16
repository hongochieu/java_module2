package ss17_crud_quan_ly_phuong_tien.service;

import ss17_crud_quan_ly_phuong_tien.entity.Truck;

import java.util.List;

public interface ITruckService {
    void addTruck(Truck truck);
    List<Truck> getTrucks();

    void deleteTruck(String truckPlate);
}