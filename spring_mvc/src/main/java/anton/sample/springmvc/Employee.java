package anton.sample.springmvc;

import anton.sample.springmvc.validation.CheckEmail;

import javax.validation.constraints.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringJoiner;

/**
 * User: Sedkov Anton
 * Date: 10.07.2021
 */
public class Employee {

    @Size(min = 2, max = 50, message = "name must be min 2 and max 50 symbols")
    private String name;

    //@NotNull(message = "surname is required")
    //@NotEmpty(message = "surname is required")
    @NotBlank(message = "surname is required")
    private String surname;

    @Min(value = 500, message = "salary must be greater than 499")
    @Max(value = 1000, message = "salary must be less than 1001")
    private int salary;

    private String department;
    private String carBrand;
    private String[] languages;

    @Pattern(regexp = "\\d{3}-\\d{2}-\\d{2}", message = "Please, use pattern XXX-XX-XX")
    private String phoneNumber;

    @CheckEmail(value = "icy.com", message = "email must ends with icy.com")
    private String email;

    private Map<String, String> departments;
    private Map<String, String> carBrands;
    private Map<String, String> languagesMap;

    public Employee() {
        departments = new HashMap<>();
        departments.put("IT", "Informantion Technology");
        departments.put("HR", "Human Resources");
        departments.put("Sales", "Sales");

        carBrands = new HashMap<>();
        carBrands.put("BMW", "BMW");
        carBrands.put("Audi", "Audi");
        carBrands.put("Mercedes-Benz", "MB");

        languagesMap = new HashMap<>();
        languagesMap.put("English", "EN");
        languagesMap.put("Deutsch", "DE");
        languagesMap.put("Espanol", "ES");
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

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Map<String, String> getDepartments() {
        return departments;
    }

    public void setDepartments(Map<String, String> departments) {
        this.departments = departments;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public Map<String, String> getCarBrands() {
        return carBrands;
    }

    public void setCarBrands(Map<String, String> carBrands) {
        this.carBrands = carBrands;
    }

    public String[] getLanguages() {
        return languages;
    }

    public void setLanguages(String[] languages) {
        this.languages = languages;
    }

    public Map<String, String> getLanguagesMap() {
        return languagesMap;
    }

    public void setLanguagesMap(Map<String, String> languagesMap) {
        this.languagesMap = languagesMap;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Employee.class.getSimpleName() + "[", "]")
                .add("name='" + name + "'")
                .add("surname='" + surname + "'")
                .add("salary=" + salary)
                .add("department='" + department + "'")
                .add("carBrand='" + carBrand + "'")
                .add("languages=" + Arrays.toString(languages))
                .add("departments=" + departments)
                .add("carBrands=" + carBrands)
                .add("languagesMap=" + languagesMap)
                .add("phoneNumber=" + phoneNumber)
                .add("email=" + email)
                .toString();
    }
}
