package case_study.repository;

import case_study.entity.Customer;
import case_study.utils.ReadAndWriteFile;

import java.util.ArrayList;
import java.util.List;

public class CustomerRepository implements ICustomerRepository {
    private static final String PATH = "D:\\Codegym\\module2\\case_study\\data\\customer.csv";
    private List<Customer> customers = new ArrayList<>();

    @Override
    public List<Customer> findAll() {
        List<String> lines = ReadAndWriteFile.readFromFile(PATH);
        customers.clear();
        for (String line : lines) {
            customers.add(Customer.fromCSV(line));
        }
        return customers;
    }

    @Override
    public void add(Customer customer) {
        customers = findAll();
        customers.add(customer);
        save();
    }

    @Override
    public void update(Customer customer) {
        customers = findAll();
        for (int i = 0; i < customers.size(); i++) {
            if (customers.get(i).getId().equals(customer.getId())) {
                customers.set(i, customer);
                break;
            }
        }
        save();
    }

    @Override
    public void delete(String id) {
        customers = findAll();
        customers.removeIf(c -> c.getId().equals(id));
        save();
    }

    private void save() {
        List<String> lines = new ArrayList<>();
        for (Customer c : customers) {
            lines.add(c.toCSV());
        }
        ReadAndWriteFile.writeToFile(PATH, lines, false);
    }
}
