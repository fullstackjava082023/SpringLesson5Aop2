package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        Person person = applicationContext.getBean(Person.class);
//        person.greet("Arja"); //jp 1
//        person.greet("John"); // jp 2
////        person.greetInFrench();
//        person.greet("Ned");//jp 3
//        System.out.println(person.sum(5,10));
//
        person.doSomething(5);
        person.doSomething(15);

//Use Aspect J and create a same classes PersonBean, PersonAspect, Main.
//In PersonBean create a method do something with int argument like in class
//In PersonAspect intercept the call with @Around advise.
//In case the number provided is >10 run the actual method and increase the counter
//If the number is <= 10 don’t run the method and dont increase the counter
//                - print “Ignored with the number which was provided”
// example : person.doSomething(20) -> passed , person.doSomething(5) - ignored because 5 <= 10
    }
}