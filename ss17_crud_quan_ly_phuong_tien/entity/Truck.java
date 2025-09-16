package ss17_crud_quan_ly_phuong_tien.entity;

public class Truck extends Vehicle {
    private double loadCapacity;

    public Truck(String licensePlate, String manufacturerName, int manufactureYear, String ownerName, double loadCapacity) {
        super(licensePlate, manufacturerName, manufactureYear, ownerName);
        this.loadCapacity = loadCapacity;
    }

    public double getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(double loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    @Override
    public String getInfoToCSV() {
        return this.getLicensePlate() + "," + this.getManufacturerName() + "," +
                this.getManufactureYear() + "," + this.getOwnerName() + "," + this.getLoadCapacity();
    }

    @Override
    public String toString() {
        return "Truck{" + super.toString() + ", loadCapacity=" + loadCapacity + '}';
    }
}
