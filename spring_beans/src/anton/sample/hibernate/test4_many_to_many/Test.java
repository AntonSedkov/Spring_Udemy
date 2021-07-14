package anton.sample.hibernate.test4_many_to_many;

import anton.sample.hibernate.entity5_many_to_many.Child;
import anton.sample.hibernate.entity5_many_to_many.Section;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * User: Sedkov Anton
 * Date: 08.07.2021
 */
public class Test {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Section.class)
                .addAnnotatedClass(Child.class)
                .buildSessionFactory();

        try (Session session = factory.getCurrentSession()) {

            /*Section section1 = new Section("Football");
            Child child1 = new Child("Zaur", 5);
            Child child2 = new Child("Anton", 7);
            Child child3 = new Child("Lex", 9);
            section1.addChildToSection(child1);
            section1.addChildToSection(child2);
            section1.addChildToSection(child3);

            session.beginTransaction();

            session.save(section1);

            session.getTransaction().commit();

            System.out.println("Done");
            System.out.println("*************************");*/

            /*Section section2 = new Section("Volleyball");
            Section section3 = new Section("Chess");
            Section section4 = new Section("Math");
            Child child4 = new Child("Alexa", 10);
            child4.addSectionToChild(section2);
            child4.addSectionToChild(section3);
            child4.addSectionToChild(section4);

            session.beginTransaction();

            session.save(child4);

            session.getTransaction().commit();

            System.out.println("Done");
            System.out.println("*************************");*/

            /*session.beginTransaction();

            Section section = session.get(Section.class, 1);

            System.out.println(section);
            System.out.println(section.getChildren());

            session.getTransaction().commit();

            System.out.println("Done");
            System.out.println("*************************");*/

            /*session.beginTransaction();

            Child child = session.get(Child.class,4);

            System.out.println(child);
            System.out.println(child.getSections());

            session.getTransaction().commit();

            System.out.println("Done");
            System.out.println("*************************");*/

           /* session.beginTransaction();

            Section section = session.get(Section.class, 1);

            session.delete(section);

            session.getTransaction().commit();

            System.out.println("Done");
            System.out.println("*************************");*/

          /*  //Save without CascadeType.REMOVE

            Section section1 = new Section("Football");
            Child child1 = new Child("Zaur", 5);
            Child child2 = new Child("Anton", 7);
            Child child3 = new Child("Lex", 9);

            session.beginTransaction();

            //using ------save()-----
            session.save(section1);

            section1.addChildToSection(child1);
            section1.addChildToSection(child2);
            section1.addChildToSection(child3);

            session.save(child1);
            session.save(child2);
            session.save(child3);

            session.getTransaction().commit();

            System.out.println("Done");
            System.out.println("*************************");
*/
/*
            Section section1 = new Section("Football");
            Child child1 = new Child("Zaur", 5);
            Child child2 = new Child("Anton", 7);
            Child child3 = new Child("Lex", 9);
            section1.addChildToSection(child1);
            section1.addChildToSection(child2);
            section1.addChildToSection(child3);

            session.beginTransaction();

            session.persist(section1);

            session.getTransaction().commit();

            System.out.println("Done");
            System.out.println("*************************");*/

           /* session.beginTransaction();

            Section section = session.get(Section.class, 7);

            session.delete(section);

            session.getTransaction().commit();

            System.out.println("Done");
            System.out.println("*************************");*/

            session.beginTransaction();

            Child child = session.get(Child.class, 5);
            session.delete(child);

            session.getTransaction().commit();

            System.out.println("Done");
            System.out.println("*************************");

        } finally {
            factory.close();
        }

    }
}
