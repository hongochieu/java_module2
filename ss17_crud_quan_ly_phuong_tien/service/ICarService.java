package ss17_crud_quan_ly_phuong_tien.service;

import ss17_crud_quan_ly_phuong_tien.entity.Car;

import java.util.List;

public interface ICarService {
    List <Car> findAll();
    void addCar(Car car);
    boolean deleteCar(String licensePlate);
}