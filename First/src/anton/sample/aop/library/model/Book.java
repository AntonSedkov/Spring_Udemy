package anton.sample.aop.library.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * User: Sedkov Anton
 * Date: 04.07.2021
 */

@Component
public class Book {

    @Value("To kill a mockingbird")
    private String name;

    public String getName() {
        return name;
    }
}
