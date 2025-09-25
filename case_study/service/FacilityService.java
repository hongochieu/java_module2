package case_study.service;

import case_study.entity.Facility;
import case_study.repository.FacilityRepository;

import java.util.List;
import java.util.Scanner;

public class FacilityService implements IFacilityService {
    private final FacilityRepository repo = new FacilityRepository();
    private final Scanner sc = new Scanner(System.in);

    @Override
    public void display() {
        List<Facility> list = repo.findAll();
        if (list.isEmpty()) {
            System.out.println("No facilities found.");
        } else {
            for (Facility f : list) {
                System.out.println(f);
            }
        }
    }

    @Override
    public void add() {
        System.out.print("Nhập ID dịch vụ: ");
        String id = sc.nextLine();
        System.out.print("Enter service name: ");
        String name = sc.nextLine();
        System.out.print("Enter area: ");
        double area = Double.parseDouble(sc.nextLine());
        System.out.print("Enter cost: ");
        double cost = Double.parseDouble(sc.nextLine());
        System.out.print("Enter max people: ");
        int maxPeople = Integer.parseInt(sc.nextLine());
        System.out.print("Enter rental type: ");
        String rentalType = sc.nextLine();

        Facility f = new Facility(id, name, area, cost, maxPeople, rentalType);
        repo.add(f);
        System.out.println("✔ Facility added successfully!");
    }

    @Override
    public void delete() {
        System.out.print("Enter facility ID to delete: ");
        String id = sc.nextLine();
        repo.delete(id);
        System.out.println("✔ Facility deleted successfully!");
    }
}
