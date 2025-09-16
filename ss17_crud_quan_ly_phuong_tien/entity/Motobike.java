package ss17_crud_quan_ly_phuong_tien.entity;

public class Motobike extends Vehicle {
    private double horsePower;

    public Motobike(String licensePlate, String manufacturerName, int manufactureYear, String ownerName, double horsePower) {
        super(licensePlate, manufacturerName, manufactureYear, ownerName);
        this.horsePower = horsePower;
    }

    public double getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(double horsePower) {
        this.horsePower = horsePower;
    }

    @Override
    public String getInfoToCSV() {
        return this.getLicensePlate() + "," + this.getManufacturerName() + "," +
                this.getManufactureYear() + "," + this.getOwnerName() + "," + this.getHorsePower();
    }

    @Override
    public String toString() {
        return "Motobike{" + super.toString() + ", horsePower=" + horsePower + '}';
    }
}
