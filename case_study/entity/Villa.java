package case_study.model;

public class Villa extends Facility {
    private String roomStandard;
    private double poolArea;
    private int numFloor;

    public Villa() {}

    public Villa(String id, String name, double area, double cost, int maxPeople, String rentalType,
                 String roomStandard, double poolArea, int numFloor) {
        super(id, name, area, cost, maxPeople, rentalType);
        this.roomStandard = roomStandard;
        this.poolArea = poolArea;
        this.numFloor = numFloor;
    }
}
