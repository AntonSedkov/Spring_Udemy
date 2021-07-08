package anton.sample.hibernate.test_one_to_many;

import anton.sample.hibernate.entity4_one_to_many_uni.Department2;
import anton.sample.hibernate.entity4_one_to_many_uni.Employee4;
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
                .addAnnotatedClass(Employee4.class)
                .addAnnotatedClass(Department2.class)
                .buildSessionFactory();

        try (Session session = sessionFactory.getCurrentSession()) {
            /*Department2 dep= new Department2("HR", 600,1800);
            Employee4 emp1 = new Employee4("Hregoz", "Darco", 800);
            Employee4 emp2 = new Employee4("Grenadot", "Vitus'", 1500);

            dep.addEmployeeToDepartment(emp1);
            dep.addEmployeeToDepartment(emp2);

            session.beginTransaction();

            session.save(dep);

            session.getTransaction().commit();

            System.out.println("Done!");*/

            /*session.beginTransaction();

            Department2 dep = session.get(Department2.class, 2);
            System.out.println(dep);
            System.out.println(dep.getEmps());

            System.out.println("__________________");

            Employee4 emp = session.get(Employee4.class, 6);
            System.out.println(emp);

            session.getTransaction().commit();

            System.out.println("Done!");*/

/*            session.beginTransaction();

            Department2 dep = session.get(Department2.class, 2);

            session.delete(dep);

            session.getTransaction().commit();

            System.out.println("Done!");*/

           /* session.beginTransaction();

            Employee4 emp = session.get(Employee4.class, 5);

            session.delete(emp);

            session.getTransaction().commit();

            System.out.println("Done!");*/

        } finally {
            sessionFactory.close();
        }


    }
}
