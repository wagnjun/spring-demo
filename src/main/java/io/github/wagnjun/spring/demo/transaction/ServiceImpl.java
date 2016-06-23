package io.github.wagnjun.spring.demo.transaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

/**
 * Created by bata on 16/6/21.
 */
@Component
public class ServiceImpl implements Service {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public String fun1(String name) {
        if (name == null) {
            throw new IllegalArgumentException();
        }
        return jdbcTemplate.queryForMap("SELECT * FROM grampus WHERE name='grampus1'").get("name").toString();
    }

    @Override
    public String fun2(String name) throws CheckedException {
        if(name == null){
            throw new CheckedException();
        }
        return null;
    }
}
