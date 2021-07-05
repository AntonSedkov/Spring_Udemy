package anton.sample.aop.library.aspect;

import anton.sample.aop.library.model.Book;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * User: Sedkov Anton
 * Date: 04.07.2021
 */
@Component
@Aspect
@Order(-10)
public class LoggingAspect {

    //PointCut = "execution(public void anton.sample.aop.library.model.UniverLibrary.get*())"
    @Before("anton.sample.aop.library.aspect.AppPointcut.allAddMethods()")
    public void beforeAddLoggingAdvice(JoinPoint joinPoint) {
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        System.out.println("Signature = " + signature);
        System.out.println("Signature method = " + signature.getMethod());
        System.out.println("Signature return type = " + signature.getReturnType());
        System.out.println("Signature method name = " + signature.getName());

        if (signature.getName().equals("addBook")) {
            Object[] args = joinPoint.getArgs();
            for (Object obj : args) {
                if (obj instanceof Book) {
                    Book book = (Book) obj;
                    System.out.println("Book: " + book.getName() + ", " + book.getAuthor() + ", " + book.getYear());
                } else if (obj instanceof String) {
                    System.out.println("Book was added by " + obj);
                }
            }
        }

        System.out.println("beforeGetBookAdvice: try to get a book/magazine");
        System.out.println("--------------------------------------");
    }


    /*

    @Pointcut("execution(* anton.sample.aop.library.model.UniverLibrary.*(..))")
    private void allMethodsFromUniverLibrary() {
    }

    @Pointcut("execution(public void anton.sample.aop.library.model.UniverLibrary.returnMagazine())")
    private void returnMagazineFromUniverLibrary() {
    }

    @Pointcut("allMethodsFromUniverLibrary() && !returnMagazineFromUniverLibrary()")
    private void allMethodsExceptReturnMagazineFromUniverLibrary() {
    }

    @Before("allMethodsExceptReturnMagazineFromUniverLibrary()")
    public void beforeAllMethodsExceptReturnMagazineFromUniverLibrary(){
        System.out.println("Log#108");
    }

*/

    /*
    @Pointcut("execution(* anton.sample.aop.library.model.UniverLibrary.get*())")
    private void allGetMethodsFromUniverLibrary() {
    }

    @Pointcut("execution(* anton.sample.aop.library.model.UniverLibrary.return*())")
    private void allReturnMethodsFromUniverLibrary() {
    }

    @Pointcut(" allGetMethodsFromUniverLibrary() || allReturnMethodsFromUniverLibrary()" )
    private void allGetAndReturnMethodsFromUniverLibrary() {
    }

    @Before("allGetMethodsFromUniverLibrary()")
    public void beforeGetLoggingAdvice() {
        System.out.println("beforeGetLoggingAdvice: Log#1");
    }

    @Before("allReturnMethodsFromUniverLibrary()")
    public void beforeReturnLoggingAdvice() {
        System.out.println("beforeReturnLoggingAdvice: Log#2");
    }

    @Before("allGetAndReturnMethodsFromUniverLibrary()")
    public void beforeGetAndReturnLoggingAdvice() {
        System.out.println("beforeGetAndReturnLoggingAdvice: Log#3");
    }*/




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

    @Before("execution(public void getBook(anton.sample.aop.library.model.Book))")
    public void beforeGetBookAdviceThree() {
        System.out.println("beforeGetBookAdvice: try to get a book");
    }

    @Before("execution(* return*())")
    public void beforeReturnBookAdvice() {
        System.out.println("beforeReturnBookAdvice: try to return the book");
    }
*/
}
