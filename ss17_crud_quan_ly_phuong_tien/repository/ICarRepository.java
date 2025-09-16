package ss17_crud_quan_ly_phuong_tien.repository;

import ss17_crud_quan_ly_phuong_tien.entity.Car;


import java.util.List;

public interface ICarRepository {
    List <Car> findAll();
    void addCar(Car car);
    boolean deleteCar(String licensePlate);
}
