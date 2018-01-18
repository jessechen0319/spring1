package com.jesse.hello.qulified;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component("normal")
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE, proxyMode = ScopedProxyMode.INTERFACES
        )
public class NormalClassService implements  ClassService {
    private int count;
    public void sendMessage() {
        count++;
        System.out.println(count);
        System.out.println("normal send message");
    }
}
