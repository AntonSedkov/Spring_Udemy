package anton.sample.ioc_di.animals.tests.annotest;

import anton.sample.ioc_di.animals.modelAnno.PersonAnno;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * User: Sedkov Anton
 * Date: 26.06.2021
 */
public class AnnoTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("appContextAnnot.xml");
        /*CatAnno cat = context.getBean(*//*"catBean"*//* "catAnno", CatAnno.class);
        cat.action();*/

        PersonAnno person = context.getBean("personBean", PersonAnno.class);
        person.sayHi();
        System.out.println(person.getAge());
        System.out.println(person.getSurname());

        context.close();
    }

}
