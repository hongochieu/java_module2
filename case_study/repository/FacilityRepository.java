package case_study.repository;

import case_study.entity.Facility;
import case_study.utils.ReadAndWriteFile;

import java.util.*;

public class FacilityRepository implements IFacilityRepository {
    private static final String PATH = "D:\\Codegym\\module2\\case_study\\data\\facility.csv";
    private LinkedHashMap<Facility, Integer> facilityMap = new LinkedHashMap<>();

    @Override
    public List<Facility> findAll() {
        List<String> lines = ReadAndWriteFile.readFromFile(PATH);
        facilityMap.clear();
        // TODO: parse Villa, House, Room from CSV (you can expand later)
        return new ArrayList<>(facilityMap.keySet());
    }

    @Override
    public void add(Facility facility) {
        facilityMap.put(facility, 0);
        save();
    }

    @Override
    public void update(Facility facility) {
        if (facilityMap.containsKey(facility)) {
            facilityMap.put(facility, facilityMap.get(facility));
            save();
        }
    }

    @Override
    public void delete(String id) {
        facilityMap.entrySet().removeIf(entry -> entry.getKey().getId().equals(id));
        save();
    }

    private void save() {
        // TODO: write facility to CSV
        // (Villa/House/Room needs custom toCSV)
    }
}
