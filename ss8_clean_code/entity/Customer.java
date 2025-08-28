package ss8_clean_code.entity;

public class Customer extends Person {
    private String address;

    public Customer() {}

    public Customer(int id, String name, String email, String address) {
        super(id, name, email);
        this.address = address;
    }

    public String getAddress() {
        return address;
    }
    public void setAddress(String address) { this.address = address; }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", email='" + getEmail() + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
