package io.github.wagnjun.spring.demo.bootstrap;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by bata on 16/5/7.
 */
@Configuration
@ComponentScan(basePackageClasses = Config.class)
public class Config {

    @Bean
    MessageService mockMessageService() {
        return new MessageService() {
            public String getMessage() {
                return "Hello World!";
            }
        };
    }

}
