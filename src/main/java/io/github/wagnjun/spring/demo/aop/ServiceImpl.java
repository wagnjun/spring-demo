package io.github.wagnjun.spring.demo.aop;

import org.springframework.stereotype.Component;

/**
 * Created by bata on 16/6/21.
 */
@Component
public class ServiceImpl implements Service {
    @Override
    public String getMessage(String name) {
        return "OK";
    }
}
