package anton.sample.mvc_hibernate.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

/**
 * User: Sedkov Anton
 * Date: 10.07.2021
 */

@Component
@Aspect
public class AppLoggingAspect {

    @Around("execution(* anton.sample.mvc_hibernate.dao.*.*(..))")
    public Object aroundAllRepositoryMethodsAdvice(
            ProceedingJoinPoint proceedingJoinPoint) throws Throwable {

        MethodSignature signature = (MethodSignature) proceedingJoinPoint.getSignature();
        String methodName = signature.getName();

        System.out.println("Begin of " + methodName);

        Object result = proceedingJoinPoint.proceed();

        System.out.println("End of " + methodName);

        return result;
    }

}
