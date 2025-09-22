package case_study.model;

public class Customer extends Person {
    private String customerType;
    private String address;

    public Customer() {}

    public Customer(String id, String name, String birthday, String gender,
                    String idCard, String phone, String email,
                    String customerType, String address) {
        super(id, name, birthday, gender, idCard, phone, email);
        this.customerType = customerType;
        this.address = address;
    }

    public String getCustomerType() { return customerType; }
    public void setCustomerType(String customerType) { this.customerType = customerType; }
    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    public String toCSV() {
        return String.join(",", getId(), getName(), getBirthday(), getGender(),
                getIdCard(), getPhone(), getEmail(), customerType, address);
    }

    public static Customer fromCSV(String line) {
        String[] t = line.split(",");
        return new Customer(t[0], t[1], t[2], t[3], t[4], t[5], t[6], t[7], t[8]);
    }
}
