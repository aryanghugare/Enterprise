package com.enterprise.EnterpriseAPP;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("prod")
public class PostgresDatabase implements Database {

    @Override
    public void save(String user) {
        System.out.println("This is a Postgres Database and the user is " + user);
    }
}
