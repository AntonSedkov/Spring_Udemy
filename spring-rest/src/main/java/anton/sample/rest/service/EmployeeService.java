package anton.sample.rest.service;

import anton.sample.rest.entity.Employee;

import java.util.List;

/**
 * User: Sedkov Anton
 * Date: 10.07.2021
 */
public interface EmployeeService {

    public List<Employee> getAllEmployees();

    public void saveEmployee(Employee employee);

    public Employee getEmployee(int id);

    public void deleteEmployee(int id);
}
