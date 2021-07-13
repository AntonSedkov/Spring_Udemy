package anton.sample.udemy_boot.service;


import anton.sample.udemy_boot.entity.Employee;

import java.util.List;

/**
 * User: Sedkov Anton
 * Date: 10.07.2021
 */
public interface EmployeeService {

    public List<Employee> getAllEmployees();

  /*  public void saveEmployee(Employee employee);

    public Employee getEmployee(int id);

    public void deleteEmployee(int id);*/
}
