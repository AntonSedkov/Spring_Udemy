package anton.sample.animals.tests.javaconf;

import anton.sample.animals.config.AppConfig;
import anton.sample.animals.modelAnno.PersonAnno;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * User: Sedkov Anton
 * Date: 04.07.2021
 */
public class JavaConfTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        PersonAnno person = context.getBean("personBean", PersonAnno.class);
        person.sayHi();
    }
}
