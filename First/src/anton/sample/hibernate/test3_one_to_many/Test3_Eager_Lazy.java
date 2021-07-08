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
public class Test3_Eager_Lazy {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee3.class)
                .addAnnotatedClass(Department.class)
                .buildSessionFactory();

        try (Session session = sessionFactory.getCurrentSession()) {
            /*Department dep= new Department("sales", 300,1200);
            Employee3 emp1 = new Employee3("Lex", "Liutor'", 800);
            Employee3 emp2 = new Employee3("Vika", "Kupa'", 1000);
            Employee3 emp3 = new Employee3("Barys", "Zubok", 1100);

            dep.addEmployeeToDepartment(emp1);
            dep.addEmployeeToDepartment(emp2);
            dep.addEmployeeToDepartment(emp3);

            session.beginTransaction();

            session.save(dep);

            session.getTransaction().commit();

            System.out.println("Done!");*/

            /*session.beginTransaction();

            Department dep = session.get(Department.class, 4);
            System.out.println("Show department");
            System.out.println(dep);
            System.out.println("Load employees");                   //When we have LAZY, we have to load linked classes before commit
            dep.getEmps().get(0);

            System.out.println("__________________");

            session.getTransaction().commit();

            System.out.println("Show employees");
            System.out.println(dep.getEmps());

            System.out.println("Done!");*/

        } finally {
            sessionFactory.close();
        }


    }
}
