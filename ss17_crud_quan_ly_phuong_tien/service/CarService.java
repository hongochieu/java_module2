package ss17_crud_quan_ly_phuong_tien.service;

import ss17_crud_quan_ly_phuong_tien.entity.Car;

import ss17_crud_quan_ly_phuong_tien.repository.CarRepository;


import java.util.List;

public class CarService implements ICarService {
    CarRepository carRepository = new CarRepository();

    @Override
    public List<Car> findAll() {
        return carRepository.findAll();
    }

    @Override
    public void addCar(Car car) {
        carRepository.addCar(car);
    }

    @Override
    public boolean deleteCar(String licensePlate) {
        return carRepository.deleteCar(licensePlate);
    }
}