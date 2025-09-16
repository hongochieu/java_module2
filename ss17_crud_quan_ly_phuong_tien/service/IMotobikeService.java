package ss17_crud_quan_ly_phuong_tien.service;


import ss17_crud_quan_ly_phuong_tien.entity.Motobike;

import java.util.List;

public interface IMotobikeService {
    void  addMotobike(Motobike motobike);
    List<Motobike> getListMotobike();

    void deleteMotobike(String motobikePlate);
}