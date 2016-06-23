package io.github.wagnjun.spring.demo.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * Created by bata on 16/6/21.
 */
@Aspect
@Component
public class MessageArchitecture {

    //PointCut
    @Pointcut("execution(* io.github.wagnjun.spring.demo.aop.Service.*(..))")
    public void anyGetMessage() {
    }

    //value的写法参考:http://www.eclipse.org/aspectj/doc/released/progguide/semantics-pointcuts.html#type-patterns
    @DeclareParents(value = "io.github.wagnjun.spring.demo.aop.Service+", defaultImpl = DefaultUsageTracked.class)
    public static UsageTracked mixin;
}
