package anton.sample.boot_jpa_repo.service;



import anton.sample.boot_jpa_repo.entity.Employee;

import java.util.List;

/**
 * User: Sedkov Anton
 * Date: 13.07.2021
 */
public interface EmployeeService {

    public List<Employee> getAllEmployees();

    public void saveEmployee(Employee employee);

    public Employee getEmployee(int id);

    public void deleteEmployee(int id);

    public List<Employee> findAllByName(String name);
}
