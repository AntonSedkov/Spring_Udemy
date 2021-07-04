package anton.sample.animals.tests.annotest.xmltest;

import anton.sample.animals.model.Person;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * User: Sedkov Anton
 * Date: 24.06.2021
 */
public class DISetterXmlTest {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Person person = context.getBean("personTwo", Person.class);
        person.sayHi();
        System.out.println(person.getSurname() + " " + person.getAge());

        context.close();
    }
}
