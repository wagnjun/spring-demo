package io.github.wagnjun;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * Created by bata on 16/5/7.
 */
@Service
public class MessagePrinter {

    @Autowired
    private MessageService service;

    @Value("${property.a}")//注解方式使用place holder
    private String ap;

    @PostConstruct
    private void init() {
        System.out.println("MessagePrinter#init#" + ap);
    }

    public MessagePrinter() {
    }

    public void printMessage() {
        System.out.println(this.service.getMessage());
    }
}
