package ss8_clean_code.service;

import ss8_clean_code.repository.CustomerRepository;
import ss8_clean_code.repository.ICustomerRepository;

import java.util.List;

public class CustomerService implements ICustomerService {
    private final ICustomerRepository repository = new CustomerRepository();

    @Override
    public void addCustomer(ss8_clean_code.entity.Customer customer) {
        repository.add(customer);
    }

    @Override
    public List<ss8_clean_code.entity.Customer> getAllCustomers() {
        return repository.findAll();
    }

    @Override
    public ss8_clean_code.entity.Customer getCustomerById(int id) {
        return repository.findById(id);
    }

    @Override
    public void updateCustomer(ss8_clean_code.entity.Customer customer) {
        repository.update(customer);
    }

    @Override
    public void deleteCustomer(int id) {
        repository.delete(id);
    }
}
