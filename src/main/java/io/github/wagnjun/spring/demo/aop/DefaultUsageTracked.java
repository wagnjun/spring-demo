package io.github.wagnjun.spring.demo.aop;

/**
 * Created by bata on 16/6/21.
 */
public class DefaultUsageTracked implements UsageTracked {
    @Override
    public String msg() {
        return "track..";
    }
}
