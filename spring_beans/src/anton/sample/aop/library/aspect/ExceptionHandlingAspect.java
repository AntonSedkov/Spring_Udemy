package anton.sample.aop.library.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * User: Sedkov Anton
 * Date: 05.07.2021
 */

@Component
@Aspect
@Order(200)
public class ExceptionHandlingAspect {

    @Before("anton.sample.aop.library.aspect.AppPointcut.allAddMethods()")
    public void beforeAddExceptionHandlingAdvice() {
        System.out.println("beforeGetExceptionHandlingAdvice");
        System.out.println("--------------------------------------");
    }

}
