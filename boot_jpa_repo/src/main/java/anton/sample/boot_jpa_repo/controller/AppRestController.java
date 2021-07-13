package anton.sample.boot_jpa_repo.controller;

import anton.sample.boot_jpa_repo.entity.Employee;
import anton.sample.boot_jpa_repo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * User: Sedkov Anton
 * Date: 13.07.2021
 */

@RestController
@RequestMapping("/api")
public class AppRestController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employees")
    public List<Employee> showAllEmployees() {
        List<Employee> allEmps = employeeService.getAllEmployees();
        return allEmps;
    }

    @GetMapping("/employees/{id}")
    public Employee getEmployee(@PathVariable int id) {
        Employee employee = employeeService.getEmployee(id);

        return employee;
    }

    @PostMapping("/employees")
    public Employee addNewEmployee(@RequestBody Employee employee) {
        employeeService.saveEmployee(employee);
        return employee;
    }

    @PutMapping("/employees")
    public Employee updateEmployee(@RequestBody Employee employee) {
        employeeService.saveEmployee(employee);
        return employee;
    }

    @DeleteMapping("/employees/{id}")
    public String deleteEmployee(@PathVariable int id) {
        employeeService.deleteEmployee(id);
        return String.format("Employee with ID = %d was deleted.", id);
    }

    @GetMapping("/employees/name/{name}")
    public List<Employee> getEmployee(@PathVariable String name) {
        List<Employee> employees = employeeService.findAllByName(name);

        return employees;
    }
}
