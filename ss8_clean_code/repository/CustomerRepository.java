package ss8_clean_code.repository;

import java.util.ArrayList;
import java.util.List;

public class CustomerRepository implements ICustomerRepository {
    private static List<ss8_clean_code.entity.Customer> customers = new ArrayList<>();

    static {
    }

    @Override
    public void add(ss8_clean_code.entity.Customer customer) {
        customers.add(customer);
    }

    @Override
    public List<ss8_clean_code.entity.Customer> findAll() {
        return customers;
    }

    @Override
    public ss8_clean_code.entity.Customer findById(int id) {
        for (ss8_clean_code.entity.Customer c : customers) {
            if (c.getId() == id) return c;
        }
        return null;
    }

    @Override
    public void update(ss8_clean_code.entity.Customer customer) {
        for (ss8_clean_code.entity.Customer c : customers) {
            if (c.getId() == customer.getId()) {
                c.setName(customer.getName());
                c.setEmail(customer.getEmail());
                c.setAddress(customer.getAddress());
                break;
            }
        }
    }

    @Override
    public void delete(int id) {
        customers.removeIf(c -> c.getId() == id);
    }
}
