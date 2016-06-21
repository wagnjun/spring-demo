package io.github.wagnjun.spring.demo.validator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.validation.*;
import java.util.Set;

/**
 * Created by bata on 16/5/7.
 */
public class Application {
    private static Logger logger = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        Validator validator = factory.getValidator();

        Person person = new Person("Harry", 29);
        Set<ConstraintViolation<Person>> validate = validator.validate(person);
        validate.forEach(x -> logger.info(x.getMessage()));

        try {
            Service bean = context.getBean(Service.class);
            logger.info(bean.getMessage(new Person("xxx", 1)));
        } catch (ConstraintViolationException e) {
            logger.error("" + e.getConstraintViolations());
        }

    }
}
