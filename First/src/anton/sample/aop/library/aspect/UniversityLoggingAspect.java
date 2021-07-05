package anton.sample.aop.library.aspect;

import anton.sample.aop.library.model.Student;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * User: Sedkov Anton
 * Date: 05.07.2021
 */
@Component
@Aspect
public class UniversityLoggingAspect {

   /* @Before("execution(* getStudents())")
    public void beforeGetStudentsLoggingAdvice() {
        System.out.println("beforeGetStudentsLoggingAdvice: logging before");
    }

    @AfterReturning(pointcut = "execution(* getStudents())", returning = "students")
    public void afterGetStudentsLoggingAdvice(List<Student> students) {
        Student firstStudent = students.get(0);
        String name = firstStudent.getName();
        firstStudent.setName("Mr. " + name);
        double avgGrade = firstStudent.getAvgGrade();
        firstStudent.setAvgGrade(avgGrade + 1);

        System.out.println("afterGetStudentsLoggingAdvice: logging after Returning");
    }*/
/*

    @AfterThrowing(pointcut = "execution(* getStudents())", throwing = "exception")
    public void afterThrowingGetStudentsLoggingAdvice(Throwable exception) {
        System.out.println("Logging exception = " + exception);
    }
*/

    @After("execution(* getStudents())")
    public void afterGetStudentsLoggingAdvice() {
        System.out.println("Logging after advice");
    }

}
