package anton.sample.rest_client;

import anton.sample.rest_client.config.AppConfig;
import anton.sample.rest_client.entity.Employee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Communication communication = context.getBean("communication", Communication.class);

        /* List<Employee> employees = communication.getAllEmployees();
        for (Employee emp : employees) {
            System.out.println(emp);
        }*/

        /*Employee employee = communication.getEmployee(7);
        System.out.println(employee);*/

        /*Employee employee = new Employee("Sveta", "Coroleva", "IT", 1200);
        communication.saveEmployee(employee);*/

        /*Employee employee = new Employee("Sveta", "Coroleva", "Sales", 700);
        employee.setId(13);
        communication.saveEmployee(employee);*/

        communication.deleteEmployee(13);

        context.close();
    }
}
