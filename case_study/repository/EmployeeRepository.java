package case_study.repository;

import case_study.entity.Employee;
import case_study.utils.ReadAndWriteFile;
import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository implements IEmployeeRepository {
    private static final String PATH = "D:\\Codegym\\module2\\case_study\\data\\employee.csv";
    private List<Employee> employees = new ArrayList<>();

    @Override
    public List<Employee> findAll() {
        List<String> lines = ReadAndWriteFile.readFromFile(PATH);
        employees.clear();
        for (String line : lines) {
            employees.add(Employee.fromCSV(line));
        }
        return employees;
    }

    @Override
    public void add(Employee employee) {
        employees.add(employee);
        save();
    }

    @Override
    public void update(Employee employee) {
        // TODO implement edit logic
        save();
    }

    @Override
    public void delete(String id) {
        employees.removeIf(e -> e.getId().equals(id));
        save();
    }

    private void save() {
        List<String> lines = new ArrayList<>();
        for (Employee e : employees) {
            lines.add(e.toCSV());
        }
        ReadAndWriteFile.writeToFile(PATH, lines, false);
    }
}
