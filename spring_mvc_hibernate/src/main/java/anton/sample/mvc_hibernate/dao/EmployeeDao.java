package anton.sample.mvc_hibernate.dao;

import anton.sample.mvc_hibernate.entity.Employee;

import java.util.List;

/**
 * User: Sedkov Anton
 * Date: 10.07.2021
 */
public interface EmployeeDao {
    public List<Employee> getAllEmployees();

    public void saveEmployee(Employee employee);

    public Employee getEmployee(int id);

    public void deleteEmployee(int id);
}
