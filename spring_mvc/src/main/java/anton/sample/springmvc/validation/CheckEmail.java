package anton.sample.springmvc.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * User: Sedkov Anton
 * Date: 10.07.2021
 */

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = CheckEmailValidator.class)
public @interface CheckEmail {

    public String value() default "zfq.com";
    public String message() default "email must ends with define value (default = zfk.com)";

    public Class<?>[] groups() default {};
    public Class<? extends Payload>[] payload() default {};
}
