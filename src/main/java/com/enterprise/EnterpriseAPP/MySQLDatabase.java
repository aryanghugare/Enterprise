package com.enterprise.EnterpriseAPP;

import org.springframework.stereotype.Component;

@Component
public class MySQLDatabase implements Database {

    @Override
    public void save(String user) {
        System.out.println("The user has been saved successfully in the DB sql and the user is : " + user );

    }
}
