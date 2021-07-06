package anton.sample.hibernate.test;

import anton.sample.hibernate.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

/**
 * User: Sedkov Anton
 * Date: 06.07.2021
 */
public class TestFour {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        try {
            Session session = sessionFactory.getCurrentSession();
            session.beginTransaction();
          // List<Employee> employees = session.createQuery("from Employee").getResultList();
            List<Employee> employees = session
                    .createQuery("from Employee where name='Alexa' AND  salary>1000")
                    .getResultList();

            for (Employee e : employees) {
                System.out.println(e);
            }
            session.getTransaction().commit();

            System.out.println("Done");

        } finally {
            sessionFactory.close();
        }


    }
}
