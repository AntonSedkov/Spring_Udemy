package anton.sample.rest.exception_handling;

/**
 * User: Sedkov Anton
 * Date: 11.07.2021
 */
public class NoEmployeeException extends RuntimeException{

    public NoEmployeeException(String message) {
        super(message);
    }
}
