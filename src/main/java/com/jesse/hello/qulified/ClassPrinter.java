package com.jesse.hello.qulified;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ClassPrinter {

    @Autowired
    @Qualifier("normal")
    private ClassService service;

    public void say(){
        service.sendMessage();
    }
}
