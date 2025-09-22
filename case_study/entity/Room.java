package case_study.model;

public class Room extends Facility {
    private String freeService;

    public Room() {}

    public Room(String id, String name, double area, double cost, int maxPeople, String rentalType,
                String freeService) {
        super(id, name, area, cost, maxPeople, rentalType);
        this.freeService = freeService;
    }
}
