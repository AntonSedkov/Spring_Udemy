package anton.sample.aop.library.tests;

import anton.sample.aop.library.config.AppConfig;
import anton.sample.aop.library.model.Book;
import anton.sample.aop.library.model.UniverLibrary;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * User: Sedkov Anton
 * Date: 04.07.2021
 */
public class TestOne {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        UniverLibrary univerLibrary = context.getBean("univerLibrary", UniverLibrary.class);
        Book book = context.getBean("book", Book.class);


        univerLibrary.getBook();

        univerLibrary.addBook("Anton", book);
        univerLibrary.addMagazine();
        

      /*  univerLibrary.getBook();
        univerLibrary.returnBook();
        univerLibrary.addBook();
        univerLibrary.getMagazine();
        univerLibrary.returnMagazine();
        univerLibrary.addMagazine();*/

      /*  SchoolLibrary schoolLibrary = context.getBean("schoolLibrary", SchoolLibrary.class);
        schoolLibrary.getBook();
        univerLibrary.getMagazine();
        */

        /*  univerLibrary.returnBook();*/

        /*
        univerLibrary.getMagazine(3);
*/
        context.close();
    }
}
