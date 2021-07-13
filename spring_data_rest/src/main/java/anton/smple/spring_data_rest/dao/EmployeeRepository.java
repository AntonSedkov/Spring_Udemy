package anton.smple.spring_data_rest.dao;


import anton.smple.spring_data_rest.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * User: Sedkov Anton
 * Date: 13.07.2021
 */
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
