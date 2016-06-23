package io.github.wagnjun.spring.demo.xml;

/**
 * Created by bata on 16/6/21.
 */
public class Settings {

    private boolean fooEnabled = true;

    public boolean isFooEnabled() {
        return fooEnabled;
    }

    public void setFooEnabled(boolean fooEnabled) {
        this.fooEnabled = fooEnabled;
    }

    @Override
    public String toString() {
        return "Settings{" +
                "fooEnabled=" + fooEnabled +
                '}';
    }
}
