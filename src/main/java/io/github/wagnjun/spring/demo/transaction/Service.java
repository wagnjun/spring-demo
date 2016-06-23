package io.github.wagnjun.spring.demo.transaction;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;

/**
 * Created by bata on 16/5/7.
 */
@Validated
public interface Service {

    @Transactional
    String fun1(String name);


    @Transactional(rollbackFor = {CheckedException.class})
    String fun2(String name) throws CheckedException;
}
