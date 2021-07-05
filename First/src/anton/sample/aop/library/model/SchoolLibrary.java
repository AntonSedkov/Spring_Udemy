package anton.sample.aop.library.model;

import org.springframework.stereotype.Component;

/**
 * User: Sedkov Anton
 * Date: 04.07.2021
 */

@Component
public class SchoolLibrary extends AbstractLibrary {

    @Override
    public void getBook() {
        System.out.println("We has got a book from the school.");
    }

}
