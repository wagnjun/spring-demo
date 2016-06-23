package io.github.wagnjun.spring.demo.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * Created by bata on 16/6/21.
 */
@Aspect
@Component
public class MessageAround {


    private Logger logger = LoggerFactory.getLogger(MessageAround.class);

    //Advice
    @Around("io.github.wagnjun.spring.demo.aop.MessageArchitecture.anyGetMessage()")
    public Object fun(ProceedingJoinPoint pjp) throws Throwable {
        logger.info("#fun#");
        return pjp.proceed();
    }
}
