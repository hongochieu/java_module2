package ss17_crud_quan_ly_phuong_tien.repository;

import ss17_crud_quan_ly_phuong_tien.entity.Motobike;
import ss17_crud_quan_ly_phuong_tien.util.ReadAndWriteFile;

import java.util.ArrayList;
import java.util.List;

public class MotobikeRepository implements IMotobikeRepository {
    @Override
    public List<Motobike> findAll() {
        List<Motobike> motobikeList = new ArrayList<>();
        List<String> stringList = ReadAndWriteFile.readFromFile("D:\\Codegym\\module2\\ss17_crud_quan_ly_phuong_tien\\data\\motobike.csv");
        for (String string : stringList) {
            String[] array = string.split(",");
            Motobike motobike = new Motobike(
                    array[0],
                    array[1],
                    Integer.parseInt(array[2]),
                    array[3],
                    Double.parseDouble(array[4])
            );
            motobikeList.add(motobike);
        }
        return motobikeList;
    }

    @Override
    public void addMotobike(Motobike motobike) {
        List<String> stringList = new ArrayList<>();
        stringList.add(motobike.getInfoToCSV());
        ReadAndWriteFile.writeToFile("D:\\Codegym\\module2\\ss17_crud_quan_ly_phuong_tien\\data\\motobike.csv", stringList, true);
    }

    @Override
    public boolean deleteMotobike(String licensePlate) {
        List<Motobike> motobikeList = findAll();
        boolean removed = motobikeList.removeIf(m -> m.getLicensePlate().equals(licensePlate));
        if (removed) {
            List<String> stringList = new ArrayList<>();
            for (Motobike mb : motobikeList) {
                stringList.add(mb.getInfoToCSV());
            }
            ReadAndWriteFile.writeToFile("D:\\Codegym\\module2\\ss17_crud_quan_ly_phuong_tien\\data\\motobike.csv", stringList, false);
        }
        return removed;
    }
}
