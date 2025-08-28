package ss8_clean_code.repository;

import ss8_clean_code.entity.Customer;
import java.util.List;

public interface ICustomerRepository {
    void add(Customer customer);
    List<Customer> findAll();
    Customer findById(int id);
    void update(Customer customer);
    void delete(int id);
}
