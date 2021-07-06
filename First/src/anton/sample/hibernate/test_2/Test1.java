package anton.sample.hibernate.test_2;

import anton.sample.hibernate.entity.Employee;
import anton.sample.hibernate.entity2.Detail;
import anton.sample.hibernate.entity2.Employee2;
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
                .addAnnotatedClass(Employee2.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();

        try (Session session = sessionFactory.getCurrentSession()) {
            /*Session session = sessionFactory.getCurrentSession();

            Employee2 employee = new Employee2("Lex", "Liutor'", "IT ", 300);
            Detail detail = new Detail("Minsk", "1234562", "hivi@email.com");
            employee.setEmpDetail(detail);

            session.beginTransaction();

            session.save(employee);

            session.getTransaction().commit();*/


           /* Session session = sessionFactory.getCurrentSession();

            Employee2 employee = new Employee2("Oleg", "Vox'", "Sales ", 700);
            Detail detail = new Detail("Moscow", "9999999", "hivioleg@email.com");
            employee.setEmpDetail(detail);

            session.beginTransaction();

            session.save(employee);

            session.getTransaction().commit();*/


            /*session.beginTransaction();

            Employee2 employee = session.get(Employee2.class, 10);
            System.out.println(employee.getEmpDetail());

            session.getTransaction().commit();*/


            session.beginTransaction();

            Employee2 employee = session.get(Employee2.class, 2);
            session.delete(employee);

            session.getTransaction().commit();


        } finally {
            sessionFactory.close();
        }


    }
}
