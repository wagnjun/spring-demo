package io.github.wagnjun.spring.demo.context.di;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;

/**
 * Created by bata on 16/6/22.
 */
@org.springframework.stereotype.Service
@Primary
public class ServiceImpl implements Service {

    private Logger logger = LoggerFactory.getLogger(ServiceImpl.class);

    @Autowired
    @Qualifier("serviceB")
    private Service serviceB;

    @Override
    public void fun() {
        logger.info("fun#");
        serviceB.fun();
    }


}
