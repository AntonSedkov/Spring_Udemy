package anton.sample.hibernate.test3_one_to_many;

import anton.sample.hibernate.entity3_one_to_many_bi.Department;
import anton.sample.hibernate.entity3_one_to_many_bi.Employee3;
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
                .addAnnotatedClass(Employee3.class)
                .addAnnotatedClass(Department.class)
                .buildSessionFactory();

        try (Session session = sessionFactory.getCurrentSession()) {
            /*Department dep= new Department("IT", 300,1200);
            Employee3 emp1 = new Employee3("Lex", "Liutor'", 800);
            Employee3 emp2 = new Employee3("Vika", "Kupa'", 1000);

            dep.addEmployeeToDepartment(emp1);
            dep.addEmployeeToDepartment(emp2);

            session.beginTransaction();

            session.save(dep);

            session.getTransaction().commit();

            System.out.println("Done!");*/

           /* session.beginTransaction();

            Department dep = session.get(Department.class, 1);
            System.out.println(dep);
            System.out.println(dep.getEmps());

            System.out.println("__________________");

            Employee3 emp = session.get(Employee3.class, 1);
            System.out.println(emp);
            System.out.println(emp.getDepartment());

            session.getTransaction().commit();

            System.out.println("Done!");*/


            session.beginTransaction();

            Employee3 emp = session.get(Employee3.class, 3);

            session.delete(emp);

            session.getTransaction().commit();

            System.out.println("Done!");

        } finally {
            sessionFactory.close();
        }


    }
}
