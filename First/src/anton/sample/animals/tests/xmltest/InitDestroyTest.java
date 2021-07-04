package anton.sample.animals.tests.annotest.xmltest;

import anton.sample.animals.model.Dog;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * User: Sedkov Anton
 * Date: 26.06.2021
 */
public class InitDestroyTest {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Dog dog = context.getBean("petTwo", Dog.class);
        dog.action();

        context.close();
    }

}
