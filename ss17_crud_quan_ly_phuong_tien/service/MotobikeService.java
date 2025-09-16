package ss17_crud_quan_ly_phuong_tien.service;


import ss17_crud_quan_ly_phuong_tien.entity.Motobike;
import ss17_crud_quan_ly_phuong_tien.repository.MotobikeRepository;

import java.util.List;

public class MotobikeService implements IMotobikeService {
    private MotobikeRepository motobikeRepository = new MotobikeRepository();

    @Override
    public void addMotobike(Motobike motobike) {
        motobikeRepository.addMotobike(motobike);
    }

    @Override
    public List<Motobike> getListMotobike() {
        return motobikeRepository.findAll();
    }

    @Override
    public void deleteMotobike(String motobikePlate) {
        motobikeRepository.deleteMotobike(motobikePlate);
    }
}
