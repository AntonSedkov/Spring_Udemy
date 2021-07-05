package anton.sample.aop.library.tests;

import anton.sample.aop.library.config.AppConfig;
import anton.sample.aop.library.model.Student;
import anton.sample.aop.library.model.University;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

/**
 * User: Sedkov Anton
 * Date: 05.07.2021
 */
public class TestTwo {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        University university = context.getBean("university", University.class);
        university.addStudents();
        try {
            List<Student> students = university.getStudents();

            System.out.println(students);
        } catch (Exception e) {
            System.out.println("Exception = " + e);
        }

        context.close();
    }
}
