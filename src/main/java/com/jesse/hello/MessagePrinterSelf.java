package com.jesse.hello;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("hello2")
public class MessagePrinterSelf implements Printer{
    final private MessageService service;
    @Autowired
    public MessagePrinterSelf(MessageService service) {
        this.service = service;
    }

    public void printMessage() {
        System.out.println("I am good");
        System.out.println(this.service.getMessage());
    }

    public void say() {
        System.out.println("jesse2");
    }
}