package anton.sample.hibernate.test2_one_to_one;

import anton.sample.hibernate.entity2_one_to_one.Detail;
import anton.sample.hibernate.entity2_one_to_one.Employee2;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * User: Sedkov Anton
 * Date: 06.07.2021
 */
public class Test2 {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee2.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();

        try (Session session = sessionFactory.getCurrentSession()) {

           /* session.beginTransaction();

            Employee2 employee = new Employee2("Nick", "Fee", "HR", 6700);
            Detail detail = new Detail("NY", "111111", "nick@email.com");
            detail.setEmployee(employee);
            employee.setEmpDetail(detail);
            session.save(detail);

            session.getTransaction().commit();*/

/*            session.beginTransaction();

            Detail detail = session.get(Detail.class, 4);
            System.out.println(detail.getEmployee());

            session.getTransaction().commit();*/

            /*session.beginTransaction();

            Detail detail = session.get(Detail.class, 4);
            session.delete(detail);

            session.getTransaction().commit();*/

            session.beginTransaction();

            Detail detail = session.get(Detail.class, 1);
            detail.getEmployee().setEmpDetail(null);
            session.delete(detail);

            session.getTransaction().commit();

            System.out.println("Done");

        } finally {
            sessionFactory.close();
        }


    }
}
