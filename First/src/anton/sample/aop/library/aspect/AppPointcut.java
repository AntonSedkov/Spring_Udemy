package anton.sample.aop.library.aspect;

import org.aspectj.lang.annotation.Pointcut;

/**
 * User: Sedkov Anton
 * Date: 05.07.2021
 */
public class AppPointcut {

    //rename "abc" onto "add"
    @Pointcut("execution(* abc*(..))")
    public void allAddMethods() {
    }

}
