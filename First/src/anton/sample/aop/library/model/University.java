package anton.sample.aop.library.model;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * User: Sedkov Anton
 * Date: 05.07.2021
 */

@Component
public class University {
    private List<Student> students = new ArrayList<>();

    public void addStudents() {
        Student s1 = new Student("Antony", 4, 9.9);
        Student s2 = new Student("Alexa", 3, 9.1);
        Student s3 = new Student("Max", 2, 3.5);
        Student s4 = new Student("Serge", 1, 7.8);
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
    }

    public List<Student> getStudents() {
        System.out.println("Start getStudents");
        //System.out.println(students.get(6));
        System.out.println("Info for getStudents");
        System.out.println(students);
        return students;
    }

}
