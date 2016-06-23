package io.github.wagnjun.spring.demo.context.event;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

/**
 * Created by bata on 16/6/22.
 */
@org.springframework.stereotype.Service
public class ServiceImpl implements Service, ApplicationEventPublisherAware {

    @Override
    public void fun() {
        applicationEventPublisher.publishEvent(new TestEvent("hello world"));
    }

    private ApplicationEventPublisher applicationEventPublisher;

    /**
     * Set the ApplicationEventPublisher that this object runs in.
     * <p>Invoked after population of normal bean properties but before an init
     * callback like InitializingBean's afterPropertiesSet or a custom init-method.
     * Invoked before ApplicationContextAware's setApplicationContext.
     *
     * @param applicationEventPublisher event publisher to be used by this object
     */
    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }
}
