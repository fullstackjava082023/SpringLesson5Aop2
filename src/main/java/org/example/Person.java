package org.example;


import org.springframework.stereotype.Service;

@Service
public class Person {
    public void greet(String name) {
        System.out.println("hello " + name);
    }

    public void greetInFrench() {
        System.out.println("bonjour");
    }

    public int sum(int a, int b) {
        return a+b;
    }


    public void doSomething(int number) {
        System.out.println("doing something with the " + number);
    }
}
