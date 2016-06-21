package io.github.wagnjun.spring.demo.bootstrap;

import org.springframework.stereotype.Component;

/**
 * Created by bata on 16/5/8.
 */
@Component
public class MessageServiceBImpl implements MessageServiceB {
    @Override
    public String getMessage() {
        return "MessageServiceB";
    }
}
