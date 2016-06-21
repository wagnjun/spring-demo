package io.github.wagnjun.spring.demo.bootstrap;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by bata on 16/5/7.
 */
public class Application {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        MessagePrinter printer = context.getBean(MessagePrinter.class);
        printer.printMessage();

        System.out.println(context.getBean(MessageServiceB.class).getMessage());
    }
}
