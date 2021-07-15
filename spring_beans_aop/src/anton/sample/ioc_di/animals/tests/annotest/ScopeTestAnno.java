package anton.sample.ioc_di.animals.tests.annotest;

import anton.sample.ioc_di.animals.modelAnno.CatAnno;
import anton.sample.ioc_di.animals.modelAnno.DogAnno;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * User: Sedkov Anton
 * Date: 04.07.2021
 */
public class ScopeTestAnno {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appContextAnnot.xml");
        DogAnno dogOne = context.getBean("dogAnno", DogAnno.class);
        DogAnno dogTwo = context.getBean("dogAnno", DogAnno.class);
        System.out.println("one dog: ?" + (dogOne == dogTwo));
        dogOne.action();
        dogTwo.action();

        CatAnno catOne = context.getBean("catAnno", CatAnno.class);
        CatAnno catTwo = context.getBean("catAnno", CatAnno.class);
        System.out.println("one cat: ?" + (catOne == catTwo));
        catOne.action();
        catTwo.action();

        context.close();

    }
}
