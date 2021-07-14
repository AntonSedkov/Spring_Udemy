package anton.sample.boot_jpa_repo.service;

import anton.sample.boot_jpa_repo.dao.EmployeeRepository;
import anton.sample.boot_jpa_repo.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * User: Sedkov Anton
 * Date: 13.07.2021
 */

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public void saveEmployee(Employee employee) {
        employeeRepository.save(employee);
    }

    @Override
    public Employee getEmployee(int id) {
        Employee employee = null;
        Optional<Employee> optionalEmp = employeeRepository.findById(id);
        if (optionalEmp.isPresent()) {
            employee = optionalEmp.get();
        }
        return employee;
    }

    @Override
    public void deleteEmployee(int id) {
        employeeRepository.deleteById(id);
    }

    @Override
    public List<Employee> findAllByName(String name) {
        List<Employee> employees = employeeRepository.findAllByName(name);
        return employees;
    }

}
