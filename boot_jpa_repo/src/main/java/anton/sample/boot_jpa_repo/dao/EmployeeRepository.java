package anton.sample.boot_jpa_repo.dao;


import anton.sample.boot_jpa_repo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * User: Sedkov Anton
 * Date: 13.07.2021
 */
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    public List<Employee> findAllByName(String name);

}
