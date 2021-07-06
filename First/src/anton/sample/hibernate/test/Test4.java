package anton.sample.hibernate.test;

import anton.sample.hibernate.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * User: Sedkov Anton
 * Date: 06.07.2021
 */
public class Test4 {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        try {
            Session session = sessionFactory.getCurrentSession();
            session.beginTransaction();

          /*  //update
            Employee employee = session.get(Employee.class, 1);
            employee.setSalary(15000);*/

            session
                    .createQuery("update Employee set salary = 1000 where name = 'Lex'")
                    .executeUpdate();


            session.getTransaction().commit();

            System.out.println("Done");

        } finally {
            sessionFactory.close();
        }


    }
}
