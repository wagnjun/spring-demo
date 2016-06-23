package io.github.wagnjun.spring.demo.aop;

import org.springframework.validation.annotation.Validated;

/**
 * Created by bata on 16/5/7.
 */
@Validated
public interface Service {

    String getMessage(String name);
}
