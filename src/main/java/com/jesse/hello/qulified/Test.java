package com.jesse.hello.qulified;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class Test {

    public static void main(String[] args){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Test.class);
        ClassPrinter classPrinter = context.getBean(ClassPrinter.class);
        classPrinter.say();
        ClassPrinter classPrinter2 = context.getBean(ClassPrinter.class);
        classPrinter2.say();
    }
}
