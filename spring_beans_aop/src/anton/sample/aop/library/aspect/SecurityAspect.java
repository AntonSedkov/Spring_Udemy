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
@Order(1)
public class SecurityAspect {

    @Before("anton.sample.aop.library.aspect.AppPointcut.allAddMethods()")
    public void beforeAddSecurityAdvice() {
        System.out.println("beforeGetSecurityAdvice: check rights.");
        System.out.println("--------------------------------------");
    }

}
