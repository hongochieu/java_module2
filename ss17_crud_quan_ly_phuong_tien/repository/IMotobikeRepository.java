package ss17_crud_quan_ly_phuong_tien.repository;

import ss17_crud_quan_ly_phuong_tien.entity.Car;
import ss17_crud_quan_ly_phuong_tien.entity.Motobike;

import java.util.List;

public interface IMotobikeRepository {
    List<Motobike> findAll();
    void addMotobike(Motobike motobike);
    boolean deleteMotobike(String licensePlate);
}