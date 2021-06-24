package anton.sample.animals;

import anton.sample.animals.model.Person;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * User: Sedkov Anton
 * Date: 24.06.2021
 */
public class DIConstrXmlTest {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Person person = context.getBean("personOne", Person.class);
        person.sayHi();

        context.close();
    }
}
