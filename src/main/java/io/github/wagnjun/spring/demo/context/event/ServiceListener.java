package io.github.wagnjun.spring.demo.context.event;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.event.EventListener;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * Created by bata on 16/6/22.
 */
@Component
public class ServiceListener {

    private Logger logger = LoggerFactory.getLogger(ServiceListener.class);

    @EventListener
    @Order(1)
    public void fun(TestEvent event) {
        logger.info("fun1# " + event.getContent());
    }

    @EventListener(condition = "#event.content.length() > 20")
    @Order(2)
    public void fun2(TestEvent event) {
        logger.info("fun2# " + event.getContent());
    }
}
