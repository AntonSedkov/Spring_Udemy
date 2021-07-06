package anton.sample.hibernate.entity2;

import javax.persistence.*;
import java.util.StringJoiner;

/**
 * User: Sedkov Anton
 * Date: 05.07.2021
 */

@Entity
@Table(name = "employees")
public class Employee2 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String surname;

    @Column(name = "department")
    private String department;

    @Column(name = "salary")
    private int salary;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "details_id")
    private Detail empDetail;

    public Employee2() {
    }

    public Employee2(String name, String surname, String department, int salary) {
        this.name = name;
        this.surname = surname;
        this.department = department;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Detail getEmpDetail() {
        return empDetail;
    }

    public void setEmpDetail(Detail empDetail) {
        this.empDetail = empDetail;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee2 employee2 = (Employee2) o;

        if (id != employee2.id) return false;
        if (salary != employee2.salary) return false;
        if (name != null ? !name.equals(employee2.name) : employee2.name != null) return false;
        if (surname != null ? !surname.equals(employee2.surname) : employee2.surname != null) return false;
        if (department != null ? !department.equals(employee2.department) : employee2.department != null) return false;
        return empDetail != null ? empDetail.equals(employee2.empDetail) : employee2.empDetail == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (surname != null ? surname.hashCode() : 0);
        result = 31 * result + (department != null ? department.hashCode() : 0);
        result = 31 * result + salary;
        result = 31 * result + (empDetail != null ? empDetail.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Employee2.class.getSimpleName() + "[", "]")
                .add("id=" + id)
                .add("name='" + name + "'")
                .add("surname='" + surname + "'")
                .add("department='" + department + "'")
                .add("salary=" + salary)
                .add("empDetail=" + empDetail)
                .toString();
    }
}
