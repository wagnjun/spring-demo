package io.github.wagnjun.spring.demo.context.di;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by bata on 16/6/22.
 */
@org.springframework.stereotype.Service
public class ServiceCImpl implements Service {

    private Logger logger = LoggerFactory.getLogger(ServiceCImpl.class);

    @Override
    public void fun() {
        logger.info("Cfun#");
    }


}
