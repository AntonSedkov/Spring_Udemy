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

    @Value("Harper Lee")
    private String author;

    @Value("1960")
    private int year;

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }
}
