package ss17_crud_quan_ly_phuong_tien.repository;

import ss17_crud_quan_ly_phuong_tien.entity.Car;
import ss17_crud_quan_ly_phuong_tien.util.ReadAndWriteFile;

import java.util.ArrayList;
import java.util.List;

public class CarRepository implements ICarRepository {

    private final boolean APPEND = true;

    @Override
    public List<Car> findAll() {
        List<Car> carList = new ArrayList<>();
        List<String> stringList = ReadAndWriteFile.readFromFile("D:\\Codegym\\module2\\ss17_crud_quan_ly_phuong_tien\\data\\car.csv");
        String[] aray = null;
        for (String line : stringList) {
            aray = line.split(",");
            Car car = new Car(aray[0],aray[1],Integer.parseInt(aray[2]),aray[3],Integer.parseInt(aray[4]),aray[5]);
            carList.add(car);
        }
        return carList;

    }

    @Override
    public void addCar(Car car) {
        List<String> carList = new ArrayList<>();
        carList.add(car.getInfoToCSV());
        ReadAndWriteFile.writeToFile("D:\\Codegym\\module2\\ss17_crud_quan_ly_phuong_tien\\data\\car.csv",carList,APPEND);
    }

    @Override
    public boolean deleteCar(String licensePlate) {
        List<Car> carList = findAll();
        boolean removed = carList.removeIf(car -> car.getLicensePlate().equals(licensePlate));
        if (removed) {
            List<String> stringList = new ArrayList<>();
            for (Car c : carList) {
                stringList.add(c.getInfoToCSV());
            }
            ReadAndWriteFile.writeToFile("D:\\Codegym\\module2\\ss17_crud_quan_ly_phuong_tien\\data\\car.csv", stringList, false);
        }
        return removed;
    }
}