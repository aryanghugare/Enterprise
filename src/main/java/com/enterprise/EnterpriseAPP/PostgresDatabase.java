package com.enterprise.EnterpriseAPP;

public class PostgresDatabase implements Database {

    @Override
    public void save(String user) {
        System.out.println("This is a Postgres Database!!");
    }
}
