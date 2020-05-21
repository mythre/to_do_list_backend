package io.swagger.api.impl;

import org.springframework.context.annotation.*;

@Configuration
public class DatabaseConfig{
    @Bean
    public PostgresSql postgresSql(){
        return new PostgresSql();
    }
    @Bean
    public ListDAO listDAO(){
        return new ListDAO(postgresSql());
    }

}

