package anton.sample.animals.tests.xmltest;

import anton.sample.animals.model.PetAction;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * User: Sedkov Anton
 * Date: 24.06.2021
 */
public class XmlContextTest {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        PetAction pet = context.getBean("petOne", PetAction.class);
        pet.action();

        context.close();
    }
}
