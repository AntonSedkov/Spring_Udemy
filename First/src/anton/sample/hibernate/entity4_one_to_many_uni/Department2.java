package anton.sample.hibernate.entity4_one_to_many_uni;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

/**
 * User: Sedkov Anton
 * Date: 07.07.2021
 */

@Entity
@Table(name = "departments")
public class Department2 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String departmentName;

    @Column(name = "max_salary")
    private int maxSalary;

    @Column(name = "min_salary")
    private int minSalary;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "department_id")
    private List<Employee4> emps;

    public Department2() {
    }

    public Department2(String departmentName, int maxSalary, int minSalary) {
        this.departmentName = departmentName;
        this.maxSalary = maxSalary;
        this.minSalary = minSalary;
    }

    public void addEmployeeToDepartment(Employee4 employee) {
        if (emps == null) {
            emps = new ArrayList<>();
        }
        emps.add(employee);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public int getMaxSalary() {
        return maxSalary;
    }

    public void setMaxSalary(int maxSalary) {
        this.maxSalary = maxSalary;
    }

    public int getMinSalary() {
        return minSalary;
    }

    public void setMinSalary(int minSalary) {
        this.minSalary = minSalary;
    }

    public List<Employee4> getEmps() {
        return emps;
    }

    public void setEmps(List<Employee4> emps) {
        this.emps = emps;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Department2.class.getSimpleName() + "[", "]")
                .add("id=" + id)
                .add("departmentName='" + departmentName + "'")
                .add("maxSalary=" + maxSalary)
                .add("minSalary=" + minSalary)
                .toString();
    }
}
