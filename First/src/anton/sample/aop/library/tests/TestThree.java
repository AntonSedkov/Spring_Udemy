package anton.sample.aop.library.tests;

import anton.sample.aop.library.config.AppConfig;
import anton.sample.aop.library.model.UniverLibrary;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * User: Sedkov Anton
 * Date: 05.07.2021
 */
public class TestThree {
    public static void main(String[] args) {
        System.out.println("Main starts");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        UniverLibrary univerLibrary = context.getBean("univerLibrary", UniverLibrary.class);
        String bookName = univerLibrary.returnBook();
        System.out.println("Returned book = " + bookName);

        context.close();
        System.out.println("Main ends");
    }
}
