package io.github.wagnjun.spring.demo.xml;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.castor.CastorMarshaller;

/**
 * Created by bata on 16/6/20.
 */
@Configuration
@ComponentScan(basePackageClasses = AppConfig.class)
public class AppConfig {


    @Bean
    public CastorMarshaller castorMarshaller() {
        return new CastorMarshaller();
    }

}
