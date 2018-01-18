package com.jesse.hello;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class Hello {

    @Bean("jesse")
    MessageService mockMessageService(){
        return  new MessageService() {
            public String getMessage() {
                return "jesse is here";
            }
        };
    }

    public static void main(String[] args){
        ApplicationContext context = new AnnotationConfigApplicationContext(Hello.class);
        //ApplicationContext context = new ClassPathXmlApplicationContext("/beans.xml");
        MessagePrinter printer = context.getBean(MessagePrinter.class);
        printer.printMessage();
    }
}
