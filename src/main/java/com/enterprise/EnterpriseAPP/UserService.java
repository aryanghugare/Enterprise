package com.enterprise.EnterpriseAPP;
// Loose coupling , as the database can be anything !!!

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    Database database ;
    public UserService(Database database) {
       this.database = database ;
    }


    public void saveUser(String user) {
        System.out.println("The user is saving in the userService and the user is : "+ user);
      database.save(user) ;
    }
}
