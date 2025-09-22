package case_study.model;

public class House extends Facility {
    private String roomStandard;
    private int numFloor;

    public House() {}

    public House(String id, String name, double area, double cost, int maxPeople, String rentalType,
                 String roomStandard, int numFloor) {
        super(id, name, area, cost, maxPeople, rentalType);
        this.roomStandard = roomStandard;
        this.numFloor = numFloor;
    }
}
