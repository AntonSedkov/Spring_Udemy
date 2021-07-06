package anton.sample.hibernate.test;

import anton.sample.hibernate.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * User: Sedkov Anton
 * Date: 06.07.2021
 */
public class TestTwo {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        try {
            Session session = sessionFactory.getCurrentSession();
            Employee employee = new Employee("Olef", "Coluts'", "HR ", 5500);
            session.beginTransaction();
            session.save(employee);
            session.getTransaction().commit();

            int id = employee.getId();

            session = sessionFactory.getCurrentSession();
            session.beginTransaction();
            Employee employee1 = session.get(Employee.class, id);
            session.getTransaction().commit();

            System.out.println(employee1);

            System.out.println("Done");

        } finally {
            sessionFactory.close();
        }


    }
}
