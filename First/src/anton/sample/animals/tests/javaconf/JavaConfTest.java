package anton.sample.animals.tests.javaconf;

import anton.sample.animals.config.AppConfig;
import anton.sample.animals.config.SecondConfig;
import anton.sample.animals.model.Person;
import anton.sample.animals.model.PetAction;
import anton.sample.animals.modelAnno.PersonAnno;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * User: Sedkov Anton
 * Date: 04.07.2021
 */
public class JavaConfTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SecondConfig.class);

        /*PersonAnno person = context.getBean("personBean", PersonAnno.class);
        person.sayHi();*/

        PetAction cat = context.getBean("catBean", PetAction.class);
        cat.action();
        PetAction catSec = context.getBean("catBean", PetAction.class);
        catSec.action();
        System.out.println("cat equal catSec = " + (cat == catSec));

        Person person = context.getBean("personBean", Person.class);
        person.sayHi();
        System.out.println(person.getSurname());
        System.out.println(person.getAge());
        Person personTwo = context.getBean("personBean", Person.class);
        personTwo.sayHi();
        System.out.println("person equal personTwo = " + (person == personTwo));

        context.close();
    }
}
