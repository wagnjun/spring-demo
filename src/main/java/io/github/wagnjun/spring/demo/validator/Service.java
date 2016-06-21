package io.github.wagnjun.spring.demo.validator;

import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotNull;

/**
 * Created by bata on 16/5/7.
 */
@Validated
public interface Service {

    @NotNull
    String getMessage(@NotNull Person person);
}
