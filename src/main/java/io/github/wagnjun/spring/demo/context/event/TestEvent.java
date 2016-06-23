package io.github.wagnjun.spring.demo.context.event;

/**
 * Created by bata on 16/6/22.
 */
public class TestEvent {

    private String content;

    public TestEvent(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
