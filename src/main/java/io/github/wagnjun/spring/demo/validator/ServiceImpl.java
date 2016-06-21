package io.github.wagnjun.spring.demo.validator;

import org.springframework.stereotype.Component;

import javax.validation.constraints.NotNull;

/**
 * Created by bata on 16/6/21.
 */
@Component
public class ServiceImpl implements Service {

    @Override
    public String getMessage(@NotNull Person person) {
        return null;
    }
}
