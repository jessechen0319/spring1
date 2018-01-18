package com.jesse.hello.qulified;

import org.springframework.stereotype.Component;

@Component("urgent")
public class UrgentClassService implements  ClassService {
    public void sendMessage() {
        System.out.println("urgent send message");
    }
}
