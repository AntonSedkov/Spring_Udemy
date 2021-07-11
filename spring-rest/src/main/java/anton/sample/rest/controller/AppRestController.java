package anton.sample.rest.controller;

import anton.sample.rest.entity.Employee;
import anton.sample.rest.exception_handling.NoEmployeeException;
import anton.sample.rest.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * User: Sedkov Anton
 * Date: 11.07.2021
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
        if (employee == null) {
            throw new NoEmployeeException("There is no employee with ID = " + id + " in database");
        }
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

        Employee employee = employeeService.getEmployee(id);
        if (employee==null){
            throw new NoEmployeeException("There is no employee with ID = " + id + " in database");
        }

        employeeService.deleteEmployee(id);
        return String.format("Employee with ID = %d was deleted.", id);
    }

}
