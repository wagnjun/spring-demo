package io.github.wagnjun.spring.demo.context.di;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * Created by bata on 16/6/22.
 */
@org.springframework.stereotype.Service
@Qualifier("serviceB")
public class ServiceBImpl implements Service {

    private Logger logger = LoggerFactory.getLogger(ServiceBImpl.class);

    @Override
    public void fun() {
        logger.info("Bfun#");
    }


}
