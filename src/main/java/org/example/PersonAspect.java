package org.example;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
@Aspect
public class PersonAspect {
    private int counter = 0;


//    @Before("execution(void Person.*(..))")
//    public void addCounter() {
//
//        System.out.println("intercepted " + ++counter);
//    }
//
//    @After("execution(void Person.greet(..))")//pointcut of execution of greet method of PersonBean. Counter will be added after the execution and printed
//    public void addCounterToTheMethod() {
//        System.out.println("New counter : " + ++counter);
//    }

//    @Around("execution(void Person.greet(..))")
//    public void insteadOfGreet(ProceedingJoinPoint joinPoint) throws Throwable {
//        if (joinPoint.getArgs()[0].equals("Arja")) {
//            System.out.println("Arja, you cannot enter the application");
//        } else {
//            System.out.println("You can continue");
//            joinPoint.proceed();
//        }
//    }

    @Around("execution(int Person.sum(..))")
    public int onSum(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("intercepted");
        System.out.println(Arrays.toString(joinPoint.getArgs()));
//        int arg1 = (int) joinPoint.getArgs()[0];
//        int arg2 = (int) joinPoint.getArgs()[1];
        return (int) joinPoint.proceed();
    }

    @Around("execution(void Person.doSomething(..))")
    public void onDoSomething(ProceedingJoinPoint joinPoint) throws Throwable {
        int arg1 = (int) joinPoint.getArgs()[0];
        if (arg1 > 10) {
            joinPoint.proceed();
        } else {
            System.out.println("Not pass validation the number is : " + arg1 + " smaller than 10");
        }
    }





    //ADVISE  -- @BEFORE @AFTER...
    //POINTCUT -- "execution(void Person.greet(..))"
    //JOIN POINT -- specific execution which is intercepted

}
