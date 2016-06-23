package io.github.wagnjun.spring.demo.method;

import org.springframework.beans.factory.annotation.Lookup;

/**
 * Created by bata on 16/6/21.
 */
@org.springframework.stereotype.Service
public class ServiceImpl implements Service {

    @Override
    public String getMessage(String name) {
        return createWorker().getMessage();
    }


    @Lookup
    public Worker createWorker() {
        return null;
    }
}
