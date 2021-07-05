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
@Order(20)
public class SecurityAspect {

    @Before("anton.sample.aop.library.aspect.AppPointcut.allGetMethods()")
    public void beforeGetSecurityAdvice() {
        System.out.println("beforeGetSecurityAdvice: check rights.");
    }

}
