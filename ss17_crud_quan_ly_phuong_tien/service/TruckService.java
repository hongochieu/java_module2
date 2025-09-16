package ss17_crud_quan_ly_phuong_tien.service;

import ss17_crud_quan_ly_phuong_tien.entity.Truck;
import ss17_crud_quan_ly_phuong_tien.repository.TruckRepository;

import java.util.List;

public class TruckService implements ITruckService {
    private TruckRepository truckRepository = new TruckRepository();

    @Override
    public void addTruck(Truck truck) {
        truckRepository.addTruck(truck);
    }

    @Override
    public List<Truck> getTrucks() {
        return truckRepository.getTrucks();
    }

    @Override
    public void deleteTruck(String truckPlate) {
        truckRepository.deleteTruckByLicensePlate(truckPlate);
    }
}
