package anton.sample.aop.library.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * User: Sedkov Anton
 * Date: 04.07.2021
 */
@Component
@Aspect
public class LoggingAspect {

    /*  PointCut = "execution(public void anton.sample.aop.library.model.UniverLibrary.get*())"  */
    @Before("execution(public void get*())")
    public void beforeGetBookAdvice() {
        System.out.println("beforeGetBookAdvice: try to get a book");
    }
/*
    @Before("execution(public void *(*))")
    public void beforeGetBookAdviceTwo(){
        System.out.println("beforeGetBookAdvice: try to get a book");
    }

    @Before("execution(public void get*(..))")
    public void beforeGetBookAdviceThree(){
        System.out.println("any params");
    }

     @Before("execution(public void getBook(String, ..))")
    public void beforeGetBookAdviceThree() {
        System.out.println("One precise param and more);
    }

      @Before("execution(* *(..))")
    public void beforeAllMethods() {
        System.out.println("beforeAll");
    }

    */

    @Before("execution(public void getBook(anton.sample.aop.library.model.Book))")
    public void beforeGetBookAdviceThree() {
        System.out.println("beforeGetBookAdvice: try to get a book");
    }


    @Before("execution(* return*())")
    public void beforeReturnBookAdvice() {
        System.out.println("beforeReturnBookAdvice: try to return the book");
    }

}
