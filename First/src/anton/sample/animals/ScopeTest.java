package anton.sample.animals;

import anton.sample.animals.model.Cat;
import anton.sample.animals.model.Dog;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * User: Sedkov Anton
 * Date: 24.06.2021
 */
public class ScopeTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        Cat catOne = context.getBean("petOne", Cat.class);
        Cat catTwo = context.getBean("petOne", Cat.class);

        System.out.println("Equals? Singleton : " + (catOne == catTwo));

        Dog dogOne = context.getBean("petTwo", Dog.class);
        Dog dogTwo = context.getBean("petTwo", Dog.class);

        System.out.println("Equals? Prototype : " + (dogOne == dogTwo));

    }
}
