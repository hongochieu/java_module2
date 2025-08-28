package ss8_clean_code.service;

import ss8_clean_code.entity.Customer;
import java.util.List;

public interface ICustomerService {
    void addCustomer(Customer customer);
    List<Customer> getAllCustomers();
    Customer getCustomerById(int id);
    void updateCustomer(Customer customer);
    void deleteCustomer(int id);
}
