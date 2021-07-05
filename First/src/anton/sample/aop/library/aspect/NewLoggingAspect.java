package anton.sample.aop.library.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * User: Sedkov Anton
 * Date: 05.07.2021
 */

@Component
@Aspect
public class NewLoggingAspect {

    @Around("execution(public String returnBook())")
    public Object aroundReturnBookLoggingAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("aroundReturnBookLoggingAdvice: try to return");

        long begin = System.currentTimeMillis();

        Object targetMethodResult = proceedingJoinPoint.proceed();
        targetMethodResult = "To kill the mockingbird";

        long end = System.currentTimeMillis();

        System.out.println("aroundReturnBookLoggingAdvice: book was returned");
        System.out.println("returnBook method working " + (end - begin) + "ms");

        return targetMethodResult;
    }

}
