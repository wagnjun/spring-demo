package io.github.wagnjun.spring.demo.transaction;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by bata on 16/5/7.
 */
public class Application {
    private static Logger logger = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Service bean = context.getBean(Service.class);
        try {
            logger.info(bean.fun1(null));
        } catch (Exception e) {
            logger.error("", e);
        }


        try {
            bean.fun2(null);
        } catch (Exception e) {
            logger.info("", e);
        }
    }
}
