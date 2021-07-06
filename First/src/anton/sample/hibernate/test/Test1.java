package anton.sample.hibernate.test;

import anton.sample.hibernate.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * User: Sedkov Anton
 * Date: 06.07.2021
 */
public class Test1 {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        try {
            Session session = sessionFactory.getCurrentSession();
            Employee employee = new Employee("Lex", "Liutor'", "IT ", 300);
            session.beginTransaction();
            session.save(employee);
            session.getTransaction().commit();
            System.out.println(employee);
        } finally {
            sessionFactory.close();
        }


    }
}
