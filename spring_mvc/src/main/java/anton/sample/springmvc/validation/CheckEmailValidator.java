package anton.sample.springmvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * User: Sedkov Anton
 * Date: 10.07.2021
 */


public class CheckEmailValidator implements ConstraintValidator<CheckEmail, String> {
    private String endOfEmail;

    @Override
    public void initialize(CheckEmail CheckEmail) {
        endOfEmail = CheckEmail.value();
    }

    @Override
    public boolean isValid(String enteredValue, ConstraintValidatorContext constraintValidatorContext) {
        return enteredValue.endsWith(endOfEmail);
    }
}
